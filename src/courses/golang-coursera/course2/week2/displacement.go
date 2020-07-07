package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

// GenDisplaceFn return a function to use in the calculation of the distance in
// t time passed by parameter
func GenDisplaceFn(a, v0, s0 float64) func(t float64) float64 {
	return func(t float64) float64 {
		return (float64(0.5) * a * math.Pow(t, 2)) + (v0 * t) + s0
	}
}

// ReadData for acceleration and initial distance and velocity
func ReadData() (float64, float64, float64) {
	var a, v0, s0 float64

	fmt.Print("Enter Acceleration : ")
	fmt.Scan(&a)

	fmt.Print("Enter Initial Velocity : ")
	fmt.Scan(&v0)

	fmt.Print("Enter Initial Displacement : ")
	fmt.Scan(&s0)

	return a, v0, s0
}

func timeEval(fn func(t float64) float64) {
	for {
		fmt.Print("Enter Time (Type 'Q' to exit ): ")
		scanner := bufio.NewScanner(os.Stdin)
		scanner.Scan()
		t, err := strconv.ParseFloat(scanner.Text(), 64)
		if err != nil {
			break
		}
		fmt.Println("Displacement after time ", t, " is ", fn(t))
	}
}

func main() {
	a, v0, s0 := ReadData()
	fn := GenDisplaceFn(a, v0, s0)
	timeEval(fn)
}
