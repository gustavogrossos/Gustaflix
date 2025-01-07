import br.com.gustaflix.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("Kill Bill");
        movie1.yearOfRelease = 2001;
        movie1.durationInMinutes = 125;

        movie1.informations();
        movie1.review(9);
        movie1.review(5);
        movie1.review(10);
        System.out.println("Total reviews: " + movie1.getTotalReviews());
        System.out.println("Sum reviews: " + movie1.getSumReviews());
        System.out.println(movie1.mediaReviews());
    }
}
