# 3Sum

[🔗 LeetCode Link](https://leetcode.com/problems/3sum/description/)

## Problem Description

Given an integer array `nums`, return **all** the **unique triplets** `[nums[i], nums[j], nums[k]]` such that:

- `i != j`, `i != k`, and `j != k`, and  
- `nums[i] + nums[j] + nums[k] == 0`.

> **Note:**  
> The solution set must **not** contain duplicate triplets.

---

## Examples

### Example 1

**Input:**  
`nums = [-1, 0, 1, 2, -1, -4]`  
**Output:**  
`[[-1, -1, 2], [-1, 0, 1]]`

**Explanation:**  
- `(-1) + 0 + 1 = 0`  
- `(-1) + (-1) + 2 = 0`  
Duplicate triplets like `[0, 1, -1]` are considered the same as `[-1, 0, 1]`.

---

### Example 2

**Input:**  
`nums = [0, 1, 1]`  
**Output:**  
`[]`

**Explanation:**  
There is no combination of three numbers that sum to 0.

---

### Example 3

**Input:**  
`nums = [0, 0, 0]`  
**Output:**  
`[[0, 0, 0]]`

**Explanation:**  
The only valid triplet is three zeros.

---

## Constraints

- `3 <= nums.length <= 3000`  
- `-10⁵ <= nums[i] <= 10⁵`

---

## Tags

- Array
- Two Pointers
- Sorting
