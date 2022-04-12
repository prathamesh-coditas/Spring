package com.dao;

import com.bean.Book;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookDao {
    HibernateTemplate ht;
    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    public HibernateTemplate getHt() {
        return ht;
    }
    @Transactional
    public int insertBook(Book b){
        return (int)ht.save(b);
    }
    @Transactional
    public int updateBook(String n,float s){
        return ht.bulkUpdate("update Book SET price="+s+"where bname='"+n+"'");
    }
    @Transactional
    public int deleteBook(String n){
        return ht.bulkUpdate("delete from Book where bname='"+n+"'");
    }
    public List<Book> fetchBook(){
        return ht.loadAll(Book.class);
    }
}
