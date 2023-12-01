package me.lucyydotp.aoc23.day1

import me.lucyydotp.aoc23.Utils.plus

object Day1 {
    private fun parseLine(line: String): Int = (line.first(Char::isDigit) + line.last(Char::isDigit)).toInt()
    fun calculate(input: String) = input
        .lines()
        .filterNot(String::isBlank)
        .sumOf { parseLine(it) }
}
