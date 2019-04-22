package net.comaq.recruiting.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
public class SurveyTemplate extends BaseModel {
	
	@NotNull(message = "Templatename is mandatory")
	private String name;

	@OneToMany
	@JsonProperty(required = false)
	private Collection<Question> questions;

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

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}
}
