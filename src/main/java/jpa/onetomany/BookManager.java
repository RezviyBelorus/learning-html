package jpa.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookManager {
    @Autowired
    BookDAO bookDAO;

    @Transactional
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }
}
