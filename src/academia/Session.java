package academia;

public class Session {

	private String duration;
	private People instructor;
	private People client;
	private People client2;
	private People cliente3;

	public Session(String duration, People instructor, People client, People client2, People cliente3) {
		super();
		this.duration = duration;
		this.instructor = instructor;
		this.client = client;
		this.client2 = client2;
		this.cliente3 = cliente3;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public People getInstructor() {
		return instructor;
	}

	public void setInstructor(People instructor) {
		this.instructor = instructor;
	}

	public People getClient() {
		return client;
	}

	public void setClient(People client) {
		this.client = client;
	}

	public People getClient2() {
		return client2;
	}

	public void setClient2(People client2) {
		this.client2 = client2;
	}

	public People getCliente3() {
		return cliente3;
	}

	public void setCliente3(People cliente3) {
		this.cliente3 = cliente3;
	}

	@Override
	public String toString() {
		return "\nSession \n[duration=" + duration + ", instructor=" + instructor + client + client2 + cliente3 ;
	}

	// I desire 1 instructor and three clients
	
	

}
