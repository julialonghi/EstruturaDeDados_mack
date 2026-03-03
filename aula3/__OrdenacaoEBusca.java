//Classe __OrdenacaoEBusca: encarregada de executar algumas funcionalidades
//com objetos do tipo Candidato a um concurso musical armazenados em um vetor.
//Autor Professor: Ivan Carlos Alcântara de Oliveira./Alcides Teixeira Barboza Junior
//Data da Criação: 10/02/2026. 15h.
//Autor Aluno: <COLOQUE AQUI O SEU NOME E RA>
//Data da Atualização: <DATA DA IMPLEMENTAÇÃO DOS MÉTODOS SOLICITADOS>
public class __OrdenacaoEBusca {
	// Objeto de leitura
//    private Scanner ler = new Scanner(System.in); 
	// constante com o total de candidatos
	public static final int MAX_CANDIDATOS = 15;
	// Indica o total de candidados criados
	public static int tot_candidatos;
	// main: ponto de entrada do programa
	public static void main(String[] args) {
		// Cria objeto da Classe com a 
		// execução das funcionalidades solicitadas
		new __OrdenacaoEBusca();  
	}
	// Construtor da classe encarregada de realizar a execução
	// das funcionalidades solicitadas
	public __OrdenacaoEBusca() {
		// Vetor de Candidatos
	    Candidato candidatos[];
    	// Cria vetor de objetos do tipo Candidato para 
	    // uso nos métodos de ordenação e pesquisa
    	candidatos = new Candidato[MAX_CANDIDATOS];
    	
    	// Cria lista de candidatos
	    criarCadastroCandidatos(candidatos);
	    // Mostra todos os candidatos cadastrados na ordem do cadastro
	    mostrarTodosOsCandidatos(candidatos);
/*	    
	    // Procura um candidato pelo nome em um vetor não ordenado
	    System.out.println("Forneça o nome do candidato: ");
	    String nomeCandidato = ler.nextLine();
	    Candidato cand = pesquisaSequencial(nomeCandidato, candidatos);
	    if (cand != null) {
	    	System.out.println("Dados Candidato: " + cand.toString());
	    } else {
	    	System.out.println("Candidato Inexistente!");
	    }
	   
	    // Ordena o vetor de candidatos pelo número do candidato
	    selectionSort(candidatos);
	    // Mostra os candidatos ordenados por número do candidato
	    mostrarTodosOsCandidatos(candidatos);
	    
	    // Procura um candidato no vetor ordenado pelo número do candidato 
	    System.out.println("Forneça um número de candidato:");
	    String nroCandidato = ler.nextLine();
	    cand = pesquisaBinaria(Integer.parseInt(nroCandidato), candidatos);
	    if (cand != null) {
	    	System.out.println("Dados Candidato: " + cand.toString());
	    } else {
	    	System.out.println("Candidato Inexistente!");
	    }
	    
	    // Ordena o vetor de candidatos pelo nome do candidato
	    bubbleSort(candidatos);
	    // Mostra os candidatos ordenados por nome
	    mostrarTodosOsCandidatos(candidatos);
	    
	    // Ordena o vetor de candidatos pela idade do candidato
	    insertionSort(candidatos);
	    // Mostra os candidatos ordenados por idade
	    mostrarTodosOsCandidatos(candidatos);
*/
	}
	
