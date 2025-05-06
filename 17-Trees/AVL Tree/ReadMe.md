# Videos
- [Insertion Code](https://www.youtube.com/live/1ZKPnhoZca4?si=UXiMzy1uggQcO2iq)
- [Deletion Code](https://www.youtube.com/live/5XW3rx1hf4g?si=A6PQIm-jvoF66EiZ)

---

## 🌲 What is an **AVL Tree**?

### 🔹 Definition:
An **AVL Tree** is a **self-balancing Binary Search Tree (BST)** where the **difference in height** between the **left and right subtrees** of any node (called the **balance factor**) is at most **1**.

>    ✅ Named after its inventors: **Adelson-Velsky and Landis** (1962).

---

## ⚖️ AVL Tree Properties:

| Property              | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| **Binary Search Tree** | Follows BST property (left < root < right)                                 |
| **Self-Balancing**     | Keeps tree height balanced using rotations                                 |
| **Balance Factor**     | `balanceFactor = height(left subtree) - height(right subtree)`  (must be -1, 0, or 1) |
| **Height Condition**   | Automatically balances on **insertions** and **deletions**                 |

---

## ⏱️ Time and Space Complexity:

| Operation        | Time Complexity | Space Complexity |
|------------------|------------------|------------------|
| Search           | O(log n)         | O(n)             |
| Insertion        | O(log n)         | O(n)             |
| Deletion         | O(log n)         | O(n)             |

> ✅ Balanced height ensures that AVL trees perform better than regular BSTs when data is inserted in arbitrary or sorted order.

---

## 🔁 AVL Tree Rotations:

When an insertion or deletion causes the balance factor to go out of range (not in -1, 0, 1), **rotations** are used to rebalance the tree.

### 🔄 Types of Rotations:

| Rotation Type | Condition                      | Description                         |
|---------------|--------------------------------|-------------------------------------|
| **Right Rotation (RR)** | Left-Left Case               | Imbalance on left child’s left      |
| **Left Rotation (LL)**  | Right-Right Case             | Imbalance on right child’s right    |
| **Left-Right (LR)**     | Left-Right Case              | Imbalance on left child’s right     |
| **Right-Left (RL)**     | Right-Left Case              | Imbalance on right child’s left     |

---

### 📌 Example:

Before balancing (inserting 10, 20, 30):

```
   10
     \
     20
       \
       30
```

This is a **Right-Right Case**, apply **Left Rotation (LL)** on 10:

After balancing:
```
    20
   /  \
  10  30
```

---

## 🛠️ AVL Tree Operations

### ✅ **Insertion**
- Insert node as in BST.
- Update heights.
- Check balance factor.
- Apply rotations if needed.

### ✅ **Deletion**
- Delete node as in BST.
- Update heights.
- Check balance factor.
- Apply rotations if needed.

### ✅ **Search**
- Same as Binary Search Tree (O(log n)).

---

## ✅ Advantages of AVL Tree

- 🔹 **Always balanced** → guarantees log(n) performance
- 🔹 Prevents performance degradation seen in regular BSTs
- 🔹 Ideal for applications requiring fast lookups, insertions, and deletions

---

## ❌ Disadvantages

- 🔸 **More complex** to implement due to rotations
- 🔸 Slightly higher overhead than a simple BST (especially for small datasets)

---
