import sun.plugin.javascript.navig4.Layer

fun main(args: Array<String>) {
    val age = 19
    val layer = 5
    cakeCandles(age)
    cakeTop(age)
    cakeBottom(age, layer)


}

fun cakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println()
    print(" ")
    repeat(age) {
        print("|")
    }
    println()

}

fun cakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun cakeBottom(age: Int, layer: Int) {
    repeat(layer) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

