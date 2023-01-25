package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Book;
import com.example.entity.User;
import com.example.service.BookService;
import com.example.service.UserService;


@RestController
public class LibraryManagementController {

    @Autowired
    private LibraryManagementService LibraryManagementService;

    // @Autowired
    // private UserService userService;

    @GetMapping("/Borrow")
    public ResponseEntity<List<Book>> Borrow(Long userId, Long bookId, Date dueDate) {
        return ResponseEntity.ok(LibraryManagementService.borrowBook(userId, bookId, dueDate)); 
    }

    @PostMapping("/return")
    public ResponseEntity<boolean> return(@RequestBody Book book, User user) {
        return ResponseEntity.ok(LibraryManagementService.returnBook(book, user));
    }

    @PostMapping("/calculate")
    public ResponseEntity<double> calculate(@RequestBody Book book, User user) {
        return ResponseEntity.ok(LibraryManagementService.calculateFine(book, user));
    }

}

