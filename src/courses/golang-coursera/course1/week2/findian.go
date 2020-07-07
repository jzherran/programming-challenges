package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	scan := bufio.NewScanner(os.Stdin)

	fmt.Printf("Writte your string: \n")

	if scan.Scan() {
		s := strings.ToLower(scan.Text())

		if strings.HasPrefix(s, "i") && strings.HasSuffix(s, "n") && strings.ContainsRune(s, 'a') {
			fmt.Println("Found!")
		} else {
			fmt.Println("Not Found!")
		}
	}
}
