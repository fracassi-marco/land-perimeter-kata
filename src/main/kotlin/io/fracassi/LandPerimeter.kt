package io.fracassi

fun landPerimeter(rows: Array<String>): String {
    val world: List<List<Element>> = rows.map { row -> row.map { col -> asElement(col) } }

    val perimeter = world.mapIndexed { rowIndex: Int, row: List<Element> ->
        row.mapIndexed { colIndex, element ->
            val neighbors = mutableListOf<Element>()
            if (colIndex != 0)
                neighbors.add(world[rowIndex][colIndex - 1])
            if (colIndex != row.size - 1)
                neighbors.add(world[rowIndex][colIndex + 1])
            if (rowIndex != 0)
                neighbors.add(world[rowIndex - 1][colIndex])
            if (rowIndex != world.size - 1)
                neighbors.add(world[rowIndex + 1][colIndex])
            element.addNeighbors(neighbors)
        }
    }.flatten().sumOf { it.perimeter() }

    return "Total land perimeter: $perimeter"
}

private fun asElement(it: Char) = when (it) {
    'X' -> Land()
    else -> Water()
}

interface Element {
    fun addNeighbors(elements: List<Element>): Element
    fun perimeter(): Int
}

class Land(private val neighbors: List<Element> = emptyList()) : Element {
    override fun addNeighbors(elements: List<Element>) = Land(elements)

    override fun perimeter(): Int {
        return 4 - neighbors.count { it is Land }
    }
}

class Water : Element {
    override fun addNeighbors(elements: List<Element>)= this
    override fun perimeter() = 0
}