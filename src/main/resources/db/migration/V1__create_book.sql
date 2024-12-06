CREATE TABLE book
(
    id                BIGINT AUTO_INCREMENT PRIMARY KEY,
    title             VARCHAR(255)   NOT NULL,
    summary           VARCHAR(255),
    price             DECIMAL(10, 2) NOT NULL,
    isbn              VARCHAR(13)    NOT NULL,
    category          VARCHAR(70),
    author            VARCHAR(255)   NOT NULL,
    table_of_contents TEXT,
    number_of_pages   INT,
    publication_date  DATETIME       NOT NULL,
    created_at        DATETIME       NOT NULL
);