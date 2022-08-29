package _20220829

func shuffle(nums []int, n int) []int {
	ans := make([]int, n*2)
	for i := 0; i < n; i++ {
		ans[i*2] = nums[i]
		ans[i*2+1] = nums[n+i]
	}
	return ans
}
