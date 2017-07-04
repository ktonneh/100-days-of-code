/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elkibet
 */
public class LongestWordInaString {
    
    public static void main(String[] args){
        String sentence="The quick brown fox jumped over the lazy dog";
        System.out.println("##\t"+getLongestWord(sentence));
        
    }
    
    
    private static String getLongestWord(String sentence){
        String[] words= sentence.split(" ");
        String longest= words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
       
        return longest+"|"+longest.length();
    }
    
}
