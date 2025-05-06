# Videos
- [BST OneShot](https://youtu.be/nwySujCaeH0?si=XOtzE_jEgZ09RkHp)

Here’s a complete, beginner-friendly guide to **Binary Search Trees (BST)** 🌳🔍 — explained clearly with definitions, properties, operations, advantages, and visual examples.

---

## 🌲 What is a **Binary Search Tree (BST)?**

### 🔹 **Definition**:
A **Binary Search Tree** is a **binary tree** where each node follows this rule:

> 📌 **Left Subtree** contains nodes with **values less than** the node’s value.  
> 📌 **Right Subtree** contains nodes with **values greater than** the node’s value.

👉 It maintains a **sorted order** so that **searching, inserting, and deleting** values can be done **efficiently**.

---

## 📚 BST Example:

```
        50
       /  \
     30    70
    / \    / \
  20  40  60  80
```

- All values in the left of 50 are less than 50.
- All values in the right of 50 are greater than 50.

---

## 🧠 Properties of BST:

| Property               | Description                                           |
|------------------------|-------------------------------------------------------|
| **Binary Tree**        | Each node has **at most two children**               |
| **Ordering Rule**      | Left < Root < Right                                   |
| **No Duplicates**      | Typically, duplicates are not allowed or handled specially |
| **Recursive Structure**| BSTs are naturally recursive and suitable for recursion-based algorithms |

---

## 🛠️ BST Operations:

### ✅ **1. Insertion**
- Compare value with root.
- If smaller, go left; if greater, go right.
- Repeat until a null position is found.

### ✅ **2. Deletion**
- Three cases:
  1. **Leaf Node** – just delete.
  2. **One Child** – replace with the child.
  3. **Two Children** – replace with **inorder successor** or **predecessor**, then delete recursively.

### ✅ **3. Search**
- Similar to binary search.
- Start at root, move left/right based on comparison.

---

## ⏱️ Time and Space Complexity:

| Operation   | Average Case | Worst Case (Unbalanced) | Space (Recursive) |
|-------------|--------------|--------------------------|--------------------|
| Search      | O(log n)     | O(n)                     | O(h)               |
| Insert      | O(log n)     | O(n)                     | O(h)               |
| Delete      | O(log n)     | O(n)                     | O(h)               |

> ✅ `h` is the height of the tree. If the tree is **balanced**, `h = log n`; if **skewed**, `h = n`.

---

## 🧩 BST Traversals:

### 1. **Inorder Traversal (Left, Root, Right)**
   - **Order**: **Left → Root → Right**
   - **Purpose**: This traversal is commonly used to get the nodes of a binary search tree in **sorted order** (ascending order), since for a BST, all nodes in the left subtree are smaller, and those in the right subtree are larger.
   
     ```
     Inorder:  Left Subtree → Root → Right Subtree
     ```
     For a tree like:
     ```
         5
        / \
       3   8
      / \   /
     1   4 7
     ```
     The **inorder traversal** would be: **1, 3, 4, 5, 7, 8**

---

### 2. **Preorder Traversal (Root, Left, Right)**
   - **Order**: **Root → Left → Right**
   - **Purpose**: Preorder traversal is useful for **creating a copy of a tree** or when you need to **process the root node before its children**.
     ```
     Preorder: Root → Left Subtree → Right Subtree
     ```
     For the same tree as above:
     ```
         5
        / \
       3   8
      / \   /
     1   4 7
     ```
     The **preorder traversal** would be: **5, 3, 1, 4, 8, 7**

---

### 3. **Postorder Traversal (Left, Right, Root) **
   - **Order**: **Left → Right → Root**
   - **Purpose**: Postorder traversal is often used when you need to **process all children of a node** before processing the node itself and can also be used for tasks like **tree deletion** (where you delete the children before the parent).
  
     ```
     Postorder: Left Subtree → Right Subtree → Root
     ```
     For the same tree:
     ```
         5
        / \
       3   8
      / \   /
     1   4 7
     ```
     The **postorder traversal** would be: **1, 4, 3, 7, 8, 5**

---

## 🔁 Inorder Successor & Predecessor:

| Term                  | Description                                |
|-----------------------|--------------------------------------------|
| **Inorder Successor** | Smallest node in **right subtree**         |
| **Inorder Predecessor** | Largest node in **left subtree**          |

### Visual Example:
For the tree:
```
    5
   / \
  3   8
 / \   /
1   4 7
```
- **Inorder Traversal**: 1, 3, 4, 5, 7, 8
- **Inorder Successor** of 5: 7
- **Inorder Predecessor** of 5: 4
---

## ✅ Advantages of BST:

- Efficient **search, insertion, deletion**
- Maintains a **sorted structure**
- Easy to **implement recursively**
- Forms the basis for advanced trees (AVL, Red-Black, etc.)

---

## ❌ Disadvantages:

- Can become **unbalanced**, turning into a linked list (O(n) operations)
- Needs balancing (like AVL or Red-Black Trees) for guaranteed performance

---

