
public class Main {
static int usAl(int alt,int us) {
	    if(us==1) {
	    	return alt;
	    }
	return	alt*usAl(alt,(us-1));
}
	public static void main(String[] args) {
		System.out.println(usAl(5,3));
	}

}
