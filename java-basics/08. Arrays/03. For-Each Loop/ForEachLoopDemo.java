public class ForEachLoopDemo {
    public static void main(String[] args) {
        // Array of primitive data types in Java
        String[] primitiveDataTypes = {
            "byte",
            "short",
            "int",
            "char",
            "float",
            "double",
            "long",
            "boolean"
        };

        System.out.println("Primitive data types in Java array:");

        // For-each loop to iterate through the array
        for (String dataType : primitiveDataTypes) {
            System.out.println(dataType); // Print each data type
        }
    }
}