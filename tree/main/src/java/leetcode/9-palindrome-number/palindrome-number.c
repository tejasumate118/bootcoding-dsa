bool isPalindrome(int x){
    long rem=0;
    int num=x;
    if(num<0){return false;}
    if(num%10 ==0 && num!=0) return false;
    while(num!=0){
        rem = rem*10 + num%10;
        num=num/10;
         }
     return rem==x;    

}