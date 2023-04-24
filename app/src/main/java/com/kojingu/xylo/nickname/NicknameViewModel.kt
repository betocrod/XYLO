package com.kojingu.xylo.nickname

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class NicknameViewModel {
    var search by mutableStateOf("")
        private set

    fun search(query: String) {

    }
}