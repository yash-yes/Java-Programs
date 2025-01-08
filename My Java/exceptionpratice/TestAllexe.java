package exceptionpratice;
class TestFinally{
    void test1(int x) throws IllegalAccessException
  {
    try{
        System.out.println("Test1 method x = : " +x );
        throw new IllegalAccessException("Illegal Access Exception caught ");
    }

    finally{
        System.out.println("Finally block test 1");
    }
 }
void test2(int x){
    try{
        System.out.println("Test 2 method x = " + x);
        return;
    }
    finally{
        System.out.println("Finally block test 2");
    }
}
}

public class TestAllexe {
    public static void main(String[] args) {
        TestFinally ob1 = new TestFinally();
            try{
                ob1.test1(44);
            }
            catch(IllegalAccessException e)
            {
                    System.out.println("Exception caught " + e);

            }
            ob1.test2(444);
            System.out.println(("End of these program "));
    }
    
}
