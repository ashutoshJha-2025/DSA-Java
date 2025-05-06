# Videos
- [Heap](https://youtu.be/Qf-TDPr0nYw?si=BKaUFBcsEd3-4KUF)
- [Insert and Delete](https://youtu.be/ywx-Onrdx4U?si=Ox8N6X3WZvZj1udq)

Here's a **complete guide to Heaps** 🧱 — including definitions, types, operations, properties, use cases, and visual understanding — perfect for interviews and learning purposes.

---

## 🌄 What is a **Heap**?

### 🔹 **Definition**:
A **Heap** is a **special tree-based data structure** that satisfies the **heap property**:
> ✅ In a **Max Heap**: Parent nodes are **greater than or equal to** their children.  
> ✅ In a **Min Heap**: Parent nodes are **less than or equal to** their children.

👉 Heaps are usually implemented as **complete binary trees**, which are efficiently stored as **arrays**.

---

## 🧱 Types of Heaps:

| Type        | Description                              |
|-------------|------------------------------------------|
| **Max Heap**| Largest element is at the root. Used in **priority queues**, sorting. |
| **Min Heap**| Smallest element is at the root. Used in **Dijkstra’s**, **A* search**, etc. |

---



## 📦 Heap Representation (Array Form):

For a heap stored in array `arr[]`:
- **Parent** of node at `i`: `arr[(i-1)/2]`
- **Left Child** at `2*i + 1`
- **Right Child** at `2*i + 2`

### Example (Min Heap):
```
       10
      /  \
    20    15
   / \   /
  30 40 50

Array: [10, 20, 15, 30, 40, 50]
```

---

## 🛠️ Heap Operations:

| Operation     | Description                               | Time Complexity |
|---------------|-------------------------------------------|------------------|
| **Insertion**  | Add new element at end, then "heapify up" | O(log n)         |
| **Deletion**   | Remove root, move last element to root, "heapify down" | O(log n) |
| **Heapify**    | Convert an array into a valid heap        | O(n)             |
| **Peek (Top)** | Return the root element (min or max)     | O(1)             |

---

## 🔄 Heapify (Restore Heap Property):

- **Heapify Up**: After insertion, compare child with parent and move up.
- **Heapify Down**: After deletion, compare parent with children and move down.

---

## ⏱️ Time & Space Complexity:

| Operation     | Time Complexity | Space Complexity |
|---------------|------------------|------------------|
| Insert        | O(log n)         | O(n)             |
| Delete        | O(log n)         | O(n)             |
| Peek          | O(1)             | O(n)             |
| Build Heap    | O(n)             | O(n)             |

---


## ✅ Advantages of Heaps:

- Efficient for **priority-based access**
- Fast **insert and delete** operations (O(log n))
- Easy to implement using **arrays**

---

## ❌ Disadvantages:

- Not ideal for **searching arbitrary elements** (O(n))
- Not as flexible for ordered traversal like BSTs

---
