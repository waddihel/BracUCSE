public class ConnectFriends {
  public String name;
  public int fCount;
  public ConnectFriends[] friends;

  ConnectFriends(String n, int c) {
    name = n;
    friends = new ConnectFriends[c];
    System.out.println("Welcome to ConnectFriends, " + n);
  }
  ConnectFriends(String n) { this(n, 2); }

  public void sendFriendRequest(ConnectFriends f) {
    if (fCount == friends.length)
      System.out.println(name + " has reached the friend request limit!");
    else {
      System.out.println(name + " sent a friend request to " + f.name);
      friends[fCount++] = f;
    }
  }
  public void sendFriendRequest(ConnectFriends f1, ConnectFriends f2) {
    sendFriendRequest(f1);
    sendFriendRequest(f2);
  }
  public void showDetails() {
    System.out.println("User Name: " + name);
    System.out.println("Maximum number of Sent Friend Requests: " +
                       friends.length);
    System.out.println("Total friend requests: " + fCount);
    System.out.print("Sent friend requests: ");
    for (int i = 0; i < friends.length; i++) {
      if (friends[i] == null)
        continue;
      else
        System.out.print(friends[i].name + " ");
    }
    System.out.println();
  }
  public void removeRequest(String n) {
    for (int i = 0; i < friends.length; i++) {
      if (friends[i] == null)
        continue;
      else {
        System.out.println("Request to add " + n + " is removed for " + name);
        friends[i] = null;
        fCount--;
        return;
      }
    }
    System.out.println(n + " is not in " + name + "'s sent request list.");
  }
}
