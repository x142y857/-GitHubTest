fun main(){
    val greetingFunction = { playerName: String,numBuildings: Int->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "歡迎來到 SimVillage, $playerName! (copyright $currentYear)"
    }
    runSimulation("翁子皓",greetingFunction)
}
fun runSimulation(playerName: String,greetingFunction: (String,Int)->String )
{
    val numBuildings = (1..3).shuffled().last() //Randomly selects 1,2, or 3
    println(greetingFunction(playerName,numBuildings))
}