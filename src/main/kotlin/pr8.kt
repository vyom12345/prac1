import java.util.*

fun main() {
    val array1 = arrayOf(10, 90, 60, 80, 100)


    val array2 = Array(5) { 0 }


    val array3 = Array(8) { it + 1 }


    val array4 = IntArray(5)


    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)


    val array6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))

    println("Create Array-1 by using arrayof() method:")
    println(array1.contentToString())

    println("Create Array-2 by using Array<> ():")
    println(array2.contentToString())

    println("Create Array-3 by using Array<>() and lambda function:")
    println(array3.joinToString())

    println("Create Array-4 by using IntArray):")
    println(array4.contentToString())

    println("Create Array-5 by using intArrayof ():")
    println(array5.contentToString())

    println("Create 2D Array-6 by using array0f () and intArrayof ():")
    println(Arrays.deepToString(array6))

    println("Please enter Array Value:")
    val array7 = Array(5) { readLine()?.toIntOrNull() ?: 0 }

    println("Entered Array:")
    println(array7.contentToString())

    // Sorting with built-in function
    println("With Built-in Function:  ")
    val sortedArray = array7.sorted()
    println("After sorting by built-in function:")
    println(sortedArray.joinToString())

    // Sorting without built-in function (Bubble Sort)
    println("Without Built-in Function:  ")
    println("Before Sorting:")
    println(array7.joinToString())

    soort(array7)

    println("After Sorting without built-in function:")
    println(array7.joinToString())
}

fun soort(arr: Array<Int>) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}
