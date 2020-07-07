package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
	"strings"
)

// Swap change the values for the idx int the slice with the idx - 1 value
func Swap(sli []int, idx int) {
	tmp := sli[idx-1]
	sli[idx-1] = sli[idx]
	sli[idx] = tmp
}

// BubbleSort sort with bubble sort algorithm
func BubbleSort(nums []int) {
	n := len(nums)

	for n > 1 {
		newn := 0
		for i := 1; i < n; i++ {
			if nums[i-1] > nums[i] {
				Swap(nums, i)
				newn = i
			}
		}
		n = newn
	}
}

func convToSlice(line string) []int {
	data := make([]int, 10)
	splitData := strings.Split(line, " ")

	if len(splitData) < 10 {
		log.Fatal("Is required minumum 10 numbers!")
	}

	for i, v := range splitData {
		num, e := strconv.Atoi(v)

		if e != nil {
			log.Fatal(e)
		}

		if i > len(data)-1 {
			data = append(data, num)
		} else {
			data[i] = num
		}
	}

	return data
}

func readData() []int {

	reader := bufio.NewReader(os.Stdin)

	fmt.Print("Enter a list of numbers separated by blank space: \n")

	line, e := reader.ReadString('\n')
	if e != nil {
		log.Fatal(e)
	}

	return convToSlice(strings.TrimRight(line, "\r\n"))
}

func main() {
	d := readData()
	BubbleSort(d)
	fmt.Println(d)
}

/*
10 39 9 0 2 27 166 4 35 19 100 1 7
*/
