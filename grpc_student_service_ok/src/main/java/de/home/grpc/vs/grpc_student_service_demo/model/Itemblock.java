package de.home.grpc.vs.grpc_student_service_demo.model;

public class Itemblock {
    public Item item;
    public int amount;
    
    public Itemblock(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    // Getter und Setter

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
