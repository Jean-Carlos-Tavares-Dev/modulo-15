package Factory;

public class CompanyCarFactory extends Factory {
	Car retrieveCar ( String requestedGrade) {
		switch(requestedGrade) {
		case "A":
			return new Tesla (1000,"full",  "blue");
		case "B":
			return new Audi (800,"full","blue");
		default:
			System.out.println("the requested car was unfortunately not available,");
			return null;
		}
	}

}
