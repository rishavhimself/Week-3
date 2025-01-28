package SinglyLinkedList.InventoryManagementSystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {

        ItemLinkedList itemLinkedList = new ItemLinkedList();

        //Add
        itemLinkedList.addItemAtBeginning("Bat","BA12",2,15);
        itemLinkedList.addItemAtEnd("Ball","BA34",2,500);
        itemLinkedList.addAtPosition(3,"Wicket","WI101",6,100);
        itemLinkedList.displayList();
        itemLinkedList.searchItem("Wicket","WI101");
        itemLinkedList.removeItem("WI101");
        itemLinkedList.displayTotalValue();
    }
}
