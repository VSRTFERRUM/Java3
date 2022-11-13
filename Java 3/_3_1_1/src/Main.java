public class Main {
    public static void main(String[] args)
    {
       Double n= Double.valueOf(3.14);
       String s=new String("2142.421");
       Double sd=Double.parseDouble(s);
       short sh =sd.shortValue();
       int in=sd.intValue();
       long lo=sd.longValue();
       float fl=sd.floatValue();
       byte by=sd.byteValue();
       System.out.println(sd+" " + in+ " "+lo+" "+fl+ " " +by);
       String st=n.toString();
    }
}