package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variable" untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    //variable" untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf("")}

}