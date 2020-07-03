package domain

// Runner interface to execute the logic to resolve a problem in leetcode package
type Runner interface {
	Run() error
}

// Input is an element used like a wrapper to pass information about the problem to process
type Input struct {
	QuantityValue int
	StringValue   string
}
