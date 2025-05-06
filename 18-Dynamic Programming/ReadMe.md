# video
- [DP Playlist](https://youtube.com/playlist?list=PLFdAYMIVJQHPXtFM_9mpwwQtIdzP6kxHS&si=hJ9vRjyfN5i05o5x)

---

### 🔷 What is Dynamic Programming?

Dynamic Programming is a method for solving complex problems by breaking them down into simpler subproblems and storing the results of these subproblems to avoid redundant work.

---

### 🔷 Types of DP

There are two main ways to implement DP in Java:

#### 1. **Top-Down (Memoization)**

Use recursion + caching (memoization) to avoid recalculating results.

#### 2. **Bottom-Up (Tabulation)**

Build up the solution iteratively using an array or table.

---

## 🟢 Memoization (Top-Down)

Uses **recursion + caching** (usually a HashMap or array).

### 🔧 General Time Complexity:

* **O(N)** — each unique subproblem is solved once.
* Recursive calls only happen for inputs that haven’t been memoized yet.

### 💾 Space Complexity:

* **O(N)** for the memoization table (cache).
* **O(N)** for the recursive call stack (because of depth = N).

### 📦 Total Space: **O(N + N) = O(N)**

---

## 🔵 Tabulation (Bottom-Up)

Uses **iteration** and fills up a table (usually an array).

### 🔧 General Time Complexity:

* **O(N)** — we compute values iteratively from smallest to largest.

### 💾 Space Complexity:

* **O(N)** for the DP table (e.g., `dp[]` array).
* **O(1)** stack space (no recursion).

### 📦 Total Space: **O(N + 1) = O(N)**

---

