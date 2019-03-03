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
    with(firstPerson){
        age+=1
        "Age is $age"
    }.println()
    firstPerson.run {
        age+=3
        "Run age is $age"
    }.println()
    firstPerson.let {
        it.age+=4
        "Let age ${it.age}"
    }.println()
}
data class Person(var name:String,var age:Int,var job:String){
fun printPerson()= println(this.toString())
}

fun String.println()=println(this)