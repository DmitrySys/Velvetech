package com.company;


import java.util.Stack;

public class Var
{
    Var left;
    long right;
    String operand;
    boolean isSimple = false;
    Var(int var)
    {
        right = var;
        isSimple = true;
    }
    Var(Var left,String operand,int right)
    {
        this.right = right;
        this.operand = operand;
        this.left = left;
    }
    public String toString()
    {
        return isSimple ? String.valueOf(right) : left.toString()+operand+right;
    }
}
