package io.fracassi

fun landPerimeter(rows: Array<String>): String {
    val world = rows.first().map { asElement(it) }

    val perimeter = world.mapIndexed { col, element ->
        val neighbors = mutableListOf<Element>()
        if(col != 0)
            neighbors.add(world[col - 1])
        if(col != world.size - 1)
            neighbors.add(world[col + 1])
        element.addNeighbors(neighbors)
    }.sumOf { it.perimeter() }

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