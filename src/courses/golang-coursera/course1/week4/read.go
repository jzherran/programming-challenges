package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"
)

// Person struct to store data from file
type Person struct {
	fname string
	lname string
}

func main() {
	var pathFile string
	var padding = strings.Repeat(" ", 20)

	fmt.Print("Enter file name: ")
	_, e := fmt.Scanln(&pathFile)
	if e != nil {
		log.Fatal(e)
	}

	// Open and close file after end of this function
	file, e := os.Open(pathFile)
	if e != nil {
		log.Fatal(e)
	}
	defer file.Close()

	// Store data into the slice to process after for printing
	data := make([]Person, 0)
	scanner := bufio.NewScanner(file)
	for scanner.Scan() {
		p := strings.Split(scanner.Text(), " ")
		p[0] = (string([]rune(p[0] + padding)[:20]))
		p[1] = (string([]rune(p[1] + padding)[:20]))
		data = append(data, Person{fname: p[0], lname: p[1]})
	}

	// Print data
	for _, p := range data {
		fmt.Printf("fname: %s - lname: %s\n", p.fname, p.lname)
	}
}
