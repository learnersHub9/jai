package com.jai;
public class Statik {
    static int staticVar=20;
    int nonStatic =40;
    int x=staticVar* nonStatic;
    
    static void staticMul(){
        int c;
        c=staticVar*new Statik().nonStatic;
        System.out.println("static mul is : "+c);
    }
    
    void nonStaticMul(){
        int c =staticVar* nonStatic;
        System.out.println("nonstatic mul is : "+c);
        //staticAdd();
    }
    public static void main(String args[]){
        Statik s=new Statik();

        staticVar=30;
        s.nonStatic =90;
        
        s.nonStaticMul();
        staticMul();

        System.out.println(s.x);

    }
}