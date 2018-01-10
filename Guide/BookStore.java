/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

/**
 *
 * @author Mohammed Maaz S
 */
class BookDetails {

    String title, author;

    int pages;
    float price;

   

    public BookDetails(String title, String author, int pages, float price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

  

    public void disp() {
        System.out.println("Title" + title);
        System.out.println("Author" + author);
        System.out.println("Pages" + pages);
        System.out.println("Price" +price);

    }

}

public class BookStore extends BookDetails {
 

    public static void main(String args[]) {
        BookStore obj = new BookStore("Java Programming", "Srikanth", 75, 80.0f, "Java", 8);
    BookStore obj1 = new BookStore("Hardware Programming", "Srikanth", 75, 80.0f, "CPU", "Skyward");
obj.dispSw();
obj1.dispHw();

    }
    String name, category, publisher;
    int version;

    public BookStore(String title, String author, int pages, float price, String name, int version) {
        super(title, author, pages, price);
        this.name = name;
        this.version = version;

    }

    public BookStore(String title, String author, int pages, float price, String category, String publisher) {
        super(title, author, pages, price);
        this.category = category;
        this.publisher = publisher;

    }

   

    public void dispSw() {
        super.disp();
                BookStore obj = new BookStore("Java Programming", "Srikanth", 75, 80.0f, "Java", 8);

        System.out.println("Software Name" + name);

        System.out.println("Software Version " + version);
    }

    public void dispHw() {
        super.disp();
        System.out.println("Category " + category);

        System.out.println("Publisher " + publisher);
    }

}
//Version  Name
//Category publisher
