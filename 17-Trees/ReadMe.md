### 🌳 **Tree Data Structure**

A **tree** is a **hierarchical data structure** consisting of nodes, with a **single root node** at the top and **child nodes** branching out from it. It is used to represent data with a parent-child relationship.

---

### 📌 **Key Properties of a Tree:**
- Each node stores data and links to its children.
- There is one **root node** (top-most node).
- Each node can have **zero or more child nodes**.
- A node with no children is called a **leaf**.
- There is **exactly one path** between the root and any node.

---

### 📖 **Tree Terminologies:**

| Term | Description |
|------|-------------|
| **Root** | The top node of the tree |
| **Parent** | A node that has children |
| **Child** | A node that descends from another node |
| **Leaf** | A node with no children |
| **Edge** | The connection between two nodes |
| **Siblings** | Nodes with the same parent |
| **Depth** | Distance from the root to the node |
| **Height** | Distance from the node to the deepest leaf |
| **Subtree** | A tree formed by any node and its descendants |
| **Level** | The number of edges from the root to the node |


---

### 🖼️ **Tree Diagram Example**
Here’s a detailed **tree diagram** with **at least 10 nodes**, and key tree terminologies clearly labeled:

```
                       A (Root)
                    /   |   \
                   /    |    \
                 B     C     D
               /  \         / \
            E     F       G   H
                           |
                           I
```
### 🏷️ **Explanation of Terminologies in the Diagram**

- **Root**:  
  - `A` is the root (top-most node).

- **Child**:  
  - `B`, `C`, and `D` are children of `A`.  
  - `E` and `F` are children of `B`.

- **Siblings**:  
  - `B`, `C`, and `D` are siblings (same parent `A`).  
  - `E` and `F` are siblings (same parent `B`).

- **Leaf Nodes** (nodes with no children):  
  - `C`, `E`, `F`, `H`, and `I` are leaf nodes.

- **Level**:
  - `A` is at **Level 0**  
  - `B`, `C`, `D` are at **Level 1**  
  - `E`, `F`, `G`, `H` are at **Level 2**  
  - `I` is at **Level 3**

- **Height**:
  - The **height of the tree** is the number of edges on the longest path from the root to a leaf.
  - Path: `A → D → G → I` has 3 edges, so height = **3**



---

# Here’s a comparison table of time complexity and space complexity:

| **Data Structure**        | **Operation**            | **Time Complexity**      | **Space Complexity**      |
|---------------------------|--------------------------|--------------------------|---------------------------|
| **Binary Tree 🌳**          | Search, Insert, Delete   | O(n) (in worst case)     | O(n) (for storing nodes)  |
|                           | Traversal (In-order, Pre-order, Post-order) | O(n)                     | O(n)                      |
| **Binary Search Tree (BST) 🔎🌲** | Search, Insert, Delete   | O(log n) (average case), O(n) (worst case) | O(n)                      |
|                           | Traversal                | O(n)                     | O(n)                      |
| **AVL Tree ⚖️🌳**           | Search, Insert, Delete   | O(log n)                 | O(n)                      |
|                           | Traversal                | O(n)                     | O(n)                      |
| **Heaps ⛰️📊**              | Insert, Delete (Heapify) | O(log n)                 | O(n)                      |
|                           | Peek (Max/Min)           | O(1)                     | O(n)                      |
| **Trie 🌱📚**               | Search, Insert, Delete   | O(m) (where m is the length of the string) | O(n * m) (n is number of strings, m is average string length) |
|                           | Traversal (Prefix search) | O(n * m) (worst case)    | O(n * m)                  |
