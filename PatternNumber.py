"""
Day 06: Number Pattern
Printing a half pyramid but with numbers instead of stars.
"""

n = int(input("Enter the value of n:"))

for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(j, end="")
    print()
