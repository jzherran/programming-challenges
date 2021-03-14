package solution

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

// SortColors ...
type SortColors struct{}

// Run ...
func (sc *SortColors) Run() {
	reader := bufio.NewReader(os.Stdin)
	data, _ := reader.ReadString('\n')
	nums := []int{}

	for _, v := range strings.Split(data, ",") {

		n, err := strconv.Atoi(strings.ReplaceAll(v, "\n", ""))
		if err == nil {
			nums = append(nums, n)
		} else {
			panic(err)
		}
	}

	sortColors(nums)
	fmt.Println(nums)
}

func sortColors(nums []int) {
	i, j, k := 0, 0, len(nums)-1

	for j <= k {
		//fmt.Println("BEFORE", nums, i, j, k)

		if nums[j] == 0 {
			nums[i], nums[j] = nums[j], nums[i]
			i++
			j++
		} else if nums[j] == 1 {
			j++
		} else {
			nums[j], nums[k] = nums[k], nums[j]
			k--
		}

		// fmt.Println("AFTER", nums, i, j)
	}
	//fmt.Printf("\n")
}
