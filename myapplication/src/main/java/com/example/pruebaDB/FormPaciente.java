package com.example.pruebaDB;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

public class FormPaciente extends Formulario{
	
	public FormPaciente(){
		final TextField telefono = new TextField();
		telefono.setCaption("Teléfono");
		telefono.focus();
		telefono.setWidth("210px");
		
		final TextArea area= new TextArea();
		area.setCaption("Direccion");
		area.focus();
		area.setWidth("210px");
		
        setCaption("Formulario Paciente");
		
		layout.addComponents(telefono,area);
		
	}
}
