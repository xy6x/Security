package org.example.security.Repository;

import org.example.security.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtuhRepository extends JpaRepository<User,Integer> {
User findUserByUsername(String userName);
User findUserById(Integer id);
}
