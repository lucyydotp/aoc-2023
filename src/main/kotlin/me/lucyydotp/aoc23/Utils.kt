package me.lucyydotp.aoc23

object Utils {
    operator fun Char.plus(other: Char) = charArrayOf(this, other).concatToString()
}