    // Método encarregado de criar objetos da classe Candidato
    // e armazenar em um vetor.
    // Este método foi criado para evitar a necessidade de 
    // fazer a leitura de dados de Candidato na fase de testes dos outros ´
    // métodos a serem modificados.  
	// Você deve inserir mais 5 candidatos na base
    public void criarCadastroCandidatos(Candidato[] candidatos) {	
    	candidatos[0] = new Candidato(1111, "111.111.111-11", "Leonardo", 18, 'M', "rock");
       	candidatos[1] = new Candidato(8888, "888.888.888-88", "Luiza", 21, 'F', "romantica");
       	candidatos[2] = new Candidato(7777, "777.777.777-77", "Pedro", 22, 'M', "rock");
       	candidatos[3] = new Candidato(6666, "666.666.666-66", "Ana Lopes", 54, 'F', "sertanejo");
       	candidatos[4] = new Candidato(3333, "333.333.333-33", "Mariana", 25, 'F', "sertanejo");
       	candidatos[5] = new Candidato(4444, "444.444.444-44", "Amilton", 35, 'M', "rock");
       	candidatos[6] = new Candidato(2222, "222.222.222-22", "Juliano", 19, 'M', "forró");  	
    	candidatos[7] = new Candidato(5555, "555.555.555-55", "Luciano", 52, 'M', "forró");
    	candidatos[8] = new Candidato(1010, "101.101.101-10", "Christiane", 35, 'F', "rock");    	
    	candidatos[9] = new Candidato(9999, "999.999.999-99", "Luis Alberto C.", 18, 'M', "rap");
       	tot_candidatos = 15;
    	// Criar a partir daqui mais 5 objetos da classe candidato
		candidatos[10] = new Candidato(0101, "010.010.010-11", "Anna", 18, 'F', "rock");
       	candidatos[11] = new Candidato(2121, "121.121.121-22", "Joao", 21, 'M', "romantica");
       	candidatos[12] = new Candidato(4343, "434.434.434-44", "Luiz", 22, 'M', "rock");
       	candidatos[13] = new Candidato(5656, "565.565.565-55", "Elsa", 54, 'F', "sertanejo");
       	candidatos[14] = new Candidato(7878, "787.787.787-77", "Carlos", 25, 'M', "sertanejo");
 
    }
    
	// Método que apresenta todos os dados dos candidatos cadastrados.
	// Se houver candidatos exibe a mensagem:
	//    "Candidatos cadastrados:", seguido dos seus dados um por linha.
	// Caso não haja Candidatos cadastrados mostra a mensagem: "Não há candidatos cadastrados!"
	public void mostrarTodosOsCandidatos(Candidato[] cand) {
	    String cad = "";
	    for(int i=0; i<tot_candidatos; i++) {
	            cad += cand[i].toString() + "\n";
	    }
	    if (cand.length >=1)
	       System.out.println("Candidatos cadastrados:\n" + cad);  
	    else 
	       System.out.println("Não há Candidatos cadastrados!");
	}
	
    // Método encarregado de pesquisar um candidato 
    // armazenado em um vetor (ordenado ou não)
    // tendo como chave o nome do candidato.	
	public Candidato pesquisaSequencial(String nomeCandidato, Candidato[] cand) {
		for (int i = 0; i <= cand.length; i++) {
			String nome = cand[i].getNome();
			if(nome.equals(nomeCandidato)) {
				return cand[i];
			}
		}
		return null;
	};
    
    // Método encarregado de pesquisar um candidato 
    // armazenado em um vetor ordenado
    // tendo como chave o número do candidato.
    public Candidato pesquisaBinaria(int chave, Candidato[] cand) {
    	int first = 0;
		int last = cand.length;
		while (first <= last) {
			int middle = (first + last)/2;
			int num_cand = cand[middle].getNumero_candidato();
			if(chave == num_cand) {
				return cand[middle];
			} else if (chave < num_cand) {
				last = middle-1;
			} else {
				first = middle+1;
			}
		}
		return null;
    }

    // Método encarregado de ordenar os Candidatos 
    // armazenados em um vetor pelo número do candidato.
    public void selectionSort(Candidato cand[]) {
    	for (int i = cand.length; i > 0; i--) {
			
		}
    }
 
    // Método encarregado de ordenar os Candidatos 
    // armazenados em um vetor pela idade do candidato.
    public void insertionSort(Candidato[] cand) {
    	// Seu código deve ser desenvolvido aqui
    }
    
    // Método encarregado de ordenar os Candidatos 
    // armazenados em um vetor pelo nome do candidato.
    public void bubbleSort(Candidato[] cand) {
    	// Seu código deve ser desenvolvido aqui
    }
    
  }
