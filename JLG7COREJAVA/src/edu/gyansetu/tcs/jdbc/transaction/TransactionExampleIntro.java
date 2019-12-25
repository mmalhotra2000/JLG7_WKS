package edu.gyansetu.tcs.jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.gyansetu.tcs.jdbc.DBManager;

/*
 * create table transaction (
id int primary key,
acct_no int ,
tran_type varchar(255),
amount real(9,2),
tran_date timestamp,
FOREIGN KEY fk_acc(acct_no)
   REFERENCES bank_acct(acc_no)

)

 * 
 * 
 * */

public class TransactionExampleIntro {

	public static void main(String[] args) {

		String insertTrans1 = "insert into transaction values (?,?,?,?,now())";

		// String updateBank1 = "update bank_acct set balance = ? where acc_no = ?";

		Connection connection = null;

		try {
			connection = DBManager.getConnection();

			connection.setAutoCommit(false);

			// insert into transaction values (1,5555,'DEBIT',55.0,sysdate())
			PreparedStatement insertFor1 = connection.prepareStatement(insertTrans1);
			insertFor1.setInt(1, 1); // primary key 1
			insertFor1.setInt(2, 5555);
			insertFor1.setString(3, "DEBIT");
			insertFor1.setDouble(4, 55.0);
			insertFor1.executeUpdate(); // Since auto commit is true by default
			// will commit changes in DB as soon as executed.

			PreparedStatement insertFor2 = connection.prepareStatement(insertTrans1);
			insertFor2.setInt(1 ,2); // primary key 1
			insertFor2.setInt(2, 7777);
			insertFor2.setString(3, "CREDIT");
			insertFor2.setDouble(4, 55.0);
			insertFor2.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
