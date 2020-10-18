fun main() {
    var i = 0;

    while(i < 5) println(i++)

    do {
        println(i++)
    } while(i<5)

    //Calculate counter
    var number = 100
    var temp = number
    var counter = 0
    while(temp >1) {
        temp /= 2
        counter++
    }
    println("How many times $number divides by 2 until $number become 1 : $counter")
}