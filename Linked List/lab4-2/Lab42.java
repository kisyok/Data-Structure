/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        String sentence = "Banking";
        System.out.println("Enter a sentence : " + sentence);
        for(int i=0; i<sentence.length(); i++){
            list.addNode(sentence.charAt(i));
        }
        System.out.print("The original list : ");
        list.showList();
        
        LinkedList<Character> firstlist = new LinkedList<>();
        LinkedList<Character> secondlist = new LinkedList<>();
        list.splitList();
        list.alternateList(firstlist, secondlist);
        list.mergeList(firstlist, secondlist);
       
        System.out.println("\n\nReverse the list. Recursive method in linked list");
        list.reverse(null);
        
        System.out.println("\n\nReverse the list. Recursive method in tester class");
        reverseHere(list,null);
    }
    public static void reverseHere(LinkedList list, ListNode node){
        ListNode head = list.getHead();
        if (head.getLink() != null) {
            ListNode newNode = new ListNode(head.getData(), node);
            list.setHead(list.getHead().getLink());
            reverseHere(list,newNode);
        } else {
            list.setHead(new ListNode(head.getData(), node));
            list.showList();
        }

      
    }
    
}
