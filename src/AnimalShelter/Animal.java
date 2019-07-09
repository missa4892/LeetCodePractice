package AnimalShelter;

import java.time.LocalDateTime;

public abstract class Animal {
    private String name;
    private LocalDateTime order;

    public Animal(String name){
        this.name = name;
    }

    private LocalDateTime getOrder(){
        return this.order;
    }


    protected void setOrder(LocalDateTime order){
        this.order = order;
    }

    protected boolean isOlderThan(Animal animal){
        return this.order.isBefore(animal.getOrder());
    }
}
