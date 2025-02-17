public class Person {
    
    private int age;
    private String name;

    boolean canBeChanged = true;
    public void setAge(int age) {
        if(canBeChanged) {
            if(age > 0) {
                this.age = age;
            } else {
                System.out.println("Enter a valid age");
            }
        } else {
            System.out.println("Error, wait for a while");
        }
    }


    boolean canBeAccessed = true;
    public int getAge() {
        if(canBeAccessed) {
            return age;
        } else {
            System.out.println("Error, wait for a while");
        }
        return -1;
    }
}
