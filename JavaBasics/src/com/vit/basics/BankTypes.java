package com.vit.basics;

class Bank {
	float rateOfInterest() {
		return 0;
	}
}

class HDFC extends Bank {
	float rateOfInterest() {
		return 8;
	}
}

class BOB extends Bank {
	float rateOfInterest() {
		return 9;
	}
}

class SBI extends Bank {
	float rateOfInterest() {
		return 10;
	}
}

class ICICI extends Bank {
	float rateOfInterest() {
		return 11;
	}
}

class BOM extends Bank {
	float rateOfInterest() {
		return 12;
	}
}

public class BankTypes {
	public static void main(String[] args) {
		Bank hdfc = new HDFC();
		Bank bob = new BOB();
		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank bom = new BOM();
		
		System.out.println("Interest rate of HDFC Bank: "+ hdfc.rateOfInterest());
		System.out.println("Interest rate of BOB Bank: "+ bob.rateOfInterest());
		System.out.println("Interest rate of SBI Bank: "+ sbi.rateOfInterest());
		System.out.println("Interest rate of ICICI Bank: "+ icici.rateOfInterest());
		System.out.println("Interest rate of BOM Bank: "+ bom.rateOfInterest());
	}
}
