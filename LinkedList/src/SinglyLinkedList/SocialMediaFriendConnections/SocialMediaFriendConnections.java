package SinglyLinkedList.SocialMediaFriendConnections;

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        // Adding users
        socialMedia.addUser(1, "Alice", 25);
        socialMedia.addUser(2, "Bob", 30);
        socialMedia.addUser(3, "Charlie", 35);

        // Adding friend connections
        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(1, 3);

        // Display friends of a user
        socialMedia.displayFriends(1);

        // Find mutual friends
        socialMedia.findMutualFriends(2, 3);

        // Search for a user
        socialMedia.searchUser("Alice");

        // Count friends for each user
        socialMedia.countFriends();

        // Remove a friend connection
        socialMedia.removeFriend(1, 2);

        // Display friends after removal
        socialMedia.displayFriends(1);
    }
}
