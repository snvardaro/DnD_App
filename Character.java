
public class Character 
{
    //Abilities
    String n; //name
    String r; //race
    String cl; //class
    double lvl; //level
    double s; //strength
    double smod; //str mod
    double co; //constitution
    double comod;
    double d; //dexterity
    double dmod;
    double in; //intelligence
    double inmod;
    double w; //wisdom
    double wmod;
    double ch; //charisma
    double chmod;
    //Encounter Info
    double ac; //armor class
    double i; //initiative
    double sp; //speed
    double thp; //total HP
    double chp; //current HP
    double dsuc; //death save successes
    double dfail; //death save fails
    //Skills
    double acr;
    double anh;
    double arc;
    double ath;
    double dec;
    double his;
    double ins;
    double intim;
    double inves;
    double med;
    double perc;
    double perf;
    double pers;
    double rel;
    double slh;
    double stl;
    double sur;
    //Item Info
    Inventory inv; //inventory (array of items)
    double cap; //carrying capacity
    
    void Character(String cname)
    {
    	n = cname;
    	lvl = 1;
    	setr();
    	setcl();
    	setabil();
    	sethp();
    	setsk();
    	setCap();
    	setinv();
    }
    
    String setr()
    {
    	out("Please select " + this.n + "'s race:\n");
    	
    	/*
    	out("\t1) Human");
    	out("\t2) Elf");
    	out("\t3) Halfling");
    	out("\t4) Orc");
    	in(String Race);
    	*/
    	int row;
    	int race;
    	do
    	{
	    	for(row=0; row < rList.length(); row++)
	    	{
	    		out("\t" + (row+1) + ") " + rList[row]);
	    	}
	    	out("Input: ");
	    	in(String Race);
	    	int race = Integer.toString(Race);
	    	if(race > 0 && race < rList.length())
	    	{
	    		this.r = rList[race].n;
	    	}
	    	else
	    	{
	    		out("\n\tIncorrect selection.  Please try again...\n");
	    	}
    	}
    	while(race > 0 && race < rList.length())
    	
    	return this.r;
    }
    
    String setcl()
    {
    	out("Please select " + this.n + "'s class:\n");
    	int row;
    	int clss;
    	do
    	{
	    	for(row=0; row < cList.length(); row++)
	    	{
	    		out("\t" + (row+1) + ") " + cList[row]);
	    	}
	    	out("Input: ");
	    	in(String Clss);
	    	int clss = Integer.toString(Clss);
	    	if(clss > 0 && clss < cList.length())
	    	{
	    		this.cl = cList[race].n;
	    	}
	    	else
	    	{
	    		out("\n\tIncorrect selection.  Please try again...\n");
	    	}
    	}
    	
    	return this.cl;
    } 
    
    void setabil()
    {
    	//based on other stats
    }
    
    void sethp()
    {
    	//this.thp = [stuff]a
    	//this.chp = this.thp;
    }
    
    void setsk()
    {
    	//Based on abilities, set the skills accordingly
    }
    
    void setinv()
    {
    	/*
    	 * for(int row=0; row < 2; row++)
    	 * {
    	 * 		for(int col=0; col < 11; col++)
    	 * 		{
    	 * 			this.inv.itm[row][col].add(AllItems[row][col]);
    	 * 			this.inv.itmct = this.inv.itm.size();
    	 * 		}
    	 * }
    	 * Array[][] = [GSheet:"AllItems"$A$0];
    	 * 
    	*/
    }
    
    double setCap()
    {
        cap = s*15;
        return cap;
    }
    
    //void dSave(dsuc, dfail)
    
}
