<h1>Books API</h1>
<p>This API allows for the management of a collection of books. The endpoints support basic CRUD operations as well as searching by author.</p>

<h2>Endpoints</h2>

<h3>1. Get All Books</h3>
<p><strong>Endpoint:</strong> <code>GET /books</code></p>
<p><strong>Description:</strong> Retrieve a list of all books in the collection.</p>
<p><strong>Responses:</strong></p>
<ul>
  <li><code>200 OK</code> - Books successfully retrieved.</li>
</ul>

<h3>2. Create a New Book</h3>
<p><strong>Endpoint:</strong> <code>POST /books</code></p>
<p><strong>Description:</strong> Add a new book to the collection.</p>
<p><strong>Request Body:</strong> A JSON object representing the book details.</p>
<p><strong>Responses:</strong></p>
<ul>
  <li><code>200 OK</code> - Book successfully created.</li>
</ul>

<h3>3. Update a Book by ID</h3>
<p><strong>Endpoint:</strong> <code>PUT /books/{id}</code></p>
<p><strong>Description:</strong> Update the details of an existing book by its ID.</p>
<p><strong>Request Body:</strong> A JSON object with updated book details.</p>
<p><strong>Responses:</strong></p>
<ul>
  <li><code>200 OK</code> - Book successfully updated.</li>
  <li><code>404 Not Found</code> - Book ID not found.</li>
</ul>

<h3>4. Delete a Book by ID</h3>
<p><strong>Endpoint:</strong> <code>DELETE /books/{id}</code></p>
<p><strong>Description:</strong> Delete a book from the collection by its ID.</p>
<p><strong>Responses:</strong></p>
<ul>
  <li><code>200 OK</code> - Book successfully deleted.</li>
</ul>

<h3>5. Find Books by Author</h3>
<p><strong>Endpoint:</strong> <code>GET /books/author/{author}</code></p>
<p><strong>Description:</strong> Retrieve a list of books written by a specified author.</p>
<p><strong>Responses:</strong></p>
<ul>
  <li><code>200 OK</code> - Books by the specified author retrieved.</li>
</ul>

<h2>Models</h2>
<p><strong>BookRequestDTO</strong> - Used for creating and updating books. Contains book information such as title, author, genre, etc.</p>
<p><strong>BookResponseDTO</strong> - Used for displaying book details in response to GET requests.</p>

<h2>Technologies</h2>
<p>This API is built using Java, Spring Boot, and MySQL for data storage.</p>
