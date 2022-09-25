package com.aftab.sudoku.domain

data class SudokuNode(
    val x: Int,
    val y: Int,
    val color: Int = 0,
    var readOnly: Boolean = true,
) : java.io.Serializable {
    override fun hashCode(): Int {
        return getHash(x, y)
    }
}

internal fun getHash(x: Int, y: Int): Int {
    val newX = x * 100
    return "$newX$y".toInt()
}