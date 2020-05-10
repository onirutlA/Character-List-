package com.example.submission

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Character(
    var name: String = "",
    var detail: String = "",
    var biography : String = "",
    var image: Int = 0
):Parcelable