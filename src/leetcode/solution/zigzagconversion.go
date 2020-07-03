package solution

import (
	"bytes"
	"fmt"
	"strings"
)

/*
func main() {
	reader := bufio.NewReader(os.Stdin)

	s, _ := reader.ReadString('\n')
	n, _ := reader.ReadString('\n')

	nRows, _ := strconv.Atoi(strings.ReplaceAll(n, "\n", ""))

	fmt.Println(convertV2(s, nRows))
}
*/

// 6. ZigZag Conversion - https://leetcode.com/problems/zigzag-conversion/
// String manipulaiton to get the zigzag output string
func convert(s string, numRows int) string {

	size := len(s)
	buffers := make([]bytes.Buffer, size)

	for i := 0; i < len(buffers); i++ {
		buffers[i] = bytes.Buffer{}
	}

	for i := 0; i < size; {
		for idx := 0; idx < numRows && i < size; idx++ {
			buffers[idx].WriteString(string(s[i]))
			i++
		}
		for idx := numRows - 2; idx >= 1 && i < size; idx-- {
			buffers[idx].WriteString(string(s[i]))
			i++
		}
	}

	for idx := 1; idx < len(buffers); idx++ {
		buffers[0].WriteString(buffers[idx].String())
	}
	return buffers[0].String()
}

func convertV2(s string, numRows int) string {
	if numRows == 1 {
		return s
	}

	n := len(s)
	cycle := 2*numRows - 2
	var builder strings.Builder

	builder.Grow(n)

	for i := 0; i < numRows; i++ {
		for j := 0; i+j < n; j += cycle {
			fmt.Println(i, j, builder.String())
			builder.WriteRune(rune(s[i+j]))
			if i != 0 && i != numRows-1 && j+cycle-i < n {
				builder.WriteRune(rune(s[j+cycle-i]))
			}
		}
	}

	return builder.String()
}
