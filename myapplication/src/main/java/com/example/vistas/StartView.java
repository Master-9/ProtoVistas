package com.example.vistas;

import com.example.pruebaDB.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

/*
 * Este view será la portada del prototipo
 */
public class StartView extends VerticalLayout implements View {
	public final static String VIEW_NAME="";
	Navigator nav;
	
	
	/*
	 * Este view será la portada del prototipo
	 * debe tener hacer login
	 * debe tener la opcion de registrarse
	 */
	public StartView(){
	 
        final TextField name = new TextField();
        name.setCaption("Escriba su nombre aqui:");
        
        setStyleName("ini");
      
        
        
        Resource regRap= new ThemeResource("can-stock-photo_csp5222148.jpg");
        
        /*Nav button to doctor  register view */
        Button btn_register_ps = new Button("Registrarse",new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui= UI.getCurrent();
				nav= ui.getNavigator();
				nav.navigateTo(RegisterPS_options.VIEW_NAME);
			}
		});

        /*Nav button to login view*/
        Button btn_login = new Button("Entrar", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui = UI.getCurrent();
				nav = ui.getNavigator();
				nav.navigateTo(LoginView.VIEW_NAME);
			}
		});
    
        setSpacing(true);

       
        btn_login.setDescription("Login");
        btn_login.setHeight("40px");
        btn_login.setWidth("110px");
        
        
        btn_register_ps.setDescription("Registrar Medico");
        btn_register_ps.setHeight("40px");
        btn_register_ps.setWidth("110px");
        
        
        
        final HorizontalLayout hor = new HorizontalLayout();
        
        //hor.setDefaultComponentAlignment(getDefaultComponentAlignment().TOP_RIGHT);
        hor.addComponents(btn_login,btn_register_ps);
        hor.setStyleName("barraSup");
        hor.setWidth("200px");
        addComponents(hor);
        setComponentAlignment(hor, Alignment.TOP_RIGHT);
        setMargin(true);
        setSpacing(true);
        		
	}
	

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		//Notification.show("Tipos de Registros en Gsami para Médicos");
	}

}
