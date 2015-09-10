package sample.spring.chapter05.bankapp.dao;

import org.apache.log4j.Logger;

import sample.spring.chapter05.bankapp.domain.FixedDepositDetails;

public class FixedDepositDaoImpl implements FixedDepositDao {
	private static Logger logger = Logger.getLogger(FixedDepositDaoImpl.class);
	private DatabaseConnection connection;

	public FixedDepositDaoImpl() {
		logger.info("FixedDepositDaoImpl's constructor invoked");
	}

	public void initializeDbConnection() {
		logger.info("FixedDepositDaoImpls initializeDbConnection method invoked");
		connection = DatabaseConnection.getInstance();
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		logger.info("FixedDepositDaoImpls createFixedDeposit method invoked");
		// -- save the fixed deposits and then return true
		return true;
	}

	public void releaseDbConnection() {
		logger.info("FixedDepositDaoImpl's releaseDbConnection method invoked");
		connection.releaseConnection();
	}
}
