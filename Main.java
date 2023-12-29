import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CinemaSystem system = new CinemaSystem();
        int option = 0;
        while(option != 6){
            CinemaSystem.printMenu(CinemaSystem.Options);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    Scanner movie_scanner = new Scanner(System.in);

                    String movieName;
                    System.out.println("Name of the movie");
                    movieName = movie_scanner.nextLine();

                    String movieGenre;
                    System.out.println("Genre of the movie");
                    movieGenre = movie_scanner.nextLine();

                    int movieAgeRestriction;
                    System.out.println("Age restriction:");
                    movieAgeRestriction = movie_scanner.nextInt();
                    Movie movie = new Movie(movieName,movieGenre,movieAgeRestriction);
                    system.addMovie(movie); break;
                //case 2: system.showAllMovies(); break;
                case 2:
                    Scanner newUserScanner = new Scanner(System.in);

                    String newUserName;
                    System.out.println("Name of user:");
                    newUserName = newUserScanner.nextLine();

                    int newUserAge;
                    System.out.println("Age of user:");
                    newUserAge = newUserScanner.nextInt();

                    int newUserBalance;
                    System.out.println("Balance of user:");
                    newUserBalance = newUserScanner.nextInt();
                    User newUser = new User(newUserName,newUserAge,newUserBalance);

                    system.addUser(newUser);
                    break;
                case 3: Scanner userScanner = new Scanner(System.in);
                        int userId;
                        System.out.println("User id:");
                        userId = userScanner.nextInt();
                        int userOption = 0;
                        while(userOption != 7){
                            System.out.println("User menu");// здесь должен быть вывод нормального меню пользователя
                            userOption = userScanner.nextInt();
                            switch (userOption){
                                //show all movies
                                case 1: System.out.println("1");
                                    for(Movie availableMovie: system.Movies){
                                        System.out.println(availableMovie.getMovieName()
                                                + " " + availableMovie.getGenre()
                                                + " " + availableMovie.getAgeRestriction());
                                    }
                                    break;
                                // buy a ticket
                                case 2: System.out.println("2");break;
                                //check balance
                                case 3: System.out.println("3");
                                    System.out.println("Current balance: " + system.Users.get(userId-1).getBalance());
                                    break;
                                //change balance
                                case 4: System.out.println("4");
                                    Scanner addBalance = new Scanner(System.in);

                                    System.out.println("Enter sum:");
                                    int plusBalance = addBalance.nextInt();
                                    system.Users.get(userId-1).changeBalance(plusBalance);

                                    break;
                                // print order history
                                case 5: System.out.println("5");
                                    for(Ticket userTicket:system.Users.get(userId).orderHistory){
                                            System.out.println(userTicket);
                                    }
                                    break;
                                // cancel ticket
                                case 6: System.out.println("6");break;
                                case 7: System.out.println();
                            }
                        }
                case 4: System.out.println("Exit");
            }
        }
    }
}