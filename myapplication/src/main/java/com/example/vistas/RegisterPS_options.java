package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class RegisterPS_options extends VerticalLayout implements View {
	public final static String VIEW_NAME="registerPs_options";
	Navigator nav;
	
	public RegisterPS_options(){
	 
        final TextField name = new TextField();
        name.setCaption("Escriba su nombre aqui:");

        Button button = new Button();
        button.addClickListener( e -> {
            addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        //Button buttonRap = new Button("Rapido",FontAwesome.USER_MD);
        Button buttonRap = new Button("",new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui= UI.getCurrent();
				nav= ui.getNavigator();
				nav.navigateTo(FormPSRapidoView.VIEW_NAME);
			}
		});
        
        Button buttonDirect = new Button();
        buttonDirect.addClickListener( e -> {
            addComponent(new Label("Thanks " + name.getValue() 
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
        addComponents(name,hor);
        setMargin(true);
        setSpacing(true);
        		
	}
	

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		//Notification.show("Tipos de Registros en Gsami para Médicos");
	}

}
