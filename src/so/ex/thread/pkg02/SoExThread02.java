/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ex.thread.pkg02;

/**
 *
 * @author ieda
 */
public class SoExThread02 {

    
    
    public static void main(String[] args) {
     
        for(int i = 0; i < 5; i++) {
            ThreadId threadId = new ThreadId();
            threadId.start();
        }
    }
    
}
