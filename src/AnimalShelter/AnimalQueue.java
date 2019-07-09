package AnimalShelter;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class AnimalQueue {

    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal){
        animal.setOrder(LocalDateTime.now());

        if(animal instanceof Dog){
            dogs.addLast((Dog) animal);
        } else {
            cats.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny(){
        if(dogs.size() == 0){
            return dequeueCats();
        } else if (cats.size() == 0){
            return dequeueDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if(dog.isOlderThan(cat)){
            return dequeueDogs();
        } else {
            return dequeueCats();
        }
    }

    public Dog dequeueDogs(){
        return dogs.poll();
    }

    public Cat dequeueCats(){
        return cats.poll();
    }

}
