package Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BanqueService bs=new BanqueService();
    double resbs=bs.conversion(12.00);
    System.out.println("Le résultat est: "+ resbs);
    
 
    Compte cc= new Compte(5,234353,"19/10/2023");
    System.out.println(cc.getCompte(cc));

}
}
