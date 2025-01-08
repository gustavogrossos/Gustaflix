import br.com.gustaflix.models.Movie;
import br.com.gustaflix.models.Serie;
import br.com.gustaflix.models.calculus.TimeCalculator;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("Kill Bill");
        movie1.setYearOfRelease(2001);
        movie1.setDurationInMinutes(125);

        Movie movie2 = new Movie();
        movie2.setName("Kill Bill 2");
        movie2.setYearOfRelease(2003);
        movie2.setDurationInMinutes(160);

        System.out.println("Film length: " + movie1.getDurationInMinutes());

        movie1.informations();
        movie1.review(9);
        movie1.review(5);
        movie1.review(10);
        System.out.println("Total reviews: " + movie1.getTotalReviews());
        System.out.println("Sum reviews: " + movie1.mediaReviews());
        System.out.println(movie1.mediaReviews());


        Serie GameOfThrones = new Serie();
        GameOfThrones.setName("Got");
        GameOfThrones.setYearOfRelease(2006);
        GameOfThrones.informations();
        GameOfThrones.setSeasons(8);
        GameOfThrones.setEpisodePerSeason(10);
        GameOfThrones.setMinutesPerEpisode(50);
        System.out.println("Duration to watch everything: " + GameOfThrones.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(movie1);
        calculator.include(movie2);
        calculator.include(GameOfThrones);
        System.out.println(calculator.getTotalTime());
    }
}
