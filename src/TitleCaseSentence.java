/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elkibet
 */
public class TitleCaseSentence {
    
    public static void main(String[] args){
        String sentence= "I'm a little tea pot";
        System.out.println(titleCase(sentence));
        
    }
    
    
    private static String titleCase(String sentence){
        StringBuilder result=new StringBuilder();
        String[] words;
        words = sentence.split(" ");
        for(String word: words){
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1))
                    .append(" ");
        }
        return result.toString();
    }
    
   
    
}
