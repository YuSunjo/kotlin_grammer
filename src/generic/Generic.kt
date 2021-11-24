package generic

import java.util.*

fun main() {

}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("aaa")
    }


}

class B: A() {

}