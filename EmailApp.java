
import java.util.*;
import java.io.*;

public class EmailApp{
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        var firstname = in.nextLine();
        System.out.print("Enter your Last name: ");
        var lastname = in.nextLine();
        Email em1 = new Email(firstname, lastname);
        System.out.println( em1.showInfo());
        try {    
		File newFile = new File("filename.txt");
		FileWriter fileWrite = new FileWriter(newFile, true);
		BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);
		PrintWriter write = new PrintWriter(bufferedWrite);
		if(newFile.exists() == false){
			newFile.createNewFile();
			write.print(em1.showInfo()+"\n\n");
			System.out.println("Info Successfully Saved!");
		}else{
            write.print(em1.showInfo()+"\n\n");
            System.out.println("\nInfo Successfully Saved!");
		}
		write.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
}
}