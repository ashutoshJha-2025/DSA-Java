# 🎯 BFS vs DFS
### 🔍 **Breadth-First Search (BFS)**

BFS explores a graph **level by level**, starting from the root (or source) node. It visits all the neighbors first before moving to the next level of neighbors.

**How it works:**

* Uses a **queue** (FIFO) 🧺
* Starts from a node and explores all direct neighbors first 🧭
* Then explores the neighbors of those neighbors, and so on


**Example:**
```
   A
  / \
 B - C
 |   |
 D   E
      \
       F
```

Start at node `A` and explore level by level.

**Steps:**

1. Start at A ➡️ visit A
2. Enqueue its neighbors: B, C
3. Dequeue B ➡️ visit B
4. Enqueue B's neighbor: D (skip A & C since already seen/queued)
5. Dequeue C ➡️ visit C
6. Enqueue C's neighbor: E
7. Dequeue D ➡️ visit D
8. Dequeue E ➡️ visit E
9. Enqueue E's neighbor: F
10. Dequeue F ➡️ visit F

✅ **BFS traversal**: A → B → C → D → E → F

---

### 🌊 **Depth-First Search (DFS)**

DFS dives deep into the graph, going as far as possible down one path before backtracking.

**How it works:**

* Uses a **stack** (or recursion) 📚
* Goes down a single path until it can't go further 🕳️
* Then backtracks and explores other paths


**Example:**
```
   A
  / \
 B - C
 |   |
 D   E
      \
       F
```
Start at node `A` and go as deep as possible before backtracking.

**Steps (one possible DFS path):**

1. Start at A ➡️ visit A
2. Go to B ➡️ visit B
3. Go to D ➡️ visit D
4. Backtrack to B → A
5. Go to C ➡️ visit C
6. Go to E ➡️ visit E
7. Go to F ➡️ visit F

✅ **DFS traversal**: A → B → D → C → E → F
