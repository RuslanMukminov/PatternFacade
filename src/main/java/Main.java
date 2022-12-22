public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String a = "1100100";
        String b = "0011";

        System.out.println("mult: " + bins.mult(a, b));

        System.out.println("sum: " + bins.sum(a, b));

    }
}
