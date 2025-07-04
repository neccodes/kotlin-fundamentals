package Inheritances

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val user = User()
    with(user) {
        firstName = "Alex"
        lastName = "Dobbinca"
    }
    with(user) {
        println("firstName = $firstName")
        println("LastName = $lastName")
    }
}

class FormatDelegate : ReadWriteProperty<Any?, String> {
    private  var formattedString: String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String {
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ) {
        formattedString = value.lowercase()
    }
}

class User {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class App : A by FirstDelegate(), B by SecondDelegate() {
    override fun println() {
        TODO("Not yet implemented")
    }
    override fun println2() {
        TODO("Not yet implemented")
    }
}

interface A {
    fun println()
}

interface B {
    fun println2()
}

open class FirstDelegate : A {
    override fun println() {
        TODO("Not yet implemented")
    }
}

open class SecondDelegate : B {
    override fun println2() {
        TODO("Not yet implemented")
    }
}