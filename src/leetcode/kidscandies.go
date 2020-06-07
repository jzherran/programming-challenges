// 1431. Kids With the Greatest Number of Candies [https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/]
// Normal execises in the list of easy problems.
// Array manage to resolve this problem.
func kidsWithCandies(candies []int, extraCandies int) []bool {
  res := make([]bool, len(candies))
  
  maxCandies := func (a []int) int {
    maxVal := 0;
    for _, v := range a {
      if (v > maxVal) {
        maxVal = v;
      }
    }
    return maxVal;
  }(candies);
  
  for i, c := range candies {
    res[i] = (c + extraCandies) >= maxCandies
  }
  
  return res;
}