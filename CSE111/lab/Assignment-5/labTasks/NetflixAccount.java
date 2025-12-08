public class NetflixAccount {
  public static void main(String[] args) {
    Movie m1 = new Movie("Avengers", "Sci-fi", "1:59:08");
    Movie m2 = new Movie("Lord of the Rings", "Fantasy", "2:58:05");
    Movie m3 = new Movie("Final Destination", "Horror");
    Movie m4 = new Movie("Fast and Furious", "Action", "2:05:04");
    System.out.println("===========================");
    NetflixUser user1 = new NetflixUser("Martin Freeman", "Free");
    user1.addToFavourites(m1);
    user1.showFavourites();
    user1.upgradePlan();
    user1.addToFavourites(m1);
    user1.showFavourites();
    System.out.println("===========================");
    NetflixUser user2 = new NetflixUser("Vin Diesel", "Premium");
    user2.addToFavourites(m1);
    user2.addToFavourites(m2);
    user2.addToFavourites(m3);
    user2.addToFavourites(m4);
    user2.showFavourites();
    System.out.println("===========================");
    NetflixUser user3 = new NetflixUser("Chris Evans");
    user3.addToFavourites(m1);
    user3.upgradePlan();
    user3.addToFavourites(m2);
    user3.addToFavourites(m3);
    user1.upgradePlan();
  }
}
