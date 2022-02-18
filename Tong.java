import java.util.Scanner;
public class Tong{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhap tien vay: ");
			double sotienvay = sc.nextDouble();
			System.out.print("Nhap lai suat:");
			double laisuat = sc.nextDouble();
			System.out.print("Nhap so nam");
			int sonam = sc.nextInt();
			double monthlyPayment;
			monthlyPayment = (sotienvay* laisuat)/(1-(1/(Math.pow((1+laisuat),(sonam*12)))));
			System.out.println ("MonthlyPayment:"+ monthlyPayment);
		}catch (Exception ex) {
			System.out.print("Sai du lieu");
}}}