package Consumer;

import java.util.function.Consumer;

class Movie{
	
	private String name;
	private String status;
	
	public Movie(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", status=" + status + "]";
	}
		
}
public class MovieExample {

	public static void main(String[] args) {
		
		Consumer<Movie> consumer=m->{
			System.out.println(m.getName()+"  is A Movie Name");
			System.out.println("Status of "+m.getName()+" Movies is "+m.getStatus());
		};

		Movie movie1=new Movie("Avatar", "Hit");
		Movie movie2=new Movie("Spider", "Flopped");
		
		consumer.accept(movie1);
		consumer.accept(movie2);
	}

}
