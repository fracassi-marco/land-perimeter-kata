package io.fracassi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LandPerimeterTest {

    @Test
    fun `1x1 land in 1x1 world`() {
        assertThat(landPerimeter(arrayOf("X"))).isEqualTo("Total land perimeter: 4")
    }

    @Test
    fun `1x2 land in 1x2 world`() {
        assertThat(landPerimeter(arrayOf("XX"))).isEqualTo("Total land perimeter: 6")
    }
}