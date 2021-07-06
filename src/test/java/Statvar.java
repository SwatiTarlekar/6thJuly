
public class Statvar {
int x=1;
static int y=2;
public static void main(String[] args) {
	
	Statvar s=new Statvar();
	s.x=3;
	s.y=4;
	Statvar s2=new Statvar();
	System.out.println(s2.x+"   "+y);
	s2.y=5;
	Statvar s3=new Statvar();
	s2.y=6;
	System.out.println(y);
}
}


