package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int t = 0;
        int u = t + 1; //hour after time t

        int maxdif = 0;
        int difference;

        while (t <= 100)
        {
            difference = (u * (u - 20) * (u - 100) + 120000) - (t * (t - 20) * (t - 100) + 120000);

            if (difference > maxdif)
                maxdif = difference;
            t = t + 1;
        }

        System.out.println (maxdif);
    }
}
