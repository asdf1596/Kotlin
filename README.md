# Kotlin

## 코틀린

```
#기본은 자바
fun main(){
    print("hello world") #main함수는 fun main(){}, 세미콜론은 있어도 되고 없어도 되고
    #prinln 도 존재
}
```

기본 변수는 var (변수명) = (값)

기본적으로 변수형태는 알아서 추리

변수명 정할 시->var (변수명) : (Int, String, Double.....) = (값)

상수는->val (변수명) = (값)

상수는 값 변경 불가

전역변수는 메인 함수 밖에

변수 or상수 앞에 const 붙일 시 메인함수보다 먼저 컴파일

## 형변환

```
var i = 10
var l = 20L
var name = "10"
i = name.toInt() #(변수명).to+(원하는 형)() 형태로 입력
```

베이스가java

ㄴuppercase,lowercase사용 가능

ㄴ배열도 변수명[] 사용 가능

ㄴprint할 때 변수가 필요하면 + 대신 $(변수명) 또는 ${(변수명)}

ㄴKotlin.math.max(),min() 사용 가능

random 사용할때는

```
val randeomNumber = Randem.nextInt(0,100) #0~99까지
```

처럼 사용

## 키보드 입력

```
val reader = Scanner(System.'in')
reader.nextInt() #숫자입력
reader.next() #문자입력
```

## if문

java와 동일

## when문

```
var i = 5
when {
    i>10 -> {
        print("10보다 크다")
    }
    i > 5 ->{
        print("5보다 크다")
    }
}
```

변수에 if or when 입력 가능

## 3항연산자

```
var i = 5
var result = if (i>10) true else false
```

## 반복문

```
val items = listOf(1,2,3,4,5)
for (item in items){
    print(item)
}
```

```
val items = listOf(1,2,3,4,5)
for (i in 0..(items.size -1)){
    print(item)
}
```

## forEach

```
items.forEach {item ->
    print(item)
}
```

## 리스트

변경가능한 list만들때는

```
val items = mutableListOf(1,2,3,4,5)
items.add(6)
items.remove(3)
```

## array

```
val items = arrayOf(1,2,3)
items[0] = 10
```

## try catch

```
try{

} catch (e.message){

}
```

## null

```
var name: String? = null #String? 는 String와 다르다
```

null이 아닐 때 실행하려면

```
name?.let{
    name2 = name
}
```

## 함수

```
fun sum(a:Int, b:Int) : Int{
    return a+b
}
```

또는

```
fun sum(a:Int, b:Int) = a+b
```

## class

```
fun name(){
    val jhon = Person("John", 20)
    print(jhon.name, jhon.age)
}
class Person(val name: String, var age : Int,)
```

## getter setter

override를 통해 설정 or class 앞에 data 붙이기

```
data class Person()
```

## init

class가 실행될때마다 실행되게 하려면 init 사용

```
class Person(){
    init{
        print("1")
    }
}
```

init 부분에 private set 작성 시 외부에서 변경 불가

## field

```
class Person(){
    var hobby = "축구"
    private set
    get() = "취미": $field #여기는 변수명이 아닌 field 사용
    init{
        print("1")
    }
}
```

## 상속

```
fun main(){
}
class dog{
    fun move(){
        //
    }
}
class cat{
    fun move(){
        //
    }
}
```

을 바꾸면

```
fun main(){
}
abstract ckass Animal{
    open fun move(){ #코틀린은 상속받아도 사용하려면 open 필요
        print("이동")
    }
}
class dog : Animal(){
    override fun move(){
        println("껑충")
    }
}
class cat : Animal(){
    override fun move(){
        println("살금")
    }
}
```

## interface

```
fun main(){
}
interface Drawable{
    fun draw()
}
abstract ckass Animal{
    open fun move(){ #코틀린은 상속받아도 사용하려면 open 필요
        print("이동")
    }
}
class dog : Animal(), Drawable{ #소괄호 없음
    override fun move(){
        println("껑충")
    }
}
class cat : Animal(){
    override fun move(){
        println("살금")
    }
}
```

이해 더 필요

## type check

```
fun main(){
    val dog : Animal = DOG()
    val cat = Cat()

    if(dog is Dog){
        println("멍멍이")
    }
}
interface Drawable{
    fun draw()
}
abstract ckass Animal{
    open fun move(){
        print("이동")
    }
}
class dog : Animal(), Drawable{
    override fun move(){
        println("껑충")
    }
}
class cat : Animal(){
    override fun move(){
        println("살금")
    }
}
```

