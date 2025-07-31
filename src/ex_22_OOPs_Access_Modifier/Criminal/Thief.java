package ex_22_OOPs_Access_Modifier.Criminal;

import ex_22_OOPs_Access_Modifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun= 100;
        //thief.canIShoot(); //thief not able to access protected method

    }
}
