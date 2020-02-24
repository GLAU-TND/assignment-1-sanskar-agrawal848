import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String first;
    private String last;
    private String temp;
    private String emai;
    private ArrayList<String> numbers = new ArrayList<>();

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public void setNumber(String n) {
        numbers.add(n);
    }
}