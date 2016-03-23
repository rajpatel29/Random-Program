package aa;

class SomeClass {

	   void divide( int num, int den) throws Exception
	   {
		   if(den==0)
		   {
//			   throw new RuntimeException("hhheeeeyy");
			   
//			   throw new Exception("DivideByZeroException");
			   
			   throw new Exception("DivideByZeroException");
		   }
		   else
		   {
			   System.out.println( "" + (num / den) );
		   }
	       

	   }

	   void fun() {

		   try
		   {
			   divide( 4, 0);
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }

	   } 

	}
