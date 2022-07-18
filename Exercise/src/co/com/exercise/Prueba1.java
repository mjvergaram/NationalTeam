package co.com.exercise;

import java.util.*;

public class Prueba1 {

    private int age;
    private String name;
    private static List<Person> listPerson; 	

    public Prueba1(final int age, final String name) {
        super();
        this.age = age;
        this.name = name;
    }
    
    

    public Prueba1(int age, String name, List<Person> listPerson) {
		super();
		this.age = age;
		this.name = name;
		this.listPerson = listPerson;
	}



	public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
    
    

    public List<Person> getListPerson() {
		return listPerson;
	}



	public void setListPerson(List<Person> listPerson) {
		this.listPerson = listPerson;
	}



	@Override
    public String toString() {
        return name;
    }
    
    public static List<Prueba1> groupList(List<Prueba1> nationalTeam){
    	
    	
    	List<Prueba1> listGroupNationalTeam = new ArrayList<Prueba1>();
    	try {		
    	 listPerson = new ArrayList<>();
         for(int k = 0; k<nationalTeam.size(); k++) {
    	 int ageListPerson =  nationalTeam.get(k).getAge();
    	
    	 for(int i=1; i<nationalTeam.size(); i++){
    		if(ageListPerson == nationalTeam.get(i).getAge()) {
    			Person person = new Person(nationalTeam.get(i).getName());
    			listPerson.add(person);    			
    			
    			nationalTeam.remove(i);
    		}    		
    	 }
    	 Prueba1  prueba1 = new Prueba1(ageListPerson,"", listPerson);
    	listGroupNationalTeam.add(prueba1);
      }	
    }catch(Exception e) {
    	System.out.println("Error: "+e.getStackTrace());
    }	
    	
    	return listGroupNationalTeam;
    }

    
    public static void orderingList(List<Prueba1> nationalTeam2) {
    	
    	
    	for(int i = 0;i<nationalTeam2.size(); i++) {
    		orderingName(nationalTeam2.get(i).getListPerson());
    	}
    }
    
    public static void orderingName(List<Person> listPerson) {
    	Person  person = listPerson.get(0);
    	if(listPerson.get(0).getName().charAt(0) > listPerson.get(1).getName().charAt(0)) {
    		listPerson.set(0, person);
    	}
    } 
    
    public static void printPersons(final List<Prueba1> personList) {
        System.out.println(personList);
    }

    public static void main(final String[] args) {
        final List<Prueba1> nationalTeam = new ArrayList<>();
        nationalTeam.add(new Prueba1(37, "Claudio Bravo"));
        nationalTeam.add(new Prueba1(36, "Jean Beausejour"));
        nationalTeam.add(new Prueba1(34, "Gonzalo Jara"));
        nationalTeam.add(new Prueba1(33, "Gary Medel"));
        nationalTeam.add(new Prueba1(32, "Mauricio Isla"));
        nationalTeam.add(new Prueba1(31, "Charles Aránguiz"));
        nationalTeam.add(new Prueba1(33, "Arturo Vidal"));
        nationalTeam.add(new Prueba1(34, "Matias Fernandez"));
        nationalTeam.add(new Prueba1(36, "Jorge Valdivia"));
        nationalTeam.add(new Prueba1(31, "Alexis Sánchez"));
        nationalTeam.add(new Prueba1(30, "Eduardo Vargas"));
        Prueba1.printPersons(nationalTeam);
        
        List<Prueba1> nationalTeam2 = Prueba1.groupList(nationalTeam);
        Prueba1.groupList(nationalTeam2);
        Prueba1.printPersons(nationalTeam2);
        //Prueba1.orderingList(nationalTeam2);
        
    }

}