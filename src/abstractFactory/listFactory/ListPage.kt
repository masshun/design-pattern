package abstractFactory.listFactory

import abstractFactory.factory.Item
import abstractFactory.factory.Page

class ListPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<html><head><title>${title}</title></head>¥n")
        buffer.append("<body>¥n")
        buffer.append("<h1>${title}</h1>¥n")
        buffer.append("<ul>¥n")
        content.forEach {
            val item = it as Item
            buffer.append(item.makeHTML())
        }
        buffer.append("</ul>¥n")
        buffer.append("<hr><address>${author}</address>")
        buffer.append("</body></html>¥n")
        return buffer.toString()
    }
}
