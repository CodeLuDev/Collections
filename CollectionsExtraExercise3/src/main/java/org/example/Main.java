package org.example;

import org.example.entity.Book;
import org.example.service.BookService;

import java.util.HashSet;
import java.util.Scanner;

/*
Español
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
-Constructor por defecto.
-Constructor con parámetros.
-Métodos Setters/getters
-Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
-Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
-Método toString para mostrar los datos de los libros.

English
Implement a program for a Library using a HashSet to avoid data
repeated. To do this, you must create a class called Book that stores the information of
each one of the books of a Library. The Book class should store
the title of the book, author, number of copies and number of copies borrowed.
A HashSet of type Book will also be created in the main that will store all the books
created.
In main we will have a loop that creates a Book object asking the user for all his
data and setting it in the Book. That Book is then saved to the set and
asks the user if he wants to create another Book or not.
The Library class will also contain the following methods:
-Default constructor.
-Constructor with parameters.
-Setter/getter methods
-Loan() method: The user enters the title of the book that he wants to lend and it is searched for.
in the set. If it is in the array, the method is called with that Book object. He
method is incremented by one, such as a shopping cart, the instances attribute
borrowed, from the book that the user entered. This will happen every time a
book loan. It will not be possible to lend books of which there are no copies left.
available to borrow. Returns true if the operation was successful and false on
opposite case.
-method return(): The user enters the title of the book that he wants to return and it will be returned to him.
search the set. If it is in the array, the method is called with that object. He
method decrements by one, like a shopping cart, the instances attribute
borrowed, from the book selected by the user. This will happen every time you
produce the return of a book. Books cannot be returned where they do not have
borrowed copies. Returns true if the operation was successful and false on
opposite case.
-toString method to display the book data.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        BookService bookService = new BookService();

        //five default books
        Book b1 = bookService.createAndAddBook("Pride and Prejudice","Jane Austen",100,10);
        Book b2 = bookService.createAndAddBook("To Kill a Mockingbird","Harper Lee",80,5);
        Book b3 = bookService.createAndAddBook("1984","George Orwell",120,20);
        Book b4 = bookService.createAndAddBook("The Great Gatsby","F. Scott Fitzgerald",90,15);
        Book b5 = bookService.createAndAddBook("Moby-Dick","Herman Melville",70,8);

        int option;
        do {
            System.out.println("-----MENU-----");
            System.out.println("Chose a option" +
                    "\n1. Show all books" +
                    "\n2. Borrow book" +
                    "\n3. Return book" +
                    "\n4. Exit");
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    HashSet<Book> bookSet = bookService.getBookSet();
                    bookSet.forEach((book) -> System.out.println("Title: " + book.getTitle() + ", author: " + book.getAuthor() + ", number of copies: " + book.getNumberOfCopies() + ", number of copies borrowed: " + book.getNumberOfCopiesBorrowed()));
                    break;
                case 2:
                    System.out.print("Which book do you want? Type the title`s book: ");
                    String bookToBorrow = read.nextLine();
                    boolean answerBorrow = bookService.borrowBook(bookToBorrow);
                    System.out.println("Borrow book done: "+ answerBorrow);
                    break;
                case 3:
                    System.out.print("Which book do you want to return? Type the title`s book: ");
                    String bookToReturn = read.nextLine();
                    boolean answerReturn = bookService.returnBook(bookToReturn);
                    System.out.println("Return book done: "+ answerReturn);
                    break;
                case 4:
                    System.out.println("Bye Bye!!");
                    break;
                default:
                    System.out.print("Wrong option. Enter a new onw: ");
                    option = read.nextInt();
            }

        } while (option != 4);

    }
}