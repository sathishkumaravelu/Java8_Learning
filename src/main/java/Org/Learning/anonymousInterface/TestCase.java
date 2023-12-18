package Org.Learning.anonymousInterface;

import org.junit.Test;

public class TestCase {

    @Test
    public void testAnonymousInterface(){
        IDataProvider obj = new IDataProvider() {
            @Override
            public String fetchData() {
                return "data from anonyms Interface";
            }
        };

        String s = obj.fetchData();
        System.out.println(s);

    }
}
