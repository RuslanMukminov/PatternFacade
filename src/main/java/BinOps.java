public class BinOps {
    public String sum(String a, String b) {
        String result;
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);

        result = Integer.toBinaryString(arg1 + arg2);

        return result;
    }

    public String mult(String a, String b) {
        String result;
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);

        result = Integer.toBinaryString(arg1 * arg2);

        return result;
    }
}
