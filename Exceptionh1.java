//Exception handling
class Exceptionh1{
    public static void main(String args[]){
        try{
        System.out.println(100/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        String s1=null;
        try{
            System.out.println(s1.length());

        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("hiiii");
    }
}