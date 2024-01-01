
# LeetCode Challenge D18

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2928.  Distribute Candies Among Children I](https://leetcode.com/problems/distribute-candies-among-children-i/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given two positive integers  `n`  and  `limit`. Return  _the  total number  of ways to distribute_ `n`  _candies among_ `3` _children such that no child gets more than_ `limit` _candies._

**Example**
>**Input:** n = 5, limit = 2
>
>**Output:** 3
>
>**Explanation:** There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview

A list (`list`) is initialized to store the combinations of candies for each child. Two nested loops iterate over possible combinations of candies for each child (`i`, and `j`).  `i`, `j`, and `k` represent the number of candies for the first, second, and third child, respectively. The third child's candies (`k`) are calculated based on the remaining candies after assigning to the first two children. The loops include conditions to ensure that each child's candies are non-negative and within the specified limit. If the conditions are met, the combination of candies for the three children is added to the list. The final result is obtained by dividing the size of the list by 3, as each valid distribution is represented by three integers in the list.
