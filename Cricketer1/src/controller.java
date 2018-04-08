
public class controller {
    private String name;
	private int age;
	private String country;
	private int numberofrun;
	private int numberofwicket;
	private int numberofmatch;
	
	public controller(String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void increasingRun(int runs)
	{
		numberofrun +=runs;
	}
	
	public void increasingwicket(int wickets)
	{
		numberofwicket += wickets;
	}
	public void increasingmatch(int matchs)
	{
		numberofmatch += matchs;
	}
	
	public void printinfo()
	{
		System.out.println("Player name is: "+name);
		System.out.println("Player age is: "+age);
		System.out.println("player country is: "+country);
		System.out.println("Number of runs : "+numberofrun);
		System.out.println("Number of wickets : "+numberofwicket);
		System.out.println("Number of matchs : "+numberofmatch);
	}
    
}
