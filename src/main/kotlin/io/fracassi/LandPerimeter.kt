package io.fracassi

fun landPerimeter(rows: Array<String>): String {
    val totalPerimeter: Int = rows.first().mapIndexed { index, character ->
        if(character != 'X')
            0
        else {
            var perimeter = 4
            if (index != 0 && rows.first()[index - 1] == 'X' ||
                index != rows.first().length - 1 && rows.first()[index + 1] == 'X'
            )
                perimeter--
            perimeter
        }
    }.sumOf { it }
    return "Total land perimeter: ${totalPerimeter.toString()}"
}