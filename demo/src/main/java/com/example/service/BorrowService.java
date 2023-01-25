package com.example.service;
//Borrow Service
@Service
public class BorrowService {

	@Autowired
	private BorrowRepository borrowRepository;
	
	public List<Borrow> getAllBorrows() {
		return borrowRepository.findAll();
	}
	
	public Borrow getBorrowByBookId(Long bookId) {
		return borrowRepository.findByBookId(bookId);
	}
	
	public Borrow getBorrowByUserId(Long userId) {
		return borrowRepository.findByUserId(userId);
	}
	
	public Borrow saveBorrow(Borrow borrow) {
		return borrowRepository.save(borrow);
	}
	
	public void deleteBorrow(Borrow borrow) {
		borrowRepository.delete(borrow);
	}
	
}



