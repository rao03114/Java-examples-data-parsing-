package hadooppackage;

public class MovingOneArraytoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,2,1,2,3,6,4,5,6};
        int b[] = new int[a.length];
        int c[] = a.clone();
        int d[] = a;
        String e = "kbr";
        System.out.println(e.getClass());
        
        System.out.println(d[3]);

        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            //System.out.println(b[i]);
            //System.out.println(c[i]);

        }
	}            //System.out.println(b[i]);


}
