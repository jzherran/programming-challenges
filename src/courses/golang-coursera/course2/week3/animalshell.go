package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"
)

// Enum for animals supported
const (
	Cow int = iota
	Bird
	Snake
)

// Animal struct to manage the data about an animal
type Animal struct {
	food       string
	locomotion string
	sound      string
}

// Eat get the type of the food that the animal eat
func (a Animal) Eat() string {
	return a.food
}

// Move get the type of the locomotion that the animal has
func (a Animal) Move() string {
	return a.locomotion
}

// Speak get the type of the sound do when speak
func (a Animal) Speak() string {
	return a.sound
}

func initAnimals(animals *map[int]Animal) {
	(*animals)[Cow] = Animal{"grass", "walk", "moo"}
	(*animals)[Bird] = Animal{"worms", "fly", "peep"}
	(*animals)[Snake] = Animal{"mice", "slither", "hsss"}
}

func getAnimal(animals *map[int]Animal, name string) Animal {
	var r int
	switch name {
	case "cow":
		r = Cow
	case "bird":
		r = Bird
	case "snake":
		r = Snake
	default:
		fmt.Println("Animal not supported!")
	}

	return (*animals)[r]
}

func getAnimalInfo(animal Animal, action string) {
	var v string
	switch action {
	case "eat":
		v = animal.Eat()
	case "move":
		v = animal.Move()
	case "speak":
		v = animal.Speak()
	default:
		fmt.Println("Action not supported!")
	}

	fmt.Println(v)
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	animalsMap := make(map[int]Animal, 3)

	initAnimals(&animalsMap)

	for {
		fmt.Print("> ")

		query, e := reader.ReadString('\n')
		if e != nil {
			log.Fatal("Invalid format of the query!")
		}

		qParts := strings.Split(strings.TrimRight(query, "\n\r"), " ")
		animal := getAnimal(&animalsMap, qParts[0])
		action := qParts[1]

		getAnimalInfo(animal, action)
	}
}
