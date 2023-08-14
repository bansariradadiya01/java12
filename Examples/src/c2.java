//2) The class Movie is started below. An instance of class Movie represents a film. This class
//has the following three class variables:
//● title, which is a Stringrepresenting the title of the movie
//● studio, which is a Stringrepresenting the studio that made the movie
//● rating, which is a Stringrepresenting the rating of the movie (i.e. PG­13, R, etc)
//public class Movie {
//private String title;
//private String studio;
//private String rating;
//// your code goes here
//}
//a) Write a constructor for the class Movie, which takes a Stringrepresenting the title of the
//movie, a Stringrepresenting the studio, and a Stringrepresenting the rating as its
//arguments, and sets the respective class variables to these values.
//b) Write a second constructor for the class Movie, which takes a Stringrepresenting the title
//of the movie and a Stringrepresenting the studio as its arguments, and sets the respective
//class variables to these values, while the class variable ratingis set to "PG".
//c) Write a method getPG, which takes an array of base type Movieas its argument, and
//returns a new array of only those movies in the input array with a rating of "PG". You may
//assume the input array is full of Movieinstances. The returned array need not be full.
//d) Write a piece of code that creates an instance of the class Moviewith the title “Casino
//Royale”, the studio “Eon Productions”, and the rating “PG­13”
class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }


    public static Movie[] getPG(Movie[] mov) {
        Movie[] pgMov = new Movie[mov.length];
        int newArrayIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                pgMov[newArrayIndex] = mov[i];
                newArrayIndex++;
            }
        }
        return pgMov;
    }

    public String getitel() {
        return title;
    }

    public String getrating() {
        return rating;
    }
}
public class c2 {
    public static void main(String[] args) {
        Movie mov = new Movie("1", "y", "R2");
        Movie mov1 = new Movie("2","b");
        Movie mov2 = new Movie("3", "y", "R2");
        Movie mov3 = new Movie("4","b");
        Movie m[]=new Movie[4];
        m[0]=mov;
        m[1]=mov1;
        m[2]=mov2;
        m[3]=mov3;

        Movie[] ans = Movie.getPG(m);
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]!=null){
                System.out.println(ans[i].getitel());
                System.out.println(ans[i].getrating());
            }

        }


    }
}