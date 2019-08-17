import java.sql.Time;
import javafx.application.Application;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import java.util.concurrent.TimeUnit;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.FadeTransition;

public class Level_1 extends Pane {
	int colcount=0;

		//Circle at the bottom middle side and lines coming from that circle
		Circle circle = new Circle(350,410,20);
		Line line2 = new Line(350,390,350,350);
		Line line3 = new Line(340,350,360,350);
		Line line4 = new Line(350,350,350,270);

		//Circle at the right side and lines coming from that circle
		Circle circle1 = new Circle(450,370,20);
		Line line5 = new Line(430,370,200,370);
		Arc arc1 = new Arc(200,360,10,10,180,90);
		Line line6 = new Line(190,360,190,285);
		Arc arc2 = new Arc(200,285,10,10,90,90);
		Line line7 = new Line(200,285,200,265);
		Line line8 = new Line(200,275,330,275);
		Arc arc3 = new Arc(350,275,20,20,0,180);
		Line line9 = new Line(370,275,430,275);


		//Animation named as firstCircle that does the movements (sliding, decreasing size of specified shapes, etc.)
		  //in specified duration milliseconds
		  		//when circle object is clicked by LEFT-mouse
		Timeline firstCircle = new Timeline(
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle.radiusProperty(),20)),
	            new KeyFrame(Duration.seconds(0.5),
	            		new KeyValue(line4.endYProperty(), 350)),

	            new KeyFrame(Duration.millis(200),
	            		new KeyValue(line3.endXProperty(),375),
	            		new KeyValue(line3.startXProperty(),325))
	        );

		//Animation named as firstCircleFinish that does the movements in specified duration milliseconds
		//when firstCircle animation has been completed
	    Timeline firstCircleFinish = new Timeline(
 			   new KeyFrame(Duration.seconds(0.5),
 			  new KeyValue(line2.opacityProperty(),0),
 			  new KeyValue(line4.opacityProperty(),0),
 			  new KeyValue(line3.endXProperty(), 350),
 			  new KeyValue(line3.startXProperty(), 350),
 			  new KeyValue(line3.opacityProperty(),0),

 			  new KeyValue(circle.radiusProperty(),1),
 			  new KeyValue(circle.opacityProperty(),0))) ;


	  //Animation named as secondCircle that does the movements (sliding, decreasing size of specified shapes, etc.)
	  //in specified duration milliseconds
	  		//when circle object is clicked by LEFT-mouse
	    Timeline secondCircle = new Timeline(
	    		new KeyFrame(Duration.millis(250),
						new KeyValue(circle1.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle1.radiusProperty(),20)),
	            new KeyFrame(Duration.millis(1500),
	                    new KeyValue(line9.endXProperty(),200)),

	            new KeyFrame(Duration.millis(1108),
	            		new KeyValue(line9.startXProperty(),200)),

	            new KeyFrame(Duration.millis(1108),
	            		new KeyValue(arc3.centerXProperty(),180)),

	            new KeyFrame(Duration.millis(847),
	                    new KeyValue(line8.endXProperty(),200)),

	            new KeyFrame(Duration.millis(200),
	            		new KeyValue(line7.endYProperty(),250),
						new KeyValue(line7.startYProperty(),300))
	        );

	  //Animation named as secondCircleFinish that does the movements in specified duration milliseconds
	  	//when firstCircle animation has been completed
	    Timeline secondCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
	    				new KeyValue(line5.opacityProperty(),0),
	    				new KeyValue(arc1.opacityProperty(),0),
	    				new KeyValue(line6.opacityProperty(),0),
	    				new KeyValue(arc2.opacityProperty(),0),

	    				new KeyValue(circle1.radiusProperty(),1),
	  	 			  	new KeyValue(circle1.opacityProperty(),0),

	  	 			  	new KeyValue(line7.endYProperty(),275),
	  	 			  	new KeyValue(line7.startYProperty(),275),
	  	 			  	new KeyValue(line7.opacityProperty(),0),

	  	 			  	new KeyValue(line9.opacityProperty(),0),
	  	 			  	new KeyValue(arc3.opacityProperty(),0),
	  	 			  	new KeyValue(line8.opacityProperty(),0)

	    				)
	        		);

	    //animation that will be done where collision will happen
	    Timeline colission =new Timeline(

	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line9.endXProperty(),415),
	    				new KeyValue(line9.startXProperty(),355),
	    				new KeyValue(arc3.centerXProperty(),335),
	    				new KeyValue(line8.endXProperty(),315))

	    		);


	    //constructor named level_1 that adds elements to pane and defines shape properties
		public Level_1() {
			//first circle's element's shape properties and adding specified elements to pane
			line3.setStrokeWidth(3);
			line4.setStrokeWidth(3);
			getChildren().add(circle);
			getChildren().add(line2);
			getChildren().add(line3);
			getChildren().add(line4);

			//second circle's element's shape properties and adding specified elements to pane
			arc1.setType(ArcType.OPEN);
			arc1.setFill(null);
			arc1.setStroke(Color.BLACK);
			arc2.setType(ArcType.OPEN);
			arc2.setFill(null);
			arc2.setStroke(Color.BLACK);
			line7.setStrokeWidth(3);
			line8.setStrokeWidth(3);
			arc3.setType(ArcType.OPEN);
			arc3.setFill(null);
			arc3.setStroke(Color.BLACK);
			arc3.setStrokeWidth(3);
			line9.setStrokeWidth(3);
			getChildren().add(circle1);
			getChildren().add(line5);
			getChildren().add(arc1);
			getChildren().add(line6);
			getChildren().add(arc2);
			getChildren().add(line7);
			getChildren().add(line8);
			getChildren().add(arc3);
			getChildren().add(line9);





			//creating mouseclick events
			circle.setOnMouseClicked(e -> {firstCircle.play(); firstCircle.setOnFinished(ex -> firstCircleFinish.play());});
			circle1.setOnMouseClicked(e -> secondTrueCircle());



		}


		public void secondTrueCircle(){

			//playing secondcircle animation
			secondCircle.play();
			//detecting collision area
			if(arc3.getBoundsInParent().intersects(line4.getBoundsInParent()))
			{
				colcount++;
				colission.play();
				secondCircle.stop();
			}

			secondCircle.setOnFinished(ex -> secondCircleFinish.play());
		}






}
