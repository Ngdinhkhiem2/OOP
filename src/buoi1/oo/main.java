package buoi1.oo;

public class main {
    public static void main(String[] args) {
        //Bien tham chieu doi tuong
        account account = new account();

        account.show();
        account.depoist();
        account.show();

        account.withdraw();
        account.show();


        customer customer = new customer();
        customer.show();


        employee employee = new employee();
        employee.show();
   }
}

