## 🔹Code :

```java
public class BinaryToString {
    public static void main(String[] args) {
        String unspacedBinary = "0100100001101001";
        System.out.println("String: " + binaryToString(unspacedBinary));
    }

    public static String binaryToString(String binaryStr) {
        StringBuilder result = new StringBuilder();

        if (binaryStr.contains(" ")) {
            // If there is spaced between every 8 bit of binary code, split by spaces
            String[] bytes = binaryStr.split(" ");
            for (String b : bytes) {
                int charCode = Integer.parseInt(b, 2);
                result.append((char) charCode);
            }
        } else {
            // If no spaces, process every 8 bits
            for (int i = 0; i < binaryStr.length(); i += 8) {
                String byteChunk = binaryStr.substring(i, i + 8);
                int charCode = Integer.parseInt(byteChunk, 2);
                result.append((char) charCode);
            }
        }

        return result.toString();
    }
}
```

---

## 🔹 Step-by-Step: Binary to String

Suppose you have a binary string:

```
"01001000 01101001"
```

### ✅ Step 1: Split into 8-bit chunks

Each character is 8 bits (1 byte). So:

* `01001000` → first character
* `01101001` → second character

### ✅ Step 2: Convert binary to decimal

* `01001000` → 72
* `01101001` → 105

### ✅ Step 3: Convert decimal to character (ASCII)

* 72 → `'H'`
* 105 → `'i'`

### ✅ Step 4: Combine the characters

Result: `"Hi"`

---

## 🔹How It Works

1. **Binary to Decimal** → `Integer.parseInt(binary, 2)`
2. **Decimal to Char** → `(char) decimal`
3. `substring(i, i+8)` → grabs 8 bits at a time.
4. `Integer.parseInt(..., 2)` → converts binary to decimal.
5. `(char) ...` → converts decimal to character.

---
