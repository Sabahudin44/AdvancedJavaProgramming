package three.jdbc;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * SELECT * FROM customers;
 *
 * java.sql.DriverManager
 * java.sql.Connection
 * 1. povezati se s bazom podataka
 *  1.1 URL ... jdbc:mydriver : imebaze
 *  1.2 username : root
 *  1.3 password : root
 *  1.4 driver --> MySQL
 *
 * 2. poslati ovaj upit: SELECT * FROM customers
 *  2.1 java.sql.Statement ,java.sql.Prepared Statement
 *
 * java.sql.ResultSet
 * 3. procesuirati rezultate upita
 *
 */


public class CustomerMySQLReader {
    public static final  String URL = "jdbc:mysql://localhost:3306/sql_store";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mojanini17";

    public List<Customer> loadCustomers() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
        while (resultSet.next()){
            Customer customer = new Customer();
            int customerId = resultSet.getInt("customer_id");
            customer.setCustomerId(customerId);
            String firstName = resultSet.getString("first_name");
            customer.setFirstName(firstName);
            String lastName = resultSet.getString(3);
            customer.setLastName(lastName);
            Date birthDate = resultSet.getDate("birth_date");
            customer.setBirthday(birthDate.toLocalDate());
            String phone = resultSet.getString("phone");
            customer.setPhone(phone);
            customer.setAddress(resultSet.getString("address"));
            customer.setCity(resultSet.getString("city"));
            customer.setState(resultSet.getString("state"));
            customer.setPoints(resultSet.getInt("points"));

            customerList.add(customer);

        }
        return customerList;

    }


}
