package inter4;

public class Factorial {
		
		public static long factorialFor(long n) {
			long a =  Long.MIN_VALUE;
	        if(n<0)return a;

			if(n==0 || n==1) return 1;

			long factorial =1;
	
			
			for(int i=1;i<=n;i++) {
				if(factorial>Long.MAX_VALUE/i) return a;
				factorial*=i;
				
				
			}
			return factorial;
			
		}
		
public static long factorialWhile(long n) {
	  if(n<0)return Long.MIN_VALUE;
		if(n==0) return 1;
		
	long factorial =1;
	int i =1;
	while(i<=n) {
		if(factorial>Long.MAX_VALUE/i) return  Long.MIN_VALUE;
		factorial*=i;
		i++;
	
		
	}
	
	return factorial;
}

public static long factorialDoWhile(long n) {
	  if(n<0)return Long.MIN_VALUE;

		if(n==0) return 1;
	long factorial =1;
	int i =1;
do {
	if(factorial>Long.MAX_VALUE/i) return  Long.MIN_VALUE;
	factorial*=i;
	i++;
}
while(i<=n);
return factorial;
}

public static long factorialRecursive(long n) {
	
	  if(n<0)return Long.MIN_VALUE;

		if(n==0 ) return 1;
		long result = factorialRecursive(n-1);
		if(result ==  Long.MIN_VALUE || result >  Long.MAX_VALUE / n )return  Long.MIN_VALUE ;
	return n*result;
}
}