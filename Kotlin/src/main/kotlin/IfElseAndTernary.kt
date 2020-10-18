fun main() {
    for(i:Int in 0..23) {

//        if(i == 1) println("Its one") else println("Its not one") //Standard if else
//        if(i in 4..6) continue // Checking the range.
//        var prefix = if(i%2 == 0 ) "Even" else "Odd" // Ternary operation like in java
//        println("$i is $prefix")

        var greeting = if(i in 0 until 12) {
            "Good Morning"
        } else if(i == 12) {
            "Time of lunch"
        } else {
            "Rest of the day"
        }
        println(greeting)


    }
}