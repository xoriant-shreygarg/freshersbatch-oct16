abstract class Persistence{
	abstract void persist();
}
class FilePersistence extends Persistence{
	void persist(){
		System.out.println("data persisted into File");
	}
}
class DatabasePersistence extends Persistence{
	void persist(){
		System.out.println("data persisted into Database");
	}
}
class PersistenceFactory{
	public static Persistence getPersistence(){
		if(Math.random() < 0.5) return new FilePersistence();
		else return new DatabasePersistence();
	}
}
class PersistenceMain{
	public static void main(String args[]){
		for(int i=0;i<10;i++){
			Persistence p = PersistenceFactory.getPersistence();
			p.persist();
			System.out.println(p.getClass().toString().split(" ")[1]);
		}
	}
}