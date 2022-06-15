package collections

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import sun.security.util.AuthResources

/**
 * Parsing JSON Arrays in Kotlin with Gson
 * Source: https://www.baeldung.com/kotlin/gson-parse-arrays
 */

fun main() {
//    serializeObjectList()
//    deserializeObjectList()
}

const val JSON_DATA = """[
    {"name":"Duc Thu","type":"Coding","author_articles":[{"name":"How to debug","views":111},
    {"name":"How to handsome","views":100000}]},
    {"name":"Micheal","type":"Tester","author_articles":[{"name":"Good life","views":199}]}]"""

data class Author(val name: String, val type: String? = null, @SerializedName("author_articles") val articles: List<Article>? = null)

data class Article(val name: String, val views: Int)

fun serializeObjectList() {
    val listAuthors = listOf<Author>(
        Author("Duc Thu", "Coding", listOf(Article("How to debug", 111), Article("How to handsome", 100000))),
        Author("Micheal", "Tester", listOf(Article("Good life", 199)))
    )
    val json = Gson().toJson(listAuthors)
    println("Json Result: $json")
}

fun deserializeObjectList() {
    val typeToken = object : TypeToken<List<Any>>() {}.type
    val authors = Gson().fromJson<List<Author>>(JSON_DATA, typeToken)

    println(authors)
}

