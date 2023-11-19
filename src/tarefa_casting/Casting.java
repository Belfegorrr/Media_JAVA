package Media_JAVA.src.tarefa_casting;

public class Casting {
    
    public static void main(String args[]) {
        long l1 = 1010101;
        System.out.println(l1);
        short l2 = (short) l1;
        System.out.println(l2);
        
        double l3 = l1;
        System.out.println(l3);

        System.out.println("*** Wrapper do short JAVA");

        Short x = Short.valueOf(l2);
        System.out.println(x);
    }
}
