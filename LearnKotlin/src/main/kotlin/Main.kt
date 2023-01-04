fun main() {
    val bigger:Int = isGreater(12,56)

    println(bigger)

    val result = uniFunc()

    println(result)
}

fun isGreater(a: Int, b: Int): Int = if (a > b) a else b

fun uniFunc()=Unit