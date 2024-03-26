package org.example.springjpa.repo;
import org.example.springjpa.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

// no need manual @Repository annotation because JPARepository is already annotated with @Repository
public interface productRepo extends JpaRepository<product,Integer> {

}
