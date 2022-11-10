package org.example;

import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl {
    public void save() {
        System.out.println("book dao save ...");
    }
    public class BookServiceImpl {
//        private BookDao bookDao;
//
//        public void setBookDao(BookDao bookDao) {
//            this.bookDao = bookDao;
//        }

        public void save() {
            System.out.println("book service save ...");
//            bookDao.save();
        }
    }
}
