package Less2;

public class PersonTestDrive {
    public static void main(String[] args) {
        Person Patrick = new Person(true, "Patrick");
        Person Bob = new Person(true, "Bob");
        Person Ann = new Person(false, "Ann");
        Person Julia = new Person(false, "Julia");

        System.out.println(Patrick.marry(Ann));
        System.out.println(Bob.marry(Julia));
        System.out.println(Bob.marry(Ann));
        System.out.println(Patrick.marry(Julia));
        System.out.println(Patrick.divorce());
        System.out.println(Julia.divorce());
        System.out.println(Patrick.marry(Bob));

    }
}
