package Practice;

public class StrBuff {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("HiDear");
		StringBuffer str2= new StringBuffer("SeeYouSoon");
		
		System.out.println(str.length());
		System.out.println(str2.length());
		
		System.out.println(str2.deleteCharAt(2));
		System.out.println(str.delete(2,5));
		System.out.println(str2.insert(0,'a'));
        System.out.println(str.reverse());
	}

}
