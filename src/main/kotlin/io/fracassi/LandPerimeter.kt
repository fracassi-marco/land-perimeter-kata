package io.fracassi

fun landPerimeter(rows: Array<String>): String {
    val world =  World(rows)
    val perimeter = world.cells().sumOf {
        it.perimeter(world)
    }

    return "Total land perimeter: $perimeter"
}