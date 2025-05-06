# Videos
- [Binary Tree OneShot](https://youtu.be/ThQ7dGtBdAE?si=mEEf3P3cwpybWqwn)

Here’s a comprehensive yet clear explanation of **Binary Trees** 🌳 — including definitions, types, operations, and comparisons, ideal for building your understanding or using as study notes. Let's dive in!

---

## 🌳 What is a **Binary Tree**?

### 🔹 **Definition**:
A **Binary Tree** is a **hierarchical tree data structure** in which **each node has at most two children**, commonly referred to as:

> 🔸 **Left Child**  
> 🔸 **Right Child**

It's the **foundation** of more advanced trees like BST, AVL, Heaps, and more.

---

## 🧠 Structure:

Each **node** in a binary tree contains:
```
  Node
 ┌───────┐
 │ Data  │
 └───────┘
   /   \
Left   Right
```

---

## 🧱 Types of Binary Trees:

| Type                    | Description |
|-------------------------|-------------|
| **Full Binary Tree**    | Every node has 0 or 2 children |
| **Perfect Binary Tree** | All internal nodes have 2 children and all leaves are at the same level |
| **Complete Binary Tree**| All levels are filled except possibly the last, which is filled left to right |
| **Skewed Tree**         | All nodes only have one child (left or right), forms a linear shape |
| **Balanced Binary Tree**| Height of the tree is minimized for performance, e.g., AVL |

---

## 🔁 Tree Traversals (Visiting Nodes):

| Type         | Order                         | Use Case                      |
|--------------|-------------------------------|-------------------------------|
| **Inorder**  | Left → Root → Right           | Produces sorted order in BST |
| **Preorder** | Root → Left → Right           | Used to copy or recreate tree |
| **Postorder**| Left → Right → Root           | Used in deletion or evaluation |
| **Level Order** | Breadth-First (level by level) | Used in BFS, printing trees   |

---

## 🛠️ Common Binary Tree Operations:

| Operation      | Description                             | Time Complexity |
|----------------|-----------------------------------------|------------------|
| **Insertion**   | Add a node to the tree                 | O(n) (general case) |
| **Deletion**    | Remove a node                          | O(n)             |
| **Search**      | Find a node                            | O(n)             |
| **Traversal**   | Visit nodes in a certain order         | O(n)             |
> 🔸 Unlike BST, binary trees do **not maintain order**, so search time is not optimized.

---

## ⏱️ Time and Space Complexity:

| Operation   | Time Complexity | Space Complexity |
|-------------|------------------|------------------|
| Insertion   | O(n)             | O(n)             |
| Deletion    | O(n)             | O(n)             |
| Traversal   | O(n)             | O(n)             |
| Search      | O(n)             | O(n)             |

> 📝 **Note**: For a binary tree to offer faster operations like O(log n), it needs to be structured (e.g., **BST**, **AVL**, or **Heap**).

---

## ✅ Advantages of Binary Tree:

- Easy to **build hierarchical data**
- Useful for **recursive processing**
- Foundation for advanced trees like BST, Heap, AVL
- Good for **tree-based algorithms** like expression evaluation, Huffman encoding

---

## ❌ Disadvantages:

- If **unbalanced**, performance can degrade to linear time
- Not inherently optimized for search or sorting (like BST)

---
