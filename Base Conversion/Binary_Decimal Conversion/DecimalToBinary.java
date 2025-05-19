public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 13;
        String binary = convertToBinary(num);
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + binary);
    }


    public static String convertToBinary(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal = decimal / 2;
        }
        return binary.toString();
    }   
}
