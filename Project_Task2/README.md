# Task 2 – REST API with Spring Boot

This project is a REST API created using Spring Boot.
All endpoints were tested using Postman and Swagger UI.

---

## Swagger UI
Swagger UI shows all available API endpoints.

![Swagger UI](images/SwaggerUI.png)

---

## Create Product (POST)
A new product is created using Postman.

![Create Product](images/PostProduct.png)

---

## Get Product by ID (200 OK)
A product is successfully retrieved by its ID.

![Get Product](images/GetProducts.png)

---

## Get Product by ID (404 Not Found)
An error message is returned when the product does not exist.

![Product Not Found](images/GetProductIDNotFound.png)

---

## Get All Products
All products are returned as a list.

![Get All Products](images/GetAllProducts.png)

---

## Update Product (PUT)
An existing product is updated.

![Update Product](images/PutUpdate.png)

---

## Delete Product (DELETE)
A product is deleted by its ID.

![Delete Product](images/Delete.png)

---

## After Delete
The product is no longer available after deletion.

![After Delete](images/AfterDelete.png)

---

## H2 Database Console
H2 in-memory database and PRODUCTS table.

![H2 Console](images/H2Console.png)
![H2 Database](images/H2DB.png)

### Database Verification

The application was tested using the implemented REST endpoints.
To verify that the operations affected the database correctly, the following SQL query was executed in the H2 Console:

```sql
SELECT * FROM PRODUCTS;
![Database View](images/SelectAllProducts.png)
