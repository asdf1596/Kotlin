import kotlinx.coroutines.*
fun main() = 
    runBlocking{this: CoroutineScope
        val job = GlobalScope.launch{this: CoroutinesScope //launch:코루틴 빌드, GlobalScope:메인 코드가 작동된 후 실행.
            delay(timeMillis: 3000L)
            println("World!")
        }
        println("Hello,")
        job.join()
    }
