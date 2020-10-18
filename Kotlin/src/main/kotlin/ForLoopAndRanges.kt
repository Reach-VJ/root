fun main() {

    var names = arrayOf("Bachi", "Vijay", "Hello", "Walker")
    for(name in names) println(name)  //For loop
    for(i in 1..10) println(i)   // For loop range, it prints 1 to 10
    for(i in 1.rangeTo(10)) println(i)   // For loop in other way.
    for (i in 1..10 step 2)   println(i)    // For loop range, skipping number
    for (i in 1.rangeTo(10).step(3)) println(i)
    for (i in 1 until 10)  println(i) // It wont print until 10
    for (i in 10 downTo 1) println(i)  //print in reverse direction
    for (i in 'a'..'z') println(i)  //Println chars
    for(i in names.indices) println("Index : $i, Element : ${names.get(i)}")
}