package com.example.service;
//Book Service
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Book getBookByName(String name) {
		return bookRepository.findByName(name);
	}
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}
	
}