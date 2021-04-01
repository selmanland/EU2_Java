package day16_classObjects;

public class BestBuy {

	public static void main(String[] args) {
		
		cellPhone phone1 = new cellPhone();
		
		System.out.println(phone1.brand);
		System.out.println(phone1.screenSize);
		
		phone1.brand = "Nokia 6300";
		phone1.screenSize = 2.0;
		phone1.color = "Silver";
		phone1.price = 76.16;
		
		System.out.println(phone1.brand);
		System.out.println(phone1.screenSize);
		System.out.println(phone1.color);
		System.out.println(phone1.price);
		
		phone1.color ="Black";
		System.out.println(phone1.color);
		
		cellPhone phone2 = new cellPhone();
		
		phone2.brand = "Huawei";
		phone2.screenSize = 3.1;
		phone2.color = "Red";
		phone2.price = 59.99;
		
		System.out.println("###CELL 2 VALUES###");
		System.out.println("Brand: " + phone2.brand);
		System.out.println("ScreenSize: " + phone2.screenSize);
		System.out.println("Color: " + phone2.color);
		System.out.println("Price: " + phone2.price);
		
		System.out.println("### Calling Methods ###");
		
		phone1.call();
		phone1.message();
		phone1.takeAphoto();
		
		phone2.call();
		phone2.message();
		phone2.takeAphoto();

	}

}
