package collection

import dataClassAndEnum.Data


fun main() {

    // collection 함수들
    val listOf = listOf<String>("sldfkj", "sdkfj")

    listOf.any {
        it == "0"
    }

    listOf.all {
        it == "0"
    }

    listOf.none {
        it == "sdf"
    }

    listOf.map {
        "이름$it"
    }

    // associate, partition

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf<Person>(Person("aa", 21), Person("bb", 22), Person("cc", 23))

    println(personList.associateBy { it.birthYear })

    val (over98, under98) = personList.partition { it.birthYear > 1998 }

    val numbers = listOf<Int>(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1) {50})

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)

}