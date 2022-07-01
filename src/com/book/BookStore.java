package com.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	
	 
		static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		static ArrayList<Book> books=new ArrayList<Book>();
		static ArrayList<User> users=new ArrayList<User>();
	   public static User activeUser;
		public static int cart;
		private static String Password;
		private static String Username;
	   

	public BookStore() {
		
		 
		 books.add(new Book(101 ,"The Sky                  ","Aman Varma              ",100," poetry          ",1001));
		 books.add(new Book(102,"Java Programming          ","P.K.patil               ",80, " ProgrammingBook ",1002));
		 books.add(new Book(103,"Panchtantra               ","Vikas Jadhav            ",50,"  Story           ",1003));
		 books.add(new Book(104,"A Million Thoghts         ","Astha Anand             ",110," Story           ",1004));
		 books.add(new Book(105,"Fear Not Be Strong        ","Swami Vivekanand        ",25,"  Motivational    ",1005));
		 books.add(new Book(106,"Fairy Tales               ","Christian Anderson      ",200," Story           ",1006));
		 books.add(new Book(107,"Something I Never Told U  ","Shravya Bhinder         ",190," Story           ",1007));
		 books.add(new Book(108,"Better than best friends  ","Ahona Sadhu             ",170," poetry          ",1008));
		 books.add(new Book(109,"Selected poems GULZAR     ","Pavan k. Varma          ",180," poetry          ",1009));
		 books.add(new Book(110,"Twelve paranormal tales   ","Amitav Ganguly          ",150," HorrorStory     ",1010));
		
		
		 
	}
	
	public void viewAllBookInfo()
	    {
	        if(books.size()>0)
	        {
	          for(Book book:books)
	        {
	           System.out.print("BookId:"+book.getBookId()+"\t"+"Name:"+book.getBookName()+"\t"+"Author:"+book.getBookAuthor()+"\t"+"Price:"+book.getBookprice()+"\t"+"BookDescription:"+book.getBookDesc()+"\t"+"BookIsbn:"+book.getBookIsbn()+"\n");
	        }
	        }
	        else
	        {
	           System.out.println("No record found!!");
	        }
	    }
	  
	  
	    
		  public void addNewBookInfo() throws NumberFormatException, IOException 
		    {
		        System.out.println("Enter Book Id:");
		        int bookId=Integer.parseInt(br.readLine());
		        
		        System.out.println("Enter Book Name:");
		        String bookName=br.readLine();
		        
		        System.out.println("Enter Book Author:");
		        String bookAuthor=br.readLine();
		        
		        System.out.println("Enter Book price:");
		        int bookprice=Integer.parseInt(br.readLine());
		        
		        System.out.println("Enter Book Description:");
		        String bookDesc=br.readLine();
		        
		        System.out.println("Enter Book isbn:");
		        long bookIsbn=Integer.parseInt(br.readLine());
		        
		        Book book=new Book(bookId,bookName,bookAuthor,bookprice,bookDesc,bookIsbn);
		        
		        
		        books.add(book);
		        System.out.println("===============================================================");
		    }
		        
		        public void deteteBookInfoBybookId() throws NumberFormatException, IOException 
		        {
		            System.out.println("Enter Book Id:");
		            int bookId=Integer.parseInt(br.readLine());
		            int flag=0,index;
		           Book bk = new Book();
		            for(Book b:books)
		            {
		                if(bookId==b.getBookId())
		                {
		                flag=1;
		                bk=b;       
		                }
		            }
		                    
		            if(flag==0)
		            {
		                System.out.println("Book id does not exist!!");
		            }
		            else
		            {
		               books.remove(bk);
		               System.out.println("Book information deleted Succesfully!!");
		             }
		        }
		        
		       
		       public static void register()
		        {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Username");
				String Username = scanner.next();
				System.out.println("Password");
				String password =scanner.next();
				User newUser = new User(Username, password, User.UserType.USER);
				activeUser = newUser;
				cart += 30;
				users.add(newUser);
				System.out.println("YOU HAVE BEEN REGISTERED SUCCESSFULLY.");
		        }
		  

		       public void addBookToCart() {
				Scanner scanner = new Scanner(System.in);
				int choice = 0;
				for(int i=0;i<10;i++)
					System.out.println(i + "-" + books.get(i).getBookName());
				choice = scanner.nextInt() % 10;
				
				if(activeUser.getType() == User.UserType.ADMIN || activeUser.getType() == User.UserType.USER)
				{
					cart += books.get(choice).getBookprice();
					
				}else {
					cart += books.get(choice).getBookprice() * 1.5;
					
				}
				System.out.println("YOUR FEE:" + cart);
			
				
			}
			
			public static void pay()
			{
				System.out.println("THANK YOU!! " + activeUser.getUserName() + "," + "You Payed  " + cart + " $");
				cart = 0;
			}
		
		  
		
	public static void main(String[] args) throws NumberFormatException, IOException {
			BookStore app=new BookStore();
			
			
    
    System.out.println("===============================================================");
    System.out.println("********************* Book Store Management ********************");
    System.out.println("===============================================================");
    String c=null;
    do
    {
    System.out.println("\t\t 1) VIEW ALL BOOK DATA.\r\n"
            + "\t\t 2) ADD NEW BOOK DATA.\r\n"
            + "\t\t 3) DELETE BOOK RECORD. \r\n"
            + "\t\t 4) REGISTER AS NEW USER.\r\n"
            + "\t\t 5) ADD BOOK TO CART.\r\n"
            + "\t\t 6) MAKE PAYMENT.\r\n"
            );
    System.out.println("===============================================================");
    System.out.println("Enter Your Choice:");
    int choice=Integer.parseInt(br.readLine());
    System.out.println("===============================================================");

    
    switch(choice)
    {
    	case 1:System.out.println("View all Book Information:");               
    			app.viewAllBookInfo();
    			break;
    	case 2: app.addNewBookInfo(); 
            	System.out.println("Book Information inserted Successfully!!");
            	break;
    	case 3:app.deteteBookInfoBybookId();
    			break;
    	case 4:app.register();
                break;
    	case 5:app.addBookToCart();
            	break;
        case 6:app.pay();
                break;
      default:System.out.println("Wrong Choice!!");
            break;
    
    }
    
    System.out.println("Do you want to continue?(Y->Yes / N->No)");
    c=br.readLine();

    
    }while(c.equals("Y")|| c.equals("y"));
    
    System.out.println("THANK YOU FOR VISITING!!..See you again..");
}

	

}
