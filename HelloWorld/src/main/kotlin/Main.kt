
fun main() {
    /**
     * Ejercicio 1
     */
    //Definir los objetos con las características de cada corredor
    var driver1: Driver = Driver("Max Verstappen", "Red bull racing", "Netherlands", 1)
    var driver2: Driver = Driver("Sergio Perez","Red bull racing","Mexico",11)
    var driver3: Driver = Driver("Fernando Alonso","Aston Martin","Spain",14)
    var driver4 = Driver("Lewis Hamilton", "Mercedes", "United Kingdom", 44)
    var driversArray = arrayOf(driver1, driver2, driver3, driver4) //Definir un array con los objetos creados
    //Ejercicios relacionados a la primera tarea
    println("Task 1: ")
    println()
    println("Drivers: ")
    println()
    //Hacer un ciclo for para imprimir todos los detalles de los corredores
    for (i in driversArray){
        println("Name: ${i.name}")
        println("Country: ${i.Country}")
        println("Team: ${i.team}")
        println("Number: ${i.number}")
        println()
    }
    //Ejercicios de la tarea 2
    println("Task 2: ")
    //Comparar a 2 corredores
    println("Using equality operator with driver 1 (Max Verstappen) and driver 2 (Sergio Perez): ${driver1 == driver2}")
    println("Using inequality operator with driver 1 and driver 2: ${driver1 != driver2}")
    println()
    //Ejercicios de la tarea 3
    println("Task 3: ")
    println("Making a copy of Max Verstappen: ")
    //Crear una copia de un corredor
    var evilVerstappenn = driver1.copy(name = "Evil Verstappen")
    //Imprimir las características de la copia creada
    println("Copy name: ${evilVerstappenn.name}")
    println("Original name: ${driver1.name}")
    println()
    //Ejercicios de la tarea 4
    println("Task 4: ")
    println("Destructuring driver 2 object: ")
    var (name, team, Country, number) = driver2
    println("$name, $team, $Country, $number")
    println()
    println("Task 5: ")
    println()
    for (i in driversArray){
        println(i.toString())
    }
}