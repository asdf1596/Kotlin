import kotlinx.coroutines.*
fun main() = 
    runBlocking{this: CoroutineScope
        launch{this: CoroutinesScope 
            myWorld()
        }
        println("Hello,")
}
suspend fun myWorld(){
    delay(timeMillis: 1000L)
    println("world!")
}