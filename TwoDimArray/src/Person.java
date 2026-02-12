public class Person {

    private String name;
    private static int age;

    public static void main(String args[]){
        System.out.println("Hello Person Exercise");
        Person person = new Person();
        getAge();
        System.out.println("age is " + person.getAge());
        person.setAge(10);
        System.out.println("Age is " + person.getAge);

    }
    public void Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static int getAge(){
        return age;
    }

    public static void setAge(int num){

    }

}
