package main

import "fmt"

func main() {
	var fNum float64

	fmt.Printf("Writte a floating point number:\t")
	if _, err := fmt.Scan(&fNum); err != nil {
		panic(err)
	}

	trunc := int(fNum)

	// print integer part
	fmt.Printf("The integer part of the number: %d\n", trunc)
}
