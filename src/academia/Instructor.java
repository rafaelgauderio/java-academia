package academia;

public class Instructor extends People implements Wallet {

	private String code;
	
	public Instructor(String name, int age, String code) {
		super(name, age);
		this.code = code;
	}
	
	public Instructor(String name, int age) {
		super(name, age);

	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Instructor " + super.toString() + "[Wallet code=" + code + "]";
	}

}
