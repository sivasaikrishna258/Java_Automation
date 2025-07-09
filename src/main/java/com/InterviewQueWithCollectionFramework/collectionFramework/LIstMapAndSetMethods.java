package com.InterviewQueWithCollectionFramework.collectionFramework;

/**
 * ✅ List Interface (e.g., ArrayList, LinkedList)  --->  List allows ordered elements, including duplicates.
 | Method                                | Description                                 |
 | ------------------------------------- | ------------------------------------------- |
 | `add(E e)`                            | Adds an element to the list                 |
 | `add(int index, E element)`           | Inserts an element at a specific index      |
 | `get(int index)`                      | Returns the element at the specified index  |
 | `set(int index, E element)`           | Updates the element at the given index      |
 | `remove(int index)`                   | Removes the element at the specified index  |
 | `remove(Object o)`                    | Removes the first occurrence of the element |
 | `contains(Object o)`                  | Checks if the list contains the element     |
 | `size()`                              | Returns the number of elements              |
 | `isEmpty()`                           | Checks if the list is empty                 |
 | `clear()`                             | Removes all elements from the list          |
 | `indexOf(Object o)`                   | Returns index of first occurrence           |
 | `lastIndexOf(Object o)`               | Returns index of last occurrence            |
 | `subList(int fromIndex, int toIndex)` | Returns a portion of the list               |

 */

/**
 * ✅ Set Interface (e.g., HashSet, LinkedHashSet, TreeSet)  --->  Set does not allow duplicates and may or may not maintain order.

 | Method               | Description                            |
 | -------------------- | -------------------------------------- |
 | `add(E e)`           | Adds an element to the set             |
 | `remove(Object o)`   | Removes an element                     |
 | `contains(Object o)` | Checks if the set contains the element |
 | `size()`             | Returns number of elements             |
 | `isEmpty()`          | Checks if the set is empty             |
 | `clear()`            | Removes all elements                   |
 | `iterator()`         | Returns an iterator over the elements  |
 */

/**
 * ✅ Map Interface (e.g., HashMap, LinkedHashMap, TreeMap)  --->  Map stores key-value pairs, keys must be unique.

 | Method                        | Description                                  |
 | ----------------------------- | -------------------------------------------- |
 | `put(K key, V value)`         | Adds or updates a key-value pair             |
 | `get(Object key)`             | Returns the value for the given key          |
 | `remove(Object key)`          | Removes the mapping for the key              |
 | `containsKey(Object key)`     | Checks if the key exists                     |
 | `containsValue(Object value)` | Checks if the value exists                   |
 | `keySet()`                    | Returns a set of all keys                    |
 | `values()`                    | Returns a collection of all values           |
 | `entrySet()`                  | Returns a set of key-value pairs (Map.Entry) |
 | `size()`                      | Returns the number of key-value pairs        |
 | `isEmpty()`                   | Checks if the map is empty                   |
 | `clear()`                     | Removes all mappings                         |

 */
public class LIstMapAndSetMethods {
}
