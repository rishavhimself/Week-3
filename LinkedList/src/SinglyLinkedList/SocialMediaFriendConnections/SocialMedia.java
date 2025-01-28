package SinglyLinkedList.SocialMediaFriendConnections;

import java.util.ArrayList;
class SocialMedia {
    private User head;

    // Method to add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    // Method to add a friend connection between two users
    public void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }
        System.out.println("Friend connection added between User " + userId1 + " and User " + userId2);
    }

    // Method to remove a friend connection
    public void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));
        System.out.println("Friend connection removed between User " + userId1 + " and User " + userId2);
    }

    // Method to find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        ArrayList<Integer> mutualFriends = new ArrayList<>();
        for (int friendId : user1.friendIds) {
            if (user2.friendIds.contains(friendId)) {
                mutualFriends.add(friendId);
            }
        }

        System.out.println("Mutual friends between User " + userId1 + " and User " + userId2 + ": " + mutualFriends);
    }

    // Method to display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of User " + userId + ": " + user.friendIds);
    }

    // Method to search for a user by Name or User ID
    public void searchUser(String keyword) {
        User current = head;
        boolean found = false;

        while (current != null) {
            if (current.name.equalsIgnoreCase(keyword) || String.valueOf(current.userId).equals(keyword)) {
                System.out.println("User Found: ID: " + current.userId + ", Name: " + current.name + ", Age: " + current.age);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No user found with keyword: " + keyword);
        }
    }

    // Method to count the number of friends for each user
    public void countFriends() {
        User current = head;

        while (current != null) {
            System.out.println("User ID: " + current.userId + " has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }

    // Helper method to find a user by User ID
    private User findUserById(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
