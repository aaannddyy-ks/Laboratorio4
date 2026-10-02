public class Book {
    private String title;
    private Author author;
    private double price;


    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Libro: '" + title + "' | Autor: " + author.getName() + " | Precio: $" + price);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
