```sh

curl -X POST localhost:8080/books/insert-book \
-H "Content-Type: application/json" \
-d '{
"title": "Lovely War",
"summary": "Teste",
"price": 10.99,
"isbn": "1231231231231",
"category": "romance",
"author": "cecilia",
"publicationDate": "2024-12-06T12:00:00"
}'

curl -X GET localhost:8080/books/get-all-books


```