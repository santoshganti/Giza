package edu.ocaguide.operators;

public class Java7 {
    private Exception ex;
    public Java7(Exception ex) {
         this.ex = ex;
    }
    public void throwException() throws Exception {
         System.out.println("Method started...");
         throw ex;
    }
    public static void main (String[] args) throws Exception {
         Java7 exObj = 
           new Java7(new UnsupportedOperationException());
         exObj.throwException();
         System.out.println("Method ended.");
    }
}