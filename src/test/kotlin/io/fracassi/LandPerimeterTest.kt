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

    @Test
    fun `1x2 land on the left of 1x3 world`() {
        assertThat(landPerimeter(arrayOf("XXO"))).isEqualTo("Total land perimeter: 6")
    }

    @Test
    fun `1x2 land on the right of 1x3 world`() {
        assertThat(landPerimeter(arrayOf("OXX"))).isEqualTo("Total land perimeter: 6")
    }

    @Test
    fun `1x1 and 1x1 lands in 1x4 world`() {
        assertThat(landPerimeter(arrayOf("OXOX"))).isEqualTo("Total land perimeter: 8")
    }
}