"""
Day 05: Half Pyramid Pattern
Printing a triangle of stars.
"""

# How many rows for the pyramid?
n = int(input("Enter the number of rows:"))

# Outer loop for rows
for i in range(1, n + 1):
    # Inner loop for content - notice it goes up to 'i'
    # Row 1 -> 1 star
    # Row 2 -> 2 stars
    # Row n -> n stars
    for j in range(1, i + 1):
        print("*", end="")
    print() # Newline after each row
