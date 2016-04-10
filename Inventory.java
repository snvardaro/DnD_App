
public class Inventory 
{
	Item[] itm;
	int itmct;
	double smod=0;
	double comod=0;
	double dmod=0;
	double inmod=0;
	double wmod=0;
	double chmod=0;
	
	void getMods(Character Char)
	{
		Char.smod += this.smod;
		Char.comod += this.comod;
		Char.dmod += this.dmod;
		Char.inmod += this.inmod;
		Char.wmod += this.wmod;
		Char.chmod += this.chmod;
	}
	
	void addItem(Character Char, String iname)
    {
    	int irow;
    	int icol=0;
    	for(irow=0; irow < this.itmct; irow++)
    	{
    		if(AllItems[irow][icol] == iname)
    			
    		for(icol; icol < 11; icol++)
    		{
    			
    		}
    	}
    	Char.inv.itmct = this.itm.length;
    }
	
}
