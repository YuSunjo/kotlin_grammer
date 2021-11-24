package variable

fun main() {

    val a = LateInitSample()

    println(a)
    a.text = "sdf"
    println(a)


    val number: Int by lazy {
        println("초기화 시작")
        7
    }
    println("코드 시작")
    println(number)
    println(number)

}

// lazy
// const
// lateInit

class LateInitSample {
    lateinit var text: String

    // 초기화 되었는지 확인
    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        }
        else {
            return "기본값"
        }
    }
}

