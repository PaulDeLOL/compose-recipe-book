package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    //@StringRes val descriptionResourceId: Int,
    //@StringRes val ingredientsResourceId: Int,
    //@StringRes val directionsResourceId: Int
)
