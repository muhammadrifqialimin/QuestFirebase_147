package com.example.myfirebase.viewmodel.provider


import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.example.myfirebase.repositori.AplikasiDataSiswa
import com.example.myfirebase.viewmodel.EntryViewModel
import com.example.myfirebase.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container.repositorySiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container.repositorySiswa) }
    }
}