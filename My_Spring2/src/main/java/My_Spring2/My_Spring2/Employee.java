package My_Spring2.My_Spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	
	String name;
	List<String> Skills;
	Set<String> mobile;
	Map<String,String> project;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	public Set<String> getMobile() {
		return mobile;
	}
	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}
	public Map<String, String> getProject() {
		return project;
	}
	public void setProject(Map<String, String> project) {
		this.project = project;
	}
	

}
