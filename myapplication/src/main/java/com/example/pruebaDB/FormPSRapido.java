package com.example.pruebaDB;

import com.vaadin.ui.TextField;

public class FormPSRapido extends Formulario {
	
	public FormPSRapido(){
		setCaption("Registro Rapido");
		
		final TextField univ= new TextField("Universidad de graduación:");
		univ.focus();
		univ.setWidth("210px");
		layout.addComponent(univ);
		final TextField titulo= new TextField("Título obtenido:");
		titulo.focus();
		titulo.setWidth("210px");
		layout.addComponent(titulo);
		final TextField especialidad= new TextField("Especialidades:");
		especialidad.focus();
		especialidad.setWidth("210px");
		especialidad.setInputPrompt("Internista, Neumonólogo");
		layout.addComponent(especialidad);
		final TextField colegio= new TextField("# de Colegio de Médicos:");
		colegio.focus();
		colegio.setWidth("210px");
		layout.addComponent(colegio);
		
	}
}
