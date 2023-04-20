package com.example.searchtabapp

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Music : TabItem(R.drawable.baseline_music_note_24, "Music", { MusicScreen() })
    object Movies : TabItem(R.drawable.baseline_local_movies_24, "Movies", { MoviesScreen() })
    object Books : TabItem(R.drawable.baseline_menu_book_24, "Books", { BooksScreen() })
}
