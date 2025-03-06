# Builder Design Pattern

## Introduction
The **Builder Design Pattern** is a creational design pattern used when constructing complex objects step by step. It separates the process of building an object from its representation, allowing the same construction process to create different types of objects.

---

## Why Builder Pattern?

When creating objects with many attributes, several challenges arise:

- You need to pass a **large number of arguments** to the constructor.
- Some attributes may be **optional**, leading to constructor overload or complex initialization logic.
- If a **Factory Class** is responsible for creating the object, all the construction complexity resides within that class, which can lead to **tight coupling** and reduced maintainability.

### Benefits
✅ Simplifies object creation by dividing the process into clear steps.  
✅ Handles optional attributes elegantly.  
✅ Separates object construction logic, making code easier to maintain.  
✅ Works well for **Immutable Objects**, as values are set once during construction.

---

## Key Components

### Outer Class (Main Object)
This is the actual object that we want to create, e.g., `User`.  
It typically has:
- Private instance variables (attributes).
- Private constructor (to enforce object creation via the builder only).
- Getter methods to retrieve attribute values.
- A constructor that accepts a **Builder** object and initializes the instance variables using builder’s data.

---

### Static Inner Class (Builder)
This class acts as a helper to **build the outer object step by step**.  
It contains:
- Public constructor.
- Instance variables that match the outer class.
- Setter methods to set individual attributes.
- A `build()` method that returns an instance of the outer class (`User`).

---

## Design Overview
The following diagram explains the structure visually:



---

## Final Notes
- This pattern is especially helpful when **some fields are mandatory** and others are optional.
- The **immutable nature** of the final object ensures data consistency and thread-safety in concurrent environments.
- Widely used in libraries like **Lombok** (via `@Builder` annotation).
