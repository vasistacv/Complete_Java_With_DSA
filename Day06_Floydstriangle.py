"""
Day 06: Floyd's Triangle
Printing a number triangle where numbers go 1, 2, 3... continuously.
"""

n = int(input("Enter the value of n:"))
num = 1

for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(num, end=" ")
        num += 1
    print()
