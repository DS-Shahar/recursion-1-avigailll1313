package avigail;

public class rscorshion {
	static int f(int n) {

		if(n==0) {
			return 1;}
	int a= n*f(n-1);

	return a;
		}



	static double e(int  n) {

		if(n==0) {
			return 1;}
		double a= n*f(n-1);

		return 1/a +e(n-1);
	}



	public static int q1(int n) {

		if(n==0) {
			return 0;}
	int a= n+q1(n-1);
	return a;
	}



	public static int q2(int n) {
		if(n==0) {
			return 1;}
	int a= n*q2(n-1);
	return a;}



	public static int q3(int n) {
		if(n%2==0) {
			n=-1;}
	int a= n*q3(n-2);
	return a;		 
		}
	
	public static int q4(int n) {
		if(n/10==0) {
			return 1;}
	return q4(n/10)+1;		 
		}

	public static int q5(int n, int m) {
		if (n>m) {
			return 0;}
		
	return (q5( m-n ,n)+1);		 
		}
	
public static int q6(int n,int m) {
		if (n<m) 
			return n;
		return q6(n-m,m);
	}
		
public static boolean q7(int x, int y) {
	if (x<y) 
		if (x==0)
			return true;
		else
			return false;
	return q7(x-y,y);
}
	

public static boolean q8(int n) {
			return help8 (n,2);
		}
public static boolean help8(int n,int m) {
	if (n==m) {
		return true;}
	if(n%m !=0) {
		return help8(n,m+1);
	}
	else {
		return false;
	}}
	

public static boolean areAllDigitsSameParity(int num) {
    // תנאי עצירה: אם המספר הוא חד-ספרתי, כל הספרות הן מאותו סוג
    if (num < 10) {
        return true;
    }

    // בודקים את הספרה האחרונה:
    int lastDigit = num % 10;
    return (lastDigit % 2 == 0) == ((num / 10) % 2 == 0) && areAllDigitsSameParity(num / 10);}
    


	public static void main(String[] arg) {
		 int n=7878;
		 System.out.print(areAllDigitsSameParity(n));
	}}



