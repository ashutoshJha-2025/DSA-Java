## 🔹Code :

```java
public class StringToBinary {
    public static void main(String[] args) {
        String input = "Hi";
        String binaryResult = stringToBinary(input);
        System.out.println("Original String: " + input);
        System.out.println("Binary Representation: " + binaryResult);
    }

    public static String stringToBinary(String text) {
        StringBuilder binary = new StringBuilder();

        for (char c : text.toCharArray()) {
            String binString = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            binary.append(binString);
        }

        return binary.toString();
    }
}
```

---


## 🔹 Line from Code:

```java
String binString = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
```


### 🔹 What It Does (Step by Step):

Let’s say `c` is a **character** (like `'A'`):

1. `Integer.toBinaryString(c)` → converts the **ASCII value of `c`** into binary **without leading zeros**.

   * `'A'` → 65 → `"1000001"` (7 bits)
2. `String.format("%8s", ...)` → adds **spaces in front** to make it **8 characters** long.

   * `"1000001"` → `" 1000001"`
3. `.replace(' ', '0')` → replaces those spaces with `'0'` to get a full **8-bit binary string**.

   * `" 1000001"` → `"01000001"`

---

## 🔹Step-by-Step String to Binary Conversion

Let’s convert `"Hi"` into binary.

### ✅ Step 1: Take each character

* `"H"`
* `"i"`

### ✅ Step 2: Get ASCII decimal value

* `"H"` → 72
* `"i"` → 105

### ✅ Step 3: Convert ASCII decimal to binary (8 bits)

* 72 → `01001000`
* 105 → `01101001`

### ✅ Step 4: Combine the binary

* `"Hi"` → `01001000 01101001`

That’s our string in binary!

---

