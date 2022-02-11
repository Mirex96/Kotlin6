// 6. Написать функцию, которая возвращает число 15.
fun main() {
    val number1 = 10
    val number2 = 5
    println(check(number1, number2))
}

fun check(number1: Int, number2: Int): Any {
    return if (number1 > number2) {
        15
    } else {
        "Error"
    }
}