package io.fracassi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AcceptanceTest {
    @Test
    fun `some scenarios`() {
        assertThat(landPerimeter(arrayOf("OXOOOX", "OXOXOO", "XXOOOX", "OXXXOO", "OOXOOX", "OXOOOO", "OOXOOX", "OOXOOO", "OXOOOO", "OXOOXX"))).isEqualTo("Total land perimeter: 60")
        assertThat(landPerimeter(arrayOf("OXOOO", "OOXXX", "OXXOO", "XOOOO", "XOOOO", "XXXOO", "XOXOO", "OOOXO", "OXOOX", "XOOOO", "OOOXO"))).isEqualTo("Total land perimeter: 52")
        assertThat(landPerimeter(arrayOf("XXXXXOOO", "OOXOOOOO", "OOOOOOXO", "XXXOOOXO", "OXOXXOOX"))).isEqualTo("Total land perimeter: 40")
        assertThat(landPerimeter(arrayOf("XOOOXOO", "OXOOOOO", "XOXOXOO", "OXOXXOO", "OOOOOXX", "OOOXOXX", "XXXXOXO"))).isEqualTo("Total land perimeter: 54")
        assertThat(landPerimeter(arrayOf("OOOOXO", "XOXOOX", "XXOXOX", "XOXOOO", "OOOOOO", "OOOXOO", "OOXXOO"))).isEqualTo("Total land perimeter: 40")
    }
}