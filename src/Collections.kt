fun main(){
    /**
     * LISTS : Ordered collections of items
     * SETS : Unique unordered collections of items
     * MAPS : Sets of key-value pairs where keys are unique and map to only one value
     *
     */

    /**
     * LISTS:
     * Lists store items in the order that they are added, and allow for duplicate items.
     *
     * To create a read-only list (List), use the listOf() function.
     * To create a mutable list (MutableList), use the mutableListOf() function.
     * When creating lists, Kotlin can infer the type of items stored.
     * To declare the type explicitly, add the type within angled brackets <> after the list declaration:
     */

    //we can create a read-only list using the listOf function.
    val fruits = listOf("Apple", "Banana", "Cherry")
    println(fruits) // Output: [Apple, Banana, Cherry]

    /**
     * Mutable Lists
     * A mutable list in Kotlin is defined using the MutableList interface.
     * This type of list can be modified after its creation, allowing you to add, remove, or change elements.
     * You can create a mutable list using the mutableListOf function.
     */

    val vegetables = mutableListOf("Carrot", "Potato", "Tomato")
    vegetables.add("Cucumber")
    println(vegetables) // Output: [Carrot, Potato, Tomato, Cucumber]

    /**
     *  To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a List:
     *
     */

    // Create a mutable list
    val mutableList = mutableListOf("A", "B", "C")

    // Create a read-only view of the mutable list
    val readOnlyList: List<String> = mutableList

    // Try to modify the read-only list (this will cause a compilation error)
    // readOnlyList.add("D") // This line will not compile

    // The original mutable list can still be modified
    mutableList.add("D")
    println(readOnlyList) // Output: [A, B, C, D]
    // This is also called casting.


    // To get the first or last item in a list, use .first() and .last() functions respectively:

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")
    // The first item in the list is: triangle
    // The last item in the list is: circle


    // To get the number of items in a list, use the .count() function:
    val readOnlyShape = listOf("triangle", "square", "circle","hexagon")
    println("This list has ${readOnlyShape.count()} items")
    // This list has 4 items

    // To check that an item is in a list, use the in operator:

    val readOnlyShap = listOf("triangle", "square", "circle")
    println("circle" in readOnlyShap)
    // true


    // To add or remove items from a mutable list, use .add() and .remove() functions respectively:
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    // Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)
    // [triangle, square, circle, pentagon]
    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)
    // [triangle, square, circle]

}