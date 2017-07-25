package tr.linux.kamp.account;

public class AccountApp {
	public static void main(String[] args) {
		Account myAccount = new Account("Fatih ERDAL", 500);	//parametreler doğru girildiği için hatasız olarak name için fatih ERDAL balance için 500 atar.
		Account myAccount2 = new Account("Yavuz ÇEtin", 300);	//parametreler doğru girildiği için hatasız olarak name için Yavuz ÇETİN balance için 300 atar.
				//parametreler eksik balance yok.
System.out.println(myAccount.getBalance());		//ekrana yazdırıldı.
myAccount.setName("Kerim Çaplı");				//setName metoduyla private name değişkeni Kerim çaplı yapıldı.
System.out.println(myAccount.getName());		//ekrana yazdırıldı.
System.out.println(myAccount.getBalance());		//ekrana yazdırıldı.
	}

}
