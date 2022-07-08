package ThisAndSuperKeyword;

public class ThisDemo 
{
	int id;
	String name;
	float per;
	public ThisDemo(int id,String name,float per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
		//System.out.println("id="+id+"\tname="+name+"\tper="+per);
		
	}
	public String toString()
	{
		return "id="+id+"\tname="+name+"\tper="+per;
	}

	public static void main(String[] args)
	{
		ThisDemo t=new ThisDemo(1, "shankar",12.7f);
         System.out.println(t);
	}

}
