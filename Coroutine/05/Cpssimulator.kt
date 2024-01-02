GlobalScope.launch {
    val userData = fetchUserData()
    var userCache = cacheUserData(userData)
    updateTextView(userCache)
}