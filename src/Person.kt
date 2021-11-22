// open으로 해야지 상속을 받을 수 있음
open class Person(var name: String, var age: Int) {

    init {
        println("이름: ${name} 과 나이: ${age}")
    }

    // open 해놔야지 오버라이딩을 할 수 있음
    open fun introduce() {
        println("이름은 ${name} 나이 ${age}")
    }

}