CREATE DATABASE dbda;

USE dbda;

CREATE TABLE book (
    book_id INT PRIMARY KEY,
    book_name VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE,
    quantity INT
);
SELECT * FROM book;

INSERT INTO book VALUES
(101, 'Java Programming', 'James Gosling', 650, 10),
(102, 'Python Basics', 'John Smith', 550, 20),
(103, 'Database Systems', 'Korth', 800, 12);

SELECT * FROM book;
