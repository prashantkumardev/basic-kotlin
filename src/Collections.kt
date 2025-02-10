fun collections(){
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






}