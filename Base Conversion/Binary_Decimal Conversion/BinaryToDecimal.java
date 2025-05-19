public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryStr = "1011";
        int decimalValue = binaryToDecimal(binaryStr);
        System.out.println("Binary: " + binaryStr);
        System.out.println("Decimal: " + decimalValue);
    }


    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i); // from right to left
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
