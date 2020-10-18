fun main() {
    println("2 > 1 is ${2>1}")
    println("1 < 2 is ${1<2}")
    println("1 <= 1 is ${1<=2}")
    println("1 == 1 is ${1==1}")
    println("1 == 2 is ${1==2}")
    println("1 != 2 is ${1!=2}")
    println("true && false = ${true && false}")
    println("true || false = ${true || false}")
    var condition = 2 > 1 || 3>2 && 2>3  //precendence for &&
    println(condition)
}