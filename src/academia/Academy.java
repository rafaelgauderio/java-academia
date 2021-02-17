package academia;

public class Academy {

	public static void main(String[] args) {

		Equipment dumbbells = new Equipment("Dumbbells");
		Equipment station = new Equipment("Weight training station");
		Equipment bench = new Equipment("Bench press");
		Equipment belt = new Equipment("Running belt");
		
		
				
		People instructor = new Instructor("Rafael De Luca", 35,"2020-ALSDSOEE");
		
		
		People instructor2 = new Instructor("Julia Claire",43,"2019-JDAJDALSDSAO");
		
		
		People carla = new Client("Clarice Strong", 24, belt);
		People sara = new Client("Sara Taylo", 34, station);
		People sonya = new Client("Sonya Vanthunder", 45, dumbbells);

		People john = new Client("John Mayer", 56, bench);
		People carlos = new Client("Carlos Mallman", 32, belt);
		People jonatan = new Client("Jonatan Kliver", 47, dumbbells);

		Session saturday = new Session("2h:30min", instructor, carla, sara, sonya);
		Session sunday = new Session("23h:45min", instructor2, john, carlos, jonatan);

		System.out.println(dumbbells);

		System.out.println(saturday.toString());

		System.out.println(sunday.toString());

	}

}
