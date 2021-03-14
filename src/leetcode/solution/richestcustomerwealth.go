package solution

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type RichestCustomerWealth struct{}

func (r *RichestCustomerWealth) Run() {
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

	fmt.Println(maximumWealth(nums))
}

func maximumWealth(accounts [][]int) int {
	result := 0
	for _, c := range accounts {
    countCustomer := 0
    for _, a := range c {
      countCustomer += a
    }
    
    if result < countCustomer {
      result = countCustomer
    }
	}

	return result
}