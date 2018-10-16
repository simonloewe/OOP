/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw03a02;

/**
 *
 * @author Lion
 */
public class Demo {
    int number = 0;
    int number2 = 0;
    
    float kleineNummer = 0.9f;
    
    int height;
    int width;
    
    public void cToTenWithFor(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    
    public void cToTenWithDo(){
        do{
            System.out.println(number);
            number++;
        }while(number<=10);
    }
    
    public void cToTenWithWhile(){
        while(number2 != 11){
            System.out.println(number2);
            number2++;
        }
    }
    
    public void addtitionFloatWithWile(){
        while(kleineNummer < 1.0f){
            kleineNummer = kleineNummer + 0.000025f;
        }
    }
    
    public void printBox(final int hight, final int width){
        int widthTemp = width;
        int widthTemp2 = width;
        int hightTemp = hight;
        do{
            System.out.print("#");
            widthTemp = widthTemp - 1;
        }while(widthTemp > 0);
       
        int auslass = 2;
        
        do{
            System.out.println();
                System.out.print("#");
                
                for(int i = 2; i < width; i++){
                    System.out.print("-");
                }
                
                System.out.print("#");
                           
            hightTemp--;
        }while(hightTemp > 2);
        System.out.println();
         do{
            System.out.print("#");
            widthTemp2 = widthTemp2 - 1;
        }while(widthTemp2 > 0);
    }
}
