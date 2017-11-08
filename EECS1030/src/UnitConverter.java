/**	This utility class facilitates conversion from metric units to
 *	imperial units.
 */
public class UnitConverter
{
	/** Represents the number of centimetres in an inch. */
	 public static final double CM_PER_INCH = 2.54;
	 public static final double KG_TO_POUNDS=2.2;
	 public static final double CELCIUS_TO_FARENHEIGHT=1.8;//*1.8 + 32
	 public static final double CELCIUS_TO_FARENHEIGHT_ADD=32;
	// Include additional constants here as needed.
	// Use the one above as a guide.
	;
	
	
	// This line prevents clients from instantiating the class.
	private UnitConverter() {}
	
	
	/**	Converts the passed value in centimetres to the corresponding
	 *	length in inches.
	 *	
	 *	@param cm A length in centimetres.
	 *	@return The passed length in inches.
	 */
	public static double cmToInches(double cm)
	{
		double result = cm / CM_PER_INCH;
		return result;
	}
	
	
	/**	Write a description here.
	 *	Use the method above as a guide.	
	 */
	public static double kgToPounds(double kg)
	{
		kg=kg*KG_TO_POUNDS;
		return kg;
		
	}
	
	
	/**	Write a description here.
	 *	Use the method above as a guide.	
	 */
	public static double cToFahrenheit(double c)
	{
		c=(c*CELCIUS_TO_FARENHEIGHT)+CELCIUS_TO_FARENHEIGHT_ADD;
		return c;
		
	}
}