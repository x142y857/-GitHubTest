fun main(){
    val greetingFunction: (String) -> String ={ playerName ->
        val currentYear = 2018
        "歡迎來到 SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("翁子皓"))
}