package cn.slg.jw.javaee.ch10spring10;
import org.springframework.stereotype.Component;

@Component("personService")
public class PersonServiceImpl implements PersonService {
    private String person = null;   
       public PersonServiceImpl(String person) {   
           this.person = person;   
        }   
       public PersonServiceImpl() {}   
       public String getPerson() {   
           return person;   
        }   
       public void setPerson(String person) {   
           this.person = person;   
        }   
       public String save(String person){
           System.out.println(person +  " is saved successfully.");   
           return person;   
       }   
     public void update(String person){   
            System.out.println(person + " is updated.");   
       }  
}

