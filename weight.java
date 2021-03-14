import java.util.*;
public class weight{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the height in feet and inches:");
        double h=s.nextDouble();
        System.out.println("enter the weight in kgs:");
        double w=s.nextDouble();
        double hi=h*30.48;
        System.out.println("your height in cms is"+ hi);
        
    }
}