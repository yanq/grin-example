package book

import grin.web.Controller
import groovy.util.logging.Slf4j

/**
 * Book
 * something about this controller
 */
@Slf4j
class BookController extends Controller {
    def index() {
        params.limit = params.limit ? params.limit.toInteger() : 10
        params.order = params.order ?: 'id desc'

        def list = Book.list(params)
        def count = Book.count()

        list.fetch()

        render('index', [list: list, count: count])
    }

    def show() {
        Book book = Book.get(params.id)

        if (!book) {
            notFound()
            return
        }

        book.fetch()

        render('show', [book: book])
    }

    def create() {
        Book book = Book.from(params)
        render('create', [book: book, authorList: Author.list()])
    }

    def save() {
        Book book = Book.from(params)
        book.validate()

        if (book.errors) {
            render('create', [book: book, authorList: Author.list()])
        } else {
            if (book.save()) {
                redirect("show/${book.id}")
            } else {
                render('create', [book: book, authorList: Author.list()])
            }
        }
    }

    def edit() {
        Book book = Book.get(params.id)

        if (!book) {
            notFound()
            return
        }

        render('edit', [book: book, authorList: Author.list()])
    }

    def update() {
        Book book = Book.get(params.id)

        if (!book) {
            notFound()
            return
        }

        book.bind(params)
        book.validate()

        if (book.errors) {
            render('edit', [book: book, authorList: Author.list()])
        } else {
            if (book.save()) {
                redirect("show/${book.id}")
            } else {
                render('edit', [book: book, authorList: Author.list()])
            }
        }
    }

    def delete() {
        Book book = Book.get(params.id)
        book.delete()
        redirect("../index")
    }
}


