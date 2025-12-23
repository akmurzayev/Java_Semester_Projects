package pl.edu.vistula.firstrestapi.product.support;
import pl.edu.vistula.firstrestapi.product.support.exception.ProductNotFoundException;
import java.util.function.Supplier;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> productNotFound(Long id){
        return () -> new ProductNotFoundException(id);
    }
}
