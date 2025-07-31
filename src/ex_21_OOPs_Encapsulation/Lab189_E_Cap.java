package ex_21_OOPs_Encapsulation;

public class Lab189_E_Cap {
    public static void main(String[] args) {
        VWOLogin vwo = new VWOLogin("kheyati", "1234");
        //System.out.println(vwo.password);
        // this is not encapsulated anyone can access the attributes
        // anyone that has access to object reference can access the attributes
        // Bad Approach

        vwo.password = "09798";
        //System.out.println(vwo.password);


        goodvwologin g1 = new goodvwologin("usr", "pass");
        //System.out.println(g1.password); // not allowed to access since it is encapsulated using private variable
        //allowed to get password
        String gpassword = g1.getPassword();
        //not allowed to set password
        //String spassword = g1.setPassword("newpassword");
        // if Admin is true allow to set password
        System.out.println("-------New Admin Password-------");
        g1.setPassword("pass123$", false);
        String admin = g1.getPassword();
        System.out.println(admin);

    }
}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class goodvwologin {


    // Encapsulated class: variable should be private
    private String username;
    private String password;

    // Parametirsed Constructor
    public goodvwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }
// This will give access to private variables

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Cannot change password");
        }
    }
}

