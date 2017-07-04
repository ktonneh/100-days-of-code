/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elkibet
 */
public class StaticMethodsChallenge {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stark stark = new Ned();
        Stark.talk();
    }
    
    static class Stark{
        static void talk(){
            System.out.println("The winter is coming!!");
        }
    }
    
    static class Ned extends Stark{
        static void talk(){
            System.out.println("The only time a man can be brave is when he is afraid!!");
        }
    }
    
}
