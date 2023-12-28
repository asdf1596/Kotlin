import kotlinx.coroutines.*

fun main() = runBlocking { this: CoroitineScope
    val job = launch { this: CoroutinesScope #캔슬 가능 개체
        repeat(time:1000) {i ->
            prinln(msg:"job: I'm sleeping $i ...")
        delay(timeMillis: 500L)
        }
    }
    delay(timeMillis: 1300L)
    println(msg: "main: I'm tried of waiting!")
    job.cancle()
    job.join()
    println(msg: "main: Now I can quit")
}