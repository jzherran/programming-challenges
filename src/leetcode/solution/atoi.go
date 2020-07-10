package solution

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strings"
	"unicode"
)

// Atoi struct
type Atoi struct{}

// Run execute solution
func (a *Atoi) Run() error {
	reader := bufio.NewReader(os.Stdin)
	data, err := reader.ReadString('\n')

	if err != nil {
		return err
	}

	fmt.Println(myAtoi(strings.TrimRight(data, "\n")))
	return nil
}

func myAtoi(str string) int {
	v, s := 0, 1

	str = strings.Trim(str, " ")

	for i, r := range str {
		if i == 0 && IsSign(r) {
			if r == '-' {
				s = -1
			}
			continue
		}

		if !unicode.IsNumber(r) {
			v, _ := checkLimitInt32(v)
			return v
		}

		if _, b := checkLimitInt32(v); !b {
			if v >= 0 {
				v = (10 * v) + int(r-'0')
			} else {
				v = (10 * v) - int(r-'0')
			}
		}

		if s != 0 && v > 0 {
			v *= s
			s = 0
		}
	}

	r, _ := checkLimitInt32(v)
	return r
}

func checkLimitInt32(v int) (int, bool) {
	if v > math.MaxInt32 {
		return math.MaxInt32, true
	} else if v < math.MinInt32 {
		return math.MinInt32, true
	} else {
		return v, false
	}
}

// IsSign check if the rune is '+' or '-'
func IsSign(r rune) bool {
	if r == '-' || r == '+' {
		return true
	}
	return false
}
