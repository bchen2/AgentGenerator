/**
 * 
 */
package agents;

/**
 * @author Anish
 *
 */
public class Capabilities {


	private double Quality;

	
	public double getQuality() {
		return Quality;
	}
	
	public void setQuality(double quality) {
		Quality = quality;
	}
	
	public void MakeAgentWithQualityBetween(double MinQuality, double MaxQuality){
		
		this.Quality = round1d(MinQuality+Math.random()*(MaxQuality-MinQuality));
		
	}


	
	public static double round1d(double a){
		return a;
	}//end of method
}
