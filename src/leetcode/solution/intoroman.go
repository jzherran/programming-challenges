package solution

import "strings"

// IntToRoman struct
type IntToRoman struct{}

func intToRoman(num int) string {
	sb := strings.Builder{}

	values := []int{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}
	romans := []string{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}

	for i := 0; i < len(values); i++ {
		for num > values[i] {
			num -= values[i]
			sb.WriteString(romans[i])
		}
	}

	return sb.String()
}
