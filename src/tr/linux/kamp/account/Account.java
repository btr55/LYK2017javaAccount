package tr.linux.kamp.account;

public class Account {
private String name;	//isim tanımladık. dişardan erişilemez.
private double balance;	//bakiye tanımladık. dişardan erişilemez.

public Account(String name, double balance) {
	this.name=name;
	
	if (balance > 0.0) {		//balance değeri sıfırdan büyükse burda gelen değeri private olan balance değerine at.
		this.balance=balance;
	}
}
public Account(){
	
}

public void deposit (double depositAmount) {
	if (depositAmount>0.0){
		balance=balance +depositAmount;
	}
}
public double getBalance() {   //getter tanımladık. dışardan erişilebilir balance değeri döndürür.
	return balance;
}
public String getName() {		 //getter tanımladık. dışardan erişilebilir name değeri döndürür.
	return name;
}
public void setName (String name) {		 //setter tanımladık. dışardan erişilebilir name değeri döndürür.
	this.name=name;
}
}

