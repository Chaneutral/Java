package d9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MailSender sender = new MailSender();
			
		MessageUI ui = new MessageUI(scanner, sender);
		
		ui.doJob();
		
	}
	
}
