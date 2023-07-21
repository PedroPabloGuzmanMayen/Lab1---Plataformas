//Definir el enum con características para cada elemento en él
enum class Team(val member1:String, val member2: String){
    Mercedes("Russell", "Hamilton"),
    Red_Bull_Racing("Verstappen", "Perez"),
    Ferrari("Leclerc", "Sainz"),
    McLaren("Piastri", "Norris"),
    Aston_Martin("Stroll", "Alonso"),
    Alpine("Gasly", "Ocon"),
    AlphaTauri("Tsunoda", "Ricciardo"),
    Alfa_Romeo("Guanyu", "Bottas"),
    Haas("Hulkenberg", "Magnussen"),
    Williams("Sergeant", "Albon"),
}

fun main(){
//Utilizar la función
    var team: Team = Team.Mercedes
    printDetails(team)
}
//Impirmir los miembros de cada equipo
private fun printDetails(team:Team){
    println("Members of the team: ${team.member1}, ${team.member2}")
}