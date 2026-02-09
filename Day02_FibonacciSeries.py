"""
Day 02: Fibonacci Series

Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13...
Each number = sum of previous two.
"""

# Function to get fibonacci number at position n
def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n - 1) + fib(n - 2)

n = int(input())

# Print first n fibonacci numbers
for i in range(n):
    print(fib(i), end=" ")
