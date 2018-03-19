package stepDefinition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DummyClass {

	@When ("^The project is Dummy$")
	public void The_project_is_Dummy(){
		System.out.println("This is When annotations");
	}
	@Then ("^The contant of the package is also dummy$")
	public void The_contant_of_the_package_is_also_dummy(){
		System.out.println("This is first then");
		}
	@Then ("^We have to write a dummy code$")
	public void We_have_to_write_a_dummy_code(){
		System.out.println("This is second then");
		}
	}



