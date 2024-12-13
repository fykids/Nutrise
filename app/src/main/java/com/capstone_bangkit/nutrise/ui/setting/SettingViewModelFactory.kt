package com.capstone_bangkit.nutrise.ui.setting

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.capstone_bangkit.nutrise.userpref.UserPreferences

class SettingViewModelFactory(private val context: Context, private val pref: UserPreferences) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return if (modelClass.isAssignableFrom(SettingViewModel::class.java)) {
            SettingViewModel(context, pref) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}