-- Creación de la tabla customers
CREATE TABLE customers (
    id BIGINT PRIMARY KEY IDENTITY(1,1),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(255),
    date_of_birth DATE,
    address VARCHAR(255)
);
