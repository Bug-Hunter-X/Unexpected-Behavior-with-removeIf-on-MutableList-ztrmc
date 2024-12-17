fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code attempts to remove even numbers from a list. However, it modifies the list while iterating over it using removeIf, which can lead to unexpected behavior and elements being skipped. 