package day7.task2;

public class EmployeeException extends Exception{
private String exceptionMsg = "";


public EmployeeException() {
	super();
	// TODO Auto-generated constructor stub
}

public EmployeeException(String message) {
	super(message);
	this.exceptionMsg = message;
}

@Override
public String toString() {
	return "city Code Exception :- "+exceptionMsg;
}
}
