public class Main {
    enum refcompany
    {
        AMD, NVIDIA, INTEL
    }
    enum company
    {
        GYGABYTE, MSI, ZOTAC, ASUS;
    }
    enum memcompany
    {
        Patriot, Kingston, Sumsumg;
    }
    class Motherboard
    {
        String socket;
        String sizetype;
        company t;
    }
    class Processer
    {
        refcompany ref;
        String socket;
        int tdp;
        int power;
    }
    class GPU
    {
        refcompany ref;
        int tdp;
        int power;

    }
    class RAM
    {
        int size;
        double speed;
        int cl;
        memcompany m;
    }
    class Rom
    {
        memcompany m;
        int size;
        String type;
        double speed;
    }
    class bp
    {
        int watt;
        String standart;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}