package _20220901

func finalPrices(prices []int) []int {
	for i := 0; i < len(prices)-1; i++ {
		for j := i + 1; j < len(prices); j++ {
			if prices[j] < prices[i] {
				prices[i] -= prices[j]
				break
			}
		}
	}
	return prices
}
