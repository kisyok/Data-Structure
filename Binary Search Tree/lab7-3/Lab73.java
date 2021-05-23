/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BSTExpression a = new BSTExpression();
        a.setExp("4+5*7");
//        a.setExp("(5*4+8)/7+2");
        a.getBST().showTree();
        System.out.print("INORDER : ");
        a.getBST().setOrder(BST.order.INORDER);
        a.getBST().showTree();
        System.out.print("PREORDER : ");
        a.getBST().setOrder(BST.order.PREORDER);
        a.getBST().showTree();
        System.out.print("POSTORDER : ");
        a.getBST().setOrder(BST.order.POSTORDER);
        a.getBST().showTree();
            }
    }
