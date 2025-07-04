package Inheritances

fun main(args: Array<String>) {
    val clickListener = ClickListener()

    val button = Button("Login", 1232,object: OnClickListener{
        override fun onClick() {
            // login the widget
            TODO("Not yet implemented")
        }
    })
    val signUpButton = Button("Sign Up", 23423, object : OnClickListener {
        override fun onClick() {
            // signing up the widget
            TODO("Not yet implemented")
        }
    })
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)

class ClickListener(): OnClickListener {
    override fun onClick() {
        TODO("Not yet implemented")
    }
}

interface OnClickListener {
    fun onClick()
}