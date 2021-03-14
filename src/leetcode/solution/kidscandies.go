package solution

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type KidsCandies struct{}

func (k *KidsCandies) Run() {
	reader := bufio.NewReader(os.Stdin)

	data, _ := reader.ReadString('\n')
	candies := []int{}

	for _, v := range strings.Split(data, ",") {

		cv, e := strconv.Atoi(strings.ReplaceAll(v, "\n", ""))
		if e == nil {
			candies = append(candies, cv)
		} else {
			panic(e)
		}
	}

	var extraCandies int
	if _, err := fmt.Scanf("%d", &extraCandies); err != nil {
		panic(err)
	}

	fmt.Println(kidsWithCandies(candies, extraCandies))
}

// 1431. Kids With the Greatest Number of Candies [https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/]
func kidsWithCandies(candies []int, extraCandies int) []bool {
	res := make([]bool, len(candies))

	maxCandies := func(a []int) int {
		maxVal := 0
		for _, v := range a {
			if v > maxVal {
				maxVal = v
			}
		}
		return maxVal
	}(candies)

	for i, c := range candies {
		res[i] = (c + extraCandies) >= maxCandies
	}

	return res
}
