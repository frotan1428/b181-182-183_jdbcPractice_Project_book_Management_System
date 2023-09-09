package com.tpe;

/*
MiniProject: Book Management System
    1. Create Book Management System that can be used by any library or book store
    2. User (Admin) can: CRUD operations
        - register book (id, title, author, genre, pageCount fields)
        - list/display books
        - update book by id
        - delete book by id
*/

import java.util.Scanner;

// 1. Create menu for the app
// 2. Create book class (entity)
// 3. Create methods for books
// 4. Create class to connect database
public class Runner {

    //step 1: Create a menu
    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner input= new Scanner(System.in);

        int select;
      do {
          System.out.println("----------------------------------------");
          System.out.println("***** Book Admin Panel *****");
          System.out.println("1-Register Book");
          System.out.println("2-List All  Books");
          System.out.println("3-Delete  Book");
          System.out.println("4-Update Book");
          System.out.println("5-Find Book By id");
          System.out.println("0-exist");
          System.out.println("Select Activity");
          System.out.println("----------------------------------------");
          select=input.nextInt();

          switch (select){
              case 1:
                  //Register book
                  break;
              case 2:
                  //Display All books
                  break;
              case 3:
                  //Delete  book by id
                  break;
              case 4:
                  //Update   book by id
                  break;
              case 5:
                  //Find Book by Id;
                  break;
              case 0:
                 //exit app
                  System.out.println("Thank you for using the App. Have a nice time !");
                  break;
              default:
                  System.out.println("Incorrect input .Try numbers between 0 and 5");

          }
      }while (select!=0);

    }

}
