package pattern

fun main() {
    val people = People.Builder()
        .name("Duc Thu")
        .age(22)
        .job("Dev")

    println(people)
}

class People private constructor(
    val name: String?,
    val age: Int?,
    val job: String?
) {
    data class Builder(
        var name: String? = null,
        var age: Int? = null,
        var job: String? = null,
    ) {
        fun name(name: String) = apply { this.name = name }
        fun age(age: Int) = apply { this.age = age }
        fun job(job: String) = apply { this.job = job }
        fun build(): People = People(name, age, job)
    }
}