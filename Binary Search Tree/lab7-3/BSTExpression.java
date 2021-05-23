/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class BSTExpression {
    BST<Character> a = new BST<>();
    private String exp = "";
    public BST getBST(){return a;}
    public void setExp(String t){
        exp = t.replace(" ", "");
        System.out.println("The number of elements in the tree : "
         + exp.length());
        a = convert(exp);
    }
    public void formBST(Stack ope,Stack bst){
        System.out.println("Form a subtree");
        char operator = (Character)ope.pop();
        BST<Character> newBST = new BST<>();
        newBST.addNode(operator);
//        if(!bst.isEmpty()){
            BST right = (BST)bst.pop();
            newBST.setRightNode(right);
//        }
        if(!bst.isEmpty()){
            BST left = (BST)bst.pop();
            newBST.setLeftNode(left);
        }
        bst.push(newBST);
    }
    public String getExp(){return exp;}
    private BST convert(String exp){
        BST<Character> result;
        Stack<Character> ope = new Stack<>();
        Stack<BST> bst = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            System.out.println("Now " + ch);
            if(ch=='('){
                ope.push(ch);
            }else if(ch==')'){
                char c = ope.peek();
                while(c != '('){
                    formBST(ope, bst);
                    c = ope.peek();
                    if(c == '('){
                        //pop the '(' away
                        System.out.println("you " + ope.pop());
                    }
                }
            }else if(Character.isDigit(ch)){
                System.out.println("it's digit :" + ch);
                BST<Character> temp = new BST<>();
                temp.addNode(ch);
                bst.push(temp);
            }else{
                //it's operator
                if(ope.isEmpty()){
                    ope.push(ch);
                }else{
                    char c = ope.peek();
                    if(getPriority(ch)>=getPriority(c)){
                        ope.push(ch);
                    } else {
                        while (getPriority(ch) < getPriority(c)) {
                            formBST(ope, bst);
                            if(!ope.isEmpty()){c = ope.peek();}
                            else{break;}
                        }
                        ope.push(ch);
                    }
                }
            }
        }
        //after finish reading the expression
        while(!ope.isEmpty()){
            formBST(ope, bst);
        }
        result = bst.pop();
        while(!bst.isEmpty()){System.out.println("left : " + bst.pop());}
        return result;
    }
    public static int getPriority(char c) {
        switch (c) {
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
}
