class Assignment1{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     Assignment1(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    	Assignment1.change();  
  
    	Assignment1 s1 = new Assignment1 (111,"Karan");  
    	Assignment1 s2 = new Assignment1 (222,"Aryan");  
    	Assignment1 s3 = new Assignment1 (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  