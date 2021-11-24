package dataClassAndEnum

fun main() {

    val a = General("name", 21)

    println(a == General("name", 21))
    println(a.hashCode())
    println(a)

    val b = Data("data", 21)
    println(b == Data("data", 21))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("이런"))
    println(b.copy(id = 111))

//    val listOf = listOf(Data("name1", 21), Data("name2", 22))
//
//    for ((a, b) in listOf) {
//        println(a, b)
//    }

}

class General(val name: String, val id: Int)


data class Data(val name: String, val id: Int)