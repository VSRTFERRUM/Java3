public class Main {
    static class Phone
    {
        String number;
        String model;
        double weight;
        Phone(String number, String model,double weight)
        {
            new Phone(number,model);
            this.weight=weight;
        }
        Phone(String number, String model)
        {
            this.number=number;
            this.model=model;
            weight =250;
        }
        Phone()
        {
            number="NN";
            model="NN";
            weight =250;
        }
        void show()
        {
            System.out.println("Модель "+model+" номер "+number+" вес "+ weight);
        }
        void recieveCall(String name)
        {
            System.out.println("Звонит "+name);
        }
        void recieveCall(String name, String number)
        {
            System.out.println("Звонит "+name+" номер "+number);
        }
        String getNumber()
        {
            return number;
        }
        void sendMessage(String [] list)
        {
            for (int i = 0; i< list.length;i++)
            {
                System.out.println("Сообщение отправлено " + list[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        String[] mas=new String[10];
        for (int i = 0; i<10;i++)
        {
            mas[i]="+79842214"+i;
        }
        Phone ph1=new Phone("+799999184","Motrolla", 232.2);
        Phone ph2=new Phone("+799353184","HTC", 202.2);
        Phone ph3=new Phone("+723523532","OnePlus",240.3);
        ph1.show();
        ph2.show();
        ph3.show();
        ph1.recieveCall("1");
        ph2.recieveCall("2");
        ph3.recieveCall("3");
        ph1.getNumber();
        ph2.getNumber();
        ph3.getNumber();
        ph1.recieveCall("1","+89350");
        ph2.recieveCall("2", "+832350");
        ph3.recieveCall("3","+893532550");
        ph1.sendMessage(mas);

    }
}