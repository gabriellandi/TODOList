package tarefas;
import java.util.*;

public class TodoList {
    public ArrayList<Tarefa> todoItems;

    public TodoList() {
        this.todoItems = new ArrayList<>();
    }

    public void addItem(Tarefa item) {
        this.todoItems.add(item);
    }

    public void removeItem(int index) {
        this.todoItems.remove(index);
    }

    public void sortByStatus() {
        Collections.sort(this.todoItems, (t1, t2) -> t1.getStatus().compareTo(t2.getStatus()));
        ;
    }

    public void sortByPrioridade() {
        Collections.sort(this.todoItems, (t1, t2) -> t1.getPrioridade().compareTo(t2.getPrioridade()));
        ;
    }

    public void sortByCategory() {
        Collections.sort(this.todoItems, (t1, t2) -> t1.getCategoria().compareTo(t2.getCategoria()));
    }

    public void printList() {
        for (int i = 0; i < this.todoItems.size(); i++) {
            System.out.println((i + 1) + ". " + this.todoItems.get(i));
        }
    }

//    public void ordenaTodoList(Scanner leitor){
//        String ordenador = String.valueOf(leitor);
//        System.out.println("1 . prita oi mae" +
//                "2 . printa oi pai" +
//                "3 . printa oi vó");
//            switch (ordenador){
//                case "1":
//                    System.out.println("oi mae");
//                break;
//                case "2":
//                    System.out.println("oi pai");
//                break;
//                case "3":
//                    System.out.println("oi vó");
//                break;
//            }
//        }
//    }

}
