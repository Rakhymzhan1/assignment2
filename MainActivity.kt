package com.example.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.home.ui.theme.HomeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                HomePage()
            }
        }

    }

}
@Composable
fun HomePage() {
    // Тестовые данные
    val premieres = listOf(
        MovieItem("https://via.placeholder.com/100", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма")
    )
    val popular = listOf(
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма")
    )
    val actionUSA = listOf(
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма")
    )
    val Top = listOf(
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма")
    )
    val france = listOf(
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма")
    )
    val series = listOf(
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма"),
        MovieItem("https://via.placeholder.com/150", 7.8, "Близкие", "Драма")
    )




    Column(modifier = Modifier.padding(16.dp)) {
        MovieSection("Премьеры", premieres) { movie ->

            println("Нажата карточка фильма: ${movie.title}")
        }
        MovieSection("Популярное", popular) { movie ->
            println("Нажата карточка фильма: ${movie.title}")
        }
        MovieSection("Боевики США", actionUSA) { movie ->
            println("Нажата карточка фильма: ${movie.title}")
        }
        MovieSection("Топ-250", Top) { movie ->
            println("Нажата карточка фильма: ${movie.title}")
        }
        MovieSection("Драмы Франции", france) { movie ->
            println("Нажата карточка фильма: ${movie.title}")
        }
        MovieSection("Сериалы", series) { movie ->
            println("Нажата карточка фильма: ${movie.title}")
        }


    }
}
@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    HomeTheme {
        HomePage()
    }
}
// part 1
data class MovieItem(
    val imageUrl: String,
    val rating: Double,
    val title: String,
    val genre: String
)

// part 2
val primieres = listOf(
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма")
)
val popular = listOf(
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма"),
    MovieItem("https://via.placeholder.com/150",7.8 , "Близкие","драма")
)

//part 3
@Composable
fun MovieCard(movie: MovieItem, onClick: () -> Unit) {
    androidx.compose.material3.Card(
        modifier = Modifier
            .width(111.dp)
            .height(210.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        elevation = androidx.compose.material3.CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Box(modifier = Modifier.height(156.dp)) {
                // Изображение фильма
                Image(
                    painter = rememberImagePainter(movie.imageUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp)
                )
                // Рейтинг
                Text(
                    text = movie.rating.toString(),
                    color = Color.White,
                    modifier = Modifier
                        .padding(4.dp)
                        .background(Color(0xFF3D3BFF), shape = RoundedCornerShape(4.dp))
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    fontSize = 10.sp
                )
            }
            // Название фильма
            Text(
                text = movie.title,
                modifier = Modifier.padding(8.dp),
                fontSize = 14.sp,
                color = Color.Black
            )
            // Жанр фильма
            Text(
                text = movie.genre,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                fontSize = 12.sp,
                color = Color.Black
            )
        }
    }
}


//part 4 Populate each LazyRow with mock data created earlier.
@Composable
fun MovieSection(title: String, movies: List<MovieItem>, onMovieClick: (MovieItem) -> Unit) {
    Column(modifier = Modifier
        .padding(vertical = 16.dp)
        .fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(horizontal = 16.dp),
            fontSize = 18.sp,
            color = Color.Black
        )
        LazyRow(
            modifier = Modifier.padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {//part 5 Use items() inside the LazyRow to iterate through the data and display each item.
            items(movies) { movie ->
                MovieCard(movie = movie) {
                    onMovieClick(movie) // part 6 Add click listeners for each item in the LazyRow so that the  user can interact with them (e.g., navigate to a detail page  when an item is clicked).
                }
            }
        }
    }//7. Add padding and spacing between rows and items to improve the visual appearance of the home page.
}
