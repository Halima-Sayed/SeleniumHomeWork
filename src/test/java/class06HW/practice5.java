package class06HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;

public class practice5 extends CommonMethods {
    public static void tempCheck(int a){
        if(a<32){
            throw new RuntimeException(" It is freezing");
        }
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println();
        int temp=scan.nextInt();

        try{
            tempCheck(temp);
        }catch (RuntimeException e){
            System.out.println(e);
        }

    }
}