package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"
)

// Animal struct to manage the data about an animal
type Animal interface {
	Eat()
	Move()
	Speak()
}

// Cow animal struct used to manage cows
type Cow struct {
	name string
}

// Bird animal struct used to manage birds
type Bird struct {
	name string
}

// Snake animal struct used to manage snakes
type Snake struct {
	name string
}

// Eat get the type of the food that the cow eat
func (c Cow) Eat() {
	fmt.Println("grass")
}

// Move get the type of the locomotion that the cow has
func (c Cow) Move() {
	fmt.Println("walk")
}

// Speak get the type of the sound do when a cow speak
func (c Cow) Speak() {
	fmt.Println("moo")
}

// Eat get the type of the food that the bird eat
func (b Bird) Eat() {
	fmt.Println("worms")
}

// Move get the type of the locomotion that the bird has
func (b Bird) Move() {
	fmt.Println("fly")
}

// Speak get the type of the sound do when a bird speak
func (b Bird) Speak() {
	fmt.Println("peep")
}

// Eat get the type of the food that the snake eat
func (s Snake) Eat() {
	fmt.Println("mice")
}

// Move get the type of the locomotion that the snake has
func (s Snake) Move() {
	fmt.Println("slither")
}

// Speak get the type of the sound do when a snake speak
func (s Snake) Speak() {
	fmt.Println("hsss")
}

func newAnimal(animals *map[string]Animal, data []string) {
	animalName := data[0]
	animalType := data[1]
	switch animalType {
	case "cow":
		(*animals)[animalName] = Cow{animalName}
	case "bird":
		(*animals)[animalName] = Bird{animalName}
	case "snake":
		(*animals)[animalName] = Snake{animalName}
	default:
		fmt.Println("Animal not supported!")
		return
	}

	fmt.Printf("%s named '%s' created!\n", strings.Title(animalType), animalName)
}

func queryAnimal(animals *map[string]Animal, data []string) {
	animalName := data[0]
	animalInfo := data[1]

	if animal := (*animals)[animalName]; animal != nil {
		printAnimalInfo(animal, animalInfo)
	} else {
		fmt.Printf("Animal named '%s', not found!\n", animalName)
	}
}

func printAnimalInfo(animal Animal, action string) {
	switch action {
	case "eat":
		animal.Eat()
	case "move":
		animal.Move()
	case "speak":
		animal.Speak()
	default:
		fmt.Println("Action not supported!")
	}
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	animalsMap := make(map[string]Animal, 0)

	for {
		fmt.Print("> ")

		query, e := reader.ReadString('\n')
		if e != nil {
			log.Fatal("Invalid format of the query!")
		}

		qParts := strings.Split(strings.TrimRight(query, "\n\r"), " ")

		if len(qParts) < 3 {
			fmt.Printf("Invalid query or newanimal!\n\n")
			continue
		}

		command := qParts[0]

		if command == "newanimal" {
			newAnimal(&animalsMap, qParts[1:])
		} else if command == "query" {
			queryAnimal(&animalsMap, qParts[1:])
		} else {
			println("Invalid command!")
		}

		fmt.Println("")
	}
}
