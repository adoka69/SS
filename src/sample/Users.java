package sample;

public class Users {

    private String Name;
    public Users(String Name){
        this.Name=Name;
    }
    public Users(){}

    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    @Override
    public String toString() {
        return Name;
    }
}
