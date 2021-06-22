fun main(){
    runSimulation("翁子皓"){playerName,numBuildings->
        val currentYear = 2018
        println("Adding $numBuildings houses")
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
    println("Construction Cost: ${cost * numBuildings}")
}