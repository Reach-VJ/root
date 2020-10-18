const val STRING_CONSTANT = "Its a String constant"//Same like static final in Java

fun main() {
    println(STRING_CONSTANT)
    println(getMax(5, 1,5,6,6,9))
}

fun getMax(first: Int, vararg numbers:Int): Int {
    println(STRING_CONSTANT)
    var max = first;
    for(i in numbers)
        if(i > max) max = i
    return max
}
