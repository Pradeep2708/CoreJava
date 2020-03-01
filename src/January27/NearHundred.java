package January27;

public class NearHundred {
	public Boolean nearHundred(int n){
		boolean result=false;
		if((n>=90 && n<=100) || (n>=190 && n<=200)){
			result=true;
		}
		return result;
	}

}
