public class Teacher {
    
    // => The viewer can see this info in different class or in same package as well as in another package also, 
    //    in shot this public type cam be available for all. 
    public int teachingClass;


    // => In this private type the viewer can see this info in same class only.
    private int id;

   
    // => As the name says this info can be access in its package only but can be different class, 
    //    no one can used this info in different package.
    String degree;   // Default or Package-Private


    // => This data can be available in sub-class whatever the package is;
    protected String studentCount;
}
