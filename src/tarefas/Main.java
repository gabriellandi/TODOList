package tarefas;

import tarefas.Tarefa;

import java.util.*;

import static java.util.Collection.*;

public class Main{
    public static void main(String[] args) {
        TodoList adicionaTarefa = new TodoList();
        String verificador = "";
        boolean app = true;

        System.out.println("Bom vindo ao programa de gerenciamento de tarefas");

        try (Scanner leitor = new Scanner(System.in)) {
            while(app){
                System.out.println("O que você deseja?\n" +
                        "1 . Adicionar uma tarefa\n" +
                        "2 . Listar todas as tarefas\n" +
                        "3 . Remover tarefa\n" +
                        "4 . Excluir TODO List\n" +
                        "5 . Encerrar aplicação");
                verificador = leitor.nextLine();
                switch (verificador){
                    case "1":
                        boolean addTask = true;
                                while(addTask){
                                    Tarefa tarefaCompleta = new Tarefa();

                                    System.out.println("Qual o nome da tarefa?");
                                    tarefaCompleta.setNome(leitor.nextLine());

                                    System.out.println("Insira uma descrição da tarefa");
                                    tarefaCompleta.setDescricao(leitor.nextLine());

                                    System.out.println("Qual a data de termino da tarefa?");
                                    tarefaCompleta.setDataTermino(leitor.nextLine());

                                    System.out.println("Qual a categoria?");
                                    tarefaCompleta.setCategoria(leitor.nextLine());

                                    System.out.println("De 1 à 5 qual a prioridade da tarefa em questão?");
                                    tarefaCompleta.setPrioridade(leitor.nextLine());

                                    System.out.println("Qual o Status da tarefa? \n" +
                                            "1 . Todo \n" +
                                            "2 . Doing \n" +
                                            "3 . Done \n" +
                                            "Digite um número acima para definir o status da tarefa");
                                    tarefaCompleta.setStatus(leitor.nextLine());
                                    adicionaTarefa.addItem(tarefaCompleta);

                                    System.out.println("Deseja adicionar uma nova tarefa?(Y/N)");
                                    boolean verificaTask = true;
                                    while(verificaTask){
                                        String task = leitor.nextLine();
                                        switch (task){
                                            case "Y":
                                                addTask = true;
                                                verificaTask = false;
                                            break;
                                            case "N":
                                                addTask = false;
                                                verificaTask = false;
                                            break;
                                            default:
                                                System.out.println("Digite Y para SIM e N para NÃO");
                                        }
                                    }
                                }
                    break;
                    case "2":
                        adicionaTarefa.printList();
                        System.out.println("1 . Ver as tarefas por status\n" +
                                "2 . Ver as tarefas por categoria\n" +
                                "3 . Ver as tarefas por prioridade\n" +
                                "4 . Retornar ao menu principal" +
                                "Digite uma das opções acima");
                        String ordenador = leitor.nextLine();
                        switch (ordenador){
                            case "1":
                                adicionaTarefa.sortByStatus();
                                adicionaTarefa.printList();
                            break;
                            case "2":
                                adicionaTarefa.sortByCategory();
                                adicionaTarefa.printList();
                            break;
                            case "3":
                                adicionaTarefa.sortByPrioridade();
                                adicionaTarefa.printList();
                            break;
                            case "4":
                                System.out.println("Retornar ao menu principal");
                            break;
                            default:
                                System.out.println("Digite uma das opções acima");
                        }
                    break;
//                    case "3":
//
//                    break;
//                    case "4":
//
//                    break;
                    case "3":
                        adicionaTarefa.printList();
                        System.out.println("Digite o numero da tarefa para removê - la");
                        adicionaTarefa.removeItem(Integer.parseInt(leitor.nextLine()) - 1);
                        adicionaTarefa.printList();
                    break;
                    case "4":
                        System.out.println("Agora você pode criar uma nova TODO List");
                        adicionaTarefa = new TodoList();
                    break;
                    case "5":
                        System.out.println("Aplicação encerrada!");
                        app = false;
                    break;
                    default:
                    System.out.println("Digite um número válido");
                }
            }
        }
    }

}