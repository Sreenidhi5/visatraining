package myproject;

public class DOWFinder {
	public static void main(String[] args) {
			int a= finddow(8,12,2000);
		switch(a)
		{
		case 0:System.out.println("sunday");
		break;
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("fffffffffriday");
		break;
		case 6:System.out.println("saturday");
		break;
		}
	}
    static int finddow(int d,int m,int y) {
    	int days[]= {31,28,31,30,31,30,31,31,30,31,30,31};
    	int nod= (y-1900) *365;
		int nol = (y-1900)/4;
		nod=nod+nol;
		
		if(m==1||m==2 && ((y%4==0 && y%100 !=0 || (y%400==0 && y%100 ==0))))
		{
			nod=nod-1;
		}
		for(int a=m-2;a>=0;a--) {
			nod= nod+ days[a];	
				
		}
		nod=nod+d;
		int x= nod%7;
		return x;
		
		
	}

}
