package Workshop;

import java.util.*;
public class BookBuddy{
    static List<String> books=new ArrayList<>();
    
    public static void addBooks(String Title,String Author){
        books.add(Title+"-"+Author);
    }
    
    public static void sortAlphabetcially(){
        int n=books.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(books.get(j).compareToIgnoreCase(books.get(j+1))>0){
                    String temp=books.get(j);
                    books.set(j,books.get(j+1));
                    books.set(j+1,temp);
                }
            }
        }
    }
    
    public static String searchAuthor(String author){
        String s="";
        for(String book:books){
            String [] str=book.split("-");
            if(str[1].equalsIgnoreCase(author))
            s+=book;
        }
        return s;
    }
    
    public static void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books.");
        }
        else{
            for(String book:books){
                System.out.println(book);
            }
        }
    }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("\nEnter the number Of books : ");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        String title=sc.next();
	        String author=sc.next();
	        addBooks(title,author);
	    }
		System.out.println("ALL BOOKS:");
		displayBooks();
		System.out.println("\nBooks sorted alphabetcially :");
		sortAlphabetcially();
		displayBooks();
		System.out.println("\nEnter the author to be searched");
		String auth=sc.next();
		System.out.println(searchAuthor(auth));
	}
}
