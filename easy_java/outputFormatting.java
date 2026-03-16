 import java.util.Scanner;

    public class outputFormatting {
    
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("================================");
                for(int i=0;i< 3;i++){
                    String s1=sc.next();
                    int x=sc.nextInt();
                    //Complete this line
                    int a=15-s1.length();
                    for(int j=0;j< a;j++){
                        s1=s1+' ';
                    }String z=Integer.toString(x);
                    if(z.length()==2)
                    {
                        z='0'+z;
                    }
                    if(z.length()==1)
                    {
                        z="00"+z;
                    }    
                    System.out.println(s1+z);
                }
                System.out.println("================================");
            }
    }    
