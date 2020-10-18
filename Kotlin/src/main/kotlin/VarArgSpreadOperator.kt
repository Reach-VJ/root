fun main() {
    var sum = getSum("Hello", number =10);
    println(sum)
    sum = getSum(message ="Hello World",2,3, number =5)
    println(sum)
    sum = getSum(message ="Greeting",2,3,4, number =10)
    println(sum)
    //Passing array as vararg
    var numbers:IntArray = intArrayOf(1,2,3,4,5)
    sum = getSum(message ="Hello",*numbers, number =15)
}

fun getSum(message:String="Hello", vararg numbers: Int, number:Int): Int { //int...numbers java syntax
    var sum = 0
    for(i in numbers) sum +=i
    return sum
}