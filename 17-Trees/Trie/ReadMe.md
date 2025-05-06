# Videos
- [Trie](https://youtu.be/m9zawMC6QAI?si=KaYh6tIZQRjdz4XR)


Here's a complete and easy-to-understand guide to **Tries** 🔤 — a powerful data structure for handling strings, especially in dictionary-based problems like autocomplete, spell checking, and pattern matching.

---

## 🌳 What is a **Trie**?

### 🔹 **Definition**:
A **Trie** (pronounced *“try”*) is a **tree-like data structure** used to **store a dynamic set of strings**, where **each node represents a character** of a string.

> 📌 Also known as a **Prefix Tree** because it efficiently stores and searches strings based on their **prefixes**.

---

## 📦 Trie Structure:

- **Each node** represents a single character.
- **Each path from root to a leaf** represents a word.
- **Edges** correspond to characters.
- Nodes contain:
  - A **character**
  - A map/array of **children**
  - An **end-of-word flag** (`isEnd`)

---

### 🔤 Example:

Inserting the words `["cat", "car", "care"]`:

```
       (root)
        / 
       c
      /
     a
    / \
   t   r
        \
         e
```

---

## 🛠️ Trie Operations:

| Operation     | Description                                 | Time Complexity |
|---------------|---------------------------------------------|------------------|
| **Insert**    | Add a word character by character            | O(L)             |
| **Search**    | Check if a word exists                       | O(L)             |
| **StartsWith**| Check if any word starts with a prefix       | O(L)             |
| **Delete**    | Remove a word                                | O(L)             |

> 🔸 L = Length of the word  
> 🔸 Each character is processed in constant time, assuming fixed alphabet (e.g., 26 letters for lowercase)

---

## ⏱️ Time & Space Complexity:

| Operation        | Time       | Space        |
|------------------|------------|--------------|
| Insert/Search    | O(L)       | O(ALPHABET × N) |
| Prefix Matching  | O(L)       | O(1)         |

- **ALPHABET**: Total possible characters (26 for lowercase)
- **N**: Total words inserted

---

## ✅ Advantages of Trie:

- **Faster lookups** for strings than hash tables in some cases
- **Prefix-based search** is very efficient
- Avoids storing duplicate prefixes → **space-optimized for similar words**
- Can be used to implement **Autocomplete**, **Spell Check**, and **T9 Predictive Text**

---

## ❌ Disadvantages:

- **High memory usage** for sparse data (lots of unused children pointers)
- More complex than simple hash tables for basic tasks

---
