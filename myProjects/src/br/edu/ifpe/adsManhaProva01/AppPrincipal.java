package br.edu.ifpe.adsManhaProva01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppPrincipal {
	
	static List<OrdemServico> ordemServicos = new ArrayList<>();
	static List<Servico> servicos = new ArrayList<>();

	public static void main(String[] args) {
		Pessoa funcionario = new Funcionario("Paulo", "0147258", "Especialidade 01", "2023-09-26");
		
		Pessoa cliente = new Cliente("José", "0369147", "Tipo 01");
		
		Veiculo veiculo = new Veiculo("Placa 01", "Marca 01", "Modelo 01", (Cliente) cliente);
		
		Servico servico = new Servico("Óleo de Motor", 280.0);
		Servico servico2 = new Servico("Filtro de ar", 320.0);
		Servico servico3 = new Servico("Filtro de óleo", 4000.0);
		
		OrdemServico ordemServico = new OrdemServico("2023-10-09", "2023-09-25", "2023-09-26", (Funcionario) funcionario);
		OrdemServico ordemServico2 = new OrdemServico("2023-10-09", "2023-09-25", "2023-09-26", (Funcionario) funcionario);
		
		ordemServicos.add(ordemServico);
		ordemServicos.add(ordemServico2);
		
		ordemServico.getServicos().add(servico);
		ordemServico2.getServicos().add(servico2);
		
		servicos.add(servico);
		servicos.add(servico2);
		servicos.add(servico3);
		
		for (Servico ser : servicos) {
			System.out.println("Placa: " + veiculo.getNumPlaca());
			System.out.println("Marca: " + veiculo.getMarca());
			System.out.println("Modelo: " + veiculo.getModelo());
			System.out.println("Nome do Cliente: " + veiculo.getCliente().getNome());
			System.out.println("Rg: " + veiculo.getCliente().getRg());
			System.out.println("Tipo do Cliente: " + veiculo.getCliente().getTipoCliente());
			System.out.println("----------------------------------------");
			System.out.println("Descrição: " + ser.getDescricao());
			System.out.println("Valor: " + ser.getValor());
			for (OrdemServico ordSer : ordemServicos) {
				System.out.println("----------------------------------------");
				System.out.println("NumOS: " + ordSer.getNumOS());
				System.out.println("Data Exo: " + ordSer.getDataExo());
				System.out.println("Data de Conclusão: " + ordSer.getDataConclusao());
				System.out.println("Nome do Funcionário: " + ordSer.getFuncionario().getNome());
			}
			System.out.println("----------------------------------------");
		}

	}

}
