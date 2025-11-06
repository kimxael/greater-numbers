public class returnex {
    public static void main(String[] args) {
        System.out.println("start of program");
        checkNumber(5);
        System.out.println("end program");
    }
    public static void checkNumber(int num) {
        if(num<0){
            System.out.println("negative number");
            return;
        }
        System.out.println("positive num or zero");   
    }   
}
