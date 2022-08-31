package _20220831

import lls "github.com/emirpasic/gods/stacks/linkedliststack"

func validateStackSequences(pushed []int, popped []int) bool {
	stack := lls.New()
	var p1, p2 int
	for i := 0; i < len(pushed)+len(popped); i++ {
		top, ok := stack.Peek()
		if !ok {
			stack.Push(pushed[p1])
			p1++
		} else {
			if top == popped[p2] {
				stack.Pop()
				p2++
			} else {
				if p1 == len(pushed) {
					return false
				}
				stack.Push(pushed[p1])
				p1++
			}
		}
	}
	return stack.Empty()
}
