package P_06_OOPs.bank;
public class OopsBank{  
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcde");
        account1.getPassword();
    }
}
