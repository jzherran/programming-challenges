package solution

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

// SearchInsert ...
type SearchInsert struct{}

// Run ...
func (s SearchInsert) Run() error {
	scan := bufio.NewScanner(os.Stdin)
	scan.Split(bufio.ScanLines)

	A := []int{}
	var lines []string

	for scan.Scan() {
		lines = append(lines, scan.Text())

		if len(lines) == 2 {
			break
		}
	}

	data := strings.TrimRight(lines[0], "\n")
	x, _ := strconv.Atoi(strings.TrimRight(lines[1], "\n"))

	for _, v := range strings.Split(data, ",") {

		n, e := strconv.Atoi(v)
		if e == nil {
			A = append(A, n)
		} else {
			panic(e)
		}
	}

	fmt.Println(searchInsert(A, x))
	return nil
}

func searchInsert(A []int, x int) int {
	l, r := 0, len(A)-1

	if x < A[l] {
		return l
	}

	if x > A[r] {
		return r + 1
	}

	var m, ans int

	for l <= r {
		m = l + (r-l)/2
		if A[m] == x {
			fmt.Println("HERE 1")
			return m
		}

		if A[m] < x {
			l = m + 1
			ans = l
		} else {
			r = m - 1
			ans = m
		}
	}

	fmt.Println("HERE 2")
	return ans
}
