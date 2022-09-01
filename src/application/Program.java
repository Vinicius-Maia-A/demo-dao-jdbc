package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String args[]) {

        Scanner sc =  new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        /*Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        */

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        /*Department department = new Department(2,":)");
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list)
            System.out.println(obj);
        */

        System.out.println("\n=== TEST 3: seller findAll ===");
       /* List<Seller> list2 = sellerDao.findAll();
        for (Seller obj : list2)
            System.out.println(obj);
        */

        System.out.println("\n=== TEST 4: seller insert ===");
        //Seller seller2 = new Seller(null,"greg","greg@email.com",new Date(), 4000.0, department);
        //sellerDao.insert(seller2);
        //System.out.println("Inserted! New Id = " + seller2.getId());

        System.out.println("\n=== TEST 5: seller update ===");
        /* seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update completed!");
        list2 = sellerDao.findAll();
        for (Seller obj : list2)
            System.out.println(obj);
         */

        System.out.println("\n=== TEST 6: seller delete ===");
        List<Seller> list2 = sellerDao.findAll();
        for (Seller obj : list2)
            System.out.println(obj);
        System.out.println("Enter Id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }

}


