package com.interview;

public class PrimitiveAndNonPrimitiveTypeCasting {
    /**
     * | Type                | Conversion          | Automatic? | Example Description                             | Code Example                                 |
     * | ------------------- | ------------------- | ---------- | ----------------------------------------------- | -------------------------------------------- |
     * | Primitive           | Widening            | ✅          | Smaller primitive to larger                     | `int x = 10; long y = x;`                    |
     * | Primitive           | Narrowing           | ❌          | Larger primitive to smaller (needs cast)        | `double d = 9.9; int i = (int) d;`           |
     * | Reference           | Upcasting           | ✅          | Subclass to superclass (implicit)               | `Dog d = new Dog(); Animal a = d;`           |
     * | Reference           | Downcasting         | ❌          | Superclass to subclass (explicit + safe check)  | `if (a instanceof Dog) { Dog d = (Dog) a; }` |
     * | Primitive ↔ Wrapper | Autoboxing/Unboxing | ✅          | Automatic convert between primitive and wrapper | `Integer x = 5; int y = x;`                  |
     */
}
