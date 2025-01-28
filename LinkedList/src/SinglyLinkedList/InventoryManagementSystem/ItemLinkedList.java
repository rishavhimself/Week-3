package SinglyLinkedList.InventoryManagementSystem;

public class ItemLinkedList {

    private Item head;
    // Add
    public void addItemAtBeginning(String itemName, String itemID,int  quantity,double price){
        Item newItem  = new Item(itemName,itemID,quantity,price);
        newItem.next=head;
        head=newItem;
    }

    public  void addItemAtEnd(String itemName, String itemID,int  quantity,double price){
        Item newItem = new Item(itemName,itemID,quantity,price);
        if(head==null){
            head=newItem;
            return;
        }
        Item current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newItem;
    }

    public  void addAtPosition(int position,String itemName, String itemID,int  quantity,double price){
        if(position<=0){
            System.out.println("Invalid Position");
            return;
        }
        Item newItem = new Item(itemName,itemID,quantity,price);

        if(position==1){
            newItem.next=head;
            head=newItem;
            return;
        }
        Item current=head;
        for(int i=1;i<position-1&&current!=null;i++){
            current=current.next;
        }
        if(current==null){
            System.out.println("Position out of Range");
        }
        else{
            newItem.next=current.next;
            current.next=newItem;
        }

    }
    //Remove

    public  void removeItem(String itemId){

        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.itemID.equals(itemId)){
            head=head.next;
            System.out.println("Item with ItemID :"+itemId+" deleted.");
            return;
        }

        Item current = head;

        while(current.next!=null&&!current.next.itemID.equals(itemId)){
            current=current.next;
        }
        if(current.next==null){
            System.out.println("Item Not Found !");
            return;
        }
        current.next=current.next.next;
        System.out.println("Item with Item Id :"+itemId+" deleted.");

    }

    //Update
    public void updateItemQuantity(String itemId, int newQuantity){
        Item current = head;
        while(current.next!=null&&!current.next.itemID.equals(itemId)){
            current=current.next;
        }
        if (current.next==null){
            System.out.println("Item not found in the list");
            return;
        }
        current.quantity=newQuantity;
        System.out.println("Quantity of the Item with Item Id :"+ itemId+" is updated to "+newQuantity);
    }

    //Search
    public void searchItem(String itemName, String itemId){
        Item current = head;
        int index=1;
        while(current!=null){
            if(current.itemName.equals(itemName)&&current.itemID.equals(itemId)){
                System.out.println("Item Found at index number :"+index);
                return;
            }
            current=current.next;
            index++;
        }
        System.out.println(itemName+" with Item Id : "+itemId+" not Found");
    }

    //Display List
    public void displayList(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }

        Item current = head;
        while(current!=null){
            System.out.println("---------------------------------");
            System.out.println("Item Name : "+current.itemName);
            System.out.println("Item Id : "+current.itemID);
            System.out.println("Price : "+current.price);
            System.out.println("Quantity : "+current.quantity );
            System.out.println("Total : "+current.quantity*current.price);
            System.out.println("----------------------------------");
            current=current.next;
        }
    }

    //Display total
    public void displayTotalValue(){
        if(head==null){
            System.out.println("Empty list\nTotal Value : 0");
            return;
        }
        Item current = head;
        double totalValue=0;
        while(current!=null){
            totalValue+=current.price*current.quantity;
            current=current.next;
        }
        System.out.println("Total Value : "+totalValue);
    }
}
