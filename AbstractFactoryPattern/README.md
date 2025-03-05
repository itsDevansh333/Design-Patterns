# Abstract Factory Design Pattern

## What is Abstract Factory Pattern?

The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects **without specifying their concrete classes**. It defines a higher-level factory that delegates the actual creation of products to concrete factories.

### Key Characteristics
- Used when there are multiple families of products.
- Ensures that products created by a factory are compatible with each other.
- Promotes consistency across related products.
- Hides the actual product creation process from the client.

---

## Comparison: Abstract Factory vs Factory Method

| Criteria                  | Abstract Factory                         | Factory Method                          |
|--------------------|----------------------------------|---------------------------------|
| **Purpose**              | Produces families of related products. | Produces one type of product. |
| **Factory Type**     | Factory of factories. One factory creates multiple related products. | Each factory creates a single product type. |
| **Number of Products** | Multiple products belonging to the same family. | Single product per factory. |
| **Hierarchy**             | Abstract Factory defines methods to create each product type; concrete factories implement these. | Factory Method is usually a method within a single factory that creates one product. |
| **Flexibility**             | Adding a new product family requires adding a new factory. | Adding a new product only requires a new factory method. |
| **Complexity**        | More complex due to multiple related products and families. | Simpler, focuses on single product creation. |
| **Use Case**            | When a system needs to create families of related products that should work together (like UI themes). | When a system needs to delegate the instantiation of objects to subclasses. |

---

## When to Use

### Abstract Factory
- When you need to ensure that products from the same family are used together.
- When your system needs to support multiple families of related products.

### Factory Method
- When you want to delegate the instantiation of a single product to subclasses.
- When the creation process needs to be controlled or extended by subclasses.

---

## Key Benefits
- Promotes **loose coupling** between client and concrete product classes.
- Ensures consistency among products of the same family.
- Allows introducing new families of products without modifying existing code.

## Drawbacks
- Adding a new product type requires modifying all factories (open-closed principle violation).
- Increases complexity compared to Factory Method.

---

## Summary
| Design Pattern       | Scope                          | Complexity  |
|------------------|----------------|--------------|
| Abstract Factory      | Family of related products | Higher |
| Factory Method     | Single product type         | Lower |

---

## Quick Reference for Repository README

### Abstract Factory Pattern
The Abstract Factory Pattern provides an interface to create families of related objects without specifying concrete classes.

#### Key Points
- Creates families of products.
- Ensures products are compatible.
- Used when product families evolve together.

### Factory Method Pattern
The Factory Method Pattern defines an interface for creating a single product, with subclasses deciding the actual product to instantiate.

#### Key Points
- Creates a single product type.
- Delegates creation to subclasses.
- Used when product creation varies by subclass.

### Comparison Table
| Criteria                | Abstract Factory                    | Factory Method               |
|----------------|-------------------------|------------------|
| Purpose         | Create families of products | Create one product type |
| Products        | Multiple related products  | Single product type |
| Complexity    | Higher                          | Lower                   |
| Flexibility       | New families need new factories | New products need new methods |

---

### When to Use
| Pattern               | Use When...                                 |
|----------------|---------------------------------|
| Abstract Factory | Need consistent product families |
| Factory Method  | Need single product with flexible creation |

---

### Summary
Abstract Factory is great for creating related products together, while Factory Method focuses on customizing the creation of a single product.
