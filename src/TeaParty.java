import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
	
	 public String welcome(String name, boolean isWoman, boolean isKnighted) {
		 String greeting = "";
		 if(isKnighted == false) {
			 if(isWoman == true) {
			 greeting = ("Ms. ");
		 }
		 else if(isWoman == false) {
			 greeting = ("Mr. ");
		 }
		 }
		 else if(isKnighted == true){
			 if(isWoman == true) {
				 greeting = ("Lady ");
			 }
			 if(isWoman == false) {
				 greeting = ("Sir ");
			 }
		 }
		return "Hello "+greeting+name;
     }
	 
}
