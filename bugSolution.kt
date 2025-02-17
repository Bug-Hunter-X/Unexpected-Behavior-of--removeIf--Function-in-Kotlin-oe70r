fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.toMutableList() // Create a copy of the list
    newList.removeIf { it > 2 }
    println(newList) // Output: [1, 2]
    newList.removeIf { it == 1 }
    println(newList) // Output: [2]
    println(list) // Output: [1, 2, 3, 4, 5]  The original list remains unchanged
}