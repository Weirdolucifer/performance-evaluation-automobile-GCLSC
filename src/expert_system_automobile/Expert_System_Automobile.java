/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expert_system_automobile;

/**
 *
 * @author weirdolucifer
 */
public class Expert_System_Automobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Performance pf = new Performance();
        Welcome b = new Welcome(pf);
        b.setVisible(true);
    }
    
}
