fun main() {
    var belac = Person()
    println("His age is ${belac.personAge}")
    belac.setAge(21)
    println("His age is ${belac.personAge}")

    val messi = Person()
    val me = messi

    println(messi.personAge)
    println(me.personAge)

    messi.setAge(35)
    //me.setAge(21)

    println(messi.personAge)
    println(me.personAge)
}

class Person {
    var personAge = 0
    fun setAge(age: Int){
        personAge = age
    }
}