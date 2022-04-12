package com.bean;
import com.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringH.xml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BookDao b = (BookDao) context.getBean("dao");
        while (true) {
            System.out.println("1:insert the record 2:update salary by name 3:fetch all 4:delete 5:exit");
            int ch = Integer.parseInt(reader.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter name, Author Name and Price");
                    Book book = new Book();
                    book.setBname(reader.readLine());
                    book.setAname(reader.readLine());
                    book.setPrice(Float.parseFloat(reader.readLine()));
                    int i = b.insertBook(book);
                    if (i > 0)
                        System.out.println("Successful Insertion");
                    else
                        System.out.println("Unsuccessful");
                    break;
                case 2:
                    System.out.println("Enter Employee name and new salary to be Updated");
                    String name = reader.readLine();
                    float bprice = Float.parseFloat(reader.readLine());
                    b.updateBook(name,bprice);
                    break;
                case 3:
                    List<Book> emp=b.fetchBook();
                    for(Book l:emp){
                        System.out.println(emp);
                    }
                    break;
                case 4:
                    System.out.println("Enter name of employee to delete");
                    String name1= reader.readLine();
                    b.deleteBook(name1);
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}