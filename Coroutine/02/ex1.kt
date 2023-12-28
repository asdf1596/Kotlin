import kotlinx.coroutines.*
fun main(){
    Thread.{this: CoroutinesScope //launch:코루틴 빌드, GlobalScope:메인 코드가 작동된 후 실행.
    delay(timeMillis: 1000L)
    println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}