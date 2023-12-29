import java.util.ArrayList;

public class CinemaSystem {
    ArrayList<User> Users;
    ArrayList<Movie> Movies;
    ArrayList<Ticket> Tickets;
    public CinemaSystem() {
        this.Users = new ArrayList<>();
        this.Movies = new ArrayList<>();
        this.Tickets = new ArrayList<>();
    }
    final static String[] Options = {
            "1.Add a new movie.",
            //"2.Show all available movies.",
            "2.Add a new user.",
            "3.Chose user",
            //"5.Cancel a purchase of the ticket.",
            "4.Exit."
    };
    public static void printMenu(String[] options){
        for(String option : options){
            System.out.println(option);
        }
        System.out.println("Choose your option:");
    }
    public void addMovie(Movie movie){
        Movies.add(movie);
    }
    public void showAllMovies() {
        System.out.println("Current list of available movies:" + '\n');
        for(Movie movie : this.Movies) {
            System.out.println(movie.getMovieName() + "\n");
        }
    }
    public void addUser(User user){
        Users.add(user);
    }
    public void addTicket(Ticket ticket){
        Tickets.add(ticket);
    }
}
//test