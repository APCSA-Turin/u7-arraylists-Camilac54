package Lab1;

public class Thing {
    private String name;
   
    public Thing(String name) {
        this.name = name;
    }
   
    public String info() {
        return "This thing is named " + name;
    }
   
    public String introduce() {
        return "Hello, my name is " + name;
    }
 }