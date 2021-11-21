class Person3(var name: String, var age: Int) {

    constructor(name: String) : this(name, 1000) {
        println("이름: ${name} , 나이: ${age}")
    }

}