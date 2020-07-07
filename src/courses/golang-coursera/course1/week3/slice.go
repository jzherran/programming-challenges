package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

const aksNum = "Add a new value, or 'X' if you want to end: "

func main() {
	scan := bufio.NewScanner(os.Stdin)
	ssli := make([]int, 0, 3)

	fmt.Print(aksNum)

	i := 0
	for scan.Scan() {
		val := scan.Text()

		if val == "X" {
			return
		}

		if num, e := strconv.Atoi(val); e == nil {
			ssli = append(ssli, num)
			sort.Ints(ssli)
			fmt.Println("Status: ", ssli)
		} else {
			fmt.Println("It´s necessary an integer or 'X' to end!!!")
		}

		fmt.Printf("\n%s", aksNum)
		i++
	}
}
