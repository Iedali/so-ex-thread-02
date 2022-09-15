/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ex.thread.pkg02;


public class ThreadId extends Thread {
    
    @Override
    public void run() {
        System.out.println("Thread Id = " + getId());
    }
    
}
