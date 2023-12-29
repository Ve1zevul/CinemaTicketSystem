import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private int balance;
    ArrayList<Ticket> orderHistory = new ArrayList<Ticket>();
    public User(String name,int age,int balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBalance() {
        return balance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void changeBalance(int addBalance){this.balance = this.balance + addBalance;}
    public void setName(String name) {
        this.name = name;
    }
}
