package ex_22_OOPs_Access_Modifier.Police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

        protected void canIShoot() {
            System.out.println("You can shoot!!");
        }
        void funcdefault(){
            System.out.println("Hi Cop");
    }
    }