## 제네릭

```
fun main(){
    val box = Box(10)
    val box2 = Box("dfdfdf")

    print(box.value)
}
class box<T>(var value: T){

}
```

이해 더 필요

## 콜백

```
fun main(){
    myFunc(10){ #람다식?
        println("함수 호출")
    }
}
fun myFunc(a:Int,callBack : () -> Unit){
    println("함수 시작")
    callBack()
    println("함수 끝")
}
```

## suspend

이래저래 이해 더 필요?

# 코루틴

코루틴(Coroutine)은 일반 루틴과는 다르게 중단과 재개가 가능하며 중단한 곳에서 재개가 가능하다.

비동기 처리를 코루틴이 순차적으로 할 수 있도록 도와준다.

suspend에 대한 이해 및 비동기 처리에 대한 공부가 더 필요한 듯...

물론 후반에 갈수록 어려워지지만 시작하기에는 어렵지 않다

```
import kotlinx.coroutines.*
fun main(){
    GlobalScope.launch{this: CoroutinesScope //launch:코루틴 빌드, GlobalScope:메인 코드가 작동된 후 실행.
    delay(timeMillis: 1000L)
    println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}
```

ㄴ한번World!를 실행 후 계속 실행한다는데 프로그램이 종료돠어서 World!가 2번 이상 츨력되지 않는다고 함...어쨰서..?

ㄴ다시 생각해보니 메인 코드와 코루틴을 동시에 실행시키는데 프로그램 종료 조건은 메인 프로그랭 종료이니 그런듯?

```
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
```

```
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

```

```
import kotlinx.coroutines.*
fun main() =
    runBlocking{this: CoroutineScope
        val job = GlobalScope.launch{this: CoroutinesScope
            delay(timeMillis: 3000L)
            println("World!")
        }
        println("Hello,")
        job.join() //아마 함수 실행시키는 거로 보임
    }

```

## Structured concurrency

```
import kotlinx.coroutines.*
fun main() =
    runBlocking{this: CoroutineScope
        this.launch{this: CoroutinesScope //launch:코루틴 빌드, GlobalScope:메인 코드가 작동된 후 실행.
            delay(timeMillis: 3000L)
            println("World!")
        }

        launch{this: CoroutinesScope //launch:코루틴 빌드, GlobalScope:메인 코드가 작동된 후 실행.
            delay(timeMillis: 3000L)
            println("World!")
        }
        println("Hello,")
    }

```

결론적으로 실행까지 기다려주는 것이 스트럭쳐드 컨크러시이고 상당히 자주 나온다.

```
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
```

ㄴ서스펜드 평션(예:delay)는 서스펜드 및 코루틴에서만 사용 가능하다

```
fun main() = runBlocking{
    repeat(100_000){
        launch{
            delay(1000L)
            print(".")
        }
    }
}
```

ㄴ코루틴이 가볍다 증명용 코드

```
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
```

ㄴ메인프로세스가 끝날 시 코루틴도 끝난다는 코드

```
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
```

ㄴ코루틴의 중단 및 재개의 예시 코드

메인 코드와 코루틴은 동시에 실행이 가능하지만 코루틴끼리는 싱글 스레드에서 동작하여서

내부 작업은 순차적으로 실행된다.

병렬로 동작하려면 동시성을 제어해야 한다.(await,async,delay등 사용)

# 코루틴 3강

```
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
```

실행과 동시에 job이 실행->1.3초 후에 cancle이 실행되고 정지함->(그럼 join은 어째서 존재하는가?)????

```
import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) { // computation loop, just wastes CPU
            // print a message twice a second
            //yield()
            if (currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
}
```

cancleandjoin이 잘 작동되지 않는 이유는 delay같은 서스펜드 펑션이 없어서

yield()가 있으면 delay없이도 가능

```
import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (isActive) { // cancellable computation loop
            // print a message twice a second
            if (currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
}
```

isActive는 코루틴이 돌아갈 수 있는 상태인지 아닌지를 판별하는 것인데 cancle로 인해 불허되어서 코드 정지

```
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            println("job: I'm running finally")
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
}
```

cancle이 익셒션을 발생시키고 그것으로 인해 try가 아닌 finally가 실행된다

```
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                println("job: I'm running finally")
                delay(1000L)
                println("job: And I've just delayed for 1 sec because I'm non-cancellable")
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
}
```

rare한 케이스, 정지된 코루틴 안에서 코루틴이 실행되는 경우

```
import kotlinx.coroutines.*

fun main() = runBlocking {
    withTimeout(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
}
```

