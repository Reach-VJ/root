fun main() {
    println(double(5))
    println(getMax1(20,10))
}

fun double(num: Int) = num*2  //Single line expression function.
                              //No need to return explicitly
                              //No need to mention return type
                              //Dont use single line expression for Unit(Void in java) return.

// Method overloading
fun getMax1(num1: Int, num2: Int) = if(num1 > num2) num1 else num2
fun getMax1(num1: Double, num2: Double) = if(num1 > num2) num1 else num2

