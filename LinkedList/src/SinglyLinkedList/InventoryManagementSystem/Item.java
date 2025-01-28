package SinglyLinkedList.InventoryManagementSystem;

public class Item {

    public String itemName, itemID;
    public  int quantity;
    public double price;
    public  Item next;

    public Item(String itemName, String itemID,int  quantity,double price){
        this.itemName=itemName;
        this.itemID=itemID;
        this.quantity=quantity;
        this.price=price;
        this.next=null;

    }
}
