## 🔢 Concept: Decimal → Binary

To convert a decimal number to binary:

1. Divide the number by 2.
2. Write down the remainder (0 or 1).
3. Update the number to be the quotient.
4. Repeat until the number becomes 0.
5. The binary number is the remainders read in reverse order.

🔁 Example: Convert 13 to binary

```
13 ÷ 2 = 6 remainder 1  
6 ÷ 2 = 3 remainder 0  
3 ÷ 2 = 1 remainder 1  
1 ÷ 2 = 0 remainder 1  
→ Binary = 1101
```

🧠 Tip: You can also use Java’s built-in method:

```java
Integer.toBinaryString(13); // returns "1101"
```

---


## 🔢 Concept: Binary → Decimal

For a binary number like `1011`, the conversion to decimal is:

```
1×2³ + 0×2² + 1×2¹ + 1×2⁰  
= 8 + 0 + 2 + 1  
= 11 (Decimal)
```

🧠 Tip: You can also use Java’s built-in method:
```java
int decimal = Integer.parseInt("1011", 2);  // Output: 11
```
