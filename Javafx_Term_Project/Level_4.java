import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Level_4 extends Pane {
 int click = 0;
 int collisioncount = 0;

		//Circle at the left side and lines coming from that circle
		Circle circle = new Circle(150,350,20);
		Line line = new Line(170,350,230,350);
		Circle circle2 = new Circle(250,350,20);
		Line line1 = new Line(270,350,390,350);
		Arc arc1 = new Arc(390,340,10,10,270,90);
		Line line2 = new Line(390,340,410,340);
		Line line3 = new Line(400,340,400,245);
		Line line4 = new Line(250,370,250,330); //Line in the circle

		//Circle at the right side and lines coming from that circle
		Circle circle1 = new Circle(250,450,20);
		Line line5 = new Line(250,430,250,370);
		Line line6 = new Line(250,330,250,260);
		Arc arc2 = new Arc(260,260,10,10,90,90);
		Line line7 = new Line(260,240,260,260);
		Line line8 = new Line(260,250,380,250);
		Arc arc3 = new Arc(400,250,20,20,0,180);
		Line line9 = new Line(420,250,440,250);



		Timeline firstCircle = new Timeline(
	            new KeyFrame(Duration.seconds(0.2),
	                    new KeyValue(line2.endXProperty(), 420),
	                    new KeyValue(line2.startXProperty(), 380)),
	            new KeyFrame(Duration.seconds(1),
	                    new KeyValue(line3.endYProperty(),340))
	        );
	    Timeline firstCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
	    				new KeyValue(circle.opacityProperty(),0),
	    				new KeyValue(arc1.opacityProperty(),0),
	    				new KeyValue(line.opacityProperty(),0),
	    				new KeyValue(line1.opacityProperty(),0),
	    				new KeyValue(line2.opacityProperty(),0),
	    				new KeyValue(line3.opacityProperty(),0),
	    				new KeyValue(circle.radiusProperty(),0),
	    				new KeyValue(line2.endXProperty(),400),
	    				new KeyValue(line2.startXProperty(),400))
	        		);


		Timeline secondCircle = new Timeline(
	            new KeyFrame(Duration.millis(200),
	                    new KeyValue(line7.endYProperty(), 270),
	                    new KeyValue(line7.startYProperty(), 230)),
	            new KeyFrame(Duration.millis(1333),
	                    new KeyValue(line8.endXProperty(),260)),
	            new KeyFrame(Duration.millis(1777),
	            		new KeyValue(arc3.centerXProperty(),240)),
	            new KeyFrame(Duration.millis(1777),
	            		new KeyValue(line9.startXProperty(),260)),
	            new KeyFrame(Duration.millis(2000),
	            		new KeyValue(line9.endXProperty(),260))

	        );
	    Timeline secondCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
	    				new KeyValue(circle1.opacityProperty(),0),
	    				new KeyValue(circle2.opacityProperty(),0),
	    				new KeyValue(arc3.opacityProperty(),0),
	    				new KeyValue(arc2.opacityProperty(),0),
	    				new KeyValue(line5.opacityProperty(),0),
	    				new KeyValue(line4.opacityProperty(),0),
	    				new KeyValue(line6.opacityProperty(),0),
	    				new KeyValue(line7.opacityProperty(),0),
	    				new KeyValue(line8.opacityProperty(),0),
	    				new KeyValue(line9.opacityProperty(),0),
	    				new KeyValue(circle1.radiusProperty(),0),
	    				new KeyValue(line7.endYProperty(),250),
	    				new KeyValue(line7.startYProperty(),250))
	        		);

	    Timeline colission =new Timeline(
	    		
	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line9.endXProperty(),425),
	    				new KeyValue(line9.startXProperty(),405),
	    				
	    				new KeyValue(arc3.centerXProperty(),385),
	    				
	    				new KeyValue(line8.endXProperty(),365)

	    				)
	    		);


	public Level_4() {
		//adding objects of left side circle to the pane
		getChildren().add(circle);
		getChildren().add(line);
		getChildren().add(circle2);
		//circle2.set;
		circle2.setFill(Color.WHITE);
		circle2.setStroke(Color.BLACK);
		circle2.setStrokeWidth(3);
		getChildren().add(line1);
		getChildren().add(arc1);
		arc1.setType(ArcType.OPEN);
		arc1.setFill(null);
		arc1.setStroke(Color.BLACK);
		getChildren().add(line2);
		line2.setStrokeWidth(3);
		getChildren().add(line3);
		line3.setStrokeWidth(3);
			getChildren().add(line4);
			circle2.setRotate(0);
		//adding objects of right side circle to the pane
		getChildren().add(circle1);
		getChildren().add(line5);
		getChildren().add(line6);
		getChildren().add(arc2);
		arc2.setType(ArcType.OPEN);
		arc2.setFill(null);
		arc2.setStroke(Color.BLACK);
		getChildren().add(line7);
		line7.setStrokeWidth(3);
		getChildren().add(line8);
		line8.setStrokeWidth(3);
		getChildren().add(arc3);
		arc3.setType(ArcType.OPEN);
		arc3.setFill(null);
		arc3.setStroke(Color.BLACK);
		arc3.setStrokeWidth(3);
		getChildren().add(line9);
		line9.setStrokeWidth(3);

		circle1.setOnMouseClicked(e -> secondTrueCircle());
		circle2.setOnMouseClicked(e -> {line4.setRotate(line4.getRotate() + 90);click++;});
		circle.setOnMouseClicked(e -> firstTrueCircle());
	}

	public void secondTrueCircle() {


		if(click % 2 == 1)
			circle.setOnMouseClicked(e -> firstTrueCircle());

		else {
			secondCircle.play();
			if(arc3.getBoundsInParent().intersects(line3.getBoundsInParent())) {
				collisioncount++;
				colission.play();
				secondCircle.stop();
				}

			secondCircle.setOnFinished(ex -> secondCircleFinish.play());
			}




	}
public void firstTrueCircle() {


		if(click % 2 == 1) {
			 firstCircle.play();
			 firstCircle.setOnFinished(ex -> firstCircleFinish.play());
			 }




	}

}

