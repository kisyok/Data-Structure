/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public interface test<T> {
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void Push(T a);
    public T Pop();
    public T Peek();
    public void showStack();
}
