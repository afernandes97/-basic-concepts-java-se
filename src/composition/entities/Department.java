package composition.entities;

public class Department {
    private String name;

    public Department(){

    }

    //automatic contructor with params generate
    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
