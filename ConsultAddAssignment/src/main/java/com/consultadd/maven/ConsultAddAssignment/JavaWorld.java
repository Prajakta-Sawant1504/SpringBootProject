package com.consultadd.maven.ConsultAddAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="Framework")
public class JavaWorld implements JavaLanguage{
	
	PythonLanguage language;
	
	

	public JavaWorld() {
		super();
	}

	@Autowired
	public JavaWorld(PythonLanguage language) {
		super();
		this.language = language;
	}



	public String learningJava() {
		// TODO Auto-generated method stub
		return "I am learning Java.";
	}

	public String learningPython() {
		// TODO Auto-generated method stub
		return language.learningPython();
	}

}
