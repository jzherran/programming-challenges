package main

import (
	"github.com/jzherran/programming-challenges/leetcode/solution"
)

func main() {
	r := new(solution.IntToRoman)

	if r != nil {
		if e := r.Run(); e != nil {
			panic(e)
		}
	} else {
		panic("Is not possible to launch the process to resolve the problem!")
	}
}
