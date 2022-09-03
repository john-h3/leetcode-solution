package main

import (
	"sort"
)

type sortable [][]int

func (s sortable) Len() int {
	return len(s)
}

func (s sortable) Less(i, j int) bool {
	return s[i][0] < s[j][0]
}

func (s sortable) Swap(i, j int) {
	tmp := s[i]
	s[i] = s[j]
	s[j] = tmp
}

func findLongestChain(pairs [][]int) int {
	sort.Sort(sortable(pairs))
	prev := pairs[0]
	count := 1
	for i := 1; i < len(pairs); i++ {
		current := pairs[i]
		if prev[1] < current[0] {
			count++
			prev = current
		} else if current[1] < prev[1] {
			prev = current
		}
	}
	return count
}
