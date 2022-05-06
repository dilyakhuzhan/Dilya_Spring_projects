package kz.narxoz.narxozapp.controller;
import kz.narxoz.narxozapp.model.book;
import kz.narxoz.narxozapp.repository.bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    bookrepository bookrepository;

    @GetMapping("books")
    public List<book> getAll() {
        return bookrepository.findAll();
    }
}

