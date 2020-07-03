package solution

import (
	"sort"
)

/*
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

	fmt.Println(nums)
	fmt.Println(sortedSquares(nums))
}
*/

func sortedSquares(A []int) []int {
	var res []int

	for k := 0; k < len(A); k++ {
		res = append(res, A[k]*A[k])
	}

	sort.Sort(sort.IntSlice(res))

	return res
}
