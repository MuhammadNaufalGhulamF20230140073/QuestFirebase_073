package com.example.questfirebase_073.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questfirebase_073.modeldata.DetailSiswa
import com.example.questfirebase_073.modeldata.UIStateSiswa
import com.example.questfirebase_073.modeldata.toDataSiswa
import com.example.questfirebase_073.modeldata.toUiStateSiswa
import com.example.questfirebase_073.repositori.RepositorySiswa
import com.example.questfirebase_073.view.route.DestinasiDetail
import com.example.questfirebase_073.view.route.DestinasiEdit
import kotlinx.coroutines.launch

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositorySiswa: RepositorySiswa
) : ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    // Mengambil ID sebagai String -> Long
    private val idSiswa: Long = savedStateHandle.get<String>(DestinasiEdit.itemIdArg)?.toLong()
        ?: error("idSiswa tidak ditemukan di SavedStateHandle")

    init {
        viewModelScope.launch {
            // Tanda !! berarti kita yakin data ada (force unwrap) sesuai gambar
            uiStateSiswa = repositorySiswa.getSatuSiswa(idSiswa)!!
                .toUiStateSiswa(true)
        }
    }
