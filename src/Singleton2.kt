class B{
    init{
        println("Class init method. Singleton name property")
    }

        object Singleton{
            init{
                println("Singleton class invoked")

            }

            var name = "Kotlin objects"

            fun printName(){
                println(name)
            }
        }

}

fun main(){
    var b = B( )
}

