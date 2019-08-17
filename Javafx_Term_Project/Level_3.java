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

import javafx.util.Duration;

public class Level_3 extends Pane {
int colcount=0;

		Circle circle = new Circle(125,340,20);
		Line line5=new Line(145,340,450,340);
		Arc arc3 = new Arc(450,330,10,10,270,90);
		Line line6=new Line(450,330,470,330);
		Line line7=new Line(460,330,460,215);
		Arc arc4 = new Arc(460,195,20,20,270,180);
		Line line8=new Line(460,175,460,55);


		Circle circle2 = new Circle(200,400,20);
		Line line9=new Line(220,400,330,400);
		Arc arc5 = new Arc(330,390,10,10,270,90);
		Line line10=new Line(340,390,340,205);
		Arc arc6 = new Arc(350,205,10,10,90,90);
		Line line11=new Line(350,185,350,205);
		Line line12=new Line(350,195,465,195);


		Circle circle3 = new Circle(275,460,20);
		Line line =new Line(275,440,275,70);
		Arc arc1 = new Arc(285,70,10,10,90,90);
		Line line2=new Line(285,70,285,50);
		Line line3=new Line(285,60,440,60);
		Arc arc2 = new Arc(460,60,20,20,0,180);
		Line line4=new Line(480,60,530,60);


