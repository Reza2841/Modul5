/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slinkedlist;

/**
 *
 * @author Acer
 */
public class SinglyLinkedListApp {
  public static void main(String[] args) {
    
        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(100);
        lk.display();
        System.out.println(" ");
        lk.insertAkhir(200);
        lk.display();
        System.out.println(" ");
        lk.insertAtPos(50, 1);
        lk.display();
        System.out.println(" ");
        lk.insertAtPos(80, 2);
        lk.display();
        System.out.println(" ");
        lk.deleteAtPos(1);
        lk.display();
        System.out.println(" ");
    }
}  

