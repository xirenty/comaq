package net.comaq.recruiting.data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class SurveyTemplate extends BaseModel {
	
	@NotNull(message = "Templatename is mandatory")
	private String name;

	public SurveyTemplate(){};
	
	public SurveyTemplate(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
	
	
	
}
