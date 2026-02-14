"""
Day 06: 0-1 Triangle Pattern
Triangle where elements alternate between 0 and 1.
Logic: If (row + col) is even -> 1, else -> 0.
"""

n = int(input("Enter the value of n:"))

for i in range(1, n + 1):
    for j in range(1, i + 1):
        if (i + j) % 2 == 0:
            print("1 ", end="")
        else:
            print("0 ", end="")
    print()
