package com.example.vistas;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;

public class Autenticar extends Window {
	Navigator nav;
	final FormLayout layout;
	
	public Autenticar(){
		super("Ingresar");
		setModal(true);
		center();
		
		layout= new FormLayout();
		layout.setMargin(true);
		layout.setSizeUndefined();
		VerticalLayout lado = new VerticalLayout();
		
		ComboBox tipoUser= new ComboBox("Tipo de Usuario");
		tipoUser.addItem("Medico");
		tipoUser.addItem("Paciente");
		tipoUser.addItem("Contador");
		tipoUser.setNullSelectionAllowed(false);
		tipoUser.setWidth("210px");
		tipoUser.focus();
		layout.addComponent(tipoUser);
		//String sel= tipoUser.getValue().toString();
		
		final TextField login= new TextField("Usuario:");
		login.setWidth("210px");
		login.setInputPrompt("usuario");
		layout.addComponent(login);	
		final PasswordField pas= new PasswordField("Contraseña:");
		pas.setWidth("210px");
		pas.setInputPrompt("contraseña");
		layout.addComponent(pas);
		
		lado.addComponents(layout);
		
		VerticalLayout nada = new VerticalLayout();
		
		 Button btn_ingresar = new Button("Ingresar", new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					//UI ui = UI.getCurrent();
					//nav = ui.getNavigator();
					//nav.navigateTo(RegisterPS_options.VIEW_NAME);
					close();
				}
			});
		nada.setMargin(true);
		nada.addComponents(lado,btn_ingresar);
		nada.setComponentAlignment(btn_ingresar, Alignment.TOP_RIGHT);
		
		setContent(nada);
		//setVisible(false);
	}
	
}
