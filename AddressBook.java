import java.util.Scanner;  				// Import the Scanner class
class Bookopen						// class to open book (parent)
{
	public void openAddressBook()			//method to open bbok
   	{
		Scanner open=new Scanner(System.in);
		String a;
		a=open.nextLine();    			//storing string
    		System.out.println("Book is opened");
        }
}
class changeopen extends Bookopen			//child class
{
    	public void makeChanges()
    	{
    		System.out.println("Make changes you want to change");		//For making changes
		Scanner changes=new Scanner(System.in);
		String changedetails;
		changedetails=changes.nextLine();
    		System.out.println("save changes 1 to yes or 2 to no");         //for saving changes
		Scanner s1=new Scanner(System.in);
                int n;
		n=s1.nextInt();
		if (n == 1)
		{
      	    		System.out.println("1 to save or 2 to save as");
			Scanner save=new Scanner(System.in);
			int c;
			c=save.nextInt();
			if (c == 1)
			{
				 System.out.println("saved");
			}
			else
			{
				System.out.println("save as");
                        	Scanner d1=new Scanner(System.in);
                        	String d;
				d=d1.nextLine();
				System.out.println("saved as"+d);                //Name of the book

			}
		}
		else
		{
      	        System.out.println("changes not saved");
    		}
	}
}
class addNewBook								//class to open a new book(parent)
{
   	public void addBook()
    	{
        	System.out.println("Book Name is created");
    	}
}
class addData extends addNewBook						//child class
{
    	public void addNewData()
    	{
    		System.out.println("Make changes you want to change");
                Scanner changes=new Scanner(System.in);
                String changedetails;
                changedetails=changes.nextLine();
                System.out.println("save changes 1 to yes or 2 to no");          //For saving changes
                Scanner s1=new Scanner(System.in);
                int n;
                n=s1.nextInt();
                if (n == 1)
                {
                        System.out.println("1 to save or 2 to save as");
                        Scanner save=new Scanner(System.in);
                        int c;
                        c=save.nextInt();
                        if (c == 1)
                        {
                                 System.out.println("saved");
                        }
                        else
                        {
                                System.out.println("save as");                    //Name to save book
                                Scanner d1=new Scanner(System.in);
                                String d;
                                d=d1.nextLine();
                                System.out.println("saved as"+d);

			}
		}
    	}
}
public class AddressBook							  //Main class
{

	public static void main(String[] args) {
    	Scanner details = new Scanner(System.in);  				  // Create a Scanner object
    	AddressBook Book=new AddressBook();
    	menu();
    	int choice = details.nextInt();
    	while (choice != 9)							  //Based on choice we will make actions
    	{
		if (choice == 1)						  //Add a person in Address Book
		{
	    		System.out.println("Enter first name");
    	    		String firstName = details.nextLine();
	    		System.out.println("Enter last name");
	    		String lastName = details.nextLine();
	    		System.out.println("Enter address");
	    		String address = details.nextLine();
	    		System.out.println("Enter city");
	    		String city = details.nextLine();
	    		System.out.println("Enter state");
	    		String state = details.nextLine();
	    		System.out.println("Enter zip");
	    		String zip = details.nextLine();
	    		System.out.println("Enter phone number");
	    		String phoneNumber = details.nextLine();

            		System.out.println("Person details:\n"+firstName+" "+lastName+"\n"+address+"\n"+city+"\n"+state+"\n"+zip+"\n"+phoneNumber);  // Output user input
		}
        	else if (choice == 2)						//Edit a person details
		{
            		System.out.println("Enter address to change");
            		String address = details.nextLine();
            		System.out.println("Enter city to change");
            		String city = details.nextLine();
            		System.out.println("Enter state to change");
            		String state = details.nextLine();
            		System.out.println("Enter zip to change");
            		String zip = details.nextLine();
            		System.out.println("Enter phone number to change");
            		String phoneNumber = details.nextLine();
			System.out.println("changes made successfully");
		}
		else if (choice == 3)						//Delete a person name
		{
	    		System.out.println("Enter name to delete");
            		String name = details.nextLine();
			System.out.println("Deleted successfully");

		}
		else if (choice == 4)						//Sort entries by name
		{
	    		String temp;
	    		System.out.print("Enter number of strings you want to sort");
	    		int count=details.nextInt();
	    		String str[]=new String[count];
	    		Scanner nameSort=new Scanner(System.in);
            		System.out.print("Enter strings one by one : ");

	    		for (int i=0;i<count;i++)
	    		{
				str[i]=nameSort.nextLine();			//Array for names
			}
			for (int i=0;i<count;i++)
                        {

				for (int j=i+1;j<count;j++)
			    	{
					if (str[i].compareTo(str[j])>0)
			   		{
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
		    	   		}
	    	    		}
	    		}

	    		System.out.print("strings in sorted order:");
	    		for (int i=0;i<=count-1;i++)
			{
		    		System.out.print(str[i] + ", ");		//printing sorted names
			}
		}
		else if (choice == 5)						//Sort entries by zip
		{
	    		String temp;
            		System.out.print("Enter number of Zips you want to sort");
            		int count=details.nextInt();
            		String str[]=new String[count];
            		Scanner nameSort=new Scanner(System.in);
            		System.out.print("Enter zip one by one");
            		for (int i=0;i<count;i++)
            		{
			 str[i]=nameSort.nextLine();				//Array for entries
			}
			for (int i=0;i<count;i++)
                        {

                		for (int j=i+1;j<count;j++)
                    		{
                        		if (str[i].compareTo(str[j])>0)
                           		{
                                		temp=str[i];
                                		str[i]=str[j];
                                		str[j]=temp;
                           		}
                    		}
            		}
            		System.out.print("zips in sorted order:");		//printing sorted zips
            		for (int i=0;i<=count-1;i++)
                	{
                    		System.out.print(str[i] + ", ");
                	}
        	}
        	else if (choice == 6)						//To print entries
		{
            		System.out.print("Enter a number to print number of entries");
	    		int count=details.nextInt();
	    		String str[]=new String[count];
			Scanner s=new Scanner(System.in);
	    		System.out.print("Enter one by one");
			for (int i=0;i<count;i++)
                        {
                         str[i]=s.nextLine();
                        }

	    		for (int i=0;i<count;i++)
	    		{
				System.out.print(str[i] + ", ");
	    		}
		}
		else if (choice == 7)						//To open a book
		{
	     		System.out.println("Enter Book name you want to open: ");
			changeopen l=new changeopen();
			l.openAddressBook();
	     		l.makeChanges();

        	}
		else if (choice == 8)						//To Add a new Book
		{
	      		System.out.println("Enter New Book name : ");
              		addData l=new addData();
	      		l.addBook();
			l.addNewData();
        	}
        	else if (choice != 9)						//To exit
		{
              		System.out.println("Exited");

		}


      menu();
      choice = details.nextInt();
      }
}
	public static void menu()						//user choice to do which action to made
	{
              System.out.println("\n1.Add a person");
              System.out.println("2.Edit a person");
              System.out.println("3.Delete a person");
              System.out.println("4.Sort entries by name");
              System.out.println("5.Sort entries by zip");
              System.out.println("6.Print entries");
              System.out.println("7.Open a New Book");
              System.out.println("8.Add New Address Book");
              System.out.println("9.Exit");
	      System.out.println("Enter your choice");
        }
}
