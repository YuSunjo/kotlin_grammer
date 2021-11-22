class Student(name: String, age: Int, var studentNumber: Int): Person(name, age) {

    override fun introduce() {
        println("이름: ${name} 나이: ${age} 학번: ${studentNumber}")
    }

}