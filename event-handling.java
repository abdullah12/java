 mylabel = new Label("Push a Button"); 
 
    
    Button btn = new Button("change Label"); 
    
 
    // Handle the action events for the First button. 
    btn.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        Label.setText("button was clicked."); 
      } 
    }); 
