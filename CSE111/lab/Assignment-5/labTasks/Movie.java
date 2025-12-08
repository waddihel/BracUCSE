public class Movie {
  public String name;
  public String genre;
  public String dur;
  Movie(String n, String g, String d) {
    name = n;
    genre = g;
    dur = d;
  }
  Movie(String n, String g) { this(n, g, "Unknown"); }
}
class NetflixUser {
  public String name;
  public String plan;
  public String favMovies = "";
  public int count;
  NetflixUser(String n, String p) {
    name = n;
    plan = p;
    System.out.println("New user account created!");
  }
  NetflixUser(String n) { this(n, "Free"); }
  public void addToFavourites(Movie m) {
    if (plan.equals("Free")) {
      System.out.println("Cannot add movies to favourites. Please upgrade to "
                         + "Netflix Premium.");
    } else if (count == 3) {
      System.out.println("Cannot add new movies. Favourites list is full.");
    } else {
      favMovies += m.name + ", " + m.genre + ", Duration: " + m.dur + "\n";
      count++;
      System.out.println("Movie added to favourites.");
    }
  }
  public void showFavourites() {
    if (plan.equals("Free")) {
      System.out.println(
          "No available favourites. Please upgrade to Neflix Premium.");
    } else {
      System.out.println("Showing " + name + "'s favourites");
      System.out.print(favMovies);
    }
  }
  public void upgradePlan() {
    if (plan.equals("Premium")) {
      System.out.println("You already have Netflix Premium!");
    } else {
      plan = "Premium";
      System.out.println("Welcome to Netflix Premium!");
    }
  }
}
