fun main() {

    var names = arrayOfNulls<String>(10)  //Creating array with size with null values.
    var numbers = arrayOf(1,2,3)   //Creating array with initial values
    var num = numbers.get(0) //Accessing array elements.
    var num1 = numbers[0]    //Accessing array element in standard way.
    num = 10 // Setting array elements in standard way.
    numbers.set(0,20) //Settin array element.
    var size = numbers.size  // Array size




    var numbers1 = arrayOfNulls<Int>(10)
    numbers.set(0,1)

    names.set(0,"hello")
    var chars = names.get(0)?.get(0)
    println(chars)
    println(numbers.get(0))
}