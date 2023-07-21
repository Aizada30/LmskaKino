package models.service.srviceImpl;

import models.Movie;
import models.service.SortAble;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortableServiceImpl implements SortAble {

    @Override
    public void sortByMovieName(List<Movie> movies) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                ot A do Z eto 1
                ot Z do A eto 2 
                """);
        int num = scan.nextInt();
        switch (num){
            case 1 :  movies.sort(sortByName);
            for(Movie l:movies){
                System.out.println(l);
                System.out.println("\n");
            }
            break;
            case 2 : movies.sort(sortByNameNaoborot);
            for(Movie p:movies){
                System.out.println(p);
                System.out.println("\n");
            }break;
        }


         }

    @Override
    public void sortByMovieYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ot 0 eto - 1 
                ot max eto - 2
                 """);
        int hiha  = scanner.nextInt();
        switch (hiha){
            case 1 :  movies.sort(sortByYear);
                for(Movie m:movies){
                    System.out.println("\n" +
                            " YEAR : "+m.getYear());
                    System.out.println("\n" +
                            "~ NAME : "+m.getName());
                    System.out.println("~ GENRE : "+m.getGenre());
                    System.out.println("~ DIREKTOR : "+m.getDirector());
                    System.out.println("~ CASTS : "+m.getCast());
                }break;
            case 2 : movies.sort(sortByYearNaoborot);
            for(Movie o : movies){
                System.out.println("\n" +
                        " YEAR : "+o.getYear());
                System.out.println("\n" +
                        "~ NAME: "+o.getName());
                System.out.println("~ GENRE : "+o.getGenre());
                System.out.println("~ DIREKTOR : "+o.getDirector());
                System.out.println("~ CASTS : "+o.getCast());
            }break;
        }

    }

    @Override
    public void sortByDirektor(List<Movie> movies) {
        Scanner scannerro = new Scanner (System.in);
        System.out.println("""
                ot A do Z eto 1 
                ot Z do A eto 2
                """);
        int direktorInt= scannerro.nextInt();
        switch (direktorInt){
            case 1 : movies.sort(sortByDirektor);
            for(Movie k:movies){
                System.out.println("\n" +
                        " DIREKTOR : "+k.getDirector());
                System.out.println("\n" +
                        "~ NAME : "+k.getName());
                System.out.println("~ YEAR :"+k.getYear());
                System.out.println("~ GENRE : "+k.getGenre());
                System.out.println("~ CASTS : "+k.getCast());
            }break;
            case 2 :movies.sort(sortByDirektorNaobor);
            for(Movie m : movies){
                System.out.println("\n" +
                        " DIREKTOR : "+m.getDirector());
                System.out.println("\n" +
                        "~ NAME : "+m.getName());
                System.out.println("~ YEAR :"+m.getYear());
                System.out.println("~ GENRE : "+m.getGenre());
                System.out.println("~ CASTS : "+m.getCast());
            }
        }

    }




    Comparator<Movie> sortByName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    Comparator<Movie> sortByNameNaoborot = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    Comparator<Movie>sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()- o2.getYear();
        }
    };

    Comparator<Movie>sortByYearNaoborot = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()- o1.getYear();
        }
    };
    Comparator<Movie>sortByDirektor = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

    Comparator<Movie>sortByDirektorNaobor = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getDirector().getName().compareTo(o1.getDirector().getName());
        }
    };


}
