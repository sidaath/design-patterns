import java.util.Scanner;

//simple program, singleton pattern used to create a datastore
//datastore holds items.
public class Main {
    public static void main(String[] args) {
        String option1 = "1. Add item\n";
        String option2 = "2. View items\n";
        String option3 = "1. Delete item\n";

        Datastore datastore = Datastore.getInstance("DB_ITEMS");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Choose Option: \n");
            System.out.println(option1);
            System.out.println(option2);
            System.out.println(option3);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter item name:");
                    String name = scanner.next();
                    System.out.println("Enter price");
                    int price = scanner.nextInt();
                    System.out.println("Enter condition");
                    String condition = scanner.next();
                    Item item = new Item(name, price, condition);
                    datastore.addItem(item);
                    break;
                case 2:
                    datastore.viewItems();
                    break;
                case 3:
                    System.out.println("Enter name to delete");
                    String delName = scanner.next();
                    datastore.deleteItem(delName);
                default:
                    break;


            }
        }while(choice!=4);


    }
}
