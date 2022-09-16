package io.fracassi

class Land(private val row: Int, private val col: Int) : Cell {

    override fun perimeter(world: World): Int {
        val neighborLands = world.cells()
            .filterIsInstance<Land>()
            .count { it.isNeighborOf(this) }
        return 4 - neighborLands
    }

    private fun isNeighborOf(land: Land): Boolean {
        if(land.col == col && (land.row == row - 1 || land.row == row + 1))
            return true
        if(land.row == row && (land.col == col - 1 || land.col == col + 1))
            return true
        return false
    }
}