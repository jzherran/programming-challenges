package solution

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

// RomanToInt ...
type RomanToInt struct{}

// Run ...
func (rti *RomanToInt) Run() error {
	reader := bufio.NewReader(os.Stdin)
	data, err := reader.ReadString('\n')

	if err != nil {
		return err
	}

	fmt.Println(romanToInt(strings.TrimRight(data, "\n")))
	return nil
}

func romanToInt(s string) int {
	romans := map[rune]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}

	d := []rune(s)
	r, l := 0, '\a'

	for i := len(d) - 1; i >= 0; i-- {
		if l == '\a' {
			r += romans[d[i]]
			l = d[i]
			continue
		}

		if romans[d[i]] >= romans[l] {
			r += romans[d[i]]
		} else {
			r -= romans[d[i]]
		}

		l = d[i]
	}

	return r
}
