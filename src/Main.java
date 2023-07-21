import models.Cast;
import models.Director;
import models.Movie;
import models.service.srviceImpl.MovieServiseImpl;
import models.service.srviceImpl.SortableServiceImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cast cast = new Cast("Ben Stillet", "Larry Deyly");
        Cast cast1 = new Cast("Ouen Uilson", "Jededaya");
        Cast cast2 = new Cast("Robin Uilyams", "Teodor Ruthvelt");
        Cast cast3 = new Cast("Steve Martin", "Tom Baker");
        Cast cast4 = new Cast("Bonny Hand", "Kate Baker");
        Cast cast5 = new Cast("Hilary Duff", "Lorraina Baker");
        Cast cast6 = new Cast("Tom", "Tom");
        Cast cast7 = new Cast("Jerry", "Jerry");
        Cast cast8 = new Cast("Robert Dauny little", "Iron man");
        Cast cast9 = new Cast("Kris Evans", "Kapitan America");
        Cast cast10 = new Cast("Kris Hemswort", "Tor");
        Cast cast11 = new Cast("Vin Dizell", "Domminik Toretto");
        Cast cast12 = new Cast("Jeyson Momoa", "Dante Reyse");
        Cast cast13 = new Cast("Rita Moreno", "Abuella");


        List<Cast> castMuseam = new LinkedList<>(List.of(cast, cast1, cast2));
        List<Cast> castOptom = new LinkedList<>(List.of(cast3, cast4, cast5));
        List<Cast> castTom = new LinkedList<>(List.of(cast6, cast7));
        List<Cast> castFinal = new LinkedList<>(List.of(cast8, cast9, cast10));
        List<Cast> castsForsaj = new LinkedList<>(List.of(cast11, cast12, cast13));
        List<Cast> allCasts = new ArrayList<>(
                List.of(cast, cast1, cast2, cast3, cast4, cast5, cast6, cast7, cast8, cast9, cast10, cast11, cast12, cast13)
        );

        Director directorMuseam = new Director("Shon", "Levi");
        Director directorOptom = new Director("Shon", "Levi");
        Director directorTim = new Director("Tim", "Story");
        Director directorFinal = new Director("Shein", "Black");
        Director directorForsaj = new Director("Lui", "Letere");


        Movie movieMuseam = new Movie("Night at the museam", 2006, "History", directorMuseam, castMuseam);
        Movie movieOptom = new Movie("Wholesale cheaper", 2003, "Humor", directorOptom, castOptom);
        Movie movieTom_Jerry = new Movie("Tom & Jerry", 1940, "Anymation Cartoon", directorTim, castTom);
        Movie movieFinal = new Movie("Avengers: final", 2019, "Action movie", directorFinal, castFinal);
        Movie movieForsaj = new Movie("Forsaj 10", 2023, "Action movie", directorForsaj, castsForsaj);

        List<Movie> movieList = new LinkedList<>(List.of(movieMuseam, movieOptom, movieTom_Jerry, movieFinal, movieForsaj));

        MovieServiseImpl movieServise = new MovieServiseImpl();

        SortableServiceImpl sortService = new SortableServiceImpl();

        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        while (isTrue) {
            System.out.println("""
                                        
                                        
                    1 - get all movie 
                    2 - find movie by part or full name
                    3 - find movie by actor name
                    4 - find movie by year
                    5 - find by direct
                    6 - find by ganr
                    7 - find by role
                    8 - close
                    9 - sort by name
                    10 - sort by director 
                    11 - sort by  year
                                        
                    """);
            System.out.println("Enter number ");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> movieServise.getAllMovies(movieList);
                case 2 -> movieServise.findMovieByFullNameOrPartName(movieList);
                case 3 -> movieServise.findMovieByActorName(movieList);
                case 4 -> movieServise.findMovieByYear(movieList);
                case 5 -> movieServise.findMovieByDirector(movieList);
                case 6 -> movieServise.findMovieByGenre(movieList);
                case 7 -> movieServise.findMovieByRole(movieList);
                case 8 -> System.out.println(isTrue = false);
                case 9 -> sortService.sortByMovieName(movieList);
                case 10 -> sortService.sortByDirektor(movieList);
                case 11 -> sortService.sortByMovieYear(movieList);
            }
        }
    }
}
