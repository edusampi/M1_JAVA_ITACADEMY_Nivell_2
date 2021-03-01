
public class Nivell2 {

	public static void main(String args[]) {
	
		double d = 0.0123; 
        int a = 0;
        float b = 0;
        String c = "";
        
//CASTINGS ------------------------------------------------
        
        a = (int)d;    			// Casting de int
        b = (float)d;  			// Casting de float
        c = String.valueOf(d);	// Casting de String
        
        System.out.println(a);  
        System.out.println(b);
        System.out.println(c);
}
}