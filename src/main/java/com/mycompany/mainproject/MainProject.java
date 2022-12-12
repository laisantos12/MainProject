
package com.mycompany.mainproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lsant
 */
public class MainProject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Reads the file
        BufferedReader myReader = new BufferedReader(new FileReader("moviesmetadata.csv"));
        String line = myReader.readLine();
        //Splits the file into columns
        String[] lineArr;
        //First line of the file
        String[] movieClassifications;
      //  List<> movieList = new ArrayList<>();
        List<String[]> movieList = new ArrayList<>();
        System.out.println("*----------Welcome to EirVid!----------*");
        System.out.println(line);
        
        
        movieClassifications = line.split(",");
        //Parses the file
        //Keeps reading while has line
        while ((line = myReader.readLine()) != null){
            lineArr = line.split(",");
            movieList.add(lineArr);
            //Prints the first element of the array
            System.out.println(lineArr[0]);
        }
        
        //Loops the movies and gets the elements on the array
        for (int movie = 0; movie < movieClassifications.length; movie ++){
            System.out.println(movieClassifications[movie]);
            for (int list = 0; list < movieList.size(); list ++){
                System.out.println(movieList.get(list)[movie]);
                
            }
            
        }
        
    }
}
