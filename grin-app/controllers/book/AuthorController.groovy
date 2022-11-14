package book

import groovy.util.logging.Slf4j
import grin.web.Controller

/**
 * Author
 * something about this controller
 */
@Slf4j
class AuthorController extends Controller {
    def index() {
        params.limit = params.limit ? params.limit.toInteger() : 10
        params.order = params.order ?: 'id desc'

    def list = Author.list(params)
    def count = Author.count()

    list.fetch()

        render('index', [list: list, count: count])
    }

    def show() {
        Author author = Author.get(params.id)

    if (!author) {
        notFound()
        return
    }

        author.fetch()

        render('show', [author: author])
    }

    def create() {
        Author author = Author.from(params)
        render('create', [author: author])
    }

    def save() {
        Author author = Author.from(params)
        author.validate()

    if (author.errors) {
        render('create', [author: author])
    } else {
        if (author.save()) {
            redirect("show/${author.id}")
        } else {
            render('create', [author: author])
        }
    }
}

    def edit() {
        Author author = Author.get(params.id)

        if (!author) {
            notFound()
            return
        }

        render('edit', [author: author])
    }

    def update() {
        Author author = Author.get(params.id)

        if (!author) {
            notFound()
            return
        }

        author.bind(params)
        author.validate()

    if (author.errors) {
        render('edit', [author: author])
    } else {
        if (author.save()) {
            redirect("show/${author.id}")
        } else {
            render('edit', [author: author])
        }
    }
}

    def delete() {
        Author author = Author.get(params.id)
        author.delete()
        redirect("../index")
    }
}


