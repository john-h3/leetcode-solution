package _20220902

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func longestUnivaluePath(root *TreeNode) int {
	max, _ := path(root)
	return max
}

func path(root *TreeNode) (int, int) {
	if root == nil {
		return 0, 0
	}
	lm, lt := path(root.Left)
	rm, rt := path(root.Right)
	t := 0
	m := 0
	if root.Left != nil {
		if root.Val == root.Left.Val {
			t = 1 + lt
			m = 1 + lt
		}
	}
	if root.Right != nil {
		if root.Val == root.Right.Val {
			t = max2(1+rt, t)
			m += rt + 1
		}
	}
	return max3(lm, rm, m), t
}

func max2(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func max3(a, b, c int) int {
	return max2(max2(a, b), c)
}
