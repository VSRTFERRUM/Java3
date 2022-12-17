package com.spesce.rpn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите '.exit' для завершения программы");
        String inp = "";
        Scanner inpScan = new Scanner(System.in);

        while(inp != ".exit")
        {
            inp = inpScan.nextLine();
            try{
                System.out.println(com.spesce.rpn.RPN.evaluate(inp));
            } catch(Exception e)
            {
                System.out.println("Неверный ввод");
            }

        }
    }
}
