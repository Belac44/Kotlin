fun main() {
    val number = -440

    println(number in 0..100)
    println('t' in "kotlin")
    println('K' in "kotlin")

    println(isDigit('5'))
    println(isNotDigit('a'))
}

fun isDigit(ch: Char) = ch in '0'..'9'
fun isNotDigit(ch: Char) = ch !in '0'..'9'