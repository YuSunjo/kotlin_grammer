package nullcheck

import java.util.*

fun main() {

    // ?. ?: !!.

    var a: String? = null

    // null이면 Uppercase가 실행되지 않음
    println(a?.uppercase())

    // ?: 대체
    println(a?:"defalut".uppercase())

//    // 애러 발생
//    println(a!!.uppercase())

}