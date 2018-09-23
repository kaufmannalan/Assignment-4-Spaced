public class Main {

    public static void main(String[] args) {
	// write your code here
        float xa= 5f;
        float xb=4f;
        float xc=-3f;
        float ya=2f;
        float yb=9f;
        float yc=2f;
        float za=-5f;
        float zb=2f;
        float zc=6f;

               double save1= Math.sqrt(Math.pow(xa-xb,2f)+Math.pow(ya-yb,2f)+Math.pow(za-zb,2f));
        double save2= Math.sqrt(Math.pow(xa-xc,2f)+Math.pow(ya-yc,2f)+Math.pow(za-zc,2f));
        double save3= Math.sqrt(Math.pow(xc-xb,2f)+Math.pow(yc-yb,2f)+Math.pow(zc-zb,2f));
                System.out.println("the minimum distance between the  drones is between A and B, and is  "+save1+", the maximum distance between the drones is between A and C, and is "+save2+"");
    }
}
