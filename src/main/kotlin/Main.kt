//Hello! This is a simple console calculator
fun main(){
    while (true) {
        println("Введите первое число:")
        val firstString = readLine()?.toDoubleOrNull()
        println("Введите оператор \" + , - , * , / \"")
        val oper = readLine()
        println("Введите второе число:")
        val secondString = readLine()?.toDoubleOrNull()
        if (firstString != null && secondString != null && oper != null) {
            val result = calculate(firstString, secondString, oper)
            println("Результат: $result")
            println("Для выхода введите Stop")
            val exitCommand = readLine()?.uppercase()
            if (exitCommand == "STOP") break
        } else println("Вы ввели не верное значение!")
    }
}
fun calculate(a: Double?, b: Double?, operat: String?): Double {
    var answer = 0.0
    if (a != null && b != null && operat != null) {
        when (operat){
            "+" -> answer = a + b
            "-" -> answer = a - b
            "*" -> answer = a * b
            "/" -> answer = a / b
        }
    }
    return answer
}