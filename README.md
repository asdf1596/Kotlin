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
형변환

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
val randeomNumber = Randem.nextInt(0,100)
```

처럼 사용
