import java.util.Random;
public class Main {
    public static Random rd=new Random();
    static class Matrix
    {
        int is,js;
        int[][] matrix;
        Matrix (int is,int js)
        {
            this.is=is;
            this.js=js;
            matrix = new int[is][js];
           for (int i =0;i<is;i++)
           {
               for (int j =0;j<js;j++)
               {
               matrix[i][j]= rd.nextInt(50);
               }
           }
        }
        Matrix sum(Matrix b)
        {
            if ((js==b.js)&&(is==b.is))
            {
                Matrix c=new Matrix(is,js);
                for (int i =0;i<is;i++)
                {
                    for (int j =0;j<js;j++)
                        c.matrix[i][j]= matrix[i][j]+b.matrix[i][j];
                }
                return c;
            }
            else return new Matrix(0,0);
        }
        Matrix mult(int num)
        {

                Matrix c=new Matrix(is,js);
                for (int i =0;i<is;i++)
                {
                    for (int j =0;j<js;j++)
                        c.matrix[i][j]= matrix[i][j]*num;
                }
                return c;
            }
            void show ()
        {
            for (int i =0; i<is; i++)
            {
                for (int j =0; j<js ;j++)
                {
                    System.out.print(matrix[i][j]+" ");
                    if (j==js-1) System.out.println('\n');
                }
            }
        }
        Matrix mult(Matrix b)
        {
            if (js==b.is)
            {
                Matrix c = new Matrix(is,b.js);
                for(int i = 0; i<is;i++)
                {
                    for (int j= 0; j<b.js;j++)
                    {
                        c.matrix[i][j]=0;
                        for (int k= 0; k<js;k++)
                        {
                            c.matrix[i][j]+= matrix[i][k]*b.matrix[k][j];
                        }

                    }

                }
                return c;
            }
            return new Matrix(0,0);
        }
        }


    public static void main(String[] args)
    {
      Matrix a = new Matrix(3,2);
      Matrix c= new Matrix(3,2);
      Matrix b = new Matrix(2,3);
      a.show();
     b.show();
//     a.mult(4);
//     a.sum(c).show();
      a.mult(b).show();
    }
}