fun main() {
    //Definir una función para hallar los caracteres que no se repiten
    fun nonRepeatingCharacter(string: String): String {
        var bool = false //Definir la variable bool, esta nos ayudará a que las salidas que queremos sean generadas
        //Iterar sobre cada elemento del sitring
        for (i in string) {
            //Si hay un elemento del string el cuál solo está una vez, cambiar bool a true para que no se ejecute la siguiente condición que hay. Retornar el primer caracter que no se repite
            if (string.count { it == i } == 1) {
                bool = true
                return "El primer caracter que no se repite es $i"
            }
        }
        //si no hay caracteres que no se repitan, indicarlo
        if (bool == false){
            return "No hay caracteres que no se repitan"
        }
        return ""
    }

    val inputString = "example"
    val result = nonRepeatingCharacter("aabbb")
    println(result)
}
