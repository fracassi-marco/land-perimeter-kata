package io.fracassi

class Land(vicini: Int) {

}

fun landPerimeter(rows: Array<String>): String {
    val totalPerimeter = rows.first().mapIndexed { index, character ->
        var perimeter = 4
        if (index != 0 ||
            index != rows.first().length - 1)
            perimeter--
        perimeter
    }.sum()
    return "Total land perimeter: $totalPerimeter"
}