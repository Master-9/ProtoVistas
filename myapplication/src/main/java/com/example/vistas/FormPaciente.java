package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class FormPaciente extends VerticalLayout implements View {
	
	public final static String VIEW_NAME="formPaciente";
	Navigator nav;
	
	public FormPaciente(){
		final TextField nombreCompleto = new TextField();
		nombreCompleto.setCaption("Nombre Completo:");
		final TextField cedula = new TextField();
		cedula.setCaption("Numero de Cédula");
		final TextField telefono = new TextField();
		telefono.setCaption("Teléfono");
        
		
		
		
		
		addComponents(nombreCompleto);
		addComponents(cedula);
		addComponents(telefono);
        setMargin(true);
        setSpacing(true);
		
	}
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
