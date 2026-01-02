package com.example.questfirebase_073.repositori

import com.example.questfirebase_073.modeldata.Siswa
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

interface RepositorySiswa {
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
    suspend fun getSiswaById(id: Long): Siswa
    suspend fun updateSiswa(siswa: Siswa)
    suspend fun deleteSiswa(siswa: Siswa)
}