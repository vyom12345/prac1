
fun findMax(list: List<Int>): Int? {
    return list.max()
}

fun main() {
    val list = listOf(10, 4, 2, 7, 6, 9)

    val max = findMax(list)
    println("Maximum element from array is= "+max)
}