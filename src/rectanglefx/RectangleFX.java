package rectanglefx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class RectangleFX extends Application {
    @Override
    public void start(Stage myStage) {
         // заголовок окна 
	myStage.setTitle("Графические функции");
	 // панель компоновки
	AnchorPane rootNode=new AnchorPane();
	 // сцена 500x300
	Scene myScene=new Scene(rootNode, 300, 250);
	myStage.setScene(myScene);
	 // прямоугольник 
         // нач. точка, ширина, высота
	Rectangle rect1=new Rectangle(50, 50, 200, 150); 
	rect1.setStroke(Color.RED);
	rect1.setFill(Color.WHITE);
         // линия абсолютные координаты
        Line line1=new Line(50, 50, 250, 200); 
	line1.setStroke(Color.BLUE);
	 // добавляем в сцену
	rootNode.getChildren().addAll(rect1, line1);
	 // показываем сцену
	myStage.show();
	}
	public static void main(String[] args) {
        	launch(args);
	}
}