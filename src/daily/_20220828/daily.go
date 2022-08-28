package main

func preimageSizeFZF(k int) int {
	b1 := k * 4
	b2 := (k + 1) * 4
	for {
		if f(b1) == k {
			break
		} else if f(b1) > k {
			return 0
		}
		b1++
	}
	for {
		if f(b2) > k {
			break
		}
		b2++
	}
	return b2 - b1
}

func f(x int) (zeroCount int) {
	logarithm := log5(x)
	for i := 1; i <= logarithm; i++ {
		zeroCount += x / pow5(i)
	}
	return
}

func log5(x int) int {
	logarithm := 0
	for ; x >= 5; x /= 5 {
		logarithm++
	}
	return logarithm
}

func pow5(x int) int {
	ans := 1
	for i := 1; i <= x; i++ {
		ans *= 5
	}
	return ans
}
