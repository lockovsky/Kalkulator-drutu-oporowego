package opor;
import java.util.*;
import java.util.Scanner;

public class kalkulator {
	public static void main(String[] Args) {
		
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Podaj wymagan� moc: ");
		double moc = in.nextDouble();
		
		System.out.print("Podaj wymagane napi�cie pracy spirali: ");
		double napiecie = in.nextDouble();
		
		System.out.print("Podaj grubo�� drutu: ");
		double grubosc = in.nextDouble();
		
		System.out.print("Podaj oporno�� drutu: ");
		double oporkat = in.nextDouble();
		
		double oporspir = (napiecie * napiecie) / moc;
		double dludrut = (oporspir / oporkat);
		double poldrut = 2 * 3.14 * (grubosc / 20) * 100;
		double polcal =  poldrut * dludrut;
		double obcpow = moc / polcal;
		
		System.out.println("Op�r spirali: " + oporspir + " Ohm");
		System.out.println("D�ugosc drutu potrzebna do wykonania spirali: " + dludrut + " m");
		System.out.println("Pole powierzchni jednego metra drutu: " + poldrut + " cm2");
		System.out.println("Pole ca�kowite: " + polcal + " cm2");
		System.out.println("Obciazenie powierzchniowe: " + obcpow + " W/cm2");
		
	
	}
	

}
