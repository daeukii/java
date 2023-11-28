package d6.object;

public class Main {
    public static void main(String[] args) {
//        Person alex = new Person("Alex", 25);
        Person alex = new Student("Alex", 25, "CSE");
        Person brad = new Lecturer("Brad", 40, "Generics");
        Person alex2 = new Student("Alex", 25, "CSE");
        Person alex3 = new Lecturer("Alex", 25, "Korean");

        int a = 0;
        // 수많은 계산이 진행된다.
        // 이후 int a가 얼마인지 확인하려면?
        System.out.println(a);
        // 그렇다면 alex에 어떤값이 있는지는
        // Getter를 쓰겠지만,
        System.out.println(alex);
        System.out.println(brad);

        System.out.println(alex == alex2);
        System.out.println(alex.equals(alex2));
        System.out.println(alex.equals(alex3));
        System.out.println((alex));
    }

    public static void printPerson(Person person){
        System.out.println(person);
    }
}