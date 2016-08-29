package com.example.pruebaDB;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.example.vistas.FormPaciente;
import com.example.vistas.LoginView;
import com.example.vistas.RegisterPS_options;
import com.example.vistas.StartView;
import com.example.vistas.FormPSRapido;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;


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
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	navegador = new Navigator(this,this);
    	
    	navegador.addView(StartView.VIEW_NAME, new StartView());
    	navegador.addView(LoginView.VIEW_NAME, new LoginView());
    	navegador.addView(RegisterPS_options.VIEW_NAME, new RegisterPS_options());
    	navegador.addView(FormPSRapido.VIEW_NAME, new FormPSRapido());
    	navegador.addView(FormPaciente.VIEW_NAME, new FormPaciente());
   }
    

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
