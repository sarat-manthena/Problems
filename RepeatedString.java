package com.learning.problems;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
		long n = 549382313570L;
		//output - 16481469408
		long noOfRepeated = repeatedString(s,n);
		System.out.println(noOfRepeated);

	}
	
	static long repeatedString(String s, long n) {
        long count = 0;
        long initialCount =0;
        long strLen = s.length();
        if(strLen ==1) { 
        		if(s.charAt(0) == 'a')
        			return n;
        		else return 0;
        }
        else{
            if(n<strLen)
                strLen =n;
            for(int i=0; i< strLen;i++){
                if(s.charAt(i) == 'a')
                    initialCount++;
            }
            if(n==strLen)
                return initialCount;
            else{
                long repLen = n/strLen;
                long reminder = n%strLen;
                count = initialCount * repLen;
                for(int i=0; i< reminder; i++) {
                	if(s.charAt(i) == 'a')
                    count++;
                }

                return count;
            }
        }


    }


}
