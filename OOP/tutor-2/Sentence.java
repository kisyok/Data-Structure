/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor.pkg2;

/**
 *
 * @author HP
 */
public class Sentence {
    private String inputSentence;

    public Sentence(String inputSentence) {
        this.inputSentence = inputSentence;
    }

    public int vowels(){
        int count = 0;
        char c;
        for(int i=0; i<inputSentence.length();i++){
            c=Character.toLowerCase(inputSentence.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
    public String toString() {
        return "The sentence is : " + inputSentence 
                + "\nThe length of the sentence : " + inputSentence.length()
                + "\nThe number of vowels : " + vowels()
                + "\nThe number of words : " + inputSentence.split(" ").length;
    }
    
    
}
