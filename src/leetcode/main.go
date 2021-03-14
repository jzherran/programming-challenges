package main

import (
	"github.com/jzherran/programming-challenges/leetcode/solution"
)

func main() {
	sol := new(solution.LuckyNumbers)

	if sol != nil {
		sol.Run()
	} else {
		panic("Is not possible to launch the process to resolve the problem!")
	}
}