		Timeline firstCircle=new Timeline(
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle.radiusProperty(),20)),

				new KeyFrame(Duration.millis(1500),
						new KeyValue(line8.endYProperty(),330)),
				new KeyFrame(Duration.millis(845),
						new KeyValue(line8.startYProperty(),330)),
				new KeyFrame(Duration.millis(845),
						new KeyValue(arc4.centerYProperty(),350)),
				new KeyFrame(Duration.millis(627),
						new KeyValue(line7.endYProperty(),330)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line6.endXProperty(),485),
						new KeyValue(line6.startXProperty(),435))
				);

		Timeline firstCircleFinish=new Timeline(
				new KeyFrame(Duration.millis(500),
						new KeyValue(line8.opacityProperty(),0),
						new KeyValue(arc4.opacityProperty(),0),
						new KeyValue(line7.opacityProperty(),0),

						new KeyValue(circle.radiusProperty(),1),
						new KeyValue(circle.opacityProperty(),0),

						new KeyValue(line6.endXProperty(),460),
						new KeyValue(line6.startXProperty(),460),
						new KeyValue(line6.opacityProperty(),0),

						new KeyValue(arc3.opacityProperty(),0),
						new KeyValue(line5.opacityProperty(),0))

				);

		Timeline secondCircle=new Timeline(
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle2.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle2.radiusProperty(),20)),

				new KeyFrame(Duration.millis(1000),
						new KeyValue(line12.endXProperty(),350)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line11.startYProperty(),170),
						new KeyValue(line11.endYProperty(),220))
				);

		Timeline secondCircleFinish =new Timeline(
				new KeyFrame(Duration.millis(500),
						new KeyValue(line12.opacityProperty(),0),

						new KeyValue(circle2.radiusProperty(),1),
						new KeyValue(circle2.opacityProperty(),0),

						new KeyValue(line11.startYProperty(),195),
						new KeyValue(line11.endYProperty(),195),
						new KeyValue(line11.opacityProperty(),0),

						new KeyValue(arc6.opacityProperty(),0),
						new KeyValue(line10.opacityProperty(),0),
						new KeyValue(arc5.opacityProperty(),0),
						new KeyValue(line9.opacityProperty(),0)


						)

				);

		Timeline thirdCircle=new Timeline(
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle3.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle3.radiusProperty(),20)),

				new KeyFrame(Duration.millis(1500),
						new KeyValue(line4.endXProperty(),285)),
				new KeyFrame(Duration.millis(1193),
						new KeyValue(line4.startXProperty(),285)),
				new KeyFrame(Duration.millis(1193),
						new KeyValue(arc2.centerXProperty(),265)),
				new KeyFrame(Duration.millis(948),
						new KeyValue(line3.endXProperty(),285)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line2.startYProperty(),85),
						new KeyValue(line2.endYProperty(),35))

				);

		Timeline thirdCircleFinish=new Timeline(
				new KeyFrame(Duration.millis(500),
						new KeyValue(line4.opacityProperty(),0),
						new KeyValue(arc2.opacityProperty(),0),
						new KeyValue(line3.opacityProperty(),0),

						new KeyValue(circle3.radiusProperty(),1),
						new KeyValue(circle3.opacityProperty(),0),

						new KeyValue(line2.startYProperty(),60),
						new KeyValue(line2.endYProperty(),60),
						new KeyValue(line2.opacityProperty(),0),

						new KeyValue(line.opacityProperty(),0),
						new KeyValue(arc1.opacityProperty(),0)
						)

				);

			Timeline colission =new Timeline(

	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line8.endYProperty(),70),
	    				new KeyValue(line8.startYProperty(),190),

	    				new KeyValue(arc4.centerYProperty(),210),

	    				new KeyValue(line7.endYProperty(),230)

	    				)
	    		);

			Timeline colission2 =new Timeline(

		    		new KeyFrame(Duration.millis(133),
		    				new KeyValue(line4.endXProperty(),515),
		    				new KeyValue(line4.startXProperty(),465),

		    				new KeyValue(arc2.centerXProperty(),445),

		    				new KeyValue(line3.endXProperty(),425)

		    				)
		    		);


		public Level_3() {
			arc3.setType(ArcType.OPEN);
			arc3.setFill(null);
			arc3.setStroke(Color.BLACK);
			line6.setStrokeWidth(3);
			line7.setStrokeWidth(3);
			arc4.setType(ArcType.OPEN);
			arc4.setFill(null);
			arc4.setStroke(Color.BLACK);
			arc4.setStrokeWidth(3);
			line8.setStrokeWidth(3);
			getChildren().add(circle);
			getChildren().add(line5);
			getChildren().add(arc3);
			getChildren().add(line6);
			getChildren().add(line7);
			getChildren().add(line8);
			getChildren().add(arc4);


			arc5.setType(ArcType.OPEN);
			arc5.setFill(null);
			arc5.setStroke(Color.BLACK);
			arc6.setType(ArcType.OPEN);
			arc6.setFill(null);
			arc6.setStroke(Color.BLACK);
			line11.setStrokeWidth(3);
			line12.setStrokeWidth(3);
			getChildren().add(circle2);
			getChildren().add(line9);
			getChildren().add(arc5);
			getChildren().add(line10);
			getChildren().add(arc6);
			getChildren().add(line11);
			getChildren().add(line12);


			arc1.setType(ArcType.OPEN);
			arc1.setFill(null);
			arc1.setStroke(Color.BLACK);
			line2.setStrokeWidth(3);
			line3.setStrokeWidth(3);
			arc2.setType(ArcType.OPEN);
			arc2.setFill(null);
			arc2.setStroke(Color.BLACK);
			arc2.setStrokeWidth(3);
			line4.setStrokeWidth(3);
			getChildren().add(circle3);
			getChildren().add(line);
			getChildren().add(arc1);
			getChildren().add(line2);
			getChildren().add(line3);
			getChildren().add(arc2);
			getChildren().add(line4);





			circle.setOnMouseClicked(e -> firstTrueCircle());
			circle2.setOnMouseClicked(e -> {secondCircle.play();secondCircle.setOnFinished(ex -> secondCircleFinish.play());});
			circle3.setOnMouseClicked(e -> thirdTrueCircle());


		}

		public void firstTrueCircle(){
			firstCircle.play();
			if(arc4.getBoundsInParent().intersects(line12.getBoundsInParent()))
			{
				colcount++;
				colission.play();
				firstCircle.stop();
			}
			firstCircle.setOnFinished(ex -> firstCircleFinish.play());
		}

		public void thirdTrueCircle(){
			thirdCircle.play();
			if(arc2.getBoundsInParent().intersects(line8.getBoundsInParent()))
			{
				colcount++;
				colission2.play();
				thirdCircle.stop();
			}
			thirdCircle.setOnFinished(ex -> thirdCircleFinish.play());;
		}



}
