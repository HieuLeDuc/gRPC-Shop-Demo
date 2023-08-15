package de.home.grpc.vs.grpc_student_client.model;

import java.util.List;

public class Order {
    public int id;
    private int customerid;
    private float total;
    private List<Itemblock> itemblocks;

    public Order(int id, int customerid, float total, List<Itemblock> itemblocks) {
        this.id = id;
        this.customerid = customerid;
        this.total = total;
        this.itemblocks = itemblocks;
    }

    public int getId() {
        return id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public float getTotal() {
        newTotal();
        return total;
    }

    public void newTotal() {
        // resetting total
        float temp = 0;
        for (Itemblock itemblock : itemblocks) {
            temp += itemblock.getItem().getPrice() * itemblock.getAmount();
        }
        this.total = temp;
    }

    // add itemblock
    public void addItemblock(Itemblock itemblock) {
        itemblocks.add(itemblock);
        newTotal();
    }

    // remove itemblock
    public void removeItemblock(Itemblock itemblock) {
        itemblocks.remove(itemblock);
        newTotal();
    }

    // edit itemblock
    public void editItemblock(Itemblock itemblock, int amount) {
        for (Itemblock itemblock2 : itemblocks) {
            if (itemblock2.getItem().getId() == itemblock.getItem().getId()) {
                itemblock2.setAmount(amount);
            }
        }
        newTotal();
    }

    public Itemblock getItemblockByItem(Item item) {
        for (Itemblock ib : this.itemblocks) {
            if (ib.getItem().equals(item))
                return ib;
        }
        return null;
    }

    public List<Itemblock> getItemblocks() {
        return itemblocks;
    }

    public void setItemblocks(List<Itemblock> itemblocks) {
        this.itemblocks = itemblocks;
        newTotal();
    }

}
