package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class FormPSRapido extends VerticalLayout implements View {
	
	public final static String VIEW_NAME="formPSRapido";
	Navigator nav;
	
	public FormPSRapido(){
		final TextField name = new TextField();
        name.setCaption("Rellene el siguiente Formulario");
        addComponents(name);
        setMargin(true);
        setSpacing(true);
		
	}
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
