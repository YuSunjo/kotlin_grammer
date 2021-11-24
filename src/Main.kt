import two.Rabbit

fun main() {

    val person = Person("tnswh", 10)

    val person3 = Person3("tnswh")

    val student = Student("tnswh", 1000, 1000)
    student.introduce();

    val rabbit = Rabbit()
    rabbit.hello()
    rabbit.eat()

    val sum = sum(4, 3)
    print("$sum")


    // 고차함수
    b(::a)

    // 람다
    val c: (String) -> Unit = { str: String -> println("$str 람다함수")}
    val d = {str: String -> println("$str 람다함수")}
    // 파라미터가 한개일 경우 it 사용 가능
    val e : (String) -> Unit = { println("$it 람다함수")}
    b(c)

    // 스코프 함수  apply, run, with, also, let


    // apply에 있는 것은 자기자신이므로 참조연산자 필요 없이 사용 가능
    // 조작된 인스턴스 생성 가능
    val person4 = Person("tnswh", 1000)
    person4.apply {
        name = "[초특가]" + name
        introduce()
    }
    person4.run { println("$name , ${age}") }
    with(person4) {
        println("${name}, ${age}")
    }

    // 만약 스코프 밖에 name, age가 있었다면 그것이 우선시됨 -> it를 붙여줘야함
    person4.let { println("${it.name} ${it.age}") }
    person4.also { println("${it.name} ${it.age}") }

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun a(str: String) {
    print("${str} a")
}

// String을 파라미터로 받고 return 값이 없음 - Unit
fun b(function: (String) -> Unit) {
    function("b가 호출됨")
}

// object는 싱글톤 패턴 - 하나만 생성해서 공통으로 사용할 객체
object Counter {
    var count = 0

    fun countUp() {
        count++;
    }

    fun clear() {
        count = 0
    }

}

// class 안에도 object를 생성 가능
class FoodPoll(val name: String) {

    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++;
        count++;
    }

}