package q2;

@interface info{
	int AuthorId() default 0;
	String Author();
	String Supervisor();
	String Date();
	int Time()default 000;
	double Version()default 1.00;
	String Description();
}
@info(AuthorId=11,Author="Sai",Supervisor="hyd",Date="06nov",Time=936,Version=1.01,Description="testing")
class details{
	int AuthorId;
	String Date;
	int Time;
	double Version;
	public details(int i, String j, int time, double version) {
		AuthorId = i;
		Date = j;
		Time = time;
		Version = version;
	}

}
public class dev {
	public static void main(String[] args) {
		details obj=new details(01,"06nov",1106,1.51);
		System.out.println(obj.AuthorId);
		System.out.println(obj.Date);
		System.out.println(obj.Time);
		System.out.println(obj.Version);
		}
		}