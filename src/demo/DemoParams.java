package demo;

/**
 * This class is just to demonstrate how we can modify or not the params passed to methods.
 * 
 * @author jose
 *
 */
public class DemoParams {

	/*
	 * Test 1: primitive param
	 */
	class Car {
		public void changeVariable(int a) {
			a = 321;
		}
	}
	
	/**
	 * Test if we can modify the value of a primitive param.
	 */
	private void demoPrimitiveValues() {
		int v = 1;
		Car car = new Car();
		car.changeVariable(v);
		System.out.println(v); // 1
	}
	
	
	/*
	 * Test 2: changing property of an object param
	 */
	
	class Person {
		String name;
	}

	class Writer {
		/**
		 * Modifying property of the param
		 * @param person
		 */
		public void changeName(Person person) {
			person.name = "Lola";
		}
		
		/**
		 * Changing the pointer of the param
		 * @param person
		 */
		public void changePerson(Person person) {
			Person newPerson = new Person();
			newPerson.name = "Blas de Lezo";
			person = newPerson;
		}
	}

	private void demoObjectValues_changingItsProperties() {
		Person person = new Person();
		person.name = "Mary";
		(new Writer()).changeName( person );
		System.out.println(person.name); //Lola
	}
	

	/*
	 * Test 3: changing pointer to an object param
	 */
	
	private void demoObjectValues_changingPointer() {
		Person person = new Person();
		person.name = "Mary";
		(new Writer()).changePerson( person );
		System.out.println(person.name); //Mary
	}

	
	

	
	public static void main(String[] args) {
		DemoParams demo = new DemoParams();

		// Test of using primitive types
		demo.demoPrimitiveValues();
		// Test of using object types
		demo.demoObjectValues_changingItsProperties();
		// Test of changing the pointer to the object
		demo.demoObjectValues_changingPointer();
	}

}
