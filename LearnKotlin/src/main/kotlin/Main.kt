fun main() {
    val elements = listOf("A","B","C")

    for(e in elements){
        println("Current element: $e")
    }

    for (num in 1..7){
        println("At number $num")
    }

    var range1 = 1..10
    var range2 = 1 until 10

    for (num in range1){
        println("Range 1 numbers: $num")
    }
    for (num in range2){
        println("Range 2 numbers: $num")
    }

    showRange(1..7)
    showRange(5 downTo 1)
    showRange(range=10 downTo 0 step 2)

    for (letter in 'A'..'Z'){
        print(letter)
    }
    println()

    var character: Char = 'a'

    println("Addition of the two gives: ${character+25}")
    for (char in "Jnskhm "){
            print(char+1)
    }

    repeat(3){
        println("You never make a move when you are reeling from a loss")
    }
}

fun showRange(range: IntProgression){
    for (num in range){
        println("Current number: $num")
    }

    println("// $range\n")
}