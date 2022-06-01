
class Point {
    private var x : Int = 0
    private var y : Int = 0

    constructor() {
        x = 0
        y = 0
    }

    constructor(x : Int, y : Int) {
        this.x = x
        this.y = y
    }

    fun display() {
        println("x = $x y = $y")
    }

    override fun equals(other: Any?): Boolean {

        println("equals called")

        var p  = other as Point
        if(this.x != p.x) {
            return false
        }

        return this.y == p.y
    }

}



fun main6() {
    var p1 = Point(10, 20)
    var p2 = Point(10, 20)
    var p3 = p2

    println("p1 === p2 -> ${p1 === p2}")
    println("p2 === p3 -> ${p2 === p3}")
    line()

    println("p1 == p2 -> ${p1 == p2}") //p1 == p2  internally p1.equals(p2)
    println("p2 == p3 -> ${p2 == p3}")

}

fun main5() {
    var numbers = arrayOf(10, 20, 30, 40, 50)

    for(i in 0..numbers.size-1) {
        print("${numbers[i]} ")
    }
    line()

    Thread.sleep(3000)

    for(num in numbers) {
        print("$num ")
    }
    line()

    for((index, num) in numbers.withIndex()) {
        println("value at $index is $num")
    }
    line()

}


fun main4() {
    var num = 50

    when(num) {
        1 -> {
            println("One")
            println("1")
        }
        2 -> println("Two")
        3 -> println("Three")
        in 40..100 -> println("Passing marks scored")
        else -> println("Not valid number")
    }
}

fun main3() {
    var num1 = 100
    var num2 = 20
    var max : Int

    max = if(num1 > num2) {
        println("$num1 is greater")
        //max = num1
        num1 + 2
    }
    else {
        println("$num2 is greater")
        //max = num2
        num2 + 3
    }
    println("max = $max")
}

fun main2() {
    var numbers = 1..100
    var oddNumbers = numbers.step(2)
    for(n in oddNumbers) {
        print("$n ")
    }
    line()

    var r1 = (-10..10).reversed().step(3)
    for(n in r1) {
        print("$n ")
    }
    line()

}

fun line() {
    println("\n-------------------------")
}

fun main1() {
    var numbers =  1..10
    //for(num in numbers) {
    for(num in 1..10) {
        print("$num ")
    }
    println()

    var nums = 10.downTo(1)
    for(n in nums) {
        print("$n ")
    }
    println()
}