package com.Jellalletdin.AOPdemo;

import com.Jellalletdin.AOPdemo.Dao.AccountDAO;
import com.Jellalletdin.AOPdemo.Dao.MembershipDAO;
import com.Jellalletdin.AOPdemo.Service.TrafficFortune;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AoPdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoPdemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO, TrafficFortune trafficFortune){
		return runner->
				//demoTheBeforeAdvice(accountDAO, membershipDAO);

				//demoTheAfterReturningAdvice(accountDAO);

				//demoAfterThrowing(accountDAO);

				//demoAfter(accountDAO);

				//demoAround(trafficFortune);

				demoTheAroundAdvice(trafficFortune);
	}

	private void demoTheAroundAdvice(TrafficFortune trafficFortune) {
		System.out.println("Main Program trafficFortune ");
		System.out.println("Caaling getFortune()");

		boolean tripWire = false;
		String data = trafficFortune.getFortune(tripWire);

		System.out.println("Fortune: " + data);

		System.out.println("DONE");

	}

	private void demoAround(TrafficFortune trafficFortune) {

		System.out.println("Main Program trafficFortune ");
		System.out.println("Caaling getFortune()");
		String data = trafficFortune.getFortune();

		System.out.println("Fortune: " + data);

		System.out.println("DONE");

	}

	private void demoAfter(AccountDAO accountDAO) {

		List<Account> accounts = null;

		try {
			boolean tripWire = false;
			accountDAO.findAccounts(tripWire);
		} catch (Exception e) {
			System.out.println("\n\nMain Program caught an exception " + e);
		}



		System.out.println("-------");
		System.out.println(accounts);
		System.out.println("\n");

	}

	private void demoAfterThrowing(AccountDAO accountDAO) {

		List<Account> accounts = null;

		try {
			boolean tripWire = true;
			accountDAO.findAccounts(tripWire);
		} catch (Exception e) {
			System.out.println("\n\nMain Program caught an exception " + e);
		}



		System.out.println("-------");
		System.out.println(accounts);
		System.out.println("\n");

	}

	private void demoTheAfterReturningAdvice(AccountDAO accountDAO) {

		List<Account> accounts = accountDAO.findAccounts();

		System.out.println("\n\nMain Program demoTheAfterReturningAdvice");
		System.out.println("-------");
		System.out.println(accounts);
		System.out.println("\n");

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
