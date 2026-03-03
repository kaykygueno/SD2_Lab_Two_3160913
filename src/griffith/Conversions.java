package griffith;

public class Conversions {
	
	//Adding stubs methods each specific to the test cases in ConversionsTest.java
	
	//Multiply the euro value by 1.08 to convert to dollars
    public double euroToDollar(double euro) {
        return euro * 1.08;
    }

    //Divide the dollar value by 1.08 to convert to euro
    public double dollarToEuro(double dollar) {
        return dollar / 1.08;
    }

    //Convert the string to an integer using Integer.parseInt, return 0 if the string is null or empty, or if it cannot be parsed as an integer
    public int stringToInteger(String val) {
        if (val == null || val.isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    //Convert the integer to a string using String.valueOf
    public String integerToString(int val) {
    	return String.valueOf(val);
    }
    
    //Switch the case of each character in the string, return null if the input string is null
    public String switchCase(String val) {
    	if (val == null) {
            return null;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); 
            }
        }
        
        return result.toString();
    
    }
    
}
