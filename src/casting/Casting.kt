package casting

fun main() {

    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if (b is Cola) {
        b.washDishes()
    }

    val c = b as Cola
    c.washDishes()

}
open class Drink {

    var name = "음료"

    open fun drink() {
        println("${name}으로 마십니다.")
    }

}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name} 중에서 ${type}을 마신다")
    }

    fun washDishes() {
        println("${type}을 설거지 한다")
    }

}