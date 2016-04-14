import java.util.Scanner;

public class Item 
{
	String n;
	int c;
	double wt;
	double twt;
	double smod;
	double comod;
	double dmod;
	double inmod;
	double wmod;
	double chmod;
	public enum t={Weapon, Consumable, Re-usable, Quest};
	String desc;
	
	String setDesc()
	{
		Scanner Desc = new Scanner(System.in);
		desc = Desc.nextLine();
		Desc.close();
		return desc;
	}
	
	void ItemLog()
	{
		// Sets GSheet"ItemLog" to AllItems[][]
	}
	
}
