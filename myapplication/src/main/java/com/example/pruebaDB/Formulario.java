package com.example.pruebaDB;

import com.vaadin.data.validator.EmailValidator;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;

public class Formulario extends Panel{
	final protected TextField nombreApell;
	final protected TextField correo;
	final protected TextField cedula;
	protected FormLayout layout;
	
	public Formulario(){
		
		setSizeUndefined();
		layout= new FormLayout();
		layout.setMargin(true);
		setContent(layout);
		layout.setDefaultComponentAlignment(Alignment.MIDDLE_RIGHT);
	
		
		nombreApell= new TextField("Nombre Completo:");
		nombreApell.focus();
		nombreApell.setWidth("210px");
		nombreApell.setInputPrompt("Ricardo Cáseres");
		layout.addComponent(nombreApell);
		correo= new TextField("Correo:");
		correo.setImmediate(true);
		correo.getCaption();
		correo.focus();
		correo.setWidth("210px");
		correo.addValidator(new EmailValidator("correo invalido"));
		layout.addComponent(correo);
		cedula = new TextField();
		cedula.setCaption("Numero de Cédula");
		cedula.focus();
		cedula.setWidth("210px");
		cedula.setInputPrompt("25123456");
		layout.addComponent(cedula);
		
	}
	
	
}
