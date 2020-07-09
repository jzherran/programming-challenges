package main

import (
	"fmt"
	"sync"
)

// ChopS chopstick structure
type ChopS struct{ sync.Mutex }

// Philo philosopher structure
type Philo struct {
	id              int
	leftCS, rightCS *ChopS
}

func (p *Philo) dine(announce chan *Philo) {
	p.eat()
	announce <- p
}

func (p Philo) eat() {
	for i := 0; i < 3; i++ {
		p.leftCS.Lock()
		p.rightCS.Lock()
		fmt.Printf("starting to eat %d\n", p.id+1)
		fmt.Printf("finishing eating %d\n", p.id+1)
		p.leftCS.Unlock()
		p.rightCS.Unlock()
	}
}

func main() {
	announce := make(chan *Philo, 2)

	CSticks := make([]*ChopS, 5)
	for i := 0; i < 5; i++ {
		CSticks[i] = new(ChopS)
	}

	philos := make([]*Philo, 5)

	for i := 0; i < 5; i++ {
		philos[i] = &Philo{i, CSticks[i], CSticks[(i+1)%5]}
	}

	for _, philo := range philos {
		go philo.dine(announce)
	}

	for i := 0; i < 5; i++ {
		<-announce
	}
}
