package src
fun main() {
    val test = ConsoleOut()
    try {
        print(test.out("hello world", 7, COLOR.RED))
    }
    catch (error:NoSuchElementException){
        println(error.message)
    }
}