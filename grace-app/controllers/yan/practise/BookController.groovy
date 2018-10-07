package yan.practise

import static grace.controller.route.Routes.*

/**
 * Book
 * something about this controller
 */

get('index') {
    params.limit = params.limit ?: 10
    params.order = params.order ?: 'id desc'

    def list = Book.list(params)
    def count = Book.count()

    render('index', [list: list, count: count])
}

get('show/@id') {
    Book book = Book.get(params.id)

    if (!book) {
        notFound()
        return
    }

    render('show', [book: book])
}

get('create') {
    Book book = Book.from(params)
    render('create', [book: book])
}

post('save') {
    Book book = Book.from(params)
    book.validate()

    if (book.errors) {
        render('create', [book: book])
    } else {
        if (book.save()) {
            redirect("show/${book.id}")
        } else {
            render('create', [book: book])
        }
    }
}

get('edit/@id') {
    Book book = Book.get(params.id)

    if (!book) {
        notFound()
        return
    }

    render('edit', [book: book])
}

post('update') {
    Book book = Book.get(params.id)

    if (!book) {
        notFound()
        return
    }

    book.bind(params)
    book.validate()

    if (book.errors) {
        render('edit', [book: book])
    } else {
        if (book.save()) {
            redirect("show/${book.id}")
        } else {
            render('edit', [book: book])
        }
    }
}

get('delete/@id') {
    Book book = Book.get(params.id)
    book.delete()
    redirect("../index")
}

