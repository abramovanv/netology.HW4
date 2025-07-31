public class Book {
    public String title;
    public int releaseYear;
    public  Author author;
    public int pages;


    public Book(String title, int releaseYear, Author  author, int pages) {
        this.title=title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(){
        if (pages>500) {return true;}
        else {return false;}
    }

    public boolean matches(String word) {

        if (title.contains(word) || author.surname.contains(word) ||  author.name.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = (int) Math.floor(pages * 3* Math.sqrt(this.author.rating));

        if (price < 205) {
            price = 250;
        }
        return price;
    }

}
