import java.awt.Color;

public class Stenography {

	

	/**
	* Clear the lower (rightmost) two bits in a pixel.
	*/
	public static void clearLow( Pixel p )
	{
	int[] bitg = new int[40];
	int[] bitb = new int[40];
	int[] bitr = new int[40];
		
	int red = p.getRed();
	int blue = p.getBlue();
	int green = p.getGreen();
	
	for(int i = 0; red > 0;i++) {
	bitr[i] = red%2;
	red = red/2;
	}
	
	for(int i = 0; blue > 0;i++) {
	bitb[i] = blue%2;
	blue = blue/2;
	}
	
	for(int i = 0; green > 0;i++) {
	bitg[i] = green%2;
	green = green/2;
	}
	

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
	
	
	
	

