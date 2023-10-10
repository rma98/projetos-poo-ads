package br.edu.ifpe.adsManhaProva01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppPrincipal {
	
	static List<Veiculo> veiculos = new ArrayList<>();
	static List<OrdemServico> ordemServicos = new ArrayList<>();
	static List<Servico> servicos = new ArrayList<>();

	public static void main(String[] args) {
		Pessoa funcionario = new Funcionario("Paulo", "0147258", "Especialidade 01", "2023-09-26");
		
		Pessoa cliente = new Cliente("José", "0369147", "Tipo 01");
		
		Veiculo veiculo = new Veiculo("Placa 01", "Marca 01", "Modelo 01", (Cliente) cliente);
		
		veiculos.add(veiculo);
		
		Servico servico = new Servico("Óleo de Motor", 280.0);
		Servico servico2 = new Servico("Filtro de ar", 320.0);
		Servico servico3 = new Servico("Filtro de óleo", 4000.0);
		
		OrdemServico ordemServico = new OrdemServico("2023-10-09", "2023-09-25", "2023-09-26", (Funcionario) funcionario);
		OrdemServico ordemServico2 = new OrdemServico("2023-10-09", "2023-09-25", "2023-09-26", (Funcionario) funcionario);
		
		ordemServicos.add(ordemServico);
		ordemServicos.add(ordemServico2);
		
		veiculo.getOrdemServicos().add(ordemServico);
		veiculo.getOrdemServicos().add(ordemServico2);
		
		servicos.add(servico);
		servicos.add(servico2);
		servicos.add(servico3);
		
		ordemServico.getServicos().add(servico);
		ordemServico2.getServicos().add(servico2);
		
		for (Veiculo v : veiculos) {
			System.out.println("----------------- VEÍCULO -----------------------------------");
			System.out.println("Número da Placa: " + v.getNumPlaca());
			System.out.println("Modelo: " + v.getModelo());
			System.out.println("Marca: " + v.getMarca());
			System.out.println("------------------ CLIENTE ----------------------------------");
			System.out.println("Cliente: " + v.getCliente().getNome());
			System.out.println("RG: " + v.getCliente().getRg());
			System.out.println("Tipo do Cliente: " + v.getCliente().getTipoCliente());
			for (OrdemServico os : v.getOrdemServicos()) {
				System.out.println("--------------- ORDEM DE SERVIÇO -------------------------------------");
				System.out.println("Data OS: " + os.getNumOS());
				System.out.println("Data Exo: " + os.getDataExo());
				System.out.println("Data de Conclusão: " + os.getDataConclusao());
				System.out.println("Nome do funcionário que realizou o atendimento: " + os.getFuncionario().getNome());
				for (Servico s : os.getServicos()) {
					System.out.println("---------------------- SERVIÇO ------------------------------");
					System.out.println("Descrição do serviço: " + s.getDescricao());
					System.out.println("Valor: " + s.getValor());
				}
			}
			System.out.println("--------------------------------------------------------------");
		}

	}

}
