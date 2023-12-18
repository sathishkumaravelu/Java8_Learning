package Org.Learning.anonymousClass;

import org.junit.Test;

public class testClass {

    @Test
    public void testAnonymousClass(){
   /*     Child obj = new Child();
        Parent obj2 = new Child();
        Parent obj3 = new Parent();
        System.out.println("parent object: ");
        obj3.findPartner();

        System.out.println("child object: ");
        obj.findPartner();
        System.out.println("child object with scope resticition of partent: ");
        obj2.findPartner();

        Parent obj1 = new Parent();{
            System.out.println("I find partner anonymously from anonymously class");
        };*/

        Child obj = new Child();
        obj.findPartner();


        Parent obj1 = new Parent();
        {
            System.out.println("I find partner anonymously from anonymously class");
        };
    }
}
