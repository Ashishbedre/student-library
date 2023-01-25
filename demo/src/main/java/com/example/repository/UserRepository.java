package com.example.repository;
//User Repository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
	User findByEmail(String email);
	
}
