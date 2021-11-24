package infix

fun main() {
    deliveryItem("name", destination = "seoul")

    println(6 multiply 4)
    println(6.multiply(4))

}

fun read(x: Int) {
    println("숫자 ${x} 입니다")
}

fun read(x: String) {
    println(x)
}

// default argument

// named argument
fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name} ${count} ${destination}")
}

// vararg - 개수가 정해지지 않은 파라미터
fun sum(vararg numbers: Int) {
    var sum = 0

    for (n in numbers) {
        sum += n
    }

    print(sum)
}

// infix

infix fun Int.multiply(x: Int): Int = this * x