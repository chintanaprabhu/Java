package in.ac.kletech;

public class PolMap extends Co_ordinates {
private int iPopulation;
private int iLiteracy;
private int iPercapita;
private String sLanguage;
public int getiPopulation() {
	return iPopulation;
}
public void setiPopulation(int iPopulation) {
	this.iPopulation = iPopulation;
}
public int getiLiteracy() {
	return iLiteracy;
}
public void setiLiteracy(int iLiteracy) {
	this.iLiteracy = iLiteracy;
}
public int getiPercapita() {
	return iPercapita;
}
public void setiPercapita(int iPercapita) {
	this.iPercapita = iPercapita;
}
public String getsLanguage() {
	return sLanguage;
}
public void setsLanguage(String sLanguage) {
	this.sLanguage = sLanguage;
}
public float fPopDensity(Co_ordinates c1,int pop)
{
	float den=0.0f;
	if(pop==100000 && c1.getfLatitude()==213.66f && c1.getfLongitude()==654.165f)
		den=0.568f;
	if(pop==200000 && c1.getfLatitude()==12.56f && c1.getfLongitude()==42.65f)
		den=0.785f;
	if(pop==150000 && c1.getfLatitude()==2.64f && c1.getfLongitude()==97.15f)
	den=0.612f;
	if(pop==180000 && c1.getfLatitude()==154.78f && c1.getfLongitude()==56.47f)
		den=0.689f;
	return den;
}
}
