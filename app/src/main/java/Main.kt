fun main() {
    print("Hello")

    println()

    val str = "안녕"
    println(str + "하세요")

    println()

    println("$str 하세요")
    println("${str}하세요")

    println()

    // 배열
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)    // arrayOf 메서드 사용해서 생성/초기화 함께 수행
    val numbers2 = arrayOf(1, 2, 3, 4, 5)   // 자료형 생략
//    println("$numbers")
//    println("$numbers2")
    for(value in numbers)
        print(value)
    println()
    for(value in numbers2)
        print(value)
    numbers[0]=5
    println()
    for(value in numbers)
        print(value)
    println()
    for(value in numbers2)
        print(value)

    println()

    // 제어문 - when
    val x = 1
    when(x) {
        1 -> println("x == 1")
        2, 3 -> println("x == 2 or x == 3")
        in 4..7 -> println("4부터 7사이")
        !in 8..10 -> println("8부터 10사이가 아님")
        else -> {
            print("x는 1이나 2가 아님")
        }
    }

    println()

    val number = 1
    fun isEven(num: Int) = when (num % 2) {
        0 -> "짝"
        else -> "홀"
    }
    println(isEven(number))

    println()

    // 제어문 - for
    // 1~3까지 출력
    for(i in 1..3)
        println(i)

    // 0~10까지 2씩 증가하며 출력 - step 키워드로 증감 간격 조정
    for(i in 0..10 step 2)
        println(i)
    // 10부터 0까지 2씩 감소하며 출력
    for(i in 10 downTo 0 step 2)
        println(i)
}