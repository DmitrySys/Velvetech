package com.company;

import java.util.*;

public class RPN {
    static String delimiters = "+-";
    static long calc(String infix)
    {
        StringTokenizer tokenizer = new StringTokenizer(infix, delimiters, true);
        String curr,prev = "0";
        long res = 0;
        while (tokenizer.hasMoreTokens())
        {
            curr = tokenizer.nextToken();
            if(curr.equals("+"))
            {
                if(!tokenizer.hasMoreTokens())
                    return -1;
                else
                {
                    res= Long.valueOf(prev) + Long.valueOf(tokenizer.nextToken());
                    prev = String.valueOf(res);
                }
            } else {
                if(curr.equals("-"))
                {
                    if(!tokenizer.hasMoreTokens())
                        return -1;
                    else
                    {
                        res= Long.valueOf(prev) - Long.valueOf(tokenizer.nextToken());
                        prev = String.valueOf(res);
                    }
                } else {
                    prev = curr;
                }
            }
        }
        tokenizer = null;
        curr = null;
        prev = null;
        return res;
    }
}
