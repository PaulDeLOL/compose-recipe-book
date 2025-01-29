/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Recipe

/**
 * [Datasource] generates a list of [Recipe]
 */
class Datasource() {
    fun loadRecipes(): List<Recipe> {
        return listOf<Recipe>(
            Recipe(R.string.recipe1, R.drawable.image1),
            Recipe(R.string.recipe2, R.drawable.image2),
            Recipe(R.string.recipe3, R.drawable.image3),
            Recipe(R.string.recipe4, R.drawable.image4),
            Recipe(R.string.recipe5, R.drawable.image5),
            Recipe(R.string.recipe6, R.drawable.image6),
            Recipe(R.string.recipe7, R.drawable.image7),
            Recipe(R.string.recipe8, R.drawable.image8),
            Recipe(R.string.recipe9, R.drawable.image9),
            Recipe(R.string.recipe10, R.drawable.image10))
    }
}
