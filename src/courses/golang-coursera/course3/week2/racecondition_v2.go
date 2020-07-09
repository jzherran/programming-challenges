package main

// one goroutine is the main
// goroutine that comes by default
import (
	"fmt"
	"runtime"
	"sync"
)

var wgIns sync.WaitGroup

func main2() {

	// shared variable
	counter := 0

	// the other 10 goroutines are
	// supposed to come from here
	wgIns.Add(10)
	for i := 0; i < 10; i++ {

		// goroutines are made
		go func() {
			for j := 0; j < 10; j++ {

				// shared variable execution
				counter++
				// 100 should be the counter value but
				// it may be equal to 100 or lesser
				// due to race condition
			}
			wgIns.Done()
		}()
	}

	// this value should actually be 11
	fmt.Println("The number of goroutines before wait = ", runtime.NumGoroutine())

	wgIns.Wait()

	// value should be 100
	fmt.Println("Counter value = ", counter)

	fmt.Println("The number of goroutines after wait = ", runtime.NumGoroutine())

	// this value is supposed to be 1
	// but lets see if these values
	// stay consistently same every
	// time we run the code
}
