"""
Day 08: Butterfly Pattern
Creating a butterfly shape using stars and spaces.
"""

n = int(input("Enter the value of n: "))

# Upper half
for i in range(1, n + 1):
    # Left stars
    for j in range(1, i + 1):
        print("*", end="")
    
    # Spaces
    spaces = 2 * (n - i)
    for j in range(1, spaces + 1):
        print(" ", end="")
        
    # Right stars
    for j in range(1, i + 1):
        print("*", end="")
    print()

# Lower half
for i in range(n, 0, -1):
    # Left stars
    for j in range(1, i + 1):
        print("*", end="")
    
    # Spaces
    spaces = 2 * (n - i)
    for j in range(1, spaces + 1):
        print(" ", end="")
        
    # Right stars
    for j in range(1, i + 1):
        print("*", end="")
    print()
