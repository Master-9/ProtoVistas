package com.example.pruebaDB;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.example.vistas.FormPacienteView;
import com.example.vistas.LoginView;
import com.example.vistas.RegisterPS_options;
import com.example.vistas.StartView;
import com.example.vistas.FormPSRapidoView;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.example.pruebaDB.MyAppWidgetset")



public class MyUI extends UI {
	Navigator navegador;
	Window logIn;
	Window newUser;
	
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	navegador = new Navigator(this,this);
    	
    	navegador.addView(StartView.VIEW_NAME, new StartView());
    	navegador.addView(LoginView.VIEW_NAME, new LoginView());
    	navegador.addView(RegisterPS_options.VIEW_NAME, new RegisterPS_options());
    	navegador.addView(FormPSRapidoView.VIEW_NAME, new FormPSRapidoView());
    	navegador.addView(FormPacienteView.VIEW_NAME, new FormPacienteView());
    	
    	
    	
    /*	
    	final TextField name = new TextField("k");
        name.setCaption("Escriba su nombre aqui:");   
        logIn= new Window("Loguearse");
        logIn.setContent(name);
        logIn.center();
        logIn.setVisible(false);
        addWindow(logIn);
        
        final TextField apell = new TextField();
        name.setCaption("Escriba A:");     
        newUser= new Window("Crear Usuario");
        newUser.setHeight("300px");
        newUser.setWidth("300px");
        FormLayout layout= new FormLayout();
		layout.setMargin(true);
				
		final TextField nombreApell= new TextField("Nombre y Apellido:");
		nombreApell.focus();
		nombreApell.setWidth("210px");
		nombreApell.setInputPrompt("Ricardo Cáseres");
		layout.addComponent(nombreApell);	
		final TextField tel= new TextField("tel:");
		tel.focus();
		tel.setWidth("210px");
		tel.setInputPrompt("9098798");
		layout.addComponent(tel);
               
        newUser.setContent(layout);
        newUser.center();
        newUser.setVisible(false);
        addWindow(newUser);
     */   
        
    	
   }
    
    

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
