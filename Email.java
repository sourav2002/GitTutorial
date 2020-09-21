import java.util.Scanner;
public class Email{
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity =100;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";
// Constuuctor to recieve  the first name and last name 
public Email(String firstname, String lastname){
    this.firstname = firstname;
    this.lastname = lastname;
// call a method asking for the department - return the department
this.department = setDepartment();
// combine element to generate email
this.email = firstname.toLowerCase() + "."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
// call a method that returns a random password
this.password = randomPassword(defaultPasswordLength);
System.out.println("Your password is: "+ this.password);
}
// ask for the department
private String setDepartment(){
    System.out.println("New Worker: "+firstname+". DEPARTMENT CODE \n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if(depChoice==1){return "sales";}
    else if (depChoice==2){return "dev";}
    else if (depChoice==3){return "acct";}
    else {return "";}
}
// Generate a random password 
private String randomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*";
    char[] password = new char[length];
    for(int i=0; i<length;i++){
        int rndm = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rndm);
    }
    return new String (password);
}
// Set mailbox Capacity
public void setMailBoxCapacity(int capacity){
    this.mailboxCapacity = capacity;
}
// Set the alternate email
public void setAlternateEmail(String altEmail){
    this.alternateEmail = altEmail;
}
// Change the password 
public void changePassword(String password){
this.password = password;
}
public int getMailBoxCapacity() { return mailboxCapacity; }
public String getAlternateEmail() {return alternateEmail;}
public String getPassword() { return password;}
public String showInfo(){
    return "DISPLAY NAME: "+ firstname + " "+ lastname
    +"\nCOMPANY EMAIL: "+ email
    +"\nMAILBOX CAPACITY: "+ mailboxCapacity +"mb";
}
}
