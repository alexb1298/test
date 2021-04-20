package com.localdate;

import org.apache.commons.lang3.StringUtils;

public class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        System.out.println();
        System.out.println("******   CHAPTER 2   ******");
        final Date date = new Date();
        final String someString="some string";
        date.showDate();
        System.out.println("In the next examples im using the Class String utils form apache commons");
        System.out.println("Comparing if 'null' equals 'null': "
                + StringUtils.equals(null, null));
        System.out.println("Comparing if 'null' equals 'some string': "
                + StringUtils.equals(null, someString));
        System.out.println("Comparing if 'some string' equals 'null': "
                + StringUtils.equals(someString, null));
        System.out.println("Comparing if 'some string' equals 'some string': "
                + StringUtils.equals(someString, someString));
        System.out.println("Comparing if 'some other string' equals 'some string': "
                + StringUtils.equals("some other string", someString));
    }
}
