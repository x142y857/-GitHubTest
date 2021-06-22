fun main(){
    val greetingFunction: (String,Int) -> String ={playerName,numBuildings->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "歡迎來到 SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("翁子皓",2))
}