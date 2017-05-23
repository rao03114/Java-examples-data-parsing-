package hadooppackage;


public class SpaceSeperated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "bhaskar 30 40 50 10 40 30";
		 
	        String[] lineArray = value.split(" ");
	        String name = null;
	        
	        for(int i=0;i<lineArray.length;i++)
	        {
	        	if(i==0)
	        	{
	        		name = lineArray[i];
	        }
	        	else
	       // 1. if(i>0)
	        {
	        	
	        	 System.out.println(name + " " + lineArray[i]);
	        }
	        
	        }
	        
	        
	       
	}
}
