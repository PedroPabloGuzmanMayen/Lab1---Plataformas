fun main(){
    //Definir una función para determinar que edificios ven el atardecer
    fun buildings(buildings: List<Int>, direction: String): List<Int> {
        //Cambiar las letras del parámetro direction a mayúsculas
        var dir = direction
        dir = dir.toUpperCase()
        //Definir un array el cuál almacenará los índices de los edificios que ven el atardecer
        var finalarray: MutableList<Int> = mutableListOf()
        // Definir un array que servirá para determinar si se empieza a recorrer el array de edificios desde la izquiera o desde la derecha
        var arr: List<Int>
        //Esta variable almacenará la altura máxima encontrada
        var max: Int
        //Condición para determinar si se empieza en la izquierda o en la derecha
        if (dir == "EAST") {
            arr = buildings.indices.reversed().toList()
        }
        else{
            arr = buildings.indices.toList()
        }
        //Añadir el primer o último elemento del array
        finalarray.add(arr[0])
        //Como el primer elemento ya fue almacenado, este tiene la altura más grande hasta ese momento
        max = buildings[arr[0]]
        for (i in arr){
            //Como ya agregamos el primer elemento, solo nos interesan los otros
            if(i != arr[0]){
                //Si un edificio tiene una altura mayor a la altura más grande encontrada hasta ese momento, este podrá ver el atardecer, por ende lo agregamos
                if (buildings[i] > max){
                    finalarray.add(i)
                    max = buildings[i]
                }
            }
        }
        //Retornar el array ordenado
        return finalarray.sorted()
    }
    var test = buildings(listOf(3, 5, 4, 4, 3, 1, 3, 2), "west")
    println(test)

}