0.5초씩 1000번 박복하는 코드인데 withTimeout을 통해 정지시킨다.(허나 메인 코드여서 그런지 익셒션이 발생한다고 한다.)

```
import kotlinx.coroutines.*

fun main() = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
        "Done" // will get cancelled before it produces this result
    }
    println("Result is $result")
}
```

이번에는 시간이 지날 시 null값으로 바뀌고 값이 "Done"으로 바뀌는 코드이다.

if문도 아닌데 사실 왜 "Done"값이 나오는지 잘 모르겠다.

ㄴ찾아보니 whitTimeOrNull이 마지막으로 나온 표현식의 값을 반환한다고 해서 "Done"이 출력되는 듯 하다.(if문 비숫한 것 같기도..?)

# 코루틴 4강

```
import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}
```

순차적으로 돌아가는 코드

```
import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}
```

순차적으로 ->비동기적으로 실행(실행시간 줄이기),async실행시 코드 실행 시작만 하고 바로 다음줄로 넘어감,await->async 작동될때까지 기다리기

```
import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
        // some computation
        one.start() // start the first one
        two.start() // start the second one
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}
```

라인의 start에 LAZY를 걸었을 때 start를 걸어야 작동 시작되도록 코딩,만약 start를 하지 않을 시 await를 만나야 실행이 되서 2초가 걸림

```
import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
        // some computation
        one.start() // start the first one
        two.start() // start the second one
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}
```

위 예시는 하지 말라는 예시이다. 위 코드를 실행할 시 큰일이 벌어짐(외부함수여서 익셒션이 발생하여도 중지가 되지 않는다)(더 생각 필요)

```
import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed in $time ms")
}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    one.await() + two.await()
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}
```

이 경우는 scope에서 쓰다 보니 익셒션이 발생하면 캔슬된다,스트럭쳐드 컨크러쉬 형태로 만들어서 하는게 좋다

```
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    try {
        failedConcurrentSum()
    } catch(e: ArithmeticException) {
        println("Computation failed with ArithmeticException")
    }
}

suspend fun failedConcurrentSum(): Int = coroutineScope {
    val one = async<Int> {
        try {
            delay(Long.MAX_VALUE) // Emulates very long computation
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> {
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}
```

실행-one,two실행-two에서 출력 후 익셒션 발생-전파-one에서 finally로 연결-출력-전파로 인해 메인에서 catch로 이동-출력

# 코틀린5강(이해가 힘든 용어들이 좀 들림)

## 코틀린이 어떻게 돌아가는지

순차적으로 작성했음에도 어떻게 비동기적으로 돌아가는지

ㄴ함수의 끝에 파라미터가 하나 추가되어 컨티뉴에이션이라는 객체를 넘겨주는 형태로 변경

ㄴ코드에서 실행할때 LABEL을 넣어서 중단 및 재생 기준을 만듬

ㄴswtich case문 같은 느낌

ㄴ컨티뉴에이션..?

ㄴ콜백(?)같은 느낌

## 코틀린 java식

코드 쓴 후에 Tools - Kotlin - Show Kotlin Bytecode - 디컴파일

코틀린 코드가 분해? 되어 보여짐

switch case문이 보인다.

```
GlobalScope.launch {
    val userData = fetchUserData()
    var userCache = cacheUserData(userData)
    updateTextView(userCache)
}
```

ㄴwhen문 안에서 기준이 되는 변수의 값을 늘려가면서 순차적 실행처럼 보임

ㄴ또한 when문이기 떄문에 중단 및 재생이 가능하다

결론:콜백을 내가 하는것이 아닌 코틀린 컴파일러가 하는 것

(이래저래 이해하려면 여러번 봐야할듯 하다)

# 6강

## 디스패처

코루틴이 어떤 스레드에서 실행시킬지 결정해주는 요소

```
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch { // context of the parent, main runBlocking coroutine
        println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
        println("Default               : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(newSingleThreadContext("MyOwnThread")) { // will get its own new thread
        println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
    }
}
```

코루틴 4개 실행순서:2-3-4-1

2번:main 스레드에서 실행

3번:worker-1에서 실행

4번:비용이 높은.한번 사용마다 스레드를 만듬,실사용시에는 newSingleThreadContext("MyOwnThread").use로 쓰는게 좋음

1번:runblocking에서 옵셔널 파라미터 없이 실행됨->그럴시 자신을 호출했던 곳(메인)에서 실행

디스페처:어디서 코루틴일 실행될지 정하며 코루틴 콘텍스트에 저장된다

