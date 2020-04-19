import java.util.Scanner;

public class Marks {
    public static void main(String[]  args){
        
        
        double sum = 0;
        double average = 0;
        int max = 0;
        int min = 0;
       int n = 0;
        System.out.print("How many students are there? ");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        
           sc.nextLine();
        int[] no = new int[in]; 
        String[] name = new String[in];
         
        for (int i = 0; i != in; i++) {
        System.out.print("Enter name of student " +(n + 1)  + ": ");
        name[i] = sc.nextLine();
   
        System.out.print("Enter mark " + (n+1) + ": " ); 
        
        no[i] = sc.nextInt(); 
          n++;
             sc.nextLine();
        }

        for (int i = 0; i != in; i++) {
            sum += no[i];}
		
	
	 average = sum/(in);
	 

     int maxNo = no[0];
     for (int i = 0; i != in; i++) {
       if(no[i] > maxNo){
        maxNo = no[i];
        max = i;
       }
     }
     int minNo = no[0];
     for (int i = 0; i != in; i++) {
        if(no[i] < minNo){
         minNo = no[i];
         min = i;
        }
      }

     
     
     System.out.println("The average mark is: " + average );

     System.out.println("The best student is " + name[max]);

     System.out.println("The worst student is " + name[min]);
    }
}
