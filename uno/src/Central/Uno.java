/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Central;


public class Uno {
    
    public static void main(String[] args) {
        
   for(int row = 1; row<= 15; row++)
   {
       for(int col= 1; col <=100; col++)
       {
           if((col>20&&col<=30)&&(row >1 &&row<=5))
           {
               System.out.print("x");
           }          
           
           else if((col >= 10 &&col < 40)&&(row>=5&&row<10))
           {
               System.out.print("0");
           }
           else if((col >= 10 &&col < 15)&&(row>=10&&row<15)||(col >= 35 &&col < 40)&&(row>=10&&row<15))
           {
               System.out.print("0");
           }
            else
                   {
                   System.out.print(" ");
                   }
           
        }
       System.out.print("\n");
   }
        
         
  
    
    }
}