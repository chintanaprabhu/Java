package in.ac.kletech;

public class Co_ordinates {
private float fLatitude;
private float fLongitude;

public float getfLatitude() {
	return fLatitude;
}
public void setfLatitude(float fLatitude) {
	this.fLatitude = fLatitude;
}
public float getfLongitude() {
	return fLongitude;
}
public void setfLongitude(float fLongitude) {
	this.fLongitude = fLongitude;
}
public String sFindLocation(Co_ordinates c)
{
	String loc=new String();
	if(c.getfLatitude()==12.56f && c.getfLongitude()==42.65f)
		loc="Hubli";
	else if(c.getfLatitude()==2.64f && c.getfLongitude()==97.15f)
		loc="Dharwad";
	else if(c.getfLatitude()==213.66f && c.getfLongitude()==654.165f)
		loc="Sirsi";
	else if(c.getfLatitude()==154.78f && c.getfLongitude()==56.47f)
		loc="Belgaum";
	return loc;
}
public float fArea(Co_ordinates c1)
{
	float area=0.0f;
	if(c1.getfLatitude()==12.56f && c1.getfLongitude()==42.65f)
		area=205489f;
	else if(c1.getfLatitude()==2.64f && c1.getfLongitude()==97.15f)
	    area=56554f;
	else if(c1.getfLatitude()==213.66f && c1.getfLongitude()==654.165f)
	area=568276f;
	else if(c1.getfLatitude()==154.78f && c1.getfLongitude()==56.47f)
		area=112568f;
		return area;
}

}
