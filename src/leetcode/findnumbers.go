package leetcode

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
	fmt.Println(findNumbers(nums))
}
*/

func findNumbers(nums []int) int {

	total := 0
	digits := func(x int) int {
		r, d := x, 0

		for r > 0 {
			r = r / 10
			d++
		}

		return d
	}

	for _, n := range nums {
		numDigits := digits(n)

		if numDigits%2 == 0 {
			total++
		}
	}

	return total
}
