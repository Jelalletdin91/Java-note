package com.Jellalletdin.AOPdemo;

import com.Jellalletdin.AOPdemo.Dao.AccountDAO;
import com.Jellalletdin.AOPdemo.Dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AoPdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoPdemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO){
		return runner->
				demoTheBeforeAdvice(accountDAO, membershipDAO);
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {

		Account account = new Account();

		account.setName1("Jelalletdin");
		account.setName2("Berjanov");

		accountDAO.addAccount(account, true);
		accountDAO.doWork();

		accountDAO.setName("foober");
		accountDAO.setServiceCode("jiji2331331");

		String name = accountDAO.getName();
		String code = accountDAO.getServiceCode();

		membershipDAO.addMember();
		membershipDAO.goToSleep();

	}
}
