package com.InterviewQueWithCollectionFramework.collectionFramework;

public class ReplacingKeyAndValue {
    public static void main(String[] args) {
        // Create a HashMap
        java.util.HashMap<String, String> map = new java.util.HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");

        // Print the original HashMap
        System.out.println("Original HashMap: " + map);

        // Replace key "B" with "X" and value "Banana" with "Y"
        if (map.containsKey("B")) {
            String value = map.remove("B");
            map.put("X", value);
            System.out.println("Updated HashMap: " + map);
        } else {
            System.out.println("Key 'B' not found in the HashMap.");
        }
    }
}
