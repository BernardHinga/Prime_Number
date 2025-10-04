# Prime Number Checker (Extended)

This program checks if a given number is **prime**, lists **smaller prime numbers**, and finds the **next prime number** after it.  
It showcases **Object-Oriented Programming (OOP)** principles such as **encapsulation**, **object instantiation**, and **method reusability**.

---

## 🧩 Files Overview

### 1. `Main.java`
- Entry point of the program.
- Handles **user input** using `Scanner`.
- Creates objects from the following classes:
    - `Prime` → to check if the entered number is prime.
    - `primeList` → to display all smaller prime numbers.
    - `upperPrime` → to find the next prime number after the given number.

### 2. `Prime.java`
- Handles the logic for determining if a number is prime.
- Demonstrates **encapsulation** through a private variable `number`.
- Contains:
    - `setNumber()` and `getNumber()` (mutator and accessor methods).
    - `isPrime()` → performs the optimized prime check (up to √n and skipping even numbers).

### 3. `primeList.java`
- Displays **all prime numbers less than the user-entered number**.
- Uses:
    - **Object instantiation**: creates a `Prime` object.
    - **ArrayList** to store dynamic lists of primes.
- Optimizations:
    - Starts with 2 (the only even prime).
    - Only loops through **odd numbers** to improve efficiency.
- Demonstrates **looping**, **conditional checks**, and **data structures** in Java.

### 4. `upperPrime.java`
- Finds the **next prime number** greater than the user's input.
- Demonstrates:
    - **Iteration** and **method reuse** (`isPrime()` from `Prime.java`).
    - Efficient break condition after finding the next prime.
- Adds an extra layer of functionality and builds upon previous class logic.

---

## 💡 Key Programming Concepts

| Concept              | Description                                                                  |
|-----------------------|------------------------------------------------------------------------------|
| **Encapsulation**     | `number` is private; accessed only via getter/setter.                        |
| **Objects & Methods** | Each class performs a single logical task.                                   |
| **Reusability**       | `isPrime()` is reused in multiple classes for consistency.                   |
| **Efficiency**        | Avoids even numbers; loops only up to √n for faster computation.             |
| **Data Structures**   | `ArrayList` is used in `primeList` to dynamically store prime numbers found.  |


---

## 🧮 Example Run

```
Please enter a number to check if it's prime:
17
17 is a prime number
Prime numbers less than 17 are:
2, 3, 5, 7, 11, 13, 17,
Prime number after 17 is: 19.
```

---

## 🧠 Concepts Demonstrated
- **Encapsulation** and **method access control**.
- **Reusability of logic** across multiple classes.
- **Practical OOP implementation** with multiple cooperating objects.
- **Dynamic data handling** with ArrayLists.
- **Input/output handling** using Java’s Scanner.

---

## 🧰 Tools Used
- Java SE (Standard Edition)
- JDK 17+
- Any IDE or terminal supporting Java compilation (`javac`).

---

## 📘 How to Run
1. Compile all `.java` files:
   ```bash
   javac org/example/*.java
   ```
2. Run the program:
   ```bash
   java org.example.Main
   ```

---

## ✨ Summary
This simple but layered program demonstrates how **OOP design**, **logic decomposition**, and **mathematical optimization** can create readable, maintainable, and extendable code — all while performing a common computational task: **working with prime numbers**.