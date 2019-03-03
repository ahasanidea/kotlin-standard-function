import kotlin.concurrent.fixedRateTimer

fun main() {
    val firstPerson=Person("Ahasan",36,"Software developer")
    val secondPerson=Person("Imran",37,"Designer")
    val olderPerson=if(firstPerson.age >=secondPerson.age) firstPerson else secondPerson
    olderPerson.printPerson()
    //Run function
    run{
        if(firstPerson.age >=secondPerson.age) firstPerson else secondPerson

    }.printPerson()
    //with and T.run are same but one is normal function and another is extension funtion
    //with(T){} is normal function
    with(firstPerson){
        age+=1
        "Age is $age"
    }.println()
    //T.run{} is extension function
    //T.run accepts this arguments
    firstPerson.run {
        age+=3
        "Run age is $age"
    }.println()
    //T.run and T.let are same function but they are accept different arguments
    //T.let accepts it argument
    //T.let return different type
    firstPerson.let {
        it.age+=4
        "Let age ${it.age}"
    }.println()
   //T.let and T.also are same but they are return different types.
    //T.also return same type
    firstPerson.also {
        it.age+=3
    }.printPerson()
}
data class Person(var name:String,var age:Int,var job:String){
fun printPerson()= println(this.toString())
}

fun String.println()=println(this)