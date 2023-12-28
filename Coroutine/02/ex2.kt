import kotlinx.coroutines.*
fun main(){
    GlobalScope.launch{this: CoroutinesScope 
        delay(timeMillis: 1000L)
        println("World!")
    }
    println("Hello,")
    runBlocking{this:CoruotineScope //코루틴 실행용 runBlocking
        delay(timeMillis: 2000L)
    }
}