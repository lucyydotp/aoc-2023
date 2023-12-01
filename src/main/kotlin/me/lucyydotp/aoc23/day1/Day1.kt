package me.lucyydotp.aoc23.day1

import me.lucyydotp.aoc23.Utils.plus

object Day1 {

    private const val DIGITS = "0123456789"
    private fun parseLine(line: String): Int = (line.first { it in DIGITS } + line.last { it in DIGITS }).toInt()
    fun calculate(input: String) = input
        .lines()
        .filterNot(String::isBlank)
        .sumOf { parseLine(it) }
}
