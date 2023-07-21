fun buildingsWithSunsetView(buildings: List<Int>, direction: String): List<Int> {
    val indicesWithSunsetView = mutableListOf<Int>()
    val n = buildings.size

    if (n == 0) {
        return emptyList()
    }

    var maxHeight = 0

    // Iterate from the left (for "WEST" direction) or from the right (for "EAST" direction)
    val step = if (direction == "WEST") 1 else -1
    var i = if (direction == "WEST") 0 else n - 1

    while (i in 0 until n) {
        val currentHeight = buildings[i]

        // Check if the current building has a sunset view
        if (currentHeight > maxHeight) {
            indicesWithSunsetView.add(i)
            maxHeight = currentHeight
        }

        i += step
    }

    return indicesWithSunsetView
}

fun main() {
    val buildings = listOf(3, 5, 4, 4, 3, 1, 3, 2)
    val direction = "EAST"

    val sunsetViewIndices = buildingsWithSunsetView(buildings, direction)
    println("Buildings with sunset view indices: $sunsetViewIndices")
}
