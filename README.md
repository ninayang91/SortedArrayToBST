# SortedArrayToBST
Given a sorted array, create a binary search tree with minimal height

similar with binary search, use middle value to create root, use the left half create left, the right half create right

createBST(a,low,mid-1); createBST(a,mid+1,high) return new TreeNode(a[mid],left,right)
