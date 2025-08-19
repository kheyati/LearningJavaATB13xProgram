package ex_28_ENUM;

public enum API_URL {
    vwo("https://vwo.com"),
    google("https://google.com"),
    katalon("https://katalon.com");


    private String url;

    API_URL(String url){
        this.url= url;
    }

    String geturl(){
        return this.url;
    }
}
