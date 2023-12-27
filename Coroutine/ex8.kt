import kotlinx.coroutines.*
fun main() = 
    runBlocking{this: CoroutineScope
        GlobalScope.launch {this: CoroutineScope
        repeat(times:1000) {i->
        println("I'm sleeping $i ...")
    delay(timeMillis: 500L)
        }   
    }
    delay(timeMillis: 1300L)
}