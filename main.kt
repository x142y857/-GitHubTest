fun main(){
    runSimulation()
}

fun runSimulation(){
    val greetingFunction = configureetingFunction()
    println(greetingFunction("翁子皓"))
    println(greetingFunction("翁子皓"))
}
fun configureetingFunction():((String)->String ) {
    val structureType = "醫院"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings +=1
        println("添加 $numBuildings $structureType")
        "歡迎來到 SimVillage, $playerName! (copyright $currentYear)"
    }
}