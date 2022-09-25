package com.aftab.sudoku.domain

interface IGameDataStorage {
    suspend fun updateGame(game: SudokuPuzzle): GameStorageResult
    suspend fun updateNode(x: Int, y: Int, elepsedTime: Long): GameStorageResult
    suspend fun getCurrentGame(): GameStorageResult
}

sealed class GameStorageResult {
    data class OnSuccess(val currentGame: SudokuPuzzle) : GameStorageResult()
    data class OnError(val exception: java.lang.Exception) : GameStorageResult()
}