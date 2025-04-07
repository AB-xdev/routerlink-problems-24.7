package org.vaadin.example;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

/**
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message on a new line.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new RouterLink("TEST", DemoView.class));
    }
}
