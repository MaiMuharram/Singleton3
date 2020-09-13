
class C{
    init {
        println("Class init method.")
    }

    object SingletonC{
        init{
            println("SingletonC class invoked")

        }

        var name = "Kotlin objects C"

        fun printName(){
            println(name)
        }
    }

    companion object SingletonB{
        init{
            println("SingletonB class invoked")

        }

        var name = "Kotlin objects B"

        fun printName(){
            println(name)
        }
    }
}

fun main( ){
    var c = C()
    var cc = C.name
    println(cc)
    C.name = "Kotlin Tutorials"
    C.printName()
}
