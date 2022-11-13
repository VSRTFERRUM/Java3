public class Main {
    static class Person
    {
        String fullname;
        int age;
        Person ()
        {
            fullname="NN";
            age=0;
        }
        Person (String fullname, int age)
        {
            this.fullname=fullname;
            this.age=age;
        }
        void move()
        {
            System.out.println(fullname+" идёт");
        }
        void talk()
        {
            System.out.println(fullname+" говорит");
        }
    }
    public static void main(String[] args) {
      Person p1=new Person();
      Person p2=new Person("gfhejihf",123);
      p1.move();
      p2.talk();

    }
}