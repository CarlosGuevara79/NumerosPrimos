package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean flag, a; //banderas

    int j=0; //definimos las variables.
    int m;
    int s=2;

        for(int i=1;i<=10;i++){

        a=false;
        while(!a){
            m=2;
            flag=true;
            while((flag)&&(m<s)){
                if(s % m == 0){ //Si el residuo es igual a 0 entonces nuestro numero no es primo y entra al else
                    flag=false;
                }else{ //sigue avanzando en los numeros

                    m=m+1;
                }
            }

            if(flag){ // si es un numero primo entra al if y se imprime.
                j=j+1;
                System.out.println("El numero primo #"+j+" Es "+s);
                a=true;
            }

            s=s+1;
        }//fin de while

    }//fin de for
}
}
