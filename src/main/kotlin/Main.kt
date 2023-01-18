/*Write an extension method that filters a list by value (e.g. smaller than 500).
Write an extension method that prints list values.
Then create a list that that has at least 10 members, filter them and then print the values that pass the filter.*/

fun main(){

    fun List<Int>.filterSmaller() : List<Int> {
        return this.filter { it < 500 }
    }
    fun List<Int>.printSmaller() {
        this.forEach { println(it) }
    }

    val test = listOf(1, 4578, 75, 420, 78203, 5, 22, 56394, 0, 123)
    test.filterSmaller().printSmaller()
}