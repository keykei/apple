public class Apple
{
    	private double v0, theta, time;
    
    	public Apple() { }
    
    	public void setV0(double v0) { this.v0 = v0; }
    	public void setTheta(double theta) { this.theta = theta; }
    	public void setTime(double time) { this.time = time; }
    
	public double getX() 
	{
		return v0 * time;
    	}
   	
	public double getY()  	
  	{
    		return 0.5 * 9.8 * time * time;
	}
	
}
