/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg4;

/**
 *
 * @author HP
 */
public class CharacterUtoZ extends Banner{
    
     public CharacterUtoZ(char character) {
        this.character = character;

        switch (character) {
            case 'U':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'V':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'X':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'Y':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'Z':
                line[0] = "  ***";
                line[1] = " *   ";
                line[2] = "  *  ";
                line[3] = "   * ";
                line[4] = "***  ";
                break;
           
        }
    }
}
