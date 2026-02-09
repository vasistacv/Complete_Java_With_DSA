"""
Day 05: Hollow Rectangle Pattern
Printing a rectangle with only border stars.
"""

n = int(input("Enter the number of rows:"))
m = int(input("Enter the number of columns:"))

for i in range(1, n + 1):
    for j in range(1, m + 1):
        # Print star for borders, space for inside
        if i == 1 or i == n or j == 1 or j == m:
            print("*", end="")
        else:
            print(" ", end="")
    print() # Newline after each row
