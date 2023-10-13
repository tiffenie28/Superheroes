package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Superhero(
    @StringRes val name: Int,
    @StringRes val hobbies: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val vuln: Int,
    @StringRes val vulndetail: Int
)
