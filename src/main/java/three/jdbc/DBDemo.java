package three.jdbc;


import java.sql.SQLException;
import java.util.List;

public class DBDemo {
    public static void main(String[] args) throws SQLException {
        CustomerMySQLReader customerMySQLReader = new CustomerMySQLReader();
       List<Customer> customers = customerMySQLReader.loadCustomers();
       customers.forEach(customer -> System.out.println(customer));

      // for (Customer customer: customers){
     //      System.out.println(customer.getFirstName() + " " + customer.getLastName());
      // }
    }

}
