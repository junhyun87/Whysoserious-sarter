/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.whysoserious.ui.jokes.all.list

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.raywenderlich.android.whysoserious.R
import com.raywenderlich.android.whysoserious.common.onClick
import com.raywenderlich.android.whysoserious.model.Joke
import kotlinx.android.synthetic.main.item_joke.view.*

class JokeHolder(
    itemView: View,
    private inline val onFavoriteClickHandler: (Joke) -> Unit
) : RecyclerView.ViewHolder(itemView) {

  fun displayData(joke: Joke) = with(itemView) {
    favoriteButton.onClick { onFavoriteClickHandler(joke) }

    jokeAuthor.text = joke.authorName
    jokeDescription.text = joke.text

    favoriteButton.setImageResource(if(joke.isFavorite) R.drawable.ic_favorite_filled else R.drawable.ic_favorite_border)
  }
}