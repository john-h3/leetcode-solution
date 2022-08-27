package main

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

type Node struct {
	node *TreeNode
	idx  int
}

func widthOfBinaryTree(root *TreeNode) int {
	return widthOfNodes([]Node{{root, 1}})
}

func getChildren(nodes []Node) []Node {
	children := make([]Node, 0)
	for _, node := range nodes {
		if node.node.Left != nil {
			children = append(children, Node{node.node.Left, node.idx*2 - 1})
		}
		if node.node.Right != nil {
			children = append(children, Node{node.node.Right, node.idx * 2})
		}
	}
	return children
}

func widthOfNodes(nodes []Node) int {
	if len(nodes) == 0 {
		return 0
	}
	return max(getWidth(nodes), widthOfNodes(getChildren(nodes)))
}

func getWidth(nodes []Node) int {
	start := nodes[0].idx
	end := nodes[len(nodes)-1].idx
	return end - start + 1
}

func max(x, y int) int {
	if x > y {
		return x
	} else {
		return y
	}
}
