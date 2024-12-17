# Kotlin removeIf Bug

This repository demonstrates an uncommon bug in Kotlin related to the `removeIf` function on `MutableList`.  When removing elements from a list while iterating over it using `removeIf`, the iteration process can be disrupted, leading to some elements being unintentionally skipped.  This is because `removeIf` modifies the underlying list structure, affecting the index-based traversal.

The `bug.kt` file contains the erroneous code, and `bugSolution.kt` provides a corrected version.

## Reproducing the Bug

1. Clone this repository.
2. Navigate to the project directory.
3. Compile and run `bug.kt`.  Observe that the output is not what you might expect; some even numbers may remain.

## Solution

The solution involves iterating over a copy of the list or using a different approach that avoids modifying the list during iteration.  The `bugSolution.kt` file demonstrates the correct approach. 