fun main() {
    var num1 = 5
    var num2 = 10
    var max = getMax(num1, num2)
    println("Max of $num1 and $num2 is : $max")
    var dobuleOfNum = getDouble(5)
    print("Double of $num1 is --> $dobuleOfNum")
}

fun getMax(num1: Int, num2: Int): Int {  //Returns Int
    return if(num1 > num2) num1 else num2
}

fun getDouble(num: Int): Int {
    return num*2
}