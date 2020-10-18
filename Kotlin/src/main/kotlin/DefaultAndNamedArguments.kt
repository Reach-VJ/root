fun main() {
    greeting()
    greeting("hello")
    greeting("hello",3)
}

fun greeting(message: String = "hello", noOf: Int = 1) {
    for(i in 1..noOf)
        println("$message, $i")
}