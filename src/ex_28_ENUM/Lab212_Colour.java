package ex_28_ENUM;

public enum Lab212_Colour {
    Red("#FF0000"),
    Blue ("#53443"),
    Green("2342");

    private String hexCode;

    Lab212_Colour(String hexCode){
        this.hexCode= hexCode;
    }
    String getMaxCode(){
        return this.hexCode;
    }
}
