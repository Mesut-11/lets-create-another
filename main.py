import numpy as np

arr1 = list(range(1000000))
arr2 = list(range(1000000, 2000000))
arr1_np = np.array(arr1)
arr2_np = np.array(arr2)
print(np.dot(arr1_np, arr2_np))

print(np.array([[[
    [[11, 12, 13],
     [13, 14, 15]],
    [[15, 16, 17],
     [17, 18, 19.5]]]
]]).shape)
output = np.array([[[
    [[11, 12, 13],
     [13, 14, 15]],
    [[15, 16, 17],
     [17, 18, 19.5]]]
]])

arr3 = np.array([
    [[11, 12, 8, 19],
     [13, 21, 4, 19]],

    [[5, 1, 7, 21],
     [13, 9, 6, 1]],

    [[9, 32, 18, -5],
     [15, 25, 11, -6]]])
print(arr3[:2, :])

print(arr3.shape)

arr = [[1, 2], [2, 3], [3., 4, 5]]

print(np.array(arr).dtype)