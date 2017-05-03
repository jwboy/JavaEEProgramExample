package actions;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class MyValidator extends FieldValidatorSupport {
    private String school;
    
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void validate(Object arg0) throws ValidationException {
          String sch = super.getFieldName();
          System.out.println("filedName = " +sch);
          String value = (String)super.getFieldValue(sch, arg0);
          System.out.println("filedValue = " +value);
          
          if(!school.equals(value)){
        	  super.addFieldError(super.getFieldName(), arg0);
          }
	}

}
