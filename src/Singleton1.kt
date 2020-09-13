object Singleton {
    init{
        println("Singleton class invoked")

    }

    var name = "Kotlin objects"

    fun printName(){
        println(name)
    }
}

class A{
    init{
        println("Class init method. Singleton name property : ${Singleton.name}")
        Singleton.printName()
    }
}

fun main(){
    Singleton.printName()
    Singleton.name = "KK"
    var a = A()
}