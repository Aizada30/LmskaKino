package models.service.srviceImpl;

import models.Cast;
import models.Movie;
import models.service.FindAble;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MovieServiseImpl implements FindAble {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
        return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a MOVIE name : ");
        String nameOfMovie = scan.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().contains(nameOfMovie)) {
                System.out.println(movies.get(i));
            }
        }
    }


    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter a YEAR of movie");
        int findYear = scaner.nextInt();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getYear() == findYear) {
                System.out.println(movies.get(i).getYear() + "\n" +
                        movies.get(i).getName() + "\n" + movies.get(i).getDirector() + "\n" + movies.get(i).getCast() + "\n" + movies.get(i).getGenre());
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a DIRECTOR NAME : ");
        String directorName = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getDirector().getName().contains(directorName)) {
                System.out.println("The director you were looking for ");
                System.out.println(movies.get(i).getDirector().getName() + "\n" + movies.get(i).getName() + "\n" + movies.get(i).getCast() + "\n" + movies.get(i).getGenre());
            } else {
                System.out.println("");
            }
        }
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a GENRE : ");
        String genreFind = scan.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getGenre().contains(genreFind)) {
                System.out.println(movies.get(i).getGenre() + "\n" + movies.get(i).getName() + "\n" + movies.get(i).getDirector() + "\n" + movies.get(i).getCast());
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scam = new Scanner (System.in);
        System.out.println("Enter a ROLE  : ");
        String roleA = scam.nextLine();
        for (Movie m:movies) {
            List<Cast>castRole=m.getCast();
            for (Cast c:castRole) {
                if(c.getRole().contains(roleA) || c.getRole().equalsIgnoreCase(roleA)){
                    System.out.println(m);
                }
            }
        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter an ACTOR NAME : ");
        String nameActor = scanner.nextLine();
        for (Movie m:movies) {
            List<Cast>casts=m.getCast();
            for (Cast c:casts) {
                if(c.getActorFullName().contains(nameActor) || c.getActorFullName().equalsIgnoreCase(nameActor)){
                    System.out.println(m);
                }
            }
        }
    }
}
