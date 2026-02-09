"""
Day 05: Star Pattern
Printing rectangle of stars using nested loops.
"""

n = int(input("Enter the number of rows:"))
m = int(input("Enter the number of columns:"))

for i in range(1, n + 1):
    for j in range(1, m + 1):
        print("*", end="")
    print("*")
