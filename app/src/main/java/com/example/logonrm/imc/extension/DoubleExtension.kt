package com.example.logonrm.imc.extension

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f",this)