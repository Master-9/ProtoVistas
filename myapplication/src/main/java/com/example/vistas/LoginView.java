package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class LoginView extends VerticalLayout implements View {
	public final static String VIEW_NAME="login";
	Navigator nav;
	public LoginView(){
		
		
		ComboBox combo = new ComboBox();
		
		
		
        final TextField name = new TextField();
        name.setCaption("Login:");
        
        Button btnlogin = new Button("",new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui= UI.getCurrent();
				nav= ui.getNavigator();
				nav.navigateTo(StartView.VIEW_NAME);
			}
		});
       
        Button btnlogin2 = new Button("",new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui= UI.getCurrent();
				nav= ui.getNavigator();
				nav.navigateTo(StartView.VIEW_NAME);
			}
		});
        
        
        final HorizontalLayout hor = new HorizontalLayout();
        hor.addComponents(btnlogin,btnlogin2);
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
