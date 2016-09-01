package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.example.pruebaDB.FormPSRapido;
import com.example.pruebaDB.FormPaciente;
import com.example.pruebaDB.Formulario;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class FormPacienteView extends VerticalLayout implements View {
	
	public final static String VIEW_NAME="formPaciente";
	Navigator nav;
	FormPaciente form1;
	
	public FormPacienteView(){
		
		form1= new FormPaciente();
		setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		addComponent(form1);
		setMargin(true);
		
	}
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
