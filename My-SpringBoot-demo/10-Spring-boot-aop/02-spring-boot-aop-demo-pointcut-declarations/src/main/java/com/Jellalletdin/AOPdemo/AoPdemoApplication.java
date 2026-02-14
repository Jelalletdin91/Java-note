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
		accountDAO.addAccount(account, true);
		accountDAO.doWork();

		membershipDAO.addMember();
		membershipDAO.goToSleep();

	}
}
