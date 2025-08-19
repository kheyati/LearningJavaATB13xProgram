package ex_28_ENUM;

public enum Locators {
    page_input_email("#login-username"),
            page_input_password("#login-password"),
            page_button("#btn");
// create a variable
    private String locators;
    // create a param constructor
    Locators(String locators){
            this.locators = locators;
        }
        // create a getter
     String getLocators() {
        return locators;
    }
}


