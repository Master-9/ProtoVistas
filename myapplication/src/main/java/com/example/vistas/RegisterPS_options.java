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
	Button btn_completo; 
    final Button btn_rapido;  
    Button btn_directorio;
    final HorizontalLayout hl_btns;
    final VerticalLayout vl_completo;
    final VerticalLayout vl_rapido;
    final VerticalLayout vl_directorio;
    Label l_completo;
    Label l_rapido;
    Label l_directorio;
    
    
	public RegisterPS_options(){
		
        Resource regRap= new ThemeResource("can-stock-photo_csp5222148.jpg");
        Resource reg= new ThemeResource("images.jpeg");
        Resource regDirect= new ThemeResource("Directory-icon.png");
        
        btn_completo    = new Button();
        btn_completo.setDescription("Completo");
        btn_completo.setIcon(reg);
        btn_completo.setHeight("200px");
        btn_completo.setWidth("300px");
        l_completo = new Label();
        l_completo.setValue("Registro Completo");
        
        btn_rapido = new Button();
        btn_rapido.setDescription("Rapido");
        btn_rapido.setIcon(regRap);
        btn_rapido.setHeight("200px");
        btn_rapido.setWidth("300px");
        btn_rapido.addClickListener(new Button.ClickListener() {
        	@Override
			public void buttonClick(ClickEvent event) {
				UI ui= UI.getCurrent();
				nav= ui.getNavigator();
				nav.navigateTo(FormPSRapidoView.VIEW_NAME);
			}
        });
        
        
        l_rapido = new Label();
        l_rapido.setValue("Registro Rapido");
        
        
        
        btn_directorio  = new Button();
        btn_directorio.setDescription("Directorio");
        btn_directorio.setIcon(regDirect);
        btn_directorio.setHeight("200px");
        btn_directorio.setWidth("300px");
        l_directorio = new Label();
        l_directorio.setValue("Registro Directorio");
        
        
        
        vl_completo    = new VerticalLayout();
        vl_completo.addComponents(l_completo, btn_completo);
        vl_rapido      = new VerticalLayout();
        vl_rapido.addComponents(l_rapido, btn_rapido);
        vl_directorio  = new VerticalLayout();
        vl_directorio.addComponents(l_directorio, btn_directorio);
       
        hl_btns = new HorizontalLayout();
		hl_btns.addComponents(vl_completo, vl_rapido, vl_directorio);
		addComponent(hl_btns);
        setMargin(true);
        setSpacing(true);
        		
	}
	

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		//Notification.show("Tipos de Registros en Gsami para Médicos");
	}

}
