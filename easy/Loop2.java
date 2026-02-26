import java.util.*;
    import java.io.*; 
    class Loop2{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i< t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int sum=a;
                int r=0;
                int o=1;
                for(int j=0;j< n;j++)
                {
              
                    r=(1<< j)*b;
                    sum=sum+r;
                    System.out.print(sum+" ");
                }
                System.out.println("");
            }
            
            in.close();
        }
    }  
