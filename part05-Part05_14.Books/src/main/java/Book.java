
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals (Object compared){
        //1 
        if (this == compared){ return true;}
        //2 
        if (!(compared instanceof Book)){ return false;}
        //3
        Book comparedObj = (Book) compared;
        if(this.name.equals(comparedObj.name) &&
                this.publicationYear == comparedObj.publicationYear){
            return true;}
        return false;
    }

}
