package emailverification;
import java.util.ArrayList;

public class Emailverification {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        
        emailID.add("gandam@westgd.com");
        emailID.add("anadasu@eastgd.com");
        emailID.add("vadapalli@eastgd.com");
        emailID.add("ikkurthi@gunt.com");
        emailID.add("allam@westgd.com");
        emailID.add("karanam@eastgd.com");
       
        int c = 0;
        
   
        String searchEmail = "anadasu@eastgd.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    
                    if(searchEmail==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                       c = 1;
                        
                        break;
                        
                    }
                }
                
                if(c==1)
                {System.out.println("email ID :" + searchEmail + "  is found");}
                else{System.out.println("email ID Not found");}

    }

}
