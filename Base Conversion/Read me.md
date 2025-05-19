### Summary

* Use `Integer.toXxxString(int)` to **convert from decimal to binary/octal/hex**.
* Use `Integer.parseInt(String, radix)` to **convert from binary/octal/hex to decimal**.

---

### 🧑‍💻 Quick examples:

```java
public class BaseConversionDemo {
    public static void main(String[] args) {
        int decimal = 255;

        // Decimal to other bases
        String binaryStr = Integer.toBinaryString(decimal);  // "11111111"
        String octalStr = Integer.toOctalString(decimal);    // "377"
        String hexStr = Integer.toHexString(decimal);        // "ff"

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binaryStr);
        System.out.println("Octal: " + octalStr);
        System.out.println("Hex: " + hexStr);

        // Other bases to decimal
        int fromBinary = Integer.parseInt("11111111", 2);   // 255
        int fromOctal = Integer.parseInt("377", 8);         // 255
        int fromHex = Integer.parseInt("ff", 16);            // 255

        System.out.println("From Binary: " + fromBinary);
        System.out.println("From Octal: " + fromOctal);
        System.out.println("From Hex: " + fromHex);
    }
}
```

---
