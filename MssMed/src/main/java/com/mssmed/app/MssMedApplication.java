package com.mssmed.app;

import java.util.Iterator;

import com.google.gwt.i18n.server.MessageInterface;
import com.mssmed.helper.SpringContextHelper;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;



public class MssMedApplication{

	private static final long serialVersionUID = -4986077045187354953L;

    
    protected void init(VaadinRequest request) {
        
        SpringContextHelper helper = new SpringContextHelper(VaadinServlet.getCurrent().getServletContext());
        final VerticalLayout content = new VerticalLayout();
        final MessageInterface bean = (MessageInterface) helper.getBean("myBean");
               content.setMargin(true);
        //setContent(content);
        // Create the content root layout for the UI
        //setContent(content);
        
        Button button = new Button("Click Me");
        button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                content.addComponent(new Label("clicked"));
            }
        });
        content.addComponent(button);
    }
}
