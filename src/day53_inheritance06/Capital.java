package day53_inheritance06;

public class Capital extends City{
	private long population;
	public int count=1;

	public Capital(int id, String name, long population) {
		super(id,name);
		this.population=population;
	}
	public void displayCount() {
		System.out.println("City count: "+ super.count);
		System.out.println("Capital count: "+ count);
	//have to write sueprotherwise it will usethe count in this class and not from the superclass
	}
	
	@Override
	public String toString() {
		return super.toString()+" population: "+population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public long getPopulation() {
		return population;
	}
}
