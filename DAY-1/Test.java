public class Test {
    public static void main(String[] args) {
        System.out.println(args.length > 0 ? args[0] : "Enter argument");
        System.out.println(args.length > 1 ? args[1] : "Enter argument");
        System.out.println(args.length > 2 ? args[2] : "Enter argument");
    }
}
// - List 3 favorite foods.  
// - List 3 favorite books.  
// - List 3 favorite places.

//! java Test Favorite Foods:

/*
! cammand line argument text 
java Test "Favorite Foods: Pizza,Burger,Pasta" "Favorite Books: Jani na,365 days,Atomic Habbits" "Favorite Places: Kolkata,Durgapur,Rampurhat"   

? Favorite Foods: Pizza,Burger,Pasta
? Favorite Books: Jani na,365 days,Atomic Habbits
? Favorite Places: Kolkata,Durgapur,Rampurhat
 */