package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is full");
            return;
        }

        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;

        System.out.println("The disc has been added");

        if (qtyOrdered == MAX_NUMBER_ORDERED - 1) {
            System.out.println("The cart is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = -1;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The disc was not found in the cart");
            return;
        }

        for (int i = index; i < qtyOrdered - 1; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }

        itemsOrdered[qtyOrdered - 1] = null;
        qtyOrdered--;

        System.out.println("The disc has been removed");
    }

    public float totalCost() {
        float total = 0.0f;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }

        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found: " + itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No DVD with id " + id + " found.");
    }

    public void searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found: " + itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No DVD with title \"" + title + "\" found.");
    }
}