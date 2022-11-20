package ru.geekbrains.spring1.hibernate2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
        Product p = productDao.findById(2l);
        //System.out.println(p.getCustomers());

        CustomerDao customerDao = new CustomerDaoImpl(sessionFactoryUtils);
        Customer c = customerDao.findById(2l);
        System.out.println(c.getProducts());

        sessionFactoryUtils.shutdown();
    }
}
