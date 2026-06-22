# van Emde Boas Trees

## Universe of Size \\( u \\)
*What's the model: keys drawn from \\( \{0, \dots, u-1\} \\), and why does \\( u \\) drive the cost?*

## Recursive \\( \sqrt{u} \\) Clusters
*How does high/low bit splitting carve a key into cluster and position?*

## Summary Structure
*What does the summary vEB track, and how does it skip empty clusters?*

## Min/Max Stored Explicitly
*Why caching \\( \min \\) and \\( \max \\) at each node avoids a recursive call.*

## Successor and Predecessor
*Trace the at-most-one recursive descent that makes queries fast.*

## Why \\( O(\log\log u) \\)
*Set up the recurrence \\( T(u) = T(\sqrt{u}) + O(1) \\) and solve it.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
