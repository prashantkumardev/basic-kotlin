fun main(){
    /**
     * SETS
     * Sets are unordered and only store unique items.
     * To create a read-only set (Set), use the setOf() function.
     * To create a mutable set (MutableSet), use the mutableSetOf() function.
     *
     * When creating sets, Kotlin can infer the type of items stored.
     * To declare the type explicitly, add the type within angled brackets <> after the set declaration:
     */

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]
    println(fruit)

    // To prevent unwanted modifications, you can create a read-only view of a mutable set by assigning it to a Set:

    val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val fruitLocked: Set<String> = fruits
    println(fruitLocked)

    // As sets are unordered, you can't access an item at a particular index.

    // To get the number of items in a set, use the .count() function:
    val readOnlyFruits = setOf("apple", "banana", "cherry", "cherry")
    println("This set has ${readOnlyFruits.count()} items")   // This set has 3 items

    // To check that an item is in a set, use the in operator:

    val readOnlyFruitsAre = setOf("apple", "banana", "cherry", "cherry")
    println("banana" in readOnlyFruitsAre)  // true

    // To add or remove items from a mutable set, use .add() and .remove() functions respectively:

    val fruitss: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruitss.add("dragonfruit")    // Add "dragonfruit" to the set
    println(fruitss)              // [apple, banana, cherry, dragonfruit]
    fruitss.remove("dragonfruit") // Remove "dragonfruit" from the set
    println(fruitss)              // [apple, banana, cherry]
}