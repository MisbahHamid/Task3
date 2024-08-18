

import java.util.Scanner;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        int phone = 0;
        String name = "";
        directory d = new directory();
        Scanner input = new Scanner(System.in);
        System.out.println("press 1 for insert");
        System.out.println("press 2 for search");
        System.out.println("press 3 for update");
        System.out.println("press 4 for delete");
        System.out.println("press 5 for printlist");
        System.out.println("choice your option ");
        int choice = input.nextInt();

        while(true) {
            switch (choice) {
                case 1:
                    System.out.println("enter your name");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.println("enter your phone number");
                    phone = input.nextInt();
                    System.out.println("All the thing are enter successfully");
                    person p = new person();
                    p.setname(name);
                    p.setphone(phone);
                    d.insert(p);
                    return;
                case 2:
                    System.out.println("Enter The name you want to search");
                    name = input.nextLine();
                    d.search(name);
                    break;
                case 3:
                    System.out.println("Enter The name you want to Update");
                    name = input.nextLine();
                    d.update(name, phone);
                    break;
                case 4:
                    System.out.println("Enter The name you want to Delete");
                    name = input.nextLine();
                    d.delete(name);
                    break;
                case 5:
                    System.out.println("Enter The name you want to Print");
                    d.printlist(name);
                    break;
                case 6:
                    System.out.println("SYSTEM SHUTTING DOWN");
                    return;
            }
        }
    }
}
