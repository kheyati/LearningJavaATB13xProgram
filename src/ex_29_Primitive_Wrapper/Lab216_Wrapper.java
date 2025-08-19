package ex_29_Primitive_Wrapper;

public class Lab216_Wrapper {
    public static void main(String[] args) {
        mobilephone iphone = new mobilephone(1, "iphone16", 1200.00);
        mobilephone samsung = new mobilephone(2, "samsung", 1233.50);

        iphone.setPrice(2345.66);
        iphone.display();
        samsung.display();

        System.out.println(mobilephone.mobile_Carrier);
        mobilephone.switchonAirplanemode();

        System.out.println(covers.Blue.getColour());
    }

}
//Single inheritence

class mobilephone extends oldPhone{

    //encap + wrapper classes
    private Integer phone;
    private String name;
    private Double price;
    //Static variable
    static String mobile_Carrier = "airtel";

   //Default Constructo
    mobilephone(){
        System.out.println("DC");
    }
    //Param constructor
    public mobilephone(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    static void switchonAirplanemode(){
        System.out.println("Airplane mode common to all phones");
    }

    //method overriding
    @Override
    void calling() {
        System.out.println("mobile uses touchpad");;
    }

    //method overloading
    void priceChange(Integer price){
        System.out.println("Price in Integer");
    }

    void priceChange(Double price){
        System.out.println("Price in decimals");
    }


    // display function
    void display(){
        System.out.println(this.phone + " "+ this.name +  " " + this.price);
    }
// Getter Setter
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

class oldPhone implements SIMCard{
    void calling(){
        System.out.println("Dialpad");
    }
    // Method override
    @Override
    public void enterCard() {
        System.out.println("Card entered in old phone");
    }
}

enum covers{
    Red("red pkemon"),
    Blue("Blue pokemon");

    private String colour;
    covers(String colour){
        this.colour = colour;
    }
    // Getter for enum
    public String getColour() {
        return this.colour;
    }
}
    // interface
        interface SIMCard{
            void enterCard();


}
