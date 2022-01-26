public class Example3 {
    public static void main(String arg[]) 
        { 
        String currency = "CSC1009"; 
        switch(currency) 
        { 
        case "CSC1006": 
        System.out.println("Mathmetics 2");
        break; 
        case "CSC1007": 
        System.out.println("Operating Systems");
        break; 
        case "CSC1008": 
        System.out.println("Data Structures and Algorithm");
        break; 
        case "CSC1009": 
        System.out.println("Object Oriented Programming");
        break; 
        case "CSC1010":
        System.out.println("Computer Networks");
        default: 
        System.out.println("idk man");
        break; 
        } 
        System.out.println("After switch"); 
        }
}
