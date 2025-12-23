package pl.edu.vistula.firstrestapi.product.api.request;
import  com.fasterxml.jackson.annotation.JsonCreator;
import pl.edu.vistula.firstrestapi.product.domain.Product;

public class ProductRequest {
    private final String name;

    @JsonCreator
    public ProductRequest(String name){this.name = name;}
    public String getName(){return name;}

}
