# 🔗 Breaking Singleton Design Pattern & Prevention Techniques  

In this repository, we explore **three ways to break the Singleton Design Pattern** and the techniques to prevent them.

---

## ⚠️ 3 Ways to Break Singleton Pattern  

### 1️⃣ Using Reflection API  
While using the **Reflection API**, we can modify the properties of all class members at runtime.  
If we fetch the constructor present in the singleton class and change its visibility from `private` to `public`, we can easily create **multiple instances** of the singleton class.  

✅ **Solution:** Change the class to an `Enum` and remove the constructor altogether.  

---

### 2️⃣ Using Serialization & Deserialization  
When we serialize an object using `ObjectOutputStream` and then **deserialize** it using `ObjectInputStream`, it returns a **new instance** of the singleton class, breaking the pattern.  

✅ **Solution:** Implement the `readResolve()` method in the singleton class to **return the same singleton object** during deserialization.  

---

### 3️⃣ Using Cloning  
If the singleton class implements the `clone()` method, its object can be cloned, thus breaking the pattern.

✅ **Solution:** Override the `clone()` method to **return the existing singleton instance** instead of a new one.  

---

## 📂 Example Code  

This repository contains practical examples for each of these scenarios, along with their **respective solutions**.

---

## ✨ Contributing  
Feel free to raise issues or contribute improvements to this repository.  

---

## 📄 License  
This project is licensed under the MIT License.
