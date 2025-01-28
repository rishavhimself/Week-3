package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.ArrayList;
class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    User next;

    // Constructor to initialize a user node
    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}