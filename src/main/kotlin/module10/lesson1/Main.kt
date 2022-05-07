package module10.lesson1

fun main() {
    val devices = listOf(MobilePhone(), AppleWatch(), DiskPhone(), SmartFridge(), RadioPhone())
    devices.forEach {
        it.call("+7(959)290-39-09")
    }
    val webBrowsers = listOf<WebBrowser>(MobilePhone(), SmartTV())
    webBrowsers.forEach {
        it.playVideo("www.example.com")
    }
}