package Unit_01;

	
	      double f;
	      int i = 10;
	      f = i;
	
	      double g = 10;
	      int j;
	      j = (int) g; 
	
	      System.out.println(f);
	      System.out.println(i);
	      System.out.println(g);
	      System.out.println(j);
	
	      byte k = 10 ;
	      boolean l = true ; 
	      long m = 10L;
	      float n = 1.2f;
	      double o = 1.2d;
	
	     System.out.println(k);
	     System.out.println(l);
	     System.out.println(m);
	     System.out.println(n);
	     System.out.println(o);
	
	     System.out.println(DEF.j); 
	
	     DEF obj1 = new DEF();
	     System.out.println(obj1.i++);
	     System.out.println(obj1.i);
	
	     DEF obj2 = new DEF();
	     System.out.println(obj2.i);
	
	     //System.out.println(obj1.j++);
	     //System.out.println(obj1.j);
	     //System.out.println(obj2.j);
	
	     System.out.println(DEF.j++);
	     System.out.println(DEF.j);
	
	     DEF.typeconversionAndtypeCasting();
    }

    int r = 10;
    
    void display() {
	         
    	int a = 5; // local variable
	    System.out.println("This is display method");
	    System.out.println(a);
	}
}

class DEF {

	static int j = 10; 
    int i = 10; 

    static void display() {
    	int a = 5;
	    System.out.println("This is display method");
	    System.out.println(a);
	}

static void typeconversionAndtypeCasting() {
	
	
	double f; 
	int i = 10; 
	f = i;
	System.out.println(f);
	
	double g = 10;
	int j ; 
	j = (int)g;
	
	
	System.out.println(i);
	System.out.println(j);
	
	}
}