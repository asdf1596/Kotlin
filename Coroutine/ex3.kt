import kotlinx.coroutines.*
fun main() = 
    runBlocking{this: CoroutineScope
        GlobalScope.launch{this: CoroutinesScope //launch:코루틴 빌드, GlobalScope:메인 코드가 작동된 후 실행.
        delay(timeMillis: 1000L)
        println("World!")
        }
        println("Hello,")
        delay(timeMillis: 2000L)
    }
