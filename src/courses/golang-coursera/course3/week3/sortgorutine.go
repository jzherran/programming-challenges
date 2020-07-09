package main

import (
	"fmt"
	"sort"
	"strconv"
	"sync"
)

const m = 4

func readData() []int {
	var v string
	s := []int{}

	fmt.Println("Add integer to slice or 'X' for execute short or 'Q' for quite: ")

	for {
		fmt.Print("> ")
		fmt.Scan(&v)

		if v == "Q" {
			return []int{}
		}

		if v != "X" {
			if n, e := strconv.Atoi(v); e != nil {
				continue
			} else {
				s = append(s, n)
			}
		} else {
			return s
		}
	}
}

func sortSlice(s []int, c chan []int, wg *sync.WaitGroup) {
	sort.Ints(s)
	c <- s
	wg.Done()
}

func main() {
	s := readData()
	l := len(s)

	if l > 0 {
		n := l / m
		c := make(chan []int)
		wg := sync.WaitGroup{}

		wg.Add(4)

		for i := 0; i < m; {
			if i == m-1 {
				fmt.Printf("Slice to sort by goroutine #%d: %+v \n", i+1, s[(i*n):])
				go sortSlice(s[i*n:], c, &wg)
			} else {
				fmt.Printf("Slice to sort by goroutine #%d: %+v \n", i+1, s[(i*n):((i+1)*n)])
				go sortSlice(s[i*n:(i+1)*n], c, &wg)
			}
			i++
		}

		r := []int{}
		for i := 0; i < m; i++ {
			t := <-c
			r = append(r, t...)
		}

		sort.Ints(r)

		fmt.Printf("Final sorted slice: %+v \n", r)
	}
}
