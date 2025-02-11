fun main(){
    /**
     * MAP
     * Maps store items as key-value pairs.
     * You access the value by referencing the key.
     * You can imagine a map like a food menu.
     * You can find the price (value), by finding the food (key) you want to eat.
     * Maps are useful if you want to look up a value without using a numbered index, like in a list.
     * Every key in a map must be unique so that Kotlin can understand which value you want to get.
     * You can have duplicate values in a map.
     */

    /**
     * To create a read-only map, use the mapOf() function.
     * To create a mutable map, use the mutableMapOf() function.
     * When creating maps, Kotlin can infer the type of items stored.
     * To declare the type explicitly, add the types of the keys and values within angled brackets <> after the map declaration.
     * For example: MutableMap<String, Int>. The keys have type String and the values have type Int.
     *
     * The easiest way to create maps is to use to between each key and its related value:
     */

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)  // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)  // {apple=100, kiwi=190, orange=100}

    //To prevent unwanted modifications, you can create a read-only view of a mutable map by assigning it to a Map:
    val juiceMenus: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val juiceMenuLocked: Map<String, Int> = juiceMenus
    println(juiceMenuLocked)  //{apple=100, kiwi=190, orange=100}

    // To access a value in a map, use the indexed access operator [] with its key:
    val readOnlyJuiceMenues = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("The value of apple juice is: ${readOnlyJuiceMenues["apple"]}")  // The value of apple juice is: 100

    // If you try to access a key-value pair with a key that doesn't exist in a map, you see a null value:
    val readOnlyJuice = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("The value of pineapple juice is: ${readOnlyJuice["pineapple"]}")   // The value of pineapple juice is: null

    // You can also use the indexed access operator [] to add items to a mutable map:
    val juiceMenuss: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenuss["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenu)   // {apple=100, kiwi=190, orange=100, coconut=150}

    //To remove items from a mutable map, use the .remove() function:
    val juice: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juice.remove("orange")    // Remove key "orange" from the map
    println(juice) // {apple=100, kiwi=190}

    // To get the number of items in a map, use the .count() function:
    val readOnlyMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("This map has ${readOnlyMenu.count()} key-value pairs") // This map has 3 key-value pairs

    // To check if a specific key is already included in a map, use the .containsKey() function:
    val readJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readJuiceMenu.containsKey("kiwi"))  // true

    // To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    val onlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(onlyJuiceMenu.keys)   // [apple, kiwi, orange]
    println(onlyJuiceMenu.values)  // [100, 190, 100]
    val readMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readMenu.keys)  // [apple, kiwi, orange]
    println(readMenu.values)  // [100, 190, 100]


    //  To check that a key or value is in a map, use the in operator:
    val onlyMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("orange" in onlyMenu.keys)  // true

    // Alternatively, you don't need to use the keys property
    println("orange" in onlyMenu)  // true
    println(200 in onlyMenu.values)  // false


    // There are other ways to create maps in Kotlin.
    // Here are a few alternatives:

//    1.Using Map Constructor:
//    You can use the Map constructor directly:
    val anotherMap = mapOf(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("key3", "value3")
    )
    println(anotherMap) // Output: {key1=value1, key2=value2, key3=value3}

    //2.Using the to Infix Function
    //Another concise way is to use the to infix function which you mentioned:
    val infixMap = mapOf(
        "key1" to "value1",
        "key2" to "value2",
        "key3" to "value3"
    )
    println(infixMap) // Output: {key1=value1, key2=value2, key3=value3}

    // 3.Using a Mutable Map
    //If you need a mutable map, you can use mutableMapOf:
    val mutableMap = mutableMapOf<String, String>()
    mutableMap["key1"] = "value1"
    mutableMap["key2"] = "value2"
    mutableMap["key3"] = "value3"
    println(mutableMap) // Output: {key1=value1, key2=value2, key3=value3}

    // 4.Creating a Map from an Existing Collection
    //You can also create a map from an existing collection using the associateBy or associateWith functions:
    val list = listOf("apple", "banana", "cherry")
    val mapFromList = list.associateBy { it.first() }
    println(mapFromList) // Output: {a=apple, b=banana, c=cherry}
    //OR
    val mapFromListWithValues = list.associateWith { it.length }
    println(mapFromListWithValues) // Output: {apple=5, banana=6, cherry=6}

}