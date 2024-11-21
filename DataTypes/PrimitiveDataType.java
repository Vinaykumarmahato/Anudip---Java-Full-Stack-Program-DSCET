package DataTypes;

public class PrimitiveDataType {

    public static void main(String[] args) {
        // Integer data types
        byte byteValue = 127;       // Range: -128 to 127
        short shortValue = 32000;   // Range: -32,768 to 32,767
        int intValue = 100000;      // Range: -2^31 to 2^31-1
        long longValue = 100000L;   // Range: -2^63 to 2^63-1

        // Floating-point data types
        float floatValue = 10.5f;   // 32-bit floating point
        double doubleValue = 99.99; // 64-bit floating point

        // Character data type
        char charValue = 'A';       // 16-bit Unicode character

        // Boolean data type
        boolean isJavaFun = true;   // Only true or false

        // Displaying all primitive types
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Is Java Fun: " + isJavaFun);
    }
}
