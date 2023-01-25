package com.example.repository;
//Borrow Repository
@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long> {

	Borrow findByBookId(Long bookId);
	Borrow findByUserId(Long userId);
	
}