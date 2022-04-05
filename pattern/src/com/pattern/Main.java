package com.pattern;

import com.pattern.facade.ShapeMaker;
import com.pattern.strategy.Context;
import com.pattern.strategy.OperationAdd;
import com.pattern.strategy.OperationMultiply;
import com.pattern.strategy.OperationSubstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.print("Pentru a testa strategy(calcul de numere) apasati 1, iar pentru face(shape chooser) apasati 2 si pentru oprire, apasati 3: ");
            int a=sc.nextInt();
            if (a == 1) {
                System.out.print("Introduceti 2 numere: ");
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.print("Pentru a le aduna, tasta 1, pentru scadere 2, inmultire 3: ");
                int op = sc.nextInt();
                if (op == 1) {
                    Context context = new Context(new OperationAdd());
                    System.out.println(context.executeStrategy(b, c));
                } else if (op == 2) {
                    Context context = new Context(new OperationSubstract());
                    System.out.println(context.executeStrategy(b, c));
                } else if (op == 3) {
                    Context context = new Context(new OperationMultiply());
                    System.out.println(context.executeStrategy(b, c));
                }
            }
            else if(a==2)
            {
                System.out.print("Pentru a alege cercul 1, dreptunghi 2, patrat 3: ");
                int op = sc.nextInt();
                ShapeMaker shapeMaker = new ShapeMaker();
                if(op==1)
                    shapeMaker.chooseCircle();
                else if(op==2)
                    shapeMaker.chooseRectangle();
                else if(op==3)
                    shapeMaker.chooseSquare();
            }
            else if (a==3)
            {
                break;
            }
        }
    }
}
