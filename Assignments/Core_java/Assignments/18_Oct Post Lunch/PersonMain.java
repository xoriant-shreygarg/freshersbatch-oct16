import java.util.*;
class Person/* implements Comparable<Person>*/{
	private String name;
	private int heightInInches;
	private int weight;
	
	public String getName(){
		return this.name;
	}
	
	public int getHeightInInches(){
		return this.heightInInches;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public Person(String name, int heightInInches, int weight){
		this.name = name;
		this.heightInInches = heightInInches;
		this.weight = weight;
	}
	
	public String toString(){
		return "Name : "+this.name+" Height : "+this.heightInInches+" Weight : "+this.weight;
	}
	
	public int compareTo(Person p){
		if(this.getWeight()>p.getWeight())
			return -1;
		else if(this.getWeight()<p.getWeight())
			return 1;
		else return 0;
	}
}
class PersonMain{
	public static void main(String args[]){
		List<Person> p = new ArrayList<>();
		p.add(new Person("A",132,56));
		p.add(new Person("B",146,85));
		p.add(new Person("C",176,78));
		//Collections.sort(p, new SortPersonHeight());
		Collections.sort(p, new Comparator<Person>(){
			public int compare(Person p2, Person p1){
			if(p2.getWeight()>p1.getWeight())
				return -1;
			else if(p2.getWeight()<p1.getWeight())
				return 1;
			else return 0;
			}
		});
		for(Person tempPerson : p){
			System.out.println(tempPerson);
		}
	}
}

class SortPersonWeight implements Comparator<Person>{
	
	public int compare(Person p2, Person p1){
	if(p2.getWeight()>p1.getWeight())
		return -1;
	else if(p2.getWeight()<p1.getWeight())
		return 1;
	else return 0;
	}
	
}
class SortPersonHeight implements Comparator<Person>{
	
	public int compare(Person p1, Person p2){
	if(p2.getHeightInInches()>p1.getHeightInInches())
		return -1;
	else if(p2.getHeightInInches()<p1.getHeightInInches())
		return 1;
	else return 0;
	}
	
}