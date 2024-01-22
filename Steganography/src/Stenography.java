import java.awt.Color;

public class Stenography {

	

	/**
	* Clear the lower (rightmost) two bits in a pixel.
	*/
	public static void clearLow( Pixel p )
	{
	
	int red = p.getRed();
	int blue = p.getBlue()%100;
	int green = p.getGreen()%100;
	
	for(int i = 0; i <  String.valueOf(red).length(); i++) {
		String
	}

	p.setRed(red);
	p.setBlue(blue);
	p.setGreen(green);

		}	
	public static Picture testClearLow(Picture pic) {
		
	return pic;
		
	}
	/**
	* Set the lower 2 bits in a pixel to the highest 2 bits in c
	*/
	public static void setLow (Pixel p, Color c)
	{
	/* To be implemented */
	String bit = "";
	
		
		
	}
	
	
    public static void main(String[] args) 
    {
    	Picture beach = new Picture ("beach.jpg");
    	beach.explore();
    	Picture copy = testClearLow(beach);
    	copy.explore();
    	
    }
	}
	
	
	
	

