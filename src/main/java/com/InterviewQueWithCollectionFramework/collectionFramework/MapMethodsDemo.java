package com.InterviewQueWithCollectionFramework.collectionFramework;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 | Method                                     | Description                                    |
 | ------------------------------------------ | ---------------------------------------------- |
 | `put(K key, V value)`                      | Adds/updates value for a key                   |
 | `get(Object key)`                          | Retrieves value by key                         |
 | `remove(Object key)`                       | Removes entry by key                           |
 | `containsKey(Object key)`                  | Checks if key exists                           |
 | `containsValue(Object value)`              | Checks if value exists                         |
 | `putAll(Map<? extends K, ? extends V> m)`  | Copies all entries                             |
 | `clear()`                                  | Removes all entries                            |
 | `size()`                                   | Number of key-value pairs                      |
 | `isEmpty()`                                | Checks if map is empty                         |
 | `keySet()`                                 | Returns a `Set` of all keys                    |
 | `values()`                                 | Returns a `Collection` of all values           |
 | `entrySet()`                               | Returns a `Set<Map.Entry<K,V>>` of all entries |
 | `forEach(BiConsumer)`                      | Iterate using lambda (Java 8)                  |
 | `getOrDefault(K key, V defaultValue)`      | Return default if key not found (Java 8)       |
 | `replace(K key, V newValue)`               | Replace value if key exists                    |
 | `replaceAll(BiFunction)`                   | Replace all values based on logic (Java 8)     |
 | `compute/computeIfAbsent/computeIfPresent` | Conditionally update/insert values (Java 8)    |
 | `merge(K key, V value, BiFunction)`        | Merge value if key exists (Java 8)             |

 */
public class MapMethodsDemo {
    public static void main(String[] args) {

        Map<String, String> m=new HashMap<>();

        //put()
        m.put("name","siva");
        m.put("age","20");
        m.put("place","nellore");
        System.out.println("after adding one entry "+m);

        //get()
        System.out.println("getting the value based on key "+m.get("name"));

        //replace
        m.replace("age","25");
        System.out.println("after replacing "+ m);

    }
}
