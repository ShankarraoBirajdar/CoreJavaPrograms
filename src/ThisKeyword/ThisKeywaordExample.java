package ThisKeyword;

public class ThisKeywaordExample {

	int id;
	String name;
	float per;
	
	public ThisKeywaordExample(int id,String name,float per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
		
	}
	public String toString()
	{
		return "id="+id+"\tname="+name+"\tper="+per;
	}

	public static void main(String[] args)
	{
		ThisKeywaordExample t=new ThisKeywaordExample(1, "shankar",12.7f);
         System.out.println(t);
	}
}
