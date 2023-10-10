package br.com.nomaroma.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.OptionalDouble;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import br.com.nomaroma.entities.Account;
import br.com.nomaroma.entities.AccountEnum;
import br.com.nomaroma.entities.Client;
import br.com.nomaroma.service.BankService;
import br.com.nomaroma.service.ServiceFactory;

/**
 * OBSERVAçõES: 
 * NãO é permitido o uso de nenhuma estrutura de repetição (for, while, do-while).
 * Tente, ao máximo, evitar o uso das estruturas if, else if, else e switch-case
 * 
 * @author VictorLira
 *
 */
public class Main {

	private static BankService service = ServiceFactory.getService();

	public static void main(String[] args) {
		//1:
		/*imprimirNomesClientes();*/

		//2:
		/*imprimirMediaSaldos();*/

		//3:
		/*imprimirPaisClienteMaisRico();*/

		//4:
		/*imprimirSaldoMedio(6);*/

		//5:
		/*imprimirClientesComPoupanca();*/

		//6:
		/*System.out.println(getEstadoClientes(25));*/

		//7:
		/*System.out.println(getNumerosContas("Brazil"));*/

		//8:
		/*System.out.println(getMaiorSaldo("client39@bank.com"));*/

		//9:
		/*sacar(190,570,200);*/

		//10:
		/*depositar("Brazil",200);*/

		//11:
		/*transferir(198, 576, 594, 200);*/

		//13:
		/*System.out.println(getSomaContasEstado("State 6"));*/

		//14:
		/*System.out.println(getEmailsClientesContasConjuntas());*/

		//15:
		/*System.out.println(isPrimo(3));*/

		//16:
		/*System.out.println(getFatorial(7));*/

	}

	/**
	 * 1. Imprima na tela o nome e e-mail de todos os clientes (sem repeti��o), usando o seguinte formato:
	 * Victor Lira - vl@cin.ufpe.br
	 */
	public static void imprimirNomesClientes() {
		service
		.listClients()
		.stream()
		.distinct()
		.forEach(c-> System.out.println(c.getName()  +" - "+ c.getEmail()));
	}

	/**
	 * 2. Imprima na tela o nome do cliente e a m�dia do saldo de suas contas, ex:
	 * Victor Lira - 352
	 */
	public static void imprimirMediaSaldos() {
		service.listClients().forEach(c -> {
			double averageBalance = c.getAccounts()
					.stream()
					.mapToDouble(Account::getBalance)
					.average()
					.orElse(0.0);
			System.out.println(c.getName() + " - " + averageBalance);
		});
	}

	/**
	 * 3. Considerando que s� existem os pa�ses "Brazil" e "United States", 
	 * imprima na tela qual deles possui o cliente mais rico, ou seja,
	 * com o maior saldo somando todas as suas contas.
	 */
	public static void imprimirPaisClienteMaisRico() {
		Map<String, Double> countryToTotalBalance = new HashMap<>();
		service.listClients().forEach(c -> {
			double totalBalance = c.getAccounts()
					.stream()
					.mapToDouble(Account::getBalance)
					.sum();
			countryToTotalBalance.merge(c.getAddress().getCountry(), totalBalance, Double::sum);
		});
		String countryWithMaxBalance = countryToTotalBalance.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse("Nenhum país");
		System.out.println("País com o cliente mais rico: " + countryWithMaxBalance);
	}

	/**
	 * 4. Imprime na tela o saldo m�dio das contas da ag�ncia
	 * @param agency
	 */
	public static void imprimirSaldoMedio(int agency) {
		OptionalDouble averageBalance = service.listClients()
				.stream()
				.flatMap(c -> c.getAccounts().stream())
				.filter(a -> a.getAgency() == agency)
				.mapToDouble(Account::getBalance)
				.average();
		if (averageBalance.isPresent()) {
			System.out.println("Saldo médio da agência " + agency + ": " + averageBalance.getAsDouble());
		} else {
			System.out.println("Agência não encontrada ou sem contas.");
		}
	}
	/**
	 * 5. Imprime na tela o nome de todos os clientes que possuem conta poupan�a (tipo SAVING)
	 */
	public static void imprimirClientesComPoupanca() {
		service.listClients()
		.stream()
		.filter(client -> client.getAccounts().stream().anyMatch(account -> account.getType() == AccountEnum.SAVING))
		.forEach(client -> System.out.println(client.getName()));
	}

	/**
	 * 6.
	 * @param agency
	 * @return Retorna uma lista de Strings com o "estado" de todos os clientes da ag�ncia
	 */
	public static List<String> getEstadoClientes(int agency) {
		return service.listClients()
				.stream()
				.filter(c -> c.getAccounts().stream().anyMatch(account -> account.getAgency() == agency))
				.map(c -> c.getAddress().getState())
				.collect(Collectors.toList());
	}

	/**
	 * 7.
	 * @param country
	 * @return Retorna uma lista de inteiros com os n�meros das contas daquele pa�s
	 */
	public static List<Integer> getNumerosContas(String country) {
		return service.listClients()
				.stream()
				.filter(c -> c.getAddress().getCountry().equals(country))
				.flatMap(c -> c.getAccounts().stream())
				.map(Account::getNumber)
				.collect(Collectors.toList());
	}

