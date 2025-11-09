public class student {
    String name;
    int rollNo;

    void setData(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class studentDemo {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setData("Rahul", 101);
        s1.display();
    }    
}
