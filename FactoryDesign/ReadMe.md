# Factory Design Pattern

## Overview
The **Factory Design Pattern** is used when there is a **superclass** and multiple **sub-classes**, and we want to create and return an object of a specific sub-class based on given input.

---

## Advantages

- Focuses on creating objects for the **interface** rather than the **implementation**.
- Promotes **loose coupling** between classes, resulting in more **robust** and **maintainable** code.

---

## Example Flow


This pattern helps in delegating the instantiation logic to the **Factory Class**, instead of spreading it across the codebase.

---

## Diagram (Simplified)

```text
                        +----------------+
                        |   Super Class   |
                        +----------------+
                                 ▲
                                 │
          +---------------------+---------------------+
          │                                           │
+----------------+                          +----------------+
|   Sub-Class 1  |                          |   Sub-Class 2  |
+----------------+                          +----------------+

                      Created by Factory
