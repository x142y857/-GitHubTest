fun main(){
    runSimulation("翁子皓", ::printConstructionCost){playerName,numBuildings->
        val currentYear = 2018
        println("添加 $numBuildings 房子")
        "歡迎來到 SimVillage, $playerName! (copyright $currentYear)"
    }
}
inline fun runSimulation(playerName: String,cosPrinter: (Int)->Unit,greetingFunction: (String,Int)->String ) {
    val numBuildings = (1..3).shuffled().last() //Randomly selects 1,2, or 3
    cosPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))
}

fun printConstructionCost(numBuildings: Int){
    val cost = 500
    println("建築成本: ${cost * numBuildings}")
}