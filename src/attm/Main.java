package attm;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
   //Screen screen;
    Scene scene1;
    Scene scene;
    Scene scene2;
    Scene scene3;
    Scene scene4;
    Scene scene5;
     Scene scene6;
     Scene scene7;
    public static void main(String[] args) {
        launch(args);
    }

     ATM atttm =new ATM();
    		
    @Override
     public  void start(Stage primaryStage) throws Exception
    
    {
        window = primaryStage;
        window.setTitle("*ATM*");

      
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10,10,10));
        grid1.setVgap(8);
        grid1.setHgap(10);
        
             GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10,10,10));
        grid2.setVgap(8);
        grid2.setHgap(10);
        
        
               GridPane grid3 = new GridPane();
        grid3.setPadding(new Insets(10, 10,10,10));
        grid3.setVgap(8);
        grid3.setHgap(10);
        
          GridPane grid4 = new GridPane();
        grid4.setPadding(new Insets(10, 10,10,10));
        grid4.setVgap(8);
        grid4.setHgap(10);
        
        GridPane grid5 = new GridPane();
        grid5.setPadding(new Insets(10, 10,10,10));
        grid5.setVgap(8);
        grid5.setHgap(10);
        
        GridPane grid6 = new GridPane();
        grid6.setPadding(new Insets(10, 10,10,10));
        grid6.setVgap(8);
        grid6.setHgap(10);
        
        
        
        
          



        //Password Label 
        Label passLabel = new Label("CardNumber:");
        GridPane.setConstraints(passLabel, 0, 1);
        
        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText(" ");
        GridPane.setConstraints(passInput, 1, 1);
        
        //error Label
         Label errorLabel = new Label("");
        GridPane.setConstraints(errorLabel, 0, 2);
        
      
       
        

        //Login
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);
        loginButton.setOnAction(e->{
                int x=Integer.parseInt(passInput.getText());
               /* int y=Integer.parseInt(passInput.getText());*/
                
                boolean result;
                result = atttm.check(x/*,y*/);
                if(result){
                    
                    window.setScene(scene1);
                    
                }
                else
                    errorLabel.setText("your card number is wrong");
                                
        });
          Button button0 = new Button("0");
     GridPane.setConstraints(button0,3,1) ;
      button0.setOnAction(e-> passInput.setText(passInput.getText()+"0"));
   
    
               
   
    Button button1 = new Button("1");
     GridPane.setConstraints(button1,2,2) ;
      button1.setOnAction(e-> passInput.setText(passInput.getText()+"1"));
   
    

       Button button2 = new Button("2");
   GridPane.setConstraints(button2,3,2) ;
     button2.setOnAction(e-> passInput.setText(passInput.getText()+"2"));
   
       
   Button button3 = new Button("3");
   GridPane.setConstraints(button3,4,2) ;
     button3.setOnAction(e-> passInput.setText(passInput.getText()+"3"));
   
       
   Button button4 = new Button("4");
   GridPane.setConstraints(button4,2,3) ;
     button4.setOnAction(e-> passInput.setText(passInput.getText()+"4"));
   
       
   Button button5 = new Button("5");
   GridPane.setConstraints(button5,3,3) ;
     button5.setOnAction(e-> passInput.setText(passInput.getText()+"5"));
   
       
   Button button6 = new Button("6");
   GridPane.setConstraints(button6,4,3) ;
     button6.setOnAction(e-> passInput.setText(passInput.getText()+"6"));
   
       
   Button button7 = new Button("7");
   GridPane.setConstraints(button7,2,4) ;
     button7.setOnAction(e-> passInput.setText(passInput.getText()+"7"));
   
       
   Button button8 = new Button("8");
   GridPane.setConstraints(button8,3,4) ;
     button8.setOnAction(e-> passInput.setText(passInput.getText()+"8"));
   
       
   Button button9 = new Button("9");
   GridPane.setConstraints(button9,4,4) ;
     button9.setOnAction(e-> passInput.setText(passInput.getText()+"9"));
   
       
  
       
         
          scene = new Scene(grid,585,370);
         
          scene1= new Scene(grid1,585,370);
          
         
          scene2=new Scene(grid2,585,370);
          scene3=new Scene(grid3,585,370);
          scene4=new Scene(grid4,585,370);
          scene5=new Scene(grid5,585,370);
       
           scene6=new Scene(grid6,585,370);
          
     grid.getChildren().addAll(passLabel,passInput ,loginButton,button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,errorLabel);
     
     //withdraw
         Label withdrawLabel = new Label("how much money do you want to withdraw");
        GridPane.setConstraints(withdrawLabel, 0, 1);
        
       
        TextField withdrawInput = new TextField();
        withdrawInput.setPromptText(" ");
        GridPane.setConstraints(withdrawInput, 1, 1);
        window.setScene(scene3);
        
             Button buttonr= new Button("back");
     GridPane.setConstraints(buttonr,4,6);
      buttonr.setOnAction(e->{
         window.setScene(scene1);
      });
        
        
         Label hereLabel = new Label("");
        GridPane.setConstraints(hereLabel, 1, 4);
        
       Label errLabel = new Label("");
        GridPane.setConstraints(errLabel, 1, 4);
        
        
           Button buttonook= new Button("ok");
     GridPane.setConstraints(buttonook,3,5);
   
     
        
          
    
           buttonook.setOnAction(e->{
        int z=Integer.parseInt(withdrawInput.getText());
            int balance = atttm.balance;
           
        if(z>balance){
            errLabel.setText("you don't have enough balance");
        }
      else
            
        { atttm.withdraw(z);
                hereLabel.setText("here is your"+z+" dollars");
        }
                 
  
                                
        });
             Button h= new Button("clear");
     GridPane.setConstraints(h,4,7);
    h.setOnAction(e->{ 
        errLabel.setText("");
         hereLabel.setText("");
    });
        
      
          Button button10 = new Button("0");
     GridPane.setConstraints(button10,3,1) ;
      button10.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"0"));
   
    
               
   
    Button button11 = new Button("1");
     GridPane.setConstraints(button11,2,2) ;
      button11.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"1"));
   
    

       Button button12 = new Button("2");
   GridPane.setConstraints(button12,3,2) ;
     button12.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"2"));
   
       
   Button button13 = new Button("3");
   GridPane.setConstraints(button13,4,2) ;
     button13.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"3"));
   
       
   Button button14 = new Button("4");
   GridPane.setConstraints(button14,2,3) ;
     button14.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"4"));
   
       
   Button button15 = new Button("5");
   GridPane.setConstraints(button15,3,3) ;
     button15.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"5"));
   
       
   Button button16 = new Button("6");
   GridPane.setConstraints(button16,4,3) ;
     button16.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"6"));
   
       
   Button button17 = new Button("7");
   GridPane.setConstraints(button17,2,4) ;
     button17.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"7"));
   
       
   Button button18 = new Button("8");
   GridPane.setConstraints(button18,3,4) ;
     button18.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"8"));
   
       
   Button button19 = new Button("9");
   GridPane.setConstraints(button19,4,4) ;
     button19.setOnAction(e-> withdrawInput.setText(withdrawInput.getText()+"9"));
   
        //deposit
          Label depositLabel = new Label("how much money do you want to deposit");
        GridPane.setConstraints(depositLabel, 0, 1);
        
       
        TextField depositInput = new TextField();
        depositInput.setPromptText(" ");
        GridPane.setConstraints(depositInput, 1, 1);
        window.setScene(scene2);
        
         Button buttone= new Button("back");
     GridPane.setConstraints(buttone,4,6);
      buttone.setOnAction(e->{
         window.setScene(scene1);
      });
      
           Button buttonok= new Button("ok");
     GridPane.setConstraints(buttonok,3,5) ;
     
     
          Label addLabel = new Label("");
        GridPane.setConstraints(addLabel, 1, 4);
      
        
        
            
      buttonok.setOnAction(e->{
        
        int y=Integer.parseInt(depositInput.getText());
        
              atttm.deposit(y);
                 addLabel.setText("you add "+y+" dollars");
             
                    
                 
  
                                
        });
          Button button100 = new Button("0");
     GridPane.setConstraints(button100,3,1) ;
      button100.setOnAction(e-> depositInput.setText(depositInput.getText()+"0"));
      
     Button button110 = new Button("1");
        
     GridPane.setConstraints(button110,2,2) ;
      button110.setOnAction(e-> depositInput.setText(depositInput.getText()+"1"));
   
    

       Button button120 = new Button("2");
   GridPane.setConstraints(button120,3,2) ;
     button120.setOnAction(e-> depositInput.setText(depositInput.getText()+"2"));
   
       
   Button button130 = new Button("3");
   GridPane.setConstraints(button130,4,2) ;
     button130.setOnAction(e-> depositInput.setText(depositInput.getText()+"3"));
   
       
   Button button140= new Button("4");
   GridPane.setConstraints(button140,2,3) ;
     button140.setOnAction(e-> depositInput.setText(depositInput.getText()+"4"));
   
       
   Button button150 = new Button("5");
   GridPane.setConstraints(button150,3,3) ;
     button150.setOnAction(e-> depositInput.setText(depositInput.getText()+"5"));
   
       
   Button button160 = new Button("6");
   GridPane.setConstraints(button160,4,3) ;
     button160.setOnAction(e-> depositInput.setText(depositInput.getText()+"6"));
   
       
   Button button170 = new Button("7");
   GridPane.setConstraints(button170,2,4) ;
     button170.setOnAction(e-> depositInput.setText(depositInput.getText()+"7"));
   
       
   Button button180 = new Button("8");
   GridPane.setConstraints(button180,3,4) ;
     button180.setOnAction(e-> depositInput.setText(depositInput.getText()+"8"));
   
       
   Button button190 = new Button("9");
   GridPane.setConstraints(button190,4,4) ;
     button190.setOnAction(e-> depositInput.setText(depositInput.getText()+"9"));
     
     //check balance
      
      Button buttong = new Button("check");
   GridPane.setConstraints(buttong,4,4) ;
     
          Label balLabel = new Label("");
        GridPane.setConstraints(balLabel, 5, 5);
        
         Button buttonq= new Button("back");
     GridPane.setConstraints(buttonq,10,8);
      buttonq.setOnAction(e->{
         window.setScene(scene1);
      });
        
        
            buttong.setOnAction(e->{
        
       int balance = atttm.balance;
      
                atttm.checkBalance();
                balLabel.setText("your balance is "+balance+" dollars");
                 
  
                                
        });
     
            //prev
            
              Label mLabel = new Label("");
        GridPane.setConstraints(mLabel, 5, 5);
        
             Button l= new Button("back");
     GridPane.setConstraints(l,11,8);
      l.setOnAction(e->{
         window.setScene(scene1);
      });
            
         Button prev= new Button("prev");
     GridPane.setConstraints(prev,10,8);
     
            prev.setOnAction(e->{
                  String[] returnHistory = atttm.returnHistory();
                int i=atttm.decreaseI();
          
                if(atttm.returnI()<0)
                    mLabel.setText("no history to be shown");
                else
                  mLabel.setText(returnHistory[i]);

                       
            });
            
            
            
            //next
                   Label nLabel = new Label("");
        GridPane.setConstraints(nLabel, 5, 5);
        
          Button k= new Button("back");
     GridPane.setConstraints(k,11,8);
      k.setOnAction(e->{
         window.setScene(scene1);
      });
        
            
         Button next= new Button("next");
     GridPane.setConstraints(next,10,8);
     
            next.setOnAction(e->{
                  String[] returnHistory = atttm.returnHistory();
                int i=atttm.increaseI();
          
                if(atttm.returnI()>=5)
                    nLabel.setText("no history to be shown");
                else
                  nLabel.setText(returnHistory[i]);

            });
            
            
            
            
            
   
   
        
       
        
        
        
      Button buttond = new Button("deposit");
   GridPane.setConstraints(buttond,1,1) ;
       buttond.setOnAction(e-> window.setScene(scene2));
   
        Button buttonw = new Button("withdraw");
   GridPane.setConstraints(buttonw,1,2) ;
     buttonw.setOnAction(e-> window.setScene(scene3));
     
     
        Button buttonc = new Button("check balance");
       GridPane.setConstraints(buttonc,1,3) ;
 buttonc.setOnAction(e-> window.setScene(scene4));
   
    
   
        Button buttonp = new Button("prev");
   GridPane.setConstraints(buttonp,1,4) ;
     buttonp.setOnAction(e-> window.setScene(scene5));
 
   
        Button buttonn = new Button("next");
   GridPane.setConstraints(buttonn,1,5) ;
     buttonn.setOnAction(e-> window.setScene(scene6));
    
     
     grid1.getChildren().addAll(buttond,buttonc,buttonp,buttonn,buttonw);
        
      grid3.getChildren().addAll( withdrawLabel,withdrawInput,hereLabel,h,buttonook,buttonr,errLabel,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19);
         grid2.getChildren().addAll( depositLabel,depositInput,addLabel,buttonok,buttone,button100,button110,button120,button130,button140,button150,button160,button170,button180,button190);
           
           grid4.getChildren().addAll( buttong,buttonq,balLabel);
            grid5.getChildren().addAll(prev,l,mLabel);
            grid6.getChildren().addAll(next,k,nLabel);
 
          
        window.setScene(scene);
    window.show();
    
  

   

 
       
      
	}}