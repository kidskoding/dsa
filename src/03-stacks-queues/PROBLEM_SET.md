# Stacks & Queues: Problem Set

Each problem is an implementation task: fill in the stub in `problemset/` and make
its test in `tests/problemset/` pass. The problems are split into two groups.
**Foundational** problems drill the core LIFO/FIFO mechanics — bracket matching,
expression evaluation, and building one structure out of another. **Applied
Problems** weave LeetCode and contest-style challenges in roughly increasing
difficulty: monotonic stacks, parsing, scheduling, and queue simulation. Work
them in order; later problems lean on patterns introduced earlier.

**Foundational**

## Problem 1: Valid Parentheses

**LeetCode:** [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

### Description
Given a string `s` containing only the characters `'('`, `')'`, `'{'`, `'}'`,
`'['` and `']'`, determine whether the input string is valid. A string is valid
when every open bracket is closed by a bracket of the same type, brackets close
in the correct order, and every closing bracket has a corresponding open bracket
of the same type. Solve it in `O(n)` time using a stack.

### Examples
**Example 1:**
```
Input:  s = "()[]{}"
Output: true
```
Every opening bracket is immediately matched by the correct closing bracket.

**Example 2:**
```
Input:  s = "([)]"
Output: false
```
The brackets are not closed in the correct order: `)` arrives while `[` is still open.

**Example 3:**
```
Input:  s = "{[]}"
Output: true
```
Brackets are correctly nested.

### Constraints
- `1 <= s.length <= 10^4`
- `s` consists only of the characters `()[]{}`.

---

## Problem 2: Evaluate Reverse Polish Notation

**LeetCode:** [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)

### Description
You are given an array of strings `tokens` that represents an arithmetic
expression in Reverse Polish (postfix) Notation. Evaluate the expression and
return the resulting integer. The valid operators are `+`, `-`, `*`, and `/`.
Each operand may be an integer or another expression. Division between two
integers truncates toward zero. The input is always a valid expression. Use a
stack to push operands and apply each operator to the two most recent operands.

### Examples
**Example 1:**
```
Input:  tokens = ["2","1","+","3","*"]
Output: 9
```
This evaluates to `((2 + 1) * 3) = 9`.

**Example 2:**
```
Input:  tokens = ["4","13","5","/","+"]
Output: 6
```
This evaluates to `(4 + (13 / 5)) = 4 + 2 = 6`.

**Example 3:**
```
Input:  tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
```

### Constraints
- `1 <= tokens.length <= 10^4`
- `tokens[i]` is either an operator `+`, `-`, `*`, `/`, or an integer in the range `[-200, 200]`.

---

## Problem 3: Min Stack

**LeetCode:** [155. Min Stack](https://leetcode.com/problems/min-stack/)

### Description
Design a stack that supports `push`, `pop`, `top`, and retrieving the minimum
element, all in constant time. Implement the `Problem3` class with:
- `Problem3()` initializes an empty stack.
- `void push(int val)` pushes `val` onto the stack.
- `void pop()` removes the element on the top of the stack.
- `int top()` gets the top element of the stack.
- `int getMin()` retrieves the minimum element in the stack.

Each operation must run in `O(1)` time. The trick is to maintain an auxiliary
stack that tracks the running minimum alongside the value stack.

### Examples
**Example 1:**
```
Input:  push(-2), push(0), push(-3), getMin(), pop(), top(), getMin()
Output: -3, then 0, then -2
```
After pushing `-2, 0, -3`, the minimum is `-3`. After one pop, the top is `0`
and the minimum is `-2`.

**Example 2:**
```
Input:  push(1), push(1), push(0), getMin(), pop(), getMin()
Output: 0, then 1
```
Duplicate minimums must be tracked so that popping one `0` still leaves the
minimum correct.

**Example 3:**
```
Input:  push(7), top(), getMin()
Output: 7, then 7
```

### Constraints
- `-2^31 <= val <= 2^31 - 1`
- `pop`, `top`, and `getMin` are only called on non-empty stacks.
- At most `3 * 10^4` calls are made in total.

---

## Problem 4: Implement Queue using Stacks

**LeetCode:** [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

### Description
Implement a first-in-first-out (FIFO) queue using only two stacks. The queue
should support all the standard operations: `push`, `peek`, `pop`, and `empty`.
Implement the `Problem4` class with:
- `void push(int x)` pushes element `x` to the back of the queue.
- `int pop()` removes the element from the front of the queue and returns it.
- `int peek()` returns the element at the front of the queue.
- `boolean empty()` returns `true` if the queue is empty.

You may only use standard stack operations (push to top, peek/pop from top,
size, and is-empty). Amortized cost per operation should be `O(1)`.

### Examples
**Example 1:**
```
Input:  push(1), push(2), peek(), pop(), empty()
Output: 1, then 1, then false
```
`peek()` and the first `pop()` both return `1` (FIFO order). The queue still
holds `2`, so `empty()` is `false`.

**Example 2:**
```
Input:  push(5), pop(), empty()
Output: 5, then true
```

**Example 3:**
```
Input:  push(3), push(4), pop(), push(5), pop(), pop(), empty()
Output: 3, then 4, then 5, then true
```

### Constraints
- `1 <= x <= 9`
- At most `100` calls are made to `push`, `pop`, `peek`, and `empty`.
- All calls to `pop` and `peek` are valid (the queue is non-empty).

---

## Problem 5: Implement Stack using Queues

**LeetCode:** [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)

### Description
Implement a last-in-first-out (LIFO) stack using only one or two queues. The
stack should support all the standard operations: `push`, `top`, `pop`, and
`empty`. Implement the `Problem5` class with:
- `void push(int x)` pushes element `x` onto the stack.
- `int pop()` removes the element on the top of the stack and returns it.
- `int top()` returns the element on the top of the stack.
- `boolean empty()` returns `true` if the stack is empty.

You may only use standard queue operations (push to back, peek/pop from front,
size, and is-empty).

### Examples
**Example 1:**
```
Input:  push(1), push(2), top(), pop(), empty()
Output: 2, then 2, then false
```
`top()` and the first `pop()` both return `2` (LIFO order). The stack still
holds `1`, so `empty()` is `false`.

**Example 2:**
```
Input:  push(8), pop(), empty()
Output: 8, then true
```

**Example 3:**
```
Input:  push(1), push(2), push(3), pop(), top()
Output: 3, then 2
```

### Constraints
- `1 <= x <= 9`
- At most `100` calls are made to `push`, `pop`, `top`, and `empty`.
- All calls to `pop` and `top` are valid (the stack is non-empty).

---

## Problem 6: Sliding Window Maximum

**LeetCode:** [239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)

### Description
You are given an array of integers `nums` and a window size `k`. A window of
size `k` slides from the very left of the array to the very right. At each step
you can see only the `k` numbers inside the window, and the window moves right by
one position. Return an array of the maximum value in each window. Use a
monotonic deque to achieve `O(n)` total time, evicting indices that fall out of
the window from the front and indices of smaller values from the back.

### Examples
**Example 1:**
```
Input:  nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
```
The windows are `[1,3,-1]`, `[3,-1,-3]`, `[-1,-3,5]`, `[-3,5,3]`, `[5,3,6]`,
`[3,6,7]`, with maximums `3, 3, 5, 5, 6, 7`.

**Example 2:**
```
Input:  nums = [1], k = 1
Output: [1]
```

**Example 3:**
```
Input:  nums = [9,8,7,6,5], k = 2
Output: [9,8,7,6]
```

### Constraints
- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`
- `1 <= k <= nums.length`

---

**Applied Problems**

## Problem 7: Baseball Game

**LeetCode:** [682. Baseball Game](https://leetcode.com/problems/baseball-game/)

### Description
You are keeping the scores for a game with a series of operations given as an
array of strings `operations`. Maintain a record (a stack) of valid scores and
apply each operation:
- An integer `x`: record a new score of `x`.
- `"+"`: record a new score that is the sum of the previous two scores.
- `"D"`: record a new score that is double the previous score.
- `"C"`: invalidate and remove the previous score from the record.

It is guaranteed that every operation is valid when it is applied. Return the
sum of all the scores remaining in the record after applying every operation.

### Examples
**Example 1:**
```
Input:  operations = ["5","2","C","D","+"]
Output: 30
```
Record `5`, record `2`, cancel `2` (record `[5]`), double to `10` (record
`[5,10]`), sum to `15` (record `[5,10,15]`). Total = `5 + 10 + 15 = 30`.

**Example 2:**
```
Input:  operations = ["5","-2","4","C","D","9","+","+"]
Output: 27
```
The record ends as `[5, -2, 9, 18, 27]`, summing to `27`.

**Example 3:**
```
Input:  operations = ["1","C"]
Output: 0
```

### Constraints
- `1 <= operations.length <= 1000`
- `operations[i]` is `"C"`, `"D"`, `"+"`, or a string representing an integer in `[-3 * 10^4, 3 * 10^4]`.
- For `"+"` operations, there are always at least two previous scores.
- For `"C"` and `"D"` operations, there is always at least one previous score.

---

## Problem 8: Backspace String Compare

**LeetCode:** [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)

### Description
Given two strings `s` and `t`, return `true` if they are equal when both are
typed into empty text editors. The character `'#'` means a backspace character,
which deletes the character before it (if any). Note that backspacing on an
empty editor leaves it empty. Build each resulting string with a stack of
characters and compare the results.

### Examples
**Example 1:**
```
Input:  s = "ab#c", t = "ad#c"
Output: true
```
Both `s` and `t` become `"ac"` after applying backspaces.

**Example 2:**
```
Input:  s = "a##c", t = "#a#c"
Output: true
```
Both become `"c"`.

**Example 3:**
```
Input:  s = "a#c", t = "b"
Output: false
```
`s` becomes `"c"` while `t` stays `"b"`.

### Constraints
- `1 <= s.length, t.length <= 200`
- `s` and `t` contain only lowercase letters and `'#'` characters.

---

## Problem 9: Remove All Adjacent Duplicates In String

**LeetCode:** [1047. Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)

### Description
You are given a string `s` consisting of lowercase English letters. A duplicate
removal consists of choosing two adjacent and equal letters and removing them.
Repeatedly make duplicate removals on `s` until no more can be made. Return the
final string after all such removals; the answer is guaranteed to be unique. A
stack makes each removal `O(1)`: push each character, but if it equals the top
of the stack, pop instead.

### Examples
**Example 1:**
```
Input:  s = "abbaca"
Output: "ca"
```
Remove `"bb"` to get `"aaca"`, then remove `"aa"` to get `"ca"`.

**Example 2:**
```
Input:  s = "azxxzy"
Output: "ay"
```
Remove `"xx"` to get `"azzy"`, then remove `"zz"` to get `"ay"`.

**Example 3:**
```
Input:  s = "aaaaaa"
Output: ""
```

### Constraints
- `1 <= s.length <= 10^5`
- `s` consists of lowercase English letters.

---

## Problem 10: Make The String Great

**LeetCode:** [1544. Make The String Great](https://leetcode.com/problems/make-the-string-great/)

### Description
Given a string `s` of lowercase and uppercase English letters, a good string is
one with no two adjacent characters `s[i]` and `s[i + 1]` where one is the
lowercase version and the other is the uppercase version of the same letter
(for example, `"aA"` or `"Aa"`). To make the string good, repeatedly remove such
adjacent bad pairs until none remain. Return the resulting good string; the
answer is unique. Use a stack: push each character unless it forms a bad pair
with the current top, in which case pop instead.

### Examples
**Example 1:**
```
Input:  s = "leEeetcode"
Output: "leetcode"
```
Removing `"eE"` (or `"Ee"`) leaves `"leetcode"`, which has no bad pairs.

**Example 2:**
```
Input:  s = "abBAcC"
Output: ""
```
`"bB"` is removed leaving `"aAcC"`, then `"aA"` and `"cC"` are removed, leaving `""`.

**Example 3:**
```
Input:  s = "s"
Output: "s"
```

### Constraints
- `1 <= s.length <= 100`
- `s` contains only lowercase and uppercase English letters.

---

## Problem 11: Next Greater Element I

**LeetCode:** [496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)

### Description
The next greater element of some element `x` in an array is the first greater
element that is to the right of `x` in the same array. You are given two
distinct integer arrays `nums1` and `nums2`, where `nums1` is a subset of
`nums2`. For each `nums1[i]`, find the index of `nums1[i]` in `nums2` and
determine its next greater element in `nums2`. Return an array `ans` of the same
length as `nums1` where `ans[i]` is the next greater element described above, or
`-1` if it does not exist. A monotonic decreasing stack over `nums2` lets you
precompute every next greater element in `O(n)`.

### Examples
**Example 1:**
```
Input:  nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
```
For `4`, there is no greater element to its right, so `-1`. For `1`, the next
greater is `3`. For `2`, there is no greater element to its right, so `-1`.

**Example 2:**
```
Input:  nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
```
The next greater element of `2` is `3`; `4` has none.

**Example 3:**
```
Input:  nums1 = [1], nums2 = [1]
Output: [-1]
```

### Constraints
- `1 <= nums1.length <= nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 10^4`
- All integers in `nums1` and `nums2` are unique, and `nums1` is a subset of `nums2`.

---

## Problem 12: Daily Temperatures

**LeetCode:** [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

### Description
Given an array of integers `temperatures` representing the daily temperatures,
return an array `answer` such that `answer[i]` is the number of days you have to
wait after the `i`-th day to get a warmer temperature. If there is no future day
for which this is possible, keep `answer[i] == 0`. Use a monotonic decreasing
stack of indices: when a warmer day arrives, pop every cooler day and record the
gap, giving `O(n)` total time.

### Examples
**Example 1:**
```
Input:  temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
```
Day `0` (73) waits 1 day for 74; day `2` (75) waits 4 days for 76; the last two
days have no warmer future day.

**Example 2:**
```
Input:  temperatures = [30,40,50,60]
Output: [1,1,1,0]
```

**Example 3:**
```
Input:  temperatures = [30,60,90]
Output: [1,1,0]
```

### Constraints
- `1 <= temperatures.length <= 10^5`
- `30 <= temperatures[i] <= 100`

---

## Problem 13: Next Greater Element II

**LeetCode:** [503. Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/)

### Description
Given a circular integer array `nums` (the next element of `nums[nums.length-1]`
is `nums[0]`), return the next greater number for every element. The next
greater number of an element `x` is the first greater number traversing the
array in circular order; if it does not exist, the answer is `-1`. Process the
array twice with a monotonic decreasing stack of indices, using `i % n` to wrap
around, so the whole thing runs in `O(n)`.

### Examples
**Example 1:**
```
Input:  nums = [1,2,1]
Output: [2,-1,2]
```
The first `1`'s next greater is `2`; `2` has none; the last `1` wraps around to
find `2`.

**Example 2:**
```
Input:  nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
```

**Example 3:**
```
Input:  nums = [5,4,3,2,1]
Output: [-1,5,5,5,5]
```

### Constraints
- `1 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`

---

## Problem 14: Simplify Path

**LeetCode:** [71. Simplify Path](https://leetcode.com/problems/simplify-path/)

### Description
You are given an absolute path for a Unix-style file system, which always begins
with a slash `'/'`. Transform this absolute path into its simplified canonical
path. In a Unix file system, a single period `'.'` refers to the current
directory, a double period `'..'` refers to the parent directory, and any
number of consecutive slashes is treated as a single slash. The canonical path
must start with a single `'/'`, have directories separated by exactly one `'/'`,
not end with a trailing `'/'`, and contain no `'.'` or `'..'` components. Split
on slashes and use a stack of directory names, popping on each `'..'`.

### Examples
**Example 1:**
```
Input:  path = "/home//foo/"
Output: "/home/foo"
```
Multiple slashes collapse into one and the trailing slash is dropped.

**Example 2:**
```
Input:  path = "/a/./b/../../c/"
Output: "/c"
```
`.` is ignored; each `..` pops the previous directory, leaving only `c`.

**Example 3:**
```
Input:  path = "/../"
Output: "/"
```
Going above the root directory stays at the root.

### Constraints
- `1 <= path.length <= 3000`
- `path` consists of English letters, digits, periods `'.'`, slashes `'/'`, and underscores `'_'`.
- `path` is a valid absolute Unix path.

---

## Problem 15: Asteroid Collision

**LeetCode:** [735. Asteroid Collision](https://leetcode.com/problems/asteroid-collision/)

### Description
We are given an array `asteroids` of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign
represents its direction (positive meaning right, negative meaning left). Each
asteroid moves at the same speed. Find out the state of the asteroids after all
collisions. If two asteroids meet, the smaller one explodes; if both are the
same size, both explode. Two asteroids moving in the same direction will never
meet. A stack models the rightward-moving survivors: a leftward asteroid
collides with the top of the stack until it is destroyed or survives.

### Examples
**Example 1:**
```
Input:  asteroids = [5,10,-5]
Output: [5,10]
```
The `10` and `-5` collide, and the `-5` explodes. The `10` and `5` never meet
because they move in the same direction.

**Example 2:**
```
Input:  asteroids = [8,-8]
Output: []
```
They are the same size, so both explode.

**Example 3:**
```
Input:  asteroids = [10,2,-5]
Output: [10]
```
The `-5` destroys the `2`, then collides with the `10` and explodes.

### Constraints
- `2 <= asteroids.length <= 10^4`
- `-1000 <= asteroids[i] <= 1000`
- `asteroids[i] != 0`

---

## Problem 16: Number of Recent Calls

**LeetCode:** [933. Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)

### Description
You have a `RecentCounter` class which counts the number of recent requests
within a certain time frame. Implement the `Problem16` class:
- `Problem16()` initializes the counter with zero recent requests.
- `int ping(int t)` adds a new request at time `t` (in milliseconds) and returns
  the number of requests that have happened in the inclusive range
  `[t - 3000, t]`.

It is guaranteed that every call to `ping` uses a strictly larger value of `t`
than the previous call. A FIFO queue of timestamps lets you drop everything
older than `t - 3000` from the front and return the queue size.

### Examples
**Example 1:**
```
Input:  ping(1), ping(100), ping(3001), ping(3002)
Output: 1, 2, 3, 3
```
At `3001`, the request at time `1` is exactly `3000` ms old and still counts. At
`3002`, the request at time `1` (`3001` ms old) is evicted, leaving `3`.

**Example 2:**
```
Input:  ping(1000)
Output: 1
```

**Example 3:**
```
Input:  ping(1), ping(2), ping(3)
Output: 1, 2, 3
```

### Constraints
- `1 <= t <= 10^9`
- Each test case calls `ping` with strictly increasing values of `t`.
- At most `10^4` calls are made to `ping`.

---

## Problem 17: Validate Stack Sequences

**LeetCode:** [946. Validate Stack Sequences](https://leetcode.com/problems/validate-stack-sequences/)

### Description
Given two integer arrays `pushed` and `popped`, each with distinct values,
return `true` if and only if this could have been the result of a sequence of
push and pop operations on an initially empty stack. Simulate the process: push
each value from `pushed` in order, and whenever the top of the stack equals the
next value to pop, pop it. The sequence is valid if the stack is empty at the
end.

### Examples
**Example 1:**
```
Input:  pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
```
One valid order: push 1,2,3,4, pop 4, push 5, pop 5,3,2,1.

**Example 2:**
```
Input:  pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
```
After popping `4` and `3`, the value `1` cannot be popped before `2`, so this is impossible.

**Example 3:**
```
Input:  pushed = [1,2], popped = [2,1]
Output: true
```

### Constraints
- `1 <= pushed.length <= 1000`
- `0 <= pushed[i] <= 1000`
- All the elements of `pushed` are unique.
- `popped.length == pushed.length`
- `popped` is a permutation of `pushed`.

---

## Problem 18: Decode String

**LeetCode:** [394. Decode String](https://leetcode.com/problems/decode-string/)

### Description
Given an encoded string, return its decoded string. The encoding rule is
`k[encoded_string]`, where the `encoded_string` inside the square brackets is
repeated exactly `k` times. You may assume the input is always valid, with no
extra white spaces and well-formed brackets. The digits only indicate repeat
counts and never appear inside the decoded text. Use two stacks (one for counts,
one for partial strings) so that opening a bracket pushes context and closing a
bracket repeats and merges.

### Examples
**Example 1:**
```
Input:  s = "3[a]2[bc]"
Output: "aaabcbc"
```
`3[a]` expands to `"aaa"` and `2[bc]` expands to `"bcbc"`.

**Example 2:**
```
Input:  s = "3[a2[c]]"
Output: "accaccacc"
```
The inner `2[c]` becomes `"cc"`, so `a2[c]` is `"acc"`, repeated 3 times.

**Example 3:**
```
Input:  s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
```

### Constraints
- `1 <= s.length <= 30`
- `s` consists of lowercase English letters, digits, and square brackets `'[]'`.
- `s` is guaranteed to be a valid input.
- All integers in `s` are in the range `[1, 300]`.

---

## Problem 19: Remove K Digits

**LeetCode:** [402. Remove K Digits](https://leetcode.com/problems/remove-k-digits/)

### Description
Given a string `num` representing a non-negative integer and an integer `k`,
return the smallest possible integer (as a string) after removing exactly `k`
digits from `num`. Use a monotonic increasing stack: while you still have
removals left and the current digit is smaller than the top of the stack, pop.
Finally, strip any leading zeros from the result, and return `"0"` if the result
is empty.

### Examples
**Example 1:**
```
Input:  num = "1432219", k = 3
Output: "1219"
```
Removing the digits `4`, `3`, and `2` leaves the smallest number `1219`.

**Example 2:**
```
Input:  num = "10200", k = 1
Output: "200"
```
Removing the leading `1` gives `0200`, which becomes `200` after stripping the leading zero.

**Example 3:**
```
Input:  num = "10", k = 2
Output: "0"
```
Removing both digits leaves nothing, so the answer is `"0"`.

### Constraints
- `1 <= k <= num.length <= 10^5`
- `num` consists of only digits.
- `num` does not have any leading zeros except for the zero itself.

---

## Problem 20: Online Stock Span

**LeetCode:** [901. Online Stock Span](https://leetcode.com/problems/online-stock-span/)

### Description
Design an algorithm that collects daily price quotes for a stock and returns the
span of that stock's price for the current day. The span of the stock's price on
a given day is the maximum number of consecutive days (starting from that day and
going backward) for which the price was less than or equal to the price of that
day. Implement the `Problem20` class:
- `Problem20()` initializes the object.
- `int next(int price)` returns the span of the stock's price given today's
  `price`.

A monotonic decreasing stack of `(price, span)` pairs lets each `next` call run
in amortized `O(1)`.

### Examples
**Example 1:**
```
Input:  next(100), next(80), next(60), next(70), next(60), next(75), next(85)
Output: 1, 1, 1, 2, 1, 4, 6
```
At price `75`, the prior days `60, 70, 60` are all `<= 75`, giving a span of `4`.
At `85`, the six most recent days are all `<= 85`, giving a span of `6`.

**Example 2:**
```
Input:  next(10), next(20), next(30)
Output: 1, 2, 3
```
Each price is at least the previous, so the span keeps growing.

**Example 3:**
```
Input:  next(50), next(40), next(30)
Output: 1, 1, 1
```

### Constraints
- `1 <= price <= 10^5`
- At most `10^4` calls are made to `next`.

---

## Problem 21: Score of Parentheses

**LeetCode:** [856. Score of Parentheses](https://leetcode.com/problems/score-of-parentheses/)

### Description
Given a balanced parentheses string `s`, return the score of the string based on
the following rules: `"()"` has a score of `1`; `AB` has a score of `A + B`
where `A` and `B` are balanced parentheses strings; and `(A)` has a score of
`2 * A` where `A` is a balanced parentheses string. Use a stack that holds the
running score of each nesting level: `(` pushes a new level, `)` pops and folds
the inner score into the level below.

### Examples
**Example 1:**
```
Input:  s = "()"
Output: 1
```
A single matched pair scores `1`.

**Example 2:**
```
Input:  s = "(())"
Output: 2
```
The inner `()` scores `1`, and wrapping it in parentheses doubles it to `2`.

**Example 3:**
```
Input:  s = "()()"
Output: 2
```
Two adjacent pairs each score `1`, summing to `2`.

### Constraints
- `2 <= s.length <= 50`
- `s` consists of only `'('` and `')'`.
- `s` is a balanced parentheses string.

---

## Problem 22: Sum of Subarray Minimums

**LeetCode:** [907. Sum of Subarray Minimums](https://leetcode.com/problems/sum-of-subarray-minimums/)

### Description
Given an array of integers `arr`, find the sum of `min(b)` over every
(contiguous) subarray `b` of `arr`. Because the answer may be large, return it
modulo `10^9 + 7`. The efficient `O(n)` approach uses a monotonic stack to find,
for each element, how many subarrays it is the minimum of — namely the span to
the nearest strictly smaller element on the left and the nearest smaller-or-equal
element on the right.

### Examples
**Example 1:**
```
Input:  arr = [3,1,2,4]
Output: 17
```
The subarray minimums are `3, 1, 2, 4, 1, 1, 2, 1, 1, 1`, which sum to `17`.

**Example 2:**
```
Input:  arr = [11,81,94,43,3]
Output: 444
```

**Example 3:**
```
Input:  arr = [1]
Output: 1
```

### Constraints
- `1 <= arr.length <= 3 * 10^4`
- `1 <= arr[i] <= 3 * 10^4`

---

## Problem 23: Largest Rectangle in Histogram

**LeetCode:** [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)

### Description
Given an array of integers `heights` representing the histogram's bar heights
where the width of each bar is `1`, return the area of the largest rectangle in
the histogram. Maintain a monotonic increasing stack of bar indices: when a bar
shorter than the stack top appears, pop and compute the area of the rectangle
that used the popped bar as its limiting height, with the width spanning to the
new boundaries. This yields an `O(n)` solution.

### Examples
**Example 1:**
```
Input:  heights = [2,1,5,6,2,3]
Output: 10
```
The largest rectangle spans bars of heights `5` and `6`, giving area `5 * 2 = 10`.

**Example 2:**
```
Input:  heights = [2,4]
Output: 4
```
The rectangle of height `4` and width `1`, or height `2` and width `2`, both give `4`.

**Example 3:**
```
Input:  heights = [1,1,1,1]
Output: 4
```

### Constraints
- `1 <= heights.length <= 10^5`
- `0 <= heights[i] <= 10^4`

---

## Problem 24: Basic Calculator

**LeetCode:** [224. Basic Calculator](https://leetcode.com/problems/basic-calculator/)

### Description
Given a string `s` representing a valid expression, implement a basic calculator
to evaluate it and return the result. The expression may contain non-negative
integers, the binary `'+'` and `'-'` operators, the unary `'-'` (negation), and
parentheses `'('` and `')'`, possibly with spaces. You are not allowed to use
any built-in function that evaluates strings as expressions. Use a stack to save
the running result and sign whenever a `'('` is opened, restoring them when the
matching `')'` is reached.

### Examples
**Example 1:**
```
Input:  s = "1 + 1"
Output: 2
```
Simple addition.

**Example 2:**
```
Input:  s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
```
The inner groups evaluate to `1 + 11 - 3 = 9` and `14`, summing to `23`.

**Example 3:**
```
Input:  s = " 2-1 + 2 "
Output: 3
```

### Constraints
- `1 <= s.length <= 3 * 10^5`
- `s` consists of digits, `'+'`, `'-'`, `'('`, `')'`, and spaces `' '`.
- `s` represents a valid expression.
- The `'+'` and `'-'` operators always have a valid operand; `'-'` can also be unary.
- Every `')'` has a matching `'('`, and the integer values fit in a 32-bit signed integer.
