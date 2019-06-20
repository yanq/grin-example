package book

import static grace.route.Routes.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory

Logger log = LoggerFactory.getLogger(this.class)

/**
 * Book
 * something about this controller
 */

get('index') {
    params.limit = params.limit ? params.limit.toInteger() : 10
    params.order = params.order ?: 'id desc'

    def list = Book.list(params)
    def count = Book.count()

    list.fetch()

    json([list:list.collect{it.toMap()}, count: count])
}

get('show/@id') {
    Book book = Book.get(params.id)

    if (!book) {
        notFound()
        return
    }

    book.fetch()

    json(book.toMap())
}

post('save') {
    Book book = Book.from(params)
    book.validate()

    if (book.errors) {
        json {
            success false
            message '保存失败，请检查一下数据错误'
            errors book.errors
        }
    } else {
        if (book.save()) {
            json {
                success true
                message '发布成功'
            }
        } else {
            json {
                success false
                message '保存失败，请稍后再试'
            }
        }
    }
}

get('edit/@id') {
    Book book = Book.get(params.id)

    if (!book) {
        notFound()
        return
    }

    json(book.toMap())
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
        json {
            success false
            message '保存失败，请检查一下数据错误'
            errors book.errors
        }
    } else {
        if (book.save()) {
            json {
                success true
                message '修改成功'
            }
        } else {
            json {
                success false
                message '保存失败，请稍后再试'
            }
        }
    }
}

get('delete/@id') {
    Book book = Book.get(params.id)
    book.delete()
    json([success: true, message: '删除成功'])
}

