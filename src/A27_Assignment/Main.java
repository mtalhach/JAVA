package A27_Assignment;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int ch;
        try(MovieRentalStore store = new MovieRentalStore();
            Scanner sc = new Scanner(System.in)){
            do {
                System.out.println("""
                                            
                        1. Add movie
                        2. Search movie
                        3. Exit""");
                System.out.print("Enter choice: ");
                ch = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (ch) {
                    case 1 -> {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter actors (comma-separated): ");
                        String[] actors = Arrays.stream(sc.nextLine().split(",")).map(String::trim).toArray(String[]::new);
                        System.out.print("Enter category: ");
                        String category = sc.nextLine();
                        System.out.print("Enter year: ");
                        int year = sc.nextInt();
                        System.out.print("Enter length in minutes: ");
                        int length = sc.nextInt();
                        store.addMovie(new Movie1(id, title, actors, category, year, length));
                        System.out.println("\nMovie added successfully");
                    }

                    case 2 -> {
                        System.out.println("""
                                Search by:-
                                1. Title
                                2. Actor
                                3. Category
                                4. Year""");
                        System.out.print("Enter choice: ");
                        int key = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        List<Movie1> movies = switch (key) {
                            case 1 -> {
                                System.out.print("Enter title to search by: ");
                                String title = sc.nextLine();
                                yield store.searchMovie((m) -> m.getTitle().equals(title));
                            }
                            case 2 -> {
                                System.out.print("Enter actor to search by: ");
                                String actor = sc.nextLine();
                                yield store.searchMovie((m) -> {
                                    for (String a : m.getActor()) {
                                        if (a.equals(actor)) return true;
                                    }
                                    return false;
                                });
                            }
                            case 3 -> {
                                System.out.print("Enter category to search by: ");
                                String category = sc.nextLine();
                                yield store.searchMovie((m) -> m.getCategory().equals(category));
                            }
                            case 4 -> {
                                System.out.print("Enter year to search by: ");
                                int year = sc.nextInt();
                                yield store.searchMovie((m) -> m.getYear() == year);
                            }
                            default -> {
                                System.out.println("Invalid Choice");
                                yield null;
                            }
                        };
                        if (movies != null) {
                            System.out.println();
                            if (movies.size() == 0) {
                                System.out.println("No movie found");
                            } else {
                                System.out.println("A26_Movie/s found:-");
                                movies.forEach(e -> System.out.println("\n" + e));
                            }
                        }
                    }

                    case 3 -> System.out.println("Thank You");
                    default -> System.out.println("Invalid Choice");
                }
            } while (ch != 3);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}

