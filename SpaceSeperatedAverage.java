package hadooppackage;


public class SpaceSeperatedAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "bhaskar 10 20 ";
		 
	        String[] lineArray = value.split(" ");
	        String name = null;
	        int sum = 0;
	        for(int i=0;i<lineArray.length;i++)
	        {
	        	if(i==0)
	        	{
	        		name = lineArray[i];
	        }
	        if(i>=1)
	        {
	        	int A = Integer.parseInt(lineArray[i]);
	        	sum += A;
	        	
	        }
	        
	        }
	        //System.out.println(name + " " + sum);
	        int avg = sum/(lineArray.length-1);
	        System.out.println(name + " " +avg);
	        System.out.println(lineArray.length-1);
	       
	}
}
