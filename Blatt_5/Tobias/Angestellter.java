class Angestellter {
/*
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
*/	
	protected String vorname; //protected kann von extending Klassen noch aufgerufen werden
	protected String nachname;
	protected int alter;
	protected int gehalt;
	
	public String getVorname(){
		return this.vorname;
	}
	public String getNachname(){
		return this.nachname;
	}
	public int getAlter(){
		return this.alter;
	}
	public int getGehalt(){
		return this.gehalt;
	}
	
	public Angestellter(String vnam, String nnam, int alter, int gehalt)
	{
		this.vorname=vnam;
		this.nachname=nnam;
		this.alter=alter;
		this.gehalt=gehalt;
	}
	
	public void altern()
	{
		++this.alter;
	}
	
	public void gherh(int betrag){
		this.gehalt=this.gehalt+betrag;
	}
}