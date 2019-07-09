import AnimalShelter.AnimalQueue;
import AnimalShelter.Cat;
import AnimalShelter.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalShelterTest {

    private AnimalQueue animalQueue;
    private Cat oldest;

    @BeforeEach
    void setUp() {
        animalQueue = new AnimalQueue();
        oldest = new Cat("cat1");
        animalQueue.enqueue(oldest);
        animalQueue.enqueue(new Dog("dog1"));
        animalQueue.enqueue(new Dog("dog2"));
        animalQueue.enqueue(new Cat("cat2"));
        animalQueue.enqueue(new Dog("dog3"));
        animalQueue.enqueue(new Cat("cat3"));
    }

    @Test
    void shouldReturnOldestAnimalForAdoption() {
        assertEquals(oldest, animalQueue.dequeueAny());
    }


}