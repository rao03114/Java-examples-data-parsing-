package hadooppackage;



import java.io.IOException;

//import org.apache.pig.data.BagFactory;
//import org.apache.pig.data.DataBag;
//import org.apache.pig.data.TupleFactory;

public class CommaSeperatedAppend1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fw = "a,b,c,d,e,f,g,h";
		//String input = load;
		String line = fw.toString();
		String[] commaArray = line.split(",");
		try
		{
			//TupleFactory tupleFactory = TupleFactory.getInstance(); 
			//BagFactory bagFactory = BagFactory.getInstance();
			//DataBag output = bagFactory.newDefaultBag();
		for(int i=0;i<commaArray.length;i++)
        {
			System.out.println(commaArray[i] + "," + "1");
    	
    	
           
            //output.add(tupleFactory.newTuple(ImmutableList.of(commaArray[i])),1);
            
            //  it can be also written without ImmutableList.of function as below
             //output.add(tupleFactory.newTuple( commaArray[i] + "," + "1")); 
           
        }
        
        
        //int variable;
        /*for(String number:spaceArray)
        	{
        	variable = Integer.parseInt(number);
      	    
        	output.add(tupleFactory.newTuple(name));
         	output.add(tupleFactory.newTuple(variable));
            } */
        //System.out.println(output);
 //return t; 
        
		} catch(Exception ArrayIndexOutOfBoundsException)
		{
			return;
		}
		

	}

}
