# **1. Bubble Sort**

### ✔ Definition

A simple comparison-based sorting algorithm where **adjacent elements are swapped if they are in the wrong order**.
In every pass, the **largest element “bubbles up” to the end**.

### ✔ Working Steps

* Compare adjacent elements.
* Swap if left > right.
* After each full pass, the last element becomes sorted.
* Repeat for remaining unsorted part.

# **2. Selection Sort**

### ✔ Definition

Algorithm that repeatedly **selects the maximum element from the unsorted part** and places it at the beginning.

### ✔ Working Steps

* Set last unsorted index as maximum.
* Scan entire unsorted portion to find the true maximum.
* Swap maximum with last unsorted element.
* Move boundary backward.

# **3. Insertion Sort**

### ✔ Definition

Builds the sorted list **one element at a time by inserting each element into its correct position** in the already-sorted left part.

### ✔ Working Steps

* Take one element from unsorted part.
* Compare leftwards and shift elements.
* Insert at correct position.
* Repeat.

# **4. Cyclic Sort**

### ✔ Definition

A linear-time algorithm used for arrays containing numbers **from 1 to n** without duplicates.
Places each number at its correct index using minimal swaps.

### ✔ Working Steps

* For element at index `i`, correct position = `value - 1`.
* If not at correct position → swap with its correct position.
* Do not increment `i` until the correct element occupies index `i`.

# **5. Quick Sort**

### ✔ Definition

A divide-and-conquer algorithm that partitions the array around a **pivot**, separating smaller and larger elements and recursively sorting both sides.

### ✔ Working Steps

* Choose a pivot.
* Partition array: left < pivot > right.
* Recursively sort both halves.
* Combine results (implicitly done in place).

# **6. Merge Sort**

### ✔ Definition

A divide-and-conquer stable sorting algorithm that splits the array into halves, sorts each half, and **merges** sorted halves.

### ✔ Working Steps

* Divide array until size becomes 1.
* Merge back two sorted halves.
* Continue until entire array is merged.

# **Summary Table**

| Algorithm          | Best Time  | Avg Time   | Worst Time | Fast?                     | Notes                          |
| ------------------ | ---------- | ---------- | ---------- | ------------------------- | ------------------------------ |
| **Quick Sort**     | O(n log n) | O(n log n) | O(n²)      | ⭐ Fast                    | Practical fastest              |
| **Merge Sort**     | O(n log n) | O(n log n) | O(n log n) | ⭐ Fast                    | Needs extra memory             |
| **Cyclic Sort**    | **O(n)**   | **O(n)**   | **O(n)**   | ⭐⭐ Fastest (special case) | Works only for 1…n arrays      |
| **Insertion Sort** | O(n)       | O(n²)      | O(n²)      | Medium                    | Great for nearly sorted arrays |
| **Selection Sort** | O(n²)      | O(n²)      | O(n²)      | Slow                      | Simple but slow                |
| **Bubble Sort**    | O(n)       | O(n²)      | O(n²)      | Slowest                   | Mostly educational             |

---
