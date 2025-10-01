# Prime Number Checker

This is a simple Java program that checks if a given number is prime.  
It demonstrates several key programming concepts in **Object-Oriented Programming (OOP)**.

---

## Files Overview

### 1. `Main.java`
- Acts as the **entry point** of the program (`public static void main`).
- Handles **user input** via `Scanner`.
- Creates an instance (`object`) of the `Prime` class.
- Calls methods from the `Prime` class to:
    - Set the number (`setNumber`)
    - Check primality (`isPrime`)
    - Retrieve the number (`getNumber`) for display.

### 2. `Prime.java`
- Represents the **Prime** class, which encapsulates the logic of prime checking.
- Uses a **private variable** `number` (demonstrating **encapsulation**).
- Provides:
    - A **mutator (setter)**: `setNumber(int number)`
    - An **accessor (getter)**: `getNumber()`
- Contains a **method** `isPrime()` that:
    - Checks mathematical conditions to determine if the number is prime.
    - Optimizes the check by only looping up to the square root of the number.

---

## Key Programming Concepts

### 1. **Classes & Objects**
- A **class** is a blueprint (e.g., `Prime`).
- An **object** is an instance of that class (created in `Main`).

### 2. **Encapsulation**
- The variable `number` is marked `private`.
- Access is only possible through `getNumber()` and `setNumber()`.

### 3. **Accessors and Mutators**
- `getNumber()` (accessor) → retrieves the current value of `number`.
- `setNumber(int number)` (mutator) → assigns a value safely.

### 4. **Control Flow & Logic**
- Conditional checks (`if-else`) for prime rules:
    - Numbers ≤ 1 are not prime.
    - 2 is prime.
    - Even numbers > 2 are not prime.
- Looping with optimization:
    - Only odd numbers are tested.
    - Loop stops at `sqrt(n)` instead of `n` (efficiency).

### 5. **Mathematical Optimization**
- Prime check logic uses:
    - `Math.sqrt(n)` to reduce iterations.
    - Skipping even numbers with `i += 2`.

---

## Example Run

```
Please enter a number to check if it's prime:
29
29 is a prime number
```

```
Please enter a number to check if it's prime:
30
30 is not a prime number
```

---

## Concepts Learned
- How to separate logic into classes (`Prime`) and main execution (`Main`).
- Importance of encapsulation and controlled variable access.
- Efficiency improvements with mathematical insights (√n limit).
- User interaction with `Scanner`.