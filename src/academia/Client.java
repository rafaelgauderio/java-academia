package academia;

public class Client extends People {

	private Equipment equipment;

	public Client(String name, int age, Equipment equipment) {
		super(name, age);
		this.equipment = equipment;

	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		return "\nClient: "+ super.toString()+ "[Equipment used= " + equipment;
	}
	
	

}
