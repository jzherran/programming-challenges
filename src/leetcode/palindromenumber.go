package main

import (
	"fmt"
	"math"
)

func main() {
	var x int
	_, err := fmt.Scan(&x)

	if err != nil {
		panic(err)
	}

	fmt.Println(isPalindrome(x))
}

// 9.  [https://leetcode.com/problems/palindrome-number/]
// Calculate if a number is palinfrome or not
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

  fmt.Println(mod, digits)
  
  for i := 0; x > 0; i++ {
    fmt.Println("Iter => ", i, "::", x, mod, x / mod, x % 10)
    if (x / mod != x % 10) {
      return false
    }

    x = x % mod
    x = x / 10
    mod = mod / 100
  }

	return true
}
