"""
Day 09: Diamond Pattern
A shiny star diamond! 💎
We print the top half first, then the bottom half.
"""

# Ask the user for the size
n = int(input("Enter the value of n: "))

# Upper Half
for i in range(1, n + 1):
    # Print spaces to push stars to center
    print(" " * (n - i), end="")
    # Print stars (odd numbers: 1, 3, 5...)
    print("*" * (2 * i - 1))

# Lower Half
for i in range(n - 1, 0, -1):
    # Print spaces to keep the diamond shape
    print(" " * (n - i), end="")
    # Print stars (odd numbers decreasing)
    print("*" * (2 * i - 1))
