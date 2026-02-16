"""
Day 07: Solid Rhombus Pattern
Creating a rhombus using stars and spaces.
"""

n = int(input("Enter value of n: "))

for i in range(1, n + 1):
    # Spaces
    for j in range(1, n - i + 1):
        print(" ", end="")
        
    # Stars
    for j in range(1, n + 1):
        print("*", end="")
    print()
