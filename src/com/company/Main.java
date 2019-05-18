package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Var> buf;
        ArrayList<Var> vars = new ArrayList<>();
        vars.add(new Var(1));
        for (int i = 1; i < 9; i++) {
            buf = new ArrayList<>();
            for (int j = 0; j < vars.size(); j++) {
                buf.add(new Var(vars.get(j), "+", i + 1));
                buf.add(new Var(vars.get(j), "-", i + 1));
                buf.add(new Var(vars.get(j), "", i + 1));
            }
            vars = buf;
        }
        String variable;
        for (Var var: vars)
        {
            variable = var.toString();
            if(RPN.calc(variable)==100L) {
                System.out.println(variable);
            }
        }
    }
}
