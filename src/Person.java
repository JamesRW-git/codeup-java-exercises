public class Person {
    public static void main(String[] args) {
        Person james = new Person();
        james.setName("James");
        System.out.println(james.getName());
        james.sayHello();
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s%n", name);
    }
}
