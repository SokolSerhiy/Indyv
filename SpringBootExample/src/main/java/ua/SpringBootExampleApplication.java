package ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import ua.entity.Author;
import ua.entity.Book;
import ua.repository.AuthorRepository;
import ua.repository.BookRepository;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootExampleApplication.class, args);
		AuthorRepository authorRepository = run.getBean(AuthorRepository.class);
		BookRepository bookRepository = run.getBean(BookRepository.class);
//		Author author = new Author();
//		author.setName("Taras Shewchenko");
//		authorRepository.save(author);
//		Book book = new Book();
//		book.setTitle("Kobzar");
//		book.setAuthor(author);
//		bookRepository.save(book);
//		Book book2 = new Book();
//		book2.setAuthor(author);
//		book2.setTitle("Bukwar");
//		bookRepository.save(book2);
		Author author = authorRepository.findByName("Taras Shewchenko");
		System.out.println(author);
		for(Book book : author.getBooks()){
			System.out.println(book);
		}
		run.close();
	}
}
