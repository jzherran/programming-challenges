package main

import (
	"bufio"
	json "encoding/json"
	"fmt"
	"os"
	"strings"
)

const askData = "Ingress your %s: "
const cName = "name"
const cAddress = "address"

func main1() {
	userMap := make(map[string]string)
	reader := bufio.NewReader(os.Stdin)

	fmt.Printf(askData, cName)
	name, e := reader.ReadString('\n')

	if e != nil {
		fmt.Println(e)
		os.Exit(0)
	}

	fmt.Printf(askData, cAddress)
	address, e := reader.ReadString('\n')

	if e != nil {
		fmt.Println(e)
		os.Exit(0)
	}

	userMap[cName] = strings.TrimRight(name, "\r\n")
	userMap[cAddress] = strings.TrimRight(address, "\r\n")

	if data, e := json.Marshal(userMap); e != nil {
		fmt.Println("Information nor valid!")
	} else {
		fmt.Println(string(data))
	}
}
