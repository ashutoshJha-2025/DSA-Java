# video
- [Graph Playlist](https://youtube.com/playlist?list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&si=LhfWn91aeMpGhPxb)

---

## Key Concepts of Graphs:

1. **Vertex (Node)**: A basic unit in a graph representing an object or entity.

2. **Edge (Arc)**: A connection between two vertices. It represents the relationship between the objects or entities.

3. **Directed vs. Undirected Graphs**:

   * **Directed Graph (Digraph)**: Edges have a direction. That is, an edge from vertex A to vertex B doesn't imply an edge from vertex B to vertex A.
   * **Undirected Graph**: Edges don't have a direction. An edge between vertex A and vertex B implies a connection in both directions.

4. **Weighted vs. Unweighted Graphs**:

   * **Weighted Graph**: Edges have weights or costs associated with them. These weights can represent distance, time, or other factors.
   * **Unweighted Graph**: All edges are considered equal; no weight or cost is assigned to edges.

---
  
### The Code:

```java
ArrayList<Edge> graph[] = new ArrayList[v];
```

* **`graph[]`** is an array of ArrayLists. Each index in the array represents a vertex (node) in the graph.
* **`v`** is the total number of vertices in the graph.
* **`Edge`** is presumably a class that stores information about an edge, such as the destination vertex and the weight of the edge.

### Example Graph Representation:

```
graph[0] → [Edge(0→1, 4), Edge(0→2, 3)]
graph[1] → [Edge(1→2, 4), Edge(1→3, 2)]
graph[2] → [Edge(2→4, 6)]
graph[3] → [Edge(3→5, 7)]
graph[4] → [Edge(4→3, 5), Edge(4→5, 8)]
graph[5] → [Edge(5→6, 9)]
graph[6] → []

              -> 1 ----> 3
             /   |       ^ \
            0    |       |  --> 5 --> 6
             \   v       | /
              -> 2 ----> 4
```

### Explanation:

* **`graph[0] → [Edge(0→1, 4), Edge(0→2, 3)]`**:

  * Vertex `0` has two outgoing edges:

    * An edge to vertex `1` with weight `4` (`0 → 1`).
    * An edge to vertex `2` with weight `3` (`0 → 2`).

* **`graph[1] → [Edge(1→2, 4), Edge(1→3, 2)]`**:

  * Vertex `1` has two outgoing edges:

    * An edge to vertex `2` with weight `4` (`1 → 2`).
    * An edge to vertex `3` with weight `2` (`1 → 3`).

* **`graph[2] → [Edge(2→4, 6)]`**:

  * Vertex `2` has one outgoing edge:

    * An edge to vertex `4` with weight `6` (`2 → 4`).

* **`graph[3] → [Edge(3→5, 7)]`**:

  * Vertex `3` has one outgoing edge:

    * An edge to vertex `5` with weight `7` (`3 → 5`).

* **`graph[4] → [Edge(4→3, 5), Edge(4→5, 8)]`**:

  * Vertex `4` has two outgoing edges:

    * An edge to vertex `3` with weight `5` (`4 → 3`).
    * An edge to vertex `5` with weight `8` (`4 → 5`).

* **`graph[5] → [Edge(5→6, 9)]`**:

  * Vertex `5` has one outgoing edge:

    * An edge to vertex `6` with weight `9` (`5 → 6`).

* **`graph[6] → []`**:

  * Vertex `6` has no outgoing edges (empty list).
