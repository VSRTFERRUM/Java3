import java.util.Random;
public class Main {
//    Создайте пример наследования, реализуйте класс Employer и класс
//    Manager. Manager отличается от Employer наличием дополнительных выплат от
//    продаж а) Класс Employer содержит переменные: String firstName, lastName и
//    поле income для заработной платы. Класс Manager также имеет поле double
//    averageSum содержащую среднюю суммы дополнительных выплат за продажи.
//    б) Создать переменную типа Employer, которая ссылается на объект типа
//    Manager. в) Создать метод getIncome() для класса Employer, который возвращает
//    заработную плату. Если средняя количество отработанных дней, то сумма
//    дохода умножается на 12. Переопределить этот метод в классе Manager и
//    добавить к доходу сумму с продаж. г) Создать массив типа Employer содержащий
//    объекты класса Employer и Manager. Вызвать метод getIncome() для каждого
//    элемента массива.
  public static Random rd =new Random();
    static class Employee
    {
        String firstName, lastName;
        double income;
        Employee( String firstName, String lastName)
        {
            this.firstName=firstName;
            this.lastName=lastName;
            income=rd.nextDouble(0,100000000000.0);
        }

        Employee() {
        }

        double getIncome(int days)
        {
            if (days==365) return income*12;
            return  income;
        }
    }
    static class Manager extends Employee
    {
     double avarangeSum;
     Manager(String firstName, String lastName)
     {

         this.firstName=firstName;
         this.lastName=lastName;
         income=rd.nextDouble(0,100000000000.0);
         avarangeSum=rd.nextDouble(0,10000.0);
     }
     @Override
        double getIncome(int days)
        {
            if (days==365) return (income+avarangeSum)*12;
            return  income+avarangeSum;
        }
    }
    public static void main(String[] args) {
        Employee[] mas=new Employee[3];
        mas[0]=new Employee("sfqef","sff");
        mas[1]=new Manager("sfqeifjef","sff");
        mas[2]=new Employee("qef","sf");
        System.out.println(mas[0].getIncome(12)+" "+mas[1].getIncome(365)+" "+mas[2].getIncome(365));

    }
}