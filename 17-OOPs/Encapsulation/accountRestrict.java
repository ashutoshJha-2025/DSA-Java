package Encapsulation;
class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters 
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}

public class accountRestrict {
    public static void main(String[] args) {
       Account account1 = new Account();
       account1.name = "Ashutosh jha"; 
       account1.email = "jhaashutosh0811@gmail.com";
       account1.setpassword("abcd");
       System.out.println(account1.getpassword());
    }
}