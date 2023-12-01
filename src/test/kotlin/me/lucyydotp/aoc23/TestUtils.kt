package me.lucyydotp.aoc23

object TestUtils {
    /**
     * Loads a resource as a UTF-8 string.
     */
    fun loadResource(name: String) = this::class.java.getResource(name)!!.readText()
}
