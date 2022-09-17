package CarProject;
import CarProject.Vehicle; 
import static java.lang.System.out;
/*
This file will contain the output section for printing objects 
of type vehicle. 
*/

public class Output {


    public static void main(String[] args) {
       
       Vehicle item1 = new Vehicle(); 
       Vehicle item2 = new Vehicle(); 
       
       item1.name = "Toyota";
       item1.modelYear = 2020; 
       item1.milesDriven = 120.00; 
       System.out.println("Description below ");
       System.out.println("");
       item1.returnInfo();
       
       item2.name = "Nissan"; 
       item2.modelYear = 2022; 
       item2.milesDriven = 40.00;
        System.out.println("Description below");
        System.out.println("");
        item2.returnInfo();
       
       
    }
    
}
