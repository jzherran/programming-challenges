package solution

import (
	"math"
)

/*
func main() {
	var x int
	_, err := fmt.Scan(&x)

	if err != nil {
		panic(err)
	}

	fmt.Println(isPalindrome(x))
}
*/

// 9. Palindrome number [https://leetcode.com/problems/palindrome-number/]
// Calculate if a number is palinfrome or not: this approach can be improved
// using the same approach to validate the initial data with the end data
// but not stored bot data just get the reverse number and compare after get
// each digit
func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}

	digits := 0
	for i := x; i > 0; i = i / 10 {
		digits++
	}

	mod := int(math.Pow10(digits - 1))
	if digits%2 != 0 {
		digits--
	}

	for i := 0; x > 0; i++ {
		if x/mod != x%10 {
			return false
		}

		x = x % mod
		x = x / 10
		mod = mod / 100
	}

	return true
}
