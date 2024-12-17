fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers) 
    println(list)
}

This solution first creates a separate list of even numbers using `filter`. Then it uses `removeAll` to remove those numbers from the original list, ensuring correct removal of even numbers without disrupting the iteration process.