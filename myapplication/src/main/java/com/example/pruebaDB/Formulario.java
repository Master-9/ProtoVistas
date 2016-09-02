package com.example.pruebaDB;

import java.util.Date;

import com.vaadin.data.validator.EmailValidator;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

public class Formulario extends Panel{
	final protected TextField nombreApell;
	final protected TextField correo;
	final protected TextField cedula;
	final protected TextField rif;
	final protected ComboBox rif_p;
	final protected ComboBox estadocivil;
	final protected PopupDateField rif_vence;
	final HorizontalLayout hl_rif;
	
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
		correo.setWidth("210px");
		correo.addValidator(new EmailValidator("correo invalido"));
		layout.addComponent(correo);
		
		
		cedula = new TextField();
		cedula.setCaption("Numero de Cédula");
		cedula.setWidth("210px");
		cedula.setInputPrompt("25123456");
		layout.addComponent(cedula);
		
		
		rif_p = new ComboBox("");
		rif_p.addItem("V-");
		rif_p.addItem("E-");
		rif_p.addItem("J-");
		rif_p.setWidth("80px");


		rif = new TextField();
		rif.setCaption("");
		rif.setWidth("130px");
		rif.setInputPrompt("RIF");
		
		
		hl_rif = new HorizontalLayout();
		hl_rif.setCaption("RIF");
		hl_rif.setHeight("100%");
		hl_rif.addComponents(rif_p, rif);
		layout.addComponent(hl_rif);
		
		
		rif_vence = new PopupDateField();
		rif_vence.setValue(new Date());
		rif_vence.setWidth("210px");
		rif_vence.addValueChangeListener(e -> Notification.show("Nueva Fecha:",
        		String.valueOf(e.getProperty().getValue()),
        		Type.TRAY_NOTIFICATION));
		layout.addComponent(rif_vence);
		

		estadocivil= new ComboBox("Estado Civil");
		estadocivil.addItem("Soltero");
		estadocivil.addItem("Casado");
		estadocivil.addItem("Divorciado");
		estadocivil.setWidth("210px");
		layout.addComponent(estadocivil);
		
		
		
		
		
	}
	
	
}
