import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.scene.paint.*;

public class Level_2 extends Pane {

	int collisioncount = 0;

		//Circle at the left side and lines coming from that circle
		Circle circle = new Circle(125,410,20);
		Line line = new Line(125,390,125,150);
		Arc arc1 = new Arc(135,150,10,10,90,90);
		Line line2 = new Line(135,150,135,130);
		Line line3 = new Line(135,140,230,140);


		//Circle at the mid-left side and lines coming from that circle
		Circle circle2 = new Circle(225,410,20);
		Line line4=new Line(225,430,225,330);
		Line line5=new Line(215,330,235,330);
		Line line6=new Line(225,330,225,255);
		Arc arc2 = new Arc(225,235,20,20,90,180);
		Line line7=new Line(225,215,225,160);
		Arc arc3 = new Arc(225,140,20,20,90,-180);
		Line line8=new Line(225,120,225,100);


		//Circle at the mid-right side and lines coming from that circle
		Circle circle3 = new Circle(300,410,20);
		Line line9=new Line(300,410,300,330);
		Line line10=new Line(290,330,310,330);
		Line line11=new Line(300,330,300,230);


		//Circle at the right side and lines coming from that circle
		Circle circle4 = new Circle(475,410,20);
		Line line12 = new Line(475,390,475,245);
		Arc arc4 = new Arc(465,245,10,10,0,90);
		Line line13 = new Line(465,245,465,225);
		Line line14 = new Line(465,235,320,235);
		Arc arc5 = new Arc(300,235,20,20,0,180);
		Line line15=new Line(280,235,220,235);



		Timeline firstCircle = new Timeline(
	            new KeyFrame(Duration.seconds(0.2),
	                    new KeyValue(line2.endYProperty(), 120),
	                    new KeyValue(line2.startYProperty(), 160)),
	            new KeyFrame(Duration.seconds(1),
	                    new KeyValue(line3.endXProperty(),135))
	        );