## 코루틴 스레드와 디버깅

```
import kotlinx.coroutines.*

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() = runBlocking<Unit> {
    val a = async {
        log("I'm computing a piece of the answer")
        6
    }
    val b = async {
        log("I'm computing another piece of the answer")
        7
    }
    log("The answer is ${a.await() * b.await()}")
}
```

코틀린 라이브러리는 코루틴을 디버깅하기 위한 도구가 있다.

log라는 함수는 지금 어디서 실행되고 있는지 알려준다.

만약 오느 코루틴에서 실행되고 있는지 볼려면 jvm option에서 설정을 추가한다.

```
import kotlinx.coroutines.*

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() {
    newSingleThreadContext("Ctx1").use { ctx1 ->
        newSingleThreadContext("Ctx2").use { ctx2 ->
            runBlocking(ctx1) {
                log("Started in ctx1")
                withContext(ctx2) {
                    log("Working in ctx2")
                }
                log("Back to ctx1")
            }
        }
    }
}
```

withcontext를 통해 스레드간을 점프할 수 있다.

use를 통해 스레드를 클로즈 해줬다.(?)

## 콘텍스트

ㄴ...(공부 필요)

```
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    println("My job is ${coroutineContext[Job]}")
}
```

## children

```
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    // launch a coroutine to process some kind of incoming request
    val request = launch {
        // it spawns two other jobs
        launch(Job()) {
            println("job1: I run in my own Job and execute independently!")
            delay(1000)
            println("job1: I am not affected by cancellation of the request")
        }
        // and the other inherits the parent context
        launch {
            delay(100)
            println("job2: I am a child of the request coroutine")
            delay(1000)
            println("job2: I will not execute this line if my parent request is cancelled")
        }
    }
    delay(500)
    request.cancel() // cancel processing of the request
    println("main: Who has survived request cancellation?")
    delay(1000) // delay the main thread for a second to see what happens
}
```

코루틴이 실행될시 코루틴은 부모의 자식 코루틴이 된다.

996줄의 코루틴은 앞선 launch의 자식이 되는 것

대신 globalscope의 경우는 예외이다.

위 코드의 경우는 globalscope는 예외의 경우라서 끝까지 실행이 되었지만 일반 자식 코루틴의 경우에는

부모가 cancle되어서 자식도 cancle되었다.

## 부모 코루틴의 책임

부모 코루틴은 모든 자식 코루틴들이 실행될때까지 기다려줌(직접 트랙킹(?) 필요없음)

```
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    // launch a coroutine to process some kind of incoming request
    val request = launch {
        repeat(3) { i -> // launch a few children jobs
            launch  {
                delay((i + 1) * 200L) // variable delay 200ms, 400ms, 600ms
                println("Coroutine $i is done")
            }
        }
        println("request: I'm done and I don't explicitly join my children that are still active")
    }
    request.join() // wait for completion of the request, including all its children
    println("Now processing of the request is complete")
}
```

부모 코드가 다 실행되었음을 알린 후에도 자식 코루틴이 끝날떄까지 기다림을 알려주는 코드

## 코루틴 엘리먼트 하나로 만들기

```
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Default + CoroutineName("test")) {
        println("I'm working in thread ${Thread.currentThread().name}")
    }
}
```

여러개의 코루틴 엘리먼트(?)를 넣고 싶을때는 + 사용하기,(+는 자체적으로 더하는 기능이 있음)

## 코루틴 스코프

```
import kotlinx.coroutines.*

class Activity {
    private val mainScope = CoroutineScope(Dispatchers.Default) // use Default for test purposes

    fun destroy() {
        mainScope.cancel()
    }

    fun doSomething() {
        // launch ten coroutines for a demo, each working for a different time
        repeat(10) { i ->
            mainScope.launch {
                delay((i + 1) * 200L) // variable delay 200ms, 400ms, ... etc
                println("Coroutine $i is done")
            }
        }
    }
} // class Activity ends

fun main() = runBlocking<Unit> {
    val activity = Activity()
    activity.doSomething() // run test function
    println("Launched coroutines")
    delay(500L) // delay for half a second
    println("Destroying activity!")
    activity.destroy() // cancels all coroutines
    delay(1000) // visually confirm that they don't work
}
```

ㄴ실행(dosomthing)을 하다가 멈추면(destroy) 실행 멈두기(cancle)

안드로이드 앱을 쓰다가 끄면은 작업을 멈추어야 한다. 그것을 위해 코루틴 스코프가 있다.
