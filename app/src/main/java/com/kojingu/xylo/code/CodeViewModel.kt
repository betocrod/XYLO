package com.kojingu.xylo.code

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class CodeViewModel {
    var code by mutableStateOf("")
        private set

    var userName by mutableStateOf("")
        private set

    var friends by mutableStateOf<List<String>>(emptyList())
        private set

}