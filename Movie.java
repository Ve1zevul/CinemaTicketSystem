public class Movie {
    private String movieName;
    private String genre;
    private int ageRestriction;

    public Movie(String movieName,String genre,int ageRestriction){
        this.movieName = movieName;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
    }


    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
