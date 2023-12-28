import kotlinx.coroutines.*
fun main() = 
    runBlocking{this: CoroutineScope
        launch {this: CoroutineScope
            repeat(times:5) {i->
            println("Coroutine A,  $i ...")
            delay(timeMillis:10L)
            }   
        }
        launch {this: CoroutineScope
            repeat(times:5) {i->
            println("Coroutine B,  $i ...")
            delay(timeMillis:10L)
            }   
        }
    println("Coroutine Outer")
} 