
import java.time.LocalDate;
import java.util.*;


public class Principal {

    public static void limparTela() {
        // Tenta limpar a tela com base no sistema operacional
        try {
            String sistemaOperacional = System.getProperty("os.name").toLowerCase();
            
            if (sistemaOperacional.contains("win")) {
                // Limpa a tela no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Limpa a tela no Linux/macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Caso o método acima falhe, imprime várias linhas em branco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }


    public static void main(String[] args){
        List <String> leituras = Arquivo.ler("Emprestimos.txt");
        List <String> leituras2 = Arquivo.lerPessoas("Pessoas.txt");
        List <Emprestimos> emprestados = Arquivo.processarDados(leituras);
        List <Pessoas> pessoas = Arquivo.processarPessoas(leituras2);
        int m=1;
        System.out.println("Bem-vindo ao programa de Emprestimos!!");
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextLine();
        
        while(m>=0){
            limparTela();
            System.out.println("Diga oque deseja fazer: \n 1-Fazer um novo emprestimo\n 2- Excluir um emprestimos\n 3- Ver todos os emprestimos\n4- Devolver item\n 5-Pessoas bloqueadas\n 6-Sair\n\nDigite aqui: ");
            m = scanner.nextInt();
            if(m == 1){
                limparTela();
                System.out.println("Você deseja fazer um emprestimo de um Livro ou Utensilio? ");
                scanner.nextLine();
                String enter = scanner.nextLine();
                Emprestimos b;
                if(enter.equals("Livro")== true){
                    
                    b = Funcs.LerLivro();
                }else{
                    b = Funcs.LerUtensilios();
                }
                emprestados.add(b);
                limparTela();
                System.out.println("Emprestimo feito com sucesso!\n");
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();

            }else if(m == 2){
                limparTela();
                System.out.println("Qual o nome do Item que deseja remover? ");
                scanner.nextLine();
                String nome =  scanner.nextLine();
                Funcs.removeItem(emprestados, nome);
                limparTela();
                System.out.println("Emprestimo removido com sucesso!\n");
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }else if(m == 3){
                scanner.nextLine();
                for(Emprestimos i: emprestados){
                    System.out.println(i);
                }
                System.out.println("Deseja sair ou filtrar por atrasos?");
                String op = scanner.nextLine();
                op = op.toLowerCase();
                if(op.equals("filtrar") == true){
                    limparTela();
                    for(Emprestimos i : emprestados){
                        if(i.verificarAtraso() == true){
                            System.out.println(i);
                        }
                    }
                    System.out.println("\n\n\nPressione Enter para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                }
            }else if(m == 4){
                System.out.println("Deseja fazer manual ou automatico?");
                scanner.nextLine();
                String op = scanner.nextLine();
                op = op.toLowerCase();
                System.out.println("Digite o nome do item a ser devolvido: ");
                String nome = scanner.nextLine();
                for(Emprestimos i : emprestados){
                    if(i.verificarIgual(nome)){
                        if(op.equals("manual")){
                            System.out.println("Digite a data da devolução(AAAA-MM-DD): ");
                            LocalDate aDate = LocalDate.parse(scanner.nextLine());
                            i.registrar(aDate);
                        }else{
                            i.registrar(LocalDate.now());
                        }
                        if(i.verificarAtraso() == true){
                            Pessoas a = i.aPessoas();
                            pessoas.add(a);
                        }
                    }
                }
            }else if(m == 5){
                scanner.nextLine();
                for(Pessoas i : pessoas){
                    if(i.removeBan()== true){
                        pessoas.remove(i);
                    }else{
                        System.out.println(i);
                    }
                }
                System.out.println("\n\nPressione Enter para continuar...");
                scanner.nextLine();
            }else if(m == 6){
                m=-1;
            }

        }
        scanner.close();
        Arquivo.salvar(emprestados, "Emprestimos.txt");
        Arquivo.salvarPessoas(pessoas, "Pessoas.txt");
    }

}