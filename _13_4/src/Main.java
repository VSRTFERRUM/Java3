import javax.swing.*;

class Shirt
{
    String size;
    String type;
    String color;
    int count;
    Shirt(String str)
    {
        String split[]=str.split(",");
        count=Integer.parseInt(split[0].substring(2));
        type = split[1];
        color = split[2];
        size = split[3];

    }

    @Override
    public String toString() {
        return (size+" "+type+" "+color+" "+count);
    }
}
public class Main {
    public static void main(String[] args)
    {
    Shirt[] s= new Shirt[11];
        String[] shirts=new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (int i = 0 ; i < 11; i++)
        {
            s[i]= new Shirt(shirts[i]);
            System.out.println(s[i].toString());
        }
    }
}