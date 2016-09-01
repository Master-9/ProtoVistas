package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.example.pruebaDB.FormPSRapido;
import com.example.pruebaDB.Formulario;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class FormPSRapidoView extends VerticalLayout implements View {
	
	public final static String VIEW_NAME="formPSRapido";
	Navigator nav;
	FormPSRapido form;
	
	public FormPSRapidoView(){
		form= new FormPSRapido();
		setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		addComponent(form);
		setMargin(true);
		
	}

	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
