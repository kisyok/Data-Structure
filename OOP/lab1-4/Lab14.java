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
public class Lab14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharacterAtoG letterF = new CharacterAtoG('F');
        CharacterOtoT letterS = new CharacterOtoT('S');
        CharacterHtoN letterK = new CharacterHtoN('K');
        CharacterOtoT letterT = new CharacterOtoT('T');
        CharacterHtoN letterM = new CharacterHtoN('M');

        for (int i = 0; i < 5; i++) {
            System.out.print(letterF.getLineAt(i));
            System.out.print("  ");
            System.out.print(letterS.getLineAt(i));
            System.out.print("  ");
            System.out.print(letterK.getLineAt(i));
            System.out.print("  ");
            System.out.print(letterT.getLineAt(i));
            System.out.print("  ");
            System.out.print(letterM.getLineAt(i));
            System.out.println();
        }
    }
    }
