/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class Palindrome1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word = JOptionPane.showInputDialog("This program will find out whether the word you write is a palindrome");
        String backwardsWord="";
        for (int pos=word.length()-1; pos>=0;pos--){
            backwardsWord += word.charAt(pos);
        }
        System.out.println(backwardsWord);
        if (word.equalsIgnoreCase(backwardsWord)){
            System.out.println(word+" Is a palindrome "+backwardsWord);
        }
        else {
        System.out.println(word+" Is not a palindrome");
        }
    }
}
