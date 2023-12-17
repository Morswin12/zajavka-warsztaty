package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P13_Hibernate_Relacje_One_To_One;


import WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.HibernateUtil;

public class ExampleRunner {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepository();

        customerRepository.deleteAll();

        Customer customer1 = customerRepository.insertCustomer(ExampleData.someCustomer1());
        Customer customer2 = customerRepository.insertCustomer(ExampleData.someCustomer2());

        customerRepository.listCustomers()
                .forEach(customer -> System.out.println("##Customer listing: " + customer));

        System.out.println("###Customer1: " + customerRepository.getCustomer(customer1.getId()));
        System.out.println("###Customer2: " + customerRepository.getCustomer(customer2.getId()));

        Address newAddress = Address.builder()
                .country("Poland")
                .city("Sopot")
                .postalCode("89-123")
                .address("Duga 89")
                .build();

        customerRepository.updateCustomer(customer1.getId(), newAddress);
        System.out.println("##Customer update: " + customerRepository.getCustomer(customer1.getId()));

        customerRepository.listCustomers()
                .forEach(customer -> System.out.println("##Customer listing: " + customer));

        customerRepository.deleteCustomer(customer2.getId());

        customerRepository.listCustomers()
                .forEach(customer -> System.out.println("##Customer listing: " + customer));
        HibernateUtil.closeSessionFactory();
    }
}
