package polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Science", "John Wick");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title: ");
            String title = s.nextLine();

        }
    }
}
