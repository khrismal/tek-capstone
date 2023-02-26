package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	


	public static void main(String[] args) {
		System.out.println(data("password"));
		System.out.println(data("expirationMonth"));
		System.out.println(data("PhoneNumber"));
	}
		
	
	public static String data(String input) {
		
		Faker faker = new Faker();
		
		String outPut = "";
		String password = faker.expression("#{regexify '[a-z][a-z][a-z][a-z][a-z][a-z][A-Z][1-5][@#$]'}");
				
				
		if (input.equals("firstName")) {
			outPut = faker.name().firstName();
		} else if (input.equals("lastName")) {
			outPut = faker.name().lastName();
		} else if (input.equals("email")) {
			outPut = faker.expression("#{letterify '?????@tekschool.us'}");
		} else if (input.equals("phoneNumber")) {
			outPut = faker.phoneNumber().cellPhone();
		} else if (input.equals("fullName")) {
			outPut = faker.name().fullName();
		} else if (input.equals("streetAddress")) {
			outPut = faker.address().streetAddress();
		} else if (input.equals("city")) {
			outPut = faker.address().city();
		} else if (input.equals("state")) {
			outPut = faker.address().state();
		} else if (input.equals("zipCode")) {
			outPut = faker.address().zipCode();
		}else if (input.equals("country")) {
			outPut = "United States";
		}else if(input.equals("apt")) {
			outPut = faker.address().secondaryAddress();
		}else if (input.equals("password")) {
			outPut = password;
		}else if (input.equals("cardNumber")) {
			outPut = faker.expression("#{numerify '################'}");
		}else if(input.equals("nameOnCard")) {
			outPut = faker.name().fullName();
		}else if (input.equals("expirationMonth")) {
			outPut = faker.expression("#{regexify '[1-9]'}");
		}else if (input.equals("expirationYear")) {
			outPut = faker.regexify("20(2|3){1}[3-9]{1}");
		}else if (input.equals("securityCode")) {
			outPut = faker.expression("#{numerify '###'}");
		} else if(input.equals("regPassword")) {
			outPut = faker.expression("#{regexify '[a-z][a-z][a-z][a-z][a-z][a-z][A-Z][1-5][@#$]'}");
		}
		
//		else if (input.equals("confirmPassword")) {
//			outPut = password;
//		}
		
//		String outPut = "";
//		if(input.equals("firstName")) {
//			outPut = faker.name().firstName();
//		}else if (input.equals("lastName")) {
//			outPut = faker.name().lastName();
//		}else if (input.equals("email")) {
//			outPut = faker.expression("#{letterify '????.????@tekschool.us'}");
////			outPut = faker.name().firstName() + "."+ faker.name().lastName()
////+ "@tekschool.us";		
//		}else if (input.equals("phoneNumber")) {
//			outPut = faker.phoneNumber().cellPhone();
//		}else if (input.equals("fullName")) {
//			outPut = faker.name().fullName();
//		}else if (input.equals("address")) {
//		outPut = faker.address().streetAddress();
//		}else if (input.equals("city")) {
//			outPut = faker.address().city();
//		}else if (input.equals("state")) {
//			outPut = faker.address().state();
//		}else if (input.equals("zipCode")) {
//			outPut = faker.address().zipCode();
//		}else if (input.equals("country")) {
//			outPut ="United States";
//		}else if (input.equals("apt")) {
//			outPut = faker.address().secondaryAddress();
//		}else
//			
//		outPut = faker.expression("#{numerify '##################'}");// numbers for card
		
		return outPut;
}
}
