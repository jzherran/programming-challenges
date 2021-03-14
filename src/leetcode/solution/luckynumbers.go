package solution

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type LuckyNumbers struct{}

// 1380. Lucky Numbers in a Matrix [https://leetcode.com/problemslucky-numbers-in-a-matrix/]
func (l *LuckyNumbers) Run() {
	reader := bufio.NewReader(os.Stdin)
	data, _ := reader.ReadString('\n')
	nums := [][]int{}

	for _, r := range strings.Split(data, "],[") {
		row := []int{}

		for _, v := range strings.Split(r, ",") {
			
			n, err := strconv.Atoi(
				strings.ReplaceAll(
					strings.ReplaceAll(strings.ReplaceAll(v, "\n", ""), "[", ""), "]", ""))
			if err != nil {
				panic(err)
			}

			row = append(row, n)
		}

		nums = append(nums, row)
	}

	fmt.Println(luckyNumbers(nums))
}

func luckyNumbers(matrix [][]int) []int {
	r := make([]int, len(matrix))
	c := make([]int, len(matrix[0]))

	for i, row := range matrix {
		for j, val := range row {
			if r[i] == 0 || r[i] > val {
				r[i] = val
			}

			if c[j] < val {
				c[j] = val
			}
		}
	}

	return intersection(r, c)
}

func intersection(a, b []int) (c []int) {
	m := make(map[int]bool)

	for _, item := range a {
		m[item] = true
	}

	for _, item := range b {
		if _, ok := m[item]; ok {
			c = append(c, item)
		}
	}
	return
}
