import java.util.*;
class SequenceTes{
   public static void main(String[] args){
   int i=0,j=0,a1=0,b1=0;
   Scanner sc= new Scanner(System.in);
   DoubleArraySeq a= new DoubleArraySeq();
   DoubleArraySeq b= new DoubleArraySeq(5);
   DoubleArraySeq c;

   while(i!=16)
   {
         System.out.println(
        "1.	Print the sequences of A and B (uses toString( ) )"+"\n"+
        "2.	Report the capacity of A and B (uses getCapacity( ) )"+"\n"+
        "3.	Report if A and B are equal (uses equals( ) )"+"\n"+
        "4.	Change active sequence (default is A)"+"\n"+
        "5.	Add a number to the front of a sequence ( uses addFront( ) )"+"\n"+
        "6.	Set the current element location (uses setCurrent( ) )+"+"\n"+
        "7.	Add a number before the current element (uses addBefore( ) )"+"\n"+
        "8.	Add a number after the current element (uses addAfter( ) ) "+"\n"+
        "9.	Add a number to the end of a sequence (uses addEnd( ) )"+"\n"+
        "10. Add sequence B to end of A (uses addAll( ) )"+"\n"+
        "11. Delete a number at a certain index ( uses setCurrent( ) and removeCurrent( ) )"+"\n"+
        "12. Delete the first number from the sequence (uses removeFront( ) )"+"\n"+
        "13. Display a number at a certain index (uses getElement( ) )"+"\n"+
        "14. Display the last element in the sequence(setCurrentLast( ) and getElement( ) )"+"\n"+
        "15. Create a new sequence using concatenate of B and A and show"+"\n"+
        "16. Quit");
        i=sc.nextInt();
        
       switch(i){
         case 1  :System.out.println(a+"\n"+b);
                  break;       
         case 2  :a1=a.getCapacity();
                  b1=b.getCapacity();
                  System.out.println(a1+"\n"+b1);
                  break;
         case 3  :System.out.println(a.equals(b));
                  break;
         case 4  :a.addFront(i);
                  System.out.println(a);
                  break;
         case 5 : System.out.println(a.getCurrent());
                  break;        
         case 6  :a.setCurrent(3);
                  System.out.println(a.getCurrent());
                  break;
         case 7  :j=sc.nextInt();
                  a.addBefore(j);
                  System.out.println(a);
                  break;
         case 8  :j=sc.nextInt();
                  a.addBefore(j);
                  System.out.println(a);
                  break;
         case 9  :j=9;
                  //a.addEnd(j);
                  System.out.println(a);
                  break;
         case 10 :a.addAll(b);                 
                  System.out.println(a);
                  break;
         case 11 :a.setCurrent(j);
                  //a.removCurrent();
                  System.out.println(a);
                  break;
         case 12 :System.out.println(a);
                  a.removeFront();
                  System.out.println(a);
                  break;
         case 13 :System.out.println(a.getElement(j));
                  break;
         case 14 :a.setCurrentLast();
                  System.out.println(a.getElement(a.getCapacity()-1));
                  break;
         case 15 ://c=concatenation(a,b);
                  System.out.Println(c);
                  break;
         }
        
     }
     
   }
}
 