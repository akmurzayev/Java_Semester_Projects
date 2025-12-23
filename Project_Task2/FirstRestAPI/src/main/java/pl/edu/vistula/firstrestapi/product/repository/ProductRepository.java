package pl.edu.vistula.firstrestapi.product.repository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.firstrestapi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

    //Spring Data JPA creates the repository implementation at runtime

}
