package com.example.questfirebase_073.view.route

import com.example.questfirebase_073.R
import com.example.questfirebase_073.view.route.DestinasiNavigasi

object DestinasiDetail : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}