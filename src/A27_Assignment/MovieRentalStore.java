package A27_Assignment;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class MovieRentalStore implements Closeable{

    private final List<Movie1> movies = new ArrayList<>();

    public MovieRentalStore() throws IOException {

        FileReader fileReader=new FileReader("movie.txt");

        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\t");
            String actors = data[2];
            actors = actors.substring(1, actors.length() - 1);
            movies.add(new Movie1(Integer.parseInt(data[0]), data[1], actors.split(", "), data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5])));
        }
        reader.close();
    }


    public void addMovie(Movie1 movie) {
        movies.add(movie);
    }

    public List<Movie1> searchMovie(Predicate<Movie1> key) {
        List<Movie1> movies = new ArrayList<>();
        for (Movie1 movie : this.movies) {
            if (key.test(movie)) movies.add(movie);
        }
        return movies;
    }

    public void close() throws IOException {
        File file = new File("movie.txt");
        file.setWritable(true);
        Writer out = new BufferedWriter(new FileWriter(file));
        for (Movie1 movie : movies) {
            out.write(String.format("%d\t%s\t%s\t%s\t%d\t%d\n", movie.getId(), movie.getTitle(), Arrays.toString(movie.getActor()), movie.getCategory(), movie.getYear(), movie.getLength()));
        }
        file.setWritable(false);
        out.flush();
        out.close();
    }
}