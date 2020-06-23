package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	data, _ := reader.ReadString('\n')
	nums := []int{}

	for _, v := range strings.Split(data, ",") {

		cv, e := strconv.Atoi(strings.ReplaceAll(v, "\n", ""))
		if e == nil {
			nums = append(nums, cv)
		} else {
			panic(e)
		}
	}

	fmt.Println(canJump(nums))
}

// 55. Jump Game [https://leetcode.com/problems/jump-game/]
// Greedy algorithm, first interaction with this concept.
func canJump(nums []int) bool {
	// init the max value in 0, because is not possible to get a negative values
	maxValue := 0

	// iterate all values in nums array
	for index, value := range nums {

		// if is not the first iteration we need to fix the max value stored
		// that is necessary for the iteration of the nums array
		if index > 0 {
			maxValue = maxValue - 1
		}

		// select the max value between the old max value and the new value in the array
		maxValue = Max(maxValue, value)

		// logic to evaluate if is posible to jump to the last index in the nums array
		if len(nums) > 1 && maxValue == 0 {
			return false
		} else if len(nums) == 1 && maxValue == 1 {
			return true
		} else if maxValue >= ((len(nums) - 1) - index) {
			return true
		} else {
			continue
		}
	}
	return false
}

// Max returns the larger of x or y.
func Max(x, y int) int {
	if x < y {
		return y
	}
	return x
}
