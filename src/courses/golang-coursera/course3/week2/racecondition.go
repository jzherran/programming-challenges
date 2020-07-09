package main

import (
	"fmt"
)

// Explanation about the race condition in this program
// In this simple program we have 2 gorutines both receive a pointer value and also a time for sleeping the process
// we have a race condition in this program at the moment when we have the same value updated for 2 different threads
// and that launch a problem because is possible the have that update in the same time.

// The basic flow we expected in this program is the execution of 2 threads using the same variable
//
// Step | Thread 1   | Thread 2
// 1    | read x     | -
// 2    | increase x | -
// 3    | write x    | -
// 4    | -          | read x
// 5    | -          | increase x
// 6    | -          | write x
// -----------------------------------
// Alternative execution and race condition possibility
// Step | Thread 1   | Thread 2
// 1    | read x     | -
// 2    | -          | read x
// 3    | increase x | -
// 4    | -          | increase x
// 5    | write x    | -
// 6    | -          | write x
//
// So in this scenario the final value in x is 1 but the expected result should be 2 because we have 2 thread increasing in 1
// the value in x.
func main() {
	x := 0

	// Start gorutine 1

	fmt.Printf("Start 1 execute thread [x : %d]\n", x)

	// Increase x from 0 to 1
	go execute(&x)

	// Expected result x = 1
	fmt.Printf("End 1 execute thread [x : %d]\n", x)

	// ------------------------------------------------------------

	// Start gorutine 2

	fmt.Printf("Start 2 execute thread [x : %d]\n", x)

	// Increase x from 1 to 2
	go execute(&x)

	// Expected result x = 2
	fmt.Printf("End 2 execute thread [x : %d]\n", x)
}

func execute(v *int) {
	(*v)++
}
