CREATE TABLE customers (
       id bigint generated always as identity primary key not null,
       firstname varchar(100),
       lastname varchar(100),
       phone varchar(100),
       username varchar(100),
       password varchar(100)
);

CREATE TABLE medicines (
       id bigint generated always as identity primary key not null,
       name varchar(100),
       price varchar(100),
       quantity varchar(100)
);

CREATE TABLE orders (
       id bigint generated always as identity primary key not null,
       customer_id bigint NOT NULL,
       medicine_id bigint NOT NULL,
       date date
);

ALTER TABLE orders
    ADD CONSTRAINT fk_customer_id
        FOREIGN KEY (customer_id) REFERENCES customers(id);

ALTER TABLE orders
    ADD CONSTRAINT fk_medicine_id
        FOREIGN KEY (medicine_id) REFERENCES medicines(id);