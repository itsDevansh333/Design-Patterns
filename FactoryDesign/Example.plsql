
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
