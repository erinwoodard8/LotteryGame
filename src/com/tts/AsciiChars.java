package com.tts;


public class AsciiChars
{

    public static void printNumbers(int num)
        {
        int i;

            for(i = 48; i <= 57; i++)
            {
                System.out.println((char)i);
            }
        }



    public static void printLowerCase(String name)
    {
        int i;

        for(i = 97; i <= 122; i++)
        {
            System.out.println((char)i);
        }

    }

    public static void printUpperCase(String name)
    {
        int i;

        for(i = 65; i <= 90; i++)
        {
            System.out.println((char)i);
        }
    }
}