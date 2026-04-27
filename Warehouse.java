import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add  2.Remove  3.Update  4.Search  5.Display  0.Exit");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Qty: "); int qty = sc.nextInt();
                    System.out.print("Price: "); double price = sc.nextDouble();
                    inv.addItem(new Item(id, name, qty, price));
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    inv.removeItem(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();
                    System.out.print("New Qty: ");
                    inv.updateQuantity(uid, sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID/Name to search: ");
                    Item found = inv.search(sc.nextLine());
                    System.out.println(found != null ? found : "Not found!");
                    break;
                case 5:
                    inv.displayAll();
                    break;
                case 0:
                    System.out.println("Bye!");
            }
        } while (choice != 0);

        sc.close();
    }
}
