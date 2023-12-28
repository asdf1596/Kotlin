fun main() = runBlocking{
    repeat(100_000){
        launch{
            delay(1000L)
            print(".")
        }
    }
}