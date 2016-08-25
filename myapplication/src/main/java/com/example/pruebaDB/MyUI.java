package com.example.pruebaDB;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;
import javax.swing.ImageIcon;

import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


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

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button();
        button.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        //Button buttonRap = new Button("Rapido",FontAwesome.USER_MD);
        Button buttonRap = new Button();
        buttonRap.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        Button buttonDirect = new Button();
        buttonDirect.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        Resource regRap= new ThemeResource("can-stock-photo_csp5222148.jpg");
        Resource reg= new ThemeResource("images.jpeg");
        Resource regDirect= new ThemeResource("Directory-icon.png");
        
        
        button.setDescription("Completo");
        button.setIcon(reg);
        //button.setSizeFull();
        button.setHeight("200px");
        button.setWidth("300px");
        
        buttonRap.setDescription("Rapido");
        buttonRap.setIcon(regRap);
        buttonRap.setHeight("200px");
        buttonRap.setWidth("300px");
        
        buttonDirect.setDescription("Directorio");
        buttonDirect.setIcon(regDirect);
        buttonDirect.setHeight("200px");
        buttonDirect.setWidth("300px");
        
        final HorizontalLayout hor = new HorizontalLayout();
        hor.addComponents(button,buttonRap,buttonDirect);
        layout.addComponents(name,hor);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }
    

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
