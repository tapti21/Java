public class Conversion {
    public static void main(String[] args) {
        int num = 25;
        String binaryString = Integer.toBinaryString(num);
        System.out.println( num);
        System.out.println( binaryString);

        String binary = "11001";
        int integer = Integer.parseInt(binary, 2);
        System.out.println( binary);
        System.out.println(integer);
    }
}
