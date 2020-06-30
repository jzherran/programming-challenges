package leetcode

/*
func main() {

	reader := bufio.NewReader(os.Stdin)
	s, _ := reader.ReadString('\n')

	fmt.Println(longestPalindrome(strings.ReplaceAll(s, "\n", "")))
}
*/

func print2DSlice(matrix [][]int) {
	n := len(matrix)
	m := len(matrix[0])
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			print(matrix[i][j], " ")
		}
		println()
	}
}

/*

First approach with brute force approximation.

Time complex O(n^3)
Space complex O(1)

func longestPalindrome(s string) string {

	str := strings.Split(strings.ReplaceAll(s, "\n", ""), "")
	n := len(str)
	maxLength, start := 1, 0

	if n == 0 {
		return ""
	} else if n == 1 {
		return s
	} else {
		for i := 0; i < n; i++ {
			for j := i; j < n; j++ {

				isPalindrome := true

				for k := 0; k < (j-i+1)/2; k++ {
					if str[i+k] != str[j-k] {
						isPalindrome = false
					}
				}

				if isPalindrome && (j-i+1) > maxLength {
					start = i
					maxLength = j - i + 1
				}
			}
		}

		var r strings.Builder

		for i := start; i <= start+maxLength-1; i++ {
			r.WriteString(str[i])
		}

		return r.String()
  }
}
*/

// 5. Jump Game [https://leetcode.com/problems/longest-palindromic-substring/]
// Dynamic algorithm to calculate the longest palindrome substring
func longestPalindrome(s string) string {

	n := len(s)

	if n == 0 {
		return ""
	} else if n == 1 {
		return s
	} else {
		t := make([][]int, n)
		maxLength := 1

		for i := 0; i < n; i++ {
			t[i] = make([]int, n)
			t[i][i] = 1
		}

		start := 0
		for i := 0; i < n-1; i++ {
			if s[i] == s[i+1] {
				t[i][i+1] = 1
				start = i
				maxLength = 2
			}
		}

		for k := 3; k <= n; k++ {
			for i := 0; i < n-k+1; i++ {
				j := i + k - 1
				if t[i+1][j-1] == 1 && s[i] == s[j] {
					t[i][j] = 1

					if k > maxLength {
						start = i
						maxLength = k
					}
				}
			}
		}

		//print2DSlice(t)

		end := start + maxLength - 1

		return s[start : end+1]
	}
}
