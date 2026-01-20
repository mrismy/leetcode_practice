public class State{
    public static void main(String[] a) {
        Person1 person = new Person1("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        Person1 person2;
        person2=person;
        System.out.println("Name: " + person2.getName());
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        swapIntArr(arr1,arr2);
        System.out.println("arr1[0]: "+arr1[0]);
    }
    
public static void swap(int a, int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
}

public static void swapObj(Person p1, Person p2){
    Person temp;
    temp=p1;
    p1=p2;
    p2=temp;
}

public static void swapIntArr(int[] arr1, int[] arr2){
    int[] temp;
    temp=arr1;
    arr1=arr2;
    arr2=temp;
}

public static void swapInteger(Integer a, Integer b){
    Integer temp;
    temp=a;
    a=b;
    b=temp;
}
}
final class Person1 {

    private final String name;
    private final int age;

    public Person1(String name, int age) {
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
