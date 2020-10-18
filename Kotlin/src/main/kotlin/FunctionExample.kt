fun main() {
    greet("Vijay",3)
    printMax(1,2)
}

fun greet(greet: String, noOfTimes:Int) { //Here greet, noOfTimes are val not var,
                                         // can not change those values.
    for(i in 1..noOfTimes)
        println("Hello $greet")
//    while(noOfTimes > 0) {
//        println("Hello, $greet")
//        //noOfTimes-- //Compile type error
//    }
}

fun printMax(i: Int, j: Int) {
    var max = if(i > j) i else j
    print(max)
}