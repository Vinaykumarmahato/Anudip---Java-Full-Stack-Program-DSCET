package DataTypes;

public class NonPrimitiveDataType {

    public static void main(String[] args) {
        // String - Non-primitive data type
        String greeting = "Hello, Java!";
        
        // Array - Non-primitive data type
        int[] numbers = {10, 20, 30, 40, 50};

        // Object - Non-primitive data type
        Person person = new Person("Vinay", 23);

        // Displaying the String
        System.out.println("Greeting: " + greeting);

        // Displaying elements of the Array
        System.out.println("Numbers in the array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Displaying the Object's data
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// Example of a custom class (used as a reference data type)
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
