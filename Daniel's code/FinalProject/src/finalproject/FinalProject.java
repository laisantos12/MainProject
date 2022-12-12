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




import static finalproject.Movie.createMovie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
;

/**
 *
 * @author lsant
 */


public class FinalProject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Reads the file
        System.out.println("test");
        String line;
     
        List<Movie> movies = new ArrayList<>();
        
       
        // create and return book of this metadata return new Book(name, price, author); }

        
        
        try{
        
            BufferedReader myReader = new BufferedReader(new FileReader("src/moviesmetadataedited.csv"));
            while((line = myReader.readLine())!= null){
            String[] values  = line.split (",");
                System.out.println("test1");
                Movie movie = createMovie(values);
                System.out.println("test");
                movies.add(movie);
                System.out.println(movie);
           
                
            }
            
               
        }
        catch(IOException e){
            System.out.println("error reading the file");
        }
        
        System.out.println(movies);
       
    }
   
}