	    Timeline firstCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
        				new KeyValue(circle.opacityProperty(),0),
        				new KeyValue(arc1.opacityProperty(),0),
        				new KeyValue(line.opacityProperty(),0),
        				new KeyValue(line2.opacityProperty(),0),
        				new KeyValue(line3.opacityProperty(),0),
        				new KeyValue(circle.radiusProperty(),0),
        				new KeyValue(line2.endYProperty(),135),
        				new KeyValue(line2.startYProperty(),135))
	        		);

	    Timeline secondCircle = new Timeline(
	            new KeyFrame(Duration.millis(3000),
	                    new KeyValue(line8.endYProperty(), 330)),

	            new KeyFrame(Duration.millis(2739),
	                    new KeyValue(line8.startYProperty(), 330)),

	            new KeyFrame(Duration.millis(2739),
	            		new KeyValue(arc3.centerYProperty(),350)),

	            new KeyFrame(Duration.millis(2217),
	                    new KeyValue(line7.endYProperty(), 330)),

	            new KeyFrame(Duration.millis(1500),
	                    new KeyValue(line7.startYProperty(), 330)),

	            new KeyFrame(Duration.millis(1500),
	            		new KeyValue(arc2.centerYProperty(), 350)),

	            new KeyFrame(Duration.millis(978),
	                    new KeyValue(line6.endYProperty(), 330)),

	            new KeyFrame(Duration.millis(200),
	                    new KeyValue(line5.startXProperty(), 205),
	                    new KeyValue(line5.endXProperty(), 245))

	        );
	    Timeline secondCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
        				new KeyValue(circle2.opacityProperty(), 0),
        				new KeyValue(arc2.opacityProperty(), 0),
        				new KeyValue(line4.opacityProperty(), 0),
        				new KeyValue(line5.opacityProperty(), 0),
        				new KeyValue(line6.opacityProperty(), 0),
        				new KeyValue(arc3.opacityProperty(), 0),
        				new KeyValue(line7.opacityProperty(), 0),
        				new KeyValue(line8.opacityProperty(), 0),
        				new KeyValue(circle2.radiusProperty(), 0),
        				new KeyValue(line5.endXProperty(), 225),
        				new KeyValue(line5.startXProperty(),225))
	        		);

	    Timeline thirthCircle = new Timeline(
	            new KeyFrame(Duration.seconds(0.2),
	                    new KeyValue(line10.startXProperty(), 280),
	                    new KeyValue(line10.endXProperty(), 320)),
	            new KeyFrame(Duration.seconds(1),
	                    new KeyValue(line11.endYProperty(),330))
	        );
	    Timeline thirthCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
        				new KeyValue(circle3.opacityProperty(),0),
        				new KeyValue(line9.opacityProperty(),0),
        				new KeyValue(line10.opacityProperty(),0),
        				new KeyValue(line11.opacityProperty(),0),
        				new KeyValue(circle3.radiusProperty(),0),
        				new KeyValue(line10.endXProperty(),300),
        				new KeyValue(line10.startXProperty(),300))
	        		);

	    Timeline fourthCircle = new Timeline(
	            new KeyFrame(Duration.millis(200),
	                    new KeyValue(line13.endYProperty(), 215),
	                    new KeyValue(line13.startYProperty(), 255)),
	            new KeyFrame(Duration.millis(3000),
	                    new KeyValue(line15.endXProperty(),465)),
	            new KeyFrame(Duration.millis(2265),
	                    new KeyValue(line15.startXProperty(),465)),
	            new KeyFrame(Duration.millis(2265),
	                    new KeyValue(arc5.centerXProperty(),485)),
	            new KeyFrame(Duration.millis(1785),
	                    new KeyValue(line14.endXProperty(),465))

	        );

	    Timeline fourthCircleFinish = new Timeline(
	    		new KeyFrame(Duration.seconds(0.5),
        				new KeyValue(circle4.opacityProperty(), 0),
        				new KeyValue(arc5.opacityProperty(), 0),
        				new KeyValue(line15.opacityProperty(), 0),
        				new KeyValue(line14.opacityProperty(), 0),
        				new KeyValue(line13.opacityProperty(), 0),
        				new KeyValue(arc4.opacityProperty(), 0),
        				new KeyValue(line12.opacityProperty(), 0),
        				new KeyValue(circle4.radiusProperty(), 0),
        				new KeyValue(line13.endYProperty(), 235),
        				new KeyValue(line13.startYProperty(),235))
	        		);

	    Timeline colission =new Timeline(

	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line8.endYProperty(),115),
	    				new KeyValue(line8.startYProperty(),135),

	    				new KeyValue(arc3.centerYProperty(),155),

	    				new KeyValue(line7.endYProperty(),175),
	    				new KeyValue(line7.startYProperty(),230),

	    				new KeyValue(arc2.centerYProperty(),250),

	    				new KeyValue(line6.endYProperty(),270)
	    				)
	    		);

	    Timeline colission2 = new Timeline(

	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line15.endXProperty(),235),
	    				new KeyValue(line15.startXProperty(),295),

	    				new KeyValue(arc5.centerXProperty(),315),

	    				new KeyValue(line14.endXProperty(),335)

	    				)
	    		);



		public Level_2() {
		//adding objects of left side circle to the pane
		getChildren().add(circle);
		getChildren().add(line);
		getChildren().add(arc1);
		arc1.setType(ArcType.OPEN);
		arc1.setFill(null);
		arc1.setStroke(Color.BLACK);
		getChildren().add(line2);
		line2.setStrokeWidth(3);
		getChildren().add(line3);
		line3.setStrokeWidth(3);

		//adding objects of mid-left side circle to the pane
		getChildren().add(circle2);
		getChildren().add(line4);
		getChildren().add(line5);
		line5.setStrokeWidth(3);
		getChildren().add(line6);
		line6.setStrokeWidth(3);
		getChildren().add(arc2);
		arc2.setType(ArcType.OPEN);
		arc2.setFill(null);
		arc2.setStroke(Color.BLACK);
		arc2.setStrokeWidth(3);
		getChildren().add(line7);
		line7.setStrokeWidth(3);
		getChildren().add(arc3);
		arc3.setType(ArcType.OPEN);
		arc3.setFill(null);
		arc3.setStroke(Color.BLACK);
		arc3.setStrokeWidth(3);
		getChildren().add(line8);
		line8.setStrokeWidth(3);

		//adding objects of mid-right side circle to the pane
		getChildren().add(circle3);
		getChildren().add(line9);
		getChildren().add(line10);
		line10.setStrokeWidth(3);
		getChildren().add(line11);
		line11.setStrokeWidth(3);

		//adding objects of right side circle to the pane
		getChildren().add(circle4);
		getChildren().add(line12);
		getChildren().add(arc4);
		arc4.setType(ArcType.OPEN);
		arc4.setFill(null);
		arc4.setStroke(Color.BLACK);
		getChildren().add(line13);
		line13.setStrokeWidth(3);
		getChildren().add(line14);
		line14.setStrokeWidth(3);
		getChildren().add(arc5);
		arc5.setType(ArcType.OPEN);
		arc5.setFill(null);
		arc5.setStroke(Color.BLACK);
		arc5.setStrokeWidth(3);
		getChildren().add(line15);
		line15.setStrokeWidth(3);




		circle.setOnMouseClicked(e -> {firstCircle.play();firstCircle.setOnFinished(ex -> firstCircleFinish.play());});
		circle2.setOnMouseClicked(e -> secondTrueCircle());
		circle3.setOnMouseClicked(e -> {thirthCircle.play();thirthCircle.setOnFinished(ex -> thirthCircleFinish.play());});
		circle4.setOnMouseClicked(e -> fourthTrueCircle());


		}

		public void secondTrueCircle() {
			secondCircle.play();
			if(arc3.getBoundsInParent().intersects(line3.getBoundsInParent()) || arc2.getBoundsInParent().intersects(line15.getBoundsInParent())) {
				collisioncount++;
				colission.play();
				secondCircle.stop();
				}
			secondCircle.setOnFinished(ex -> secondCircleFinish.play());

		}
		public void fourthTrueCircle() {

			fourthCircle.play();
			if(arc5.getBoundsInParent().intersects(line11.getBoundsInParent())) {
				collisioncount++;
				colission2.play();
				fourthCircle.stop();
				}
			fourthCircle.setOnFinished(ex -> fourthCircleFinish.play());

		}


}