package me.lucyydotp.aoc23

import me.lucyydotp.aoc23.day1.Day1
import kotlin.test.Test
import kotlin.test.expect

class Day1Test {
    @Test
    fun test() {
        val input = TestUtils.loadResource("/day1")
        expect(53194) { Day1.calculate(input) }
    }
}
