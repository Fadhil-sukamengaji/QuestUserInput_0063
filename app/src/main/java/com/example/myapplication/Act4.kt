package com.example.myapplication

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@composable
fun FormDataDiri(modifier: Modifier){
    //variable" untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
}