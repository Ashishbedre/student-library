package com.example.repository;
//Book Repository
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Book findByName(String name);
	
}
    

