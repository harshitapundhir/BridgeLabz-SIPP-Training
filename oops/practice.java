package oops;
public class practice {
    String name;
    Double weight;
    int age;


    // three types of constructor parmatrise non , default
    public practice( String name , Double weight , int age){
        this.name = name;
        this.weight = weight;
        this.age = age;

    }
    void display(){
        System.out.println("My name is " + name  +  " age is " + age + " weight is " + weight);
    }

    public section extends class{
        super (name,age,weight);
        
        


    }
        public static void main (String []args) {
        practice p = new practice("harshita", 58.00, 21);
        p.display();
        }


    }
     // inhertence


 



    

