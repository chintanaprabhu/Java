package in.ac.kletech;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GeoMap g1=new GeoMap();
PolMap p1=new PolMap();
g1.setfLatitude(12.56f);
g1.setfLongitude(42.65f);
g1.setfTemp(30.0f);
g1.setsTypeofSoil("Black soil");
g1.setsWeather("Moderate");
p1.setfLatitude(2.64f);
p1.setfLongitude(97.15f);
p1.setiLiteracy(40);
p1.setiPercapita(21);
p1.setiPopulation(150000);
p1.setsLanguage("Kannada");
System.out.println("Location "+p1.sFindLocation(p1));
System.out.println("Area "+p1.fArea(p1));
System.out.println("population density "+p1.fPopDensity(p1, 150000));
System.out.println("crop grown: "+g1.sTypeofcrop("Black soil"));

	}

}
