fun main() {
    val person1 = Person("Belac")

    person1.getName()
    println(person1.name)
}

class Person(val name: String = "Unknown"){
    fun getName(){
        println("My name is $name")
    }

    override fun toString(): String {
        return name
    }
}