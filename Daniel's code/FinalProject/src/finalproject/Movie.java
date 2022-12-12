/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author danie
 */
public class Movie {
    String original_language;
    String original_title;
    String overview;
    String popularity;
    String release_date;
    String runtime;
    String tagline;
    String title;
    String vote_average;
    String vote_count;
    String price;

    public Movie(String original_language, String original_title, String overview,String popularity,String release_date, String runtime, String tagline, String title, String vote_average, String vote_count, String price) {
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity= popularity;
        this.release_date = release_date;
        this.runtime = runtime;
        this.tagline = tagline;
        this.title = title;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.price = price;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public String getVote_average() {
        return vote_average;
    }

    public String getVote_count() {
        return vote_count;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Movie{" + "original_language=" + original_language + ", original_title=" + original_title + ", overview=" + overview + ", release_date=" + release_date + ", runtime=" + runtime + ", tagline=" + tagline + ", title=" + title + ", vote_average=" + vote_average + ", vote_count=" + vote_count + ", price=" + price + '}';
    }
    
     public static Movie createMovie(String[] metadata) { 
    String original_language= metadata[0];
    String original_title = metadata[1];
    String overview= metadata[2];
    String popularity = metadata[3];
    String release_date = metadata[4];
    String runtime = metadata[5];
    String tagline= metadata[6];
    String title= metadata[7];
    String vote_average=metadata[8];
    String vote_count=metadata[9];
    String price=metadata[10];
    return new Movie(original_language,original_title,overview,popularity,release_date,runtime,tagline,title,vote_average,vote_count,price);
     }
    
     
}
