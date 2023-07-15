public class EmailCheck{

	//variables
	private String msg;
	
	
	//constructor
	public void EmailCheck(){
		msg="";
	}
	
	//compute
	public void compute(String email, String[] domains){
		//variables
		boolean atValidation = false;
		boolean dotValidation = false;
		String domainExtension = email.substring(email.length()-3);
		
		//check if the email contains @
		for(int i=0;i<email.length();i++){
			if(email.charAt(i)== '@'){
				atValidation=true;
			}
			if(email.charAt(i)== '.'){
				dotValidation=true;
			}	
		}
		
		System.out.println(atValidation +"-"+ dotValidation);
		
		if(atValidation & dotValidation){
					
			for(int i=0;i<domains.length;i++){
		
				if(domainExtension.equals(domains[i])){
					msg = "Valid !";
					break;
				}else{
					msg = "Not Valid !";
				}
			}
		}else{
			msg = "Not Valid !";
		}
	}

	//get
	public String getMsg(){
		return msg;	
	}

}