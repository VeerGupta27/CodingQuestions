<h2><a href="https://leetcode.com/problems/combine-two-tables">175. Combine Two Tables</a></h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

## Table: Person

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| personId    | int     |
| lastName    | varchar |
| firstName   | varchar |
+-------------+---------+
</pre>

<p><code>personId</code> is the primary key for this table.</p>

<p>This table contains information about the ID of some persons and their first and last names.</p>

---

## Table: Address

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| addressId   | int     |
| personId    | int     |
| city        | varchar |
| state       | varchar |
+-------------+---------+
</pre>

<p><code>addressId</code> is the primary key for this table.</p>

<p>Each row of this table contains information about the city and state of one person with ID = PersonId.</p>

---

# Problem Statement

Write a solution to report the first name, last name, city, and state of each person in the `Person` table.

If the address of a person is not present in the `Address` table, report `null` instead.

Return the result table in any order.

---

## Example

### Input

### Person Table

<pre>
+----------+----------+-----------+
| personId | lastName | firstName |
+----------+----------+-----------+
| 1        | Wang     | Allen     |
| 2        | Alice    | Bob       |
+----------+----------+-----------+
</pre>

### Address Table

<pre>
+-----------+----------+---------------+------------+
| addressId | personId | city          | state      |
+-----------+----------+---------------+------------+
| 1         | 2        | New York City | New York   |
| 2         | 3        | Leetcode      | California |
+-----------+----------+---------------+------------+
</pre>

---

### Output

<pre>
+-----------+----------+---------------+----------+
| firstName | lastName | city          | state    |
+-----------+----------+---------------+----------+
| Allen     | Wang     | Null          | Null     |
| Bob       | Alice    | New York City | New York |
+-----------+----------+---------------+----------+
</pre>

---

# Approach

- Use `LEFT JOIN`
- Return all records from `Person`
- Match rows using `personId`
- If no matching address exists, SQL automatically returns `NULL`

---

# SQL Solution

```sql
SELECT p.firstName,
       p.lastName,
       a.city,
       a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;
```

---

# Explanation

## LEFT JOIN

- Keeps all rows from the `Person` table
- Returns matching rows from `Address`
- If no match exists → returns `NULL`

---

# Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
