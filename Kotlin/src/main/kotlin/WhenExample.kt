fun main() {
    // When is similar to Swtich in Java.

    var time = 0
    var isSunady = false
    //When example 1
    var greeting = when(time) {
        in 0..5 -> "Why so early ?"
        in 0..11 -> "Good Morning" // It will print from 6 to 11, because 0 to 5 print above line.
        else -> "Good day"
    }
    println(greeting)

    //When example 2
    var message = when {
        isSunady -> "Enjoy in bed all day!"
        time  in 0..5 -> "Why so early ?"
        time  in 0..11 -> "Good morning"
        else -> "Good day"
    }
    println(message)

}