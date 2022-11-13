import java.util.Random;
import java.util.Arrays;
public class Main {
    public static Random rd=new Random();
    public static void main(String[] args)
    {
        int size= rd.nextInt(0,1000);
        double[] mas=new double[size];
        System.out.print("Изначальный массив: ");
        for(int i =0; i<size;i++)
        {
            mas[i]=Math.random()*1000;
            System.out.print(mas[i]+ " ");
        }
        Arrays.sort(mas);
        System.out.print('\n'+"Отсортированный массив: ");
        for(int i =0; i<size;i++)
        {

            System.out.print(mas[i]+" ");
        }

    }

}