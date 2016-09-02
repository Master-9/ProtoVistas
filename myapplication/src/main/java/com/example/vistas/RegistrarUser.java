package com.example.vistas;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class RegistrarUser extends Window {
	Navigator nav;
	public RegistrarUser(){
		super("Crear Usuario");
		setModal(true);
		center();
		HorizontalLayout lado= new HorizontalLayout();
		ComboBox tipoUser= new ComboBox("Tipo de Usuario");
		tipoUser.addItem("Medico");
		tipoUser.addItem("Paciente");
		tipoUser.addItem("Contador");
		tipoUser.setNullSelectionAllowed(false);
		//String sel= tipoUser.getValue().toString();
		
		
		FormLayout layout= new FormLayout();
		layout.setMargin(true);
		layout.setSizeUndefined();
				
		final TextField login= new TextField("login:");
		login.focus();
		login.setWidth("210px");
		login.setInputPrompt("ramirez45");
		layout.addComponent(login);	
		final PasswordField pas= new PasswordField("clave:");
		pas.focus();
		pas.setWidth("210px");
		pas.setInputPrompt("*****");
		layout.addComponent(pas);
		final PasswordField pasR= new PasswordField("Confirme la clave:");
		pasR.focus();
		pasR.setWidth("210px");
		pasR.setInputPrompt("*****");
		layout.addComponent(pasR);
		final TextField pSeguridad= new TextField("¿ Cual era su apodo en la infancia ?:");
		pSeguridad.focus();
		pSeguridad.setWidth("210px");
		layout.addComponent(pSeguridad);	
		
		lado.addComponents(layout,tipoUser);
		
		VerticalLayout nada = new VerticalLayout();
		
		 Button btn_guardar = new Button("Crear Usuario", new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					UI ui = UI.getCurrent();
					nav = ui.getNavigator();
					Object elec= tipoUser.getValue();
					if (elec!= null){
						enruta(elec.toString());
					}
					
					close();
				}
			});
		nada.setMargin(true);
		nada.addComponents(lado,btn_guardar);
		nada.setComponentAlignment(btn_guardar, Alignment.TOP_RIGHT);
		
		setContent(nada);
				
		
	}
	private void enruta(String v){
		UI ui = UI.getCurrent();
		nav = ui.getNavigator();
		switch (v){
			case "Medico": nav.navigateTo(RegisterPS_options.VIEW_NAME);
			break;
			case "Paciente": nav.navigateTo(FormPacienteView.VIEW_NAME);
			break;
			case "Contador": nav.navigateTo(StartView.VIEW_NAME);
			break;
		}
	
	}
		
}