	/**
	 * 8.
	 * Retorna o somat�rio dos saldos das contas do cliente em quest�o 
	 * @param clientEmail
	 * @return
	 */
	public static double getMaiorSaldo(String clientEmail) {
		Optional<Client> clientOptional = service.listClients()
				.stream()
				.filter(c -> c.getEmail().equals(clientEmail))
				.findFirst();

		if (clientOptional.isPresent()) {
			Client client = clientOptional.get();
			return client.getAccounts().stream().mapToDouble(Account::getBalance).sum();
		} else {
			throw new IllegalArgumentException("Cliente não encontrado com o email fornecido.");
		}
	}

	/**
	 * 9.
	 * Realiza uma opera��o de saque na conta de acordo com os par�metros recebidos
	 * @param agency
	 * @param number
	 * @param value
	 */
	public static void sacar(int agency, int number, double value) {
		Optional<Client> clientOptional = service.listClients()
				.stream()
				.filter(c -> c.getAccounts().stream().anyMatch(account -> 
				account.getAgency() == agency && account.getNumber() == number))
				.findFirst();

		if (clientOptional.isPresent()) {
			Client client = clientOptional.get();
			Optional<Account> accountOptional = client.getAccounts()
					.stream()
					.filter(account -> account.getAgency() == agency && account.getNumber() == number)
					.findFirst();

			if (accountOptional.isPresent()) {
				Account account = accountOptional.get();
				if (account.getBalance() >= value) {
					account.setBalance(account.getBalance() - value);
					System.out.println("Saque de " + value + " realizado com sucesso.");
				} else {
					System.out.println("Saldo insuficiente para o saque.");
				}
			} else {
				System.out.println("Conta não encontrada.");
			}
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}
	/**
	 * 10. Realiza um deposito para todos os clientes do pa�s em quest�o	
	 * @param country
	 * @param value
	 */
	public static void depositar(String country, double value) {
		service.listClients()
		.stream()
		.filter(c -> c.getAddress().getCountry().equals(country))
		.forEach(client -> {
			client.getAccounts().forEach(account -> {
				account.setBalance(account.getBalance() + value);
			});
			System.out.println("Depósito de " + value + " realizado para o cliente " + client.getName());
		});
	}

	/**
	 * 11. Realiza uma transfer�ncia entre duas contas de uma ag�ncia.
	 * @param agency - ag�ncia das duas contas
	 * @param numberSource - conta a ser debitado o dinheiro
	 * @param numberTarget - conta a ser creditado o dinheiro
	 * @param value - valor da transfer�ncia
	 */
	public static void transferir(int agency, int numberSource, int numberTarget, double value) {
		Optional<Client> clientOptional = service.listClients()
				.stream()
				.filter(c -> c.getAccounts().stream().anyMatch(account -> 
				account.getAgency() == agency && (account.getNumber() == numberSource || account.getNumber() == numberTarget)))
				.findFirst();

		if (clientOptional.isPresent()) {
			Client c = clientOptional.get();

			Account sourceAccount = c.getAccounts()
					.stream()
					.filter(account -> account.getAgency() == agency && account.getNumber() == numberSource)
					.findFirst()
					.orElse(null);

			Account targetAccount = c.getAccounts()
					.stream()
					.filter(account -> account.getAgency() == agency && account.getNumber() == numberTarget)
					.findFirst()
					.orElse(null);

			if (sourceAccount != null && targetAccount != null) {
				if (sourceAccount.getBalance() >= value) {
					sourceAccount.setBalance(sourceAccount.getBalance() - value);
					targetAccount.setBalance(targetAccount.getBalance() + value);
					System.out.println("Transferência de " + value + " realizada com sucesso.");
				} else {
					System.out.println("Saldo insuficiente para a transferência.");
				}
			} else {
				System.out.println("Conta(s) não encontrada(s).");
			}
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}

	/**
	 * 12.
	 * @param clients
	 * @return Retorna uma lista com todas as contas conjuntas (JOINT) dos clientes
	 */
	public static List<Account> getContasConjuntas(List<Client> clients) {
		return clients.stream()
                .flatMap(client -> client.getAccounts().stream())
                .filter(account -> account.getType() == AccountEnum.JOINT)
                .collect(Collectors.toList());
	}

	/**
	 * 13.
	 * @param state
	 * @return Retorna uma lista com o somat�rio dos saldos de todas as contas do estado 
	 */
	public static double getSomaContasEstado(String state) {
		return service.listClients()
                .stream()
                .filter(c -> c.getAddress().getState().equals(state))
                .flatMap(client -> client.getAccounts().stream())
                .mapToDouble(Account::getBalance)
                .sum();
	}

	/**
	 * 14.
	 * @return Retorna um array com os e-mails de todos os clientes que possuem contas conjuntas
	 */
	public static String[] getEmailsClientesContasConjuntas() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 15.
	 * @param number
	 * @return Retorna se o n�mero � primo ou n�o
	 */
	public static boolean isPrimo(int number) {
		  if (number <= 1) {
		        return false;
		    }

		    return number > 1 &&
		           IntStream.rangeClosed(2, (int) Math.sqrt(number))
		                    .noneMatch(divisor -> number % divisor == 0);
	}


	/**
	 * 16.
	 * @param number
	 * @return Retorna o fatorial do n�mero
	 */
	public static int getFatorial(int number) {
		if (number < 0) {
	        throw new IllegalArgumentException("Número negativo não possui fatorial definido.");
	    }
	    
	    return IntStream.rangeClosed(1, number)
	                    .reduce(1, (accumulator, current) -> accumulator * current);
	}
}
