fun main(){
    val greetingFunction: (String) -> String ={
        val currentYear = 2018
        "歡迎來到 SimVillage, $it! (copyright $currentYear)"
    }
    println(greetingFunction("翁子皓"))
}