fun main(){
    val greetingFunction: () -> String ={
        val currentYear = 2018
        "歡迎來到 SimVillage, 翁子皓! (copyright $currentYear)"
        println(greetingFunction())
    }