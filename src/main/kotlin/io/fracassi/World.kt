package io.fracassi

class World(private val rows: Array<String>) {
    fun cells() = rows.mapIndexed { rowIndex, row ->
        row.mapIndexed { colIndex, col -> asCell(col, rowIndex, colIndex) }
    }.flatten()

    private fun asCell(char: Char, row: Int, col: Int) = when (char) {
        'X' -> Land(row, col)
        else -> Water()
    }
}