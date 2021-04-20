package com.task;

public class Argument
{    private static final String MESSAGE = "The argument number";
    private Argument() {
    }

    public static void main(final String[] args)
    {

        if (args.length >= 1)
            for (int index = 0; index < args.length; index++)
            {
                if ("-c".equals(args[index]))
                    System.out.println(MESSAGE + index + " -->"
                            + "I got you! You introduced " + args[index]);
                else if ("-d".equals(args[index]))
                    System.out.println(MESSAGE + index + " -->"
                            + "I got you! You introduced " + args[index]);
                else
                    System.out.println(MESSAGE + index + " -->"
                            + args[index]);

            }

        else
        {
            System.out.println("You didn't introduced arguments ");
            System.out.println("You can introduce arguments by putting them after 'java Argument arg1 arg2'");
        }

    }
}
