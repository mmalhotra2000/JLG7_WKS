package edu.gyansetu.tcs.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;

public class InvoiceRepo extends BaseRepo {

	public ArrayList<Invoice> findByCustomerName(String name) {

		String query = "select * from invoice i  inner join customer c on i.cust_id = c.id where c.name= ?";

		ArrayList<Invoice> invoices = new ArrayList<>();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Customer customer = new Customer(resultSet.getInt(4), resultSet.getString(5), resultSet.getInt(6));

				Invoice invoice = new Invoice(resultSet.getInt(1), resultSet.getInt(2), customer);

				invoices.add(invoice);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return invoices;

	}

	public void save(Customer customer) {

		String query = "insert into customer values (?,?,?)";

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setInt(3, customer.getDiscount());

			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
