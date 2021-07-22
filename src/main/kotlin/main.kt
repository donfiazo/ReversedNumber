
fun main() {
    val arr: Array<Int?> = arrayOf(3,4,8,5,9,7)
    reverse(arr, 0)
    println(arr.contentToString())
}

fun<T> reverse(arr: Array<T>, nextIndex: Int) {
    if (nextIndex == arr.size) return
    val value = arr[nextIndex]
    reverse(arr, nextIndex + 1)
    arr[arr.size - nextIndex - 1] = value
}
