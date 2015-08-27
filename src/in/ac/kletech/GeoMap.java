package in.ac.kletech;

public class GeoMap extends Co_ordinates{
private float fTemp;
private String sWeather;
private String sTypeofSoil;
public float getfTemp() {
	return fTemp;
}
public void setfTemp(float fTemp) {
	this.fTemp = fTemp;
}
public String getsWeather() {
	return sWeather;
}
public void setsWeather(String sWeather) {
	this.sWeather = sWeather;
}
public String getsTypeofSoil() {
	return sTypeofSoil;
}
public void setsTypeofSoil(String sTypeofSoil) {
	this.sTypeofSoil = sTypeofSoil;
}
public boolean bTypeTerr(Co_ordinates c1,Co_ordinates c2)
{
	
	return true;
}
public String sTypeofcrop(String soil)
{
	String type=new String();
	if(sTypeofSoil=="Black soil")
		type="cotton";
	if(sTypeofSoil=="Red soil")
		type="Maze";
	if(sTypeofSoil=="Alluvial soil")
		type="Wheat";
	if(sTypeofSoil=="Mountain soil")
	type="Coffee";
	return type;
}

}
