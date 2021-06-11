package org.nagarro.advancedjava.web.hrmanager.Constant;

public interface Constant {
	final static String BASE_GET_URL = "http://localhost:8080/getemployees";
	final static String BASE_POST_URL ="http://localhost:8080/postemployees";
	final static String BASE_PUT_URL="http://localhost:8080/putemployees/{id}";
	
	//Validation
	final static String NOT_BLANK ="*Field can't be blanked";
	final static String MAX_VALIDATION_100 ="*Field can't be more then 100 character";
	final static String MAX_VALIDATION_500 ="*Field can't be be more then 500 char";
	final static String EMAIL_VALIDATION ="*Field email follow standerd format of email[@,.]";
	final static String DOB_VALIDATION ="*Field DOB follow DD/MM/YYYY format";
}
