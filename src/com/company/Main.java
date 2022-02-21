package com.company;

public class Main {

    public static void main(String[] args) {
        ok muk=new ok();
        System.out.println(muk.mahi(10));
        System.out.println("THIS IS TESTING PROGRAMME");
        System.out.println("THIS IS learn coding");
    }
    static class ok {
        int x;

        public int mahi(int x) {
            int area = x * x;
            return area;
        }
    }

}

