package OOP

fun main(args: Array<String>) {
    val listView = ListView(arrayOf("Name1", "Name2", "Name3", "Name4"))
    listView.ListViewItem().displayItem(3)
    listView.ListViewItem().displayItem(1)
}

class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}