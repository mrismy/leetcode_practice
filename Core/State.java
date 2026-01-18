public class State{
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        Person peron2;
        peron2=person;
        System.out.println("Name: " + peron2.getName());
    }
}
final class Person1 {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        //this.name = name; // This line would cause a compilation error
    }
    public void setAge(int age) {
        //this.age = age; // This line would cause a compilation error
    }
}

public void swap(int a, int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
}

public void swapObj(Person p1, Person p2){
    Person temp;
    temp=p1;
    p1=p2;
    p2=temp;
}

public void swapIntArr(int[] arr1, int[] arr2){
    int[] temp;
    temp=arr1;
    arr1=arr2;
    arr2=temp;
}

public void swapInteger(Integer a, Integer b){
    Integer temp;
    temp=a;
    a=b;
    b=temp;
}
class Person {
    String name;
    int age;
    int[] arr;

    public Person(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int[] getArr() { return arr; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; } 
    public void setArr(int[] arr) { this.arr = arr; }
}
