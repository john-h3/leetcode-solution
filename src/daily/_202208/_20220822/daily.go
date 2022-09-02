package _20220822

import "strconv"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var matrix [][]string
var h int

func printTree(root *TreeNode) [][]string {
	if root == nil {
		return matrix
	}
	h = height(root)
	rows := h + 1
	cols := 1<<(h+1) - 1
	matrix = make([][]string, rows)
	for i := 0; i < rows; i++ {
		matrix[i] = make([]string, cols)
	}
	matrix[0][(cols-1)/2] = strconv.Itoa(root.Val)
	recursiveFill(root, 0, (cols-1)/2)
	return matrix
}

func height(root *TreeNode) int {
	if root == nil {
		return -1
	}
	return 1 + max(height(root.Left), height(root.Right))
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func recursiveFill(root *TreeNode, r, c int) {
	if root == nil {
		return
	}
	if root.Left != nil {
		matrix[r+1][c-1<<(h-r-1)] = strconv.Itoa(root.Left.Val)
		recursiveFill(root.Left, r+1, c-1<<(h-r-1))
	}
	if root.Right != nil {
		matrix[r+1][c+1<<(h-r-1)] = strconv.Itoa(root.Right.Val)
		recursiveFill(root.Right, r+1, c+1<<(h-r-1))
	}
}
