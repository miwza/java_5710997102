/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

/**
 *
 * @author SENest
 */
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Bow");
      User john = new User("Nest");

      robert.sendMessage("Hi! Nest!");
      john.sendMessage("Hello! Bow!");
   }
}
