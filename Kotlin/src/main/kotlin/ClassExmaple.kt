class User(name:String="No name", age:Int=0) {
    var name:String
    var age:Int
    init {
        this.name = if(name.isBlank()) "No name" else name.trim()
        this.age = age;
    }
}

fun main() {
    var user = User();
    println("User name ${user.name}, age ${user.age}")
    var userDetails = User("Vijay",20)
    println("User name ${userDetails.name}, age ${userDetails.age}")
}