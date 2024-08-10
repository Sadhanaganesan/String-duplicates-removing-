// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String ans="";
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;i++){
            boolean dup=true;
            int j;
            for(j=0;j<str1.length;j++){
                if(i!=j && str1[i].equals(str1[j])){
                    dup=false;
                    break;
                }}
            if(dup){
                ans=ans+str1[i]+" ";
            }
        }
        ans=ans.trim();
        System.out.println(ans);
    }
}
