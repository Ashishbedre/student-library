package com.example.service;
//Library Management Service
@Service
public class LibraryManagementService {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BorrowService borrowService;
	
	@Autowired
	private UserService userService;
	
	public Book borrowBook(Long userId, Long bookId, Date dueDate) {
		User user = userService.getUserByName(userId);
		Book book = bookService.getBookByName(bookId);
		if(user != null && book != null) {
			Borrow borrow = new Borrow(null, userId, bookId, dueDate);
			borrowService.saveBorrow(borrow);
			return book;
		}
		return null;
	}
	
	public boolean returnBook(Long userId, Long bookId) {
		Borrow borrow = borrowService.getBorrowByBookId(bookId);
		if(borrow != null) {
			borrowService.deleteBorrow(borrow);
			return true;
		}
		return false;
	}
	
	public double calculateFine(Long userId, Long bookId) {
		Borrow borrow = borrowService.getBorrowByBookId(bookId);
		if(borrow != null) {
			Date dueDate = borrow.getDueDate();
			Date currentDate = new Date();
			long diff = currentDate.getTime() - dueDate.getTime();
			double fine = diff * 2;
			return fine;
		}
		return 0.0;
		
	}
	
	
	
}
