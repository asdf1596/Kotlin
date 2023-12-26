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
