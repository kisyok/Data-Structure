/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] input = {'4', '+', '5', '*', '7'};
        BST<Character> tree = new BST<>();
        for(int i=0; i<input.length; i++){
            tree.addNode(input[i]);
        }
        System.out.println("The number of elements in the tree : " + tree.getSize());
        
        System.out.print("The tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        
        System.out.print("\nThe tree elements - INORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        
        System.out.print("\nThe tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
        
        System.out.println("\nRemove a Character L");
        tree.remove('L');
        System.out.println("The number of elements in the tree : " + tree.getSize());
        
         System.out.print("The tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        
        System.out.print("\nThe tree elements - INORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        
        System.out.print("\nThe tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
       
    }
    
}
