import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList10 {
    public static void main(String[] args) {
        ArrayList<Customer10> customers = new ArrayList<>(2);

        Customer10 customer1 = new Customer10(1, "Zakia");
        Customer10 customer2 = new Customer10(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer10(4, "Cica"));
        customers.add(2, new Customer10(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer10 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer10 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer10> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer10(201, "Della"));
        newCustomers.add(new Customer10(202, "Victor"));
        newCustomers.add(new Customer10(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer10 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}