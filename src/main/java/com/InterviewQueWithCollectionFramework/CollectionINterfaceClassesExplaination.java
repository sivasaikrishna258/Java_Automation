package com.InterviewQueWithCollectionFramework;

public class CollectionINterfaceClassesExplaination {

    /**
     *✅ List Implementations (Ordered, Allows Duplicates)
     *
     * | Class          | Use Case                                                      | Features                                              |
     * | -------------- | ------------------------------------------------------------- | ----------------------------------------------------- |
     * | **ArrayList**  | When you need fast random access and infrequent insert/delete | Backed by array; resizes dynamically; not thread-safe |
     * | **LinkedList** | When you need frequent insertions/deletions at both ends      | Doubly-linked list; slower random access              |
     * | **Vector**     | When you need a thread-safe `ArrayList` (legacy)              | Synchronized; slower due to locking                   |
     * | **Stack**      | When you need LIFO (last-in, first-out) operations            | Extends Vector; legacy stack structure                |
     */

//    ✅ Set Implementations (No Duplicates)
    /**
     * | Class             | Use Case                                                      | Features                                                        |
     * | ----------------- | ------------------------------------------------------------- | --------------------------------------------------------------- |
     * | **HashSet**       | When you want a fast, unordered collection of unique elements | Uses hash table; allows one `null`                              |
     * | **LinkedHashSet** | When you want a set that maintains insertion order            | Hash table + linked list                                        |
     * | **TreeSet**       | When you need sorted elements with no duplicates              | Uses `TreeMap`; sorted according to natural order or comparator |
     */

    //✅ Queue/Deque Implementations (For Processing Elements)
    /**
     *| Class             | Use Case                                                      | Features                                     |
     * | ----------------- | ------------------------------------------------------------- | -------------------------------------------- |
     * | **PriorityQueue** | When you need elements processed by priority                  | Min-heap; doesn't allow `null`               |
     * | **ArrayDeque**    | When you need stack/queue functionality (better than `Stack`) | Double-ended queue; faster than `LinkedList` |
     * | **LinkedList**    | Also implements `Deque`                                       | Can act as queue, stack, or deque            |
     */

    //✅ Map Implementations (Key-Value Pairs)
    /**
     * | Class                 | Use Case                                              | Features                                      |
     * | --------------------- | ----------------------------------------------------- | --------------------------------------------- |
     * | **HashMap**           | When you need fast lookups and don't care about order | Allows one `null` key; unordered              |
     * | **LinkedHashMap**     | When you want to preserve insertion order             | Predictable iteration order                   |
     * | **TreeMap**           | When you want sorted key-value pairs                  | Sorted by natural order or comparator         |
     * | **Hashtable**         | Thread-safe legacy alternative to `HashMap`           | Fully synchronized; slower                    |
     * | **ConcurrentHashMap** | When you need high-performance thread-safe map        | Read/write operations can happen concurrently |
     */
}
