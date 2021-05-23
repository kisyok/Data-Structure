/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = {50, 30, 25, 71, 80, 99, 40, 1, 7, 5};
        
        BST<Integer> tree = new BST<>();
        for(int i=0 ; i<input.length; i++){
            tree.addNode(input[i]);
        }
        
        System.out.print("The tree elements in INORDER: ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        
        System.out.print("\nThe tree elements in PREORDER: ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        
        System.out.print("\nThe tree elements in POSTORDER: ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
    }
    
}
