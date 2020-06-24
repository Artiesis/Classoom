public class Wilder {

    // attributes
    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firtstname) {
    
        this.firstname = firstname;
        this.aware = false;
    }

    public Wilder(String firstname, boolean aware) {
    
        this.firstname = firstname;
        this.aware = aware;
    }

 
    // instance method
    

    public String whoAmI() {
        if (aware == false) {

            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware ";
        } else {

//    public String whoAmI() {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware ";
        }
    }
    
    // getters
    
    public String getFirstname() {
        return this.firstname;
    }   
 
    public boolean isAware() {
        return this.aware;
    }
    
    // setters
    
    public void setFirstame(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}
