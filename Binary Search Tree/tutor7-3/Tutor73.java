/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BST Implementation Using Array");
        ArrayBST a = new ArrayBST();
        char[] input = {'F', 'A', 'C', 'U', 'L', 'T', 'Y'};
        for(int i=0; i<input.length; i++){
            a.addNode(input[i]);
        }
        System.out.println("The number of elements in the tree : " + a.getSize());
        System.out.print("The tree elements - PREORDER  : ");
        a.setOrder(2);
        a.showTree();
        System.out.print("\nThe tree elements - INORDER : ");
        a.setOrder(1);
        a.showTree();
        System.out.print("\nThe tree elements - POSTORDER : ");
        a.setOrder(3);
        a.showTree();
        
        System.out.println("\nRemove 1 Character L");
        a.remove('L');
        System.out.println("The number of elements in the tree : " + a.getSize());
        System.out.print("The tree elements - PREORDER  : ");
        a.setOrder(2);
        a.showTree();
        System.out.print("\nThe tree elements - INORDER : ");
        a.setOrder(1);
        a.showTree();
        System.out.print("\nThe tree elements - POSTORDER : ");
        a.setOrder(3);
        a.showTree();
        
    }
    
}
