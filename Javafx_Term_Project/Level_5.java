import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Level_5 extends Pane {
int click = 0,click2=1;
int collisioncount = 0;

		Circle circle = new Circle(400,450,20);
		Line line = new Line(400,430,400,210);
		Arc arc = new Arc(390,210,10,10,0,90);
		Line line1 = new Line(390,210,390,190);
		Line line2 = new Line(390,200,345,200);


		Circle circle1 = new Circle(250,450,20);
		Line line3 = new Line(250,430,250,400);
		Circle circle5 = new Circle(250,380,20);
		Line line10 = new Line(230,380,270,380);
		Line line4 = new Line(250,360,250,320);
		Circle circle6 = new Circle(250,300,20);
		Line line11 = new Line(250,320,250,280);
		Line line5 = new Line(250,280,250,170);
		Arc arc3 = new Arc(260,170,10,10,90,90);
		Line line6 = new Line(260,150,260,170);
		Line line7 = new Line(260,160,330,160);
		Arc arc4 = new Arc(350,160,20,20,0,180);
		Line line8 = new Line(370,160,425,160);


		Circle circle3 = new Circle(150,380,20);
		Line line9 = new Line(170,380,230,380);
		Line line12 = new Line(270,380,410,380);
		Arc arc5 = new Arc(410,370,10,10,270,90);
		Line line13 = new Line(410,370,430,370);
		Line line14 = new Line(420,370,420,180);
		Arc arc6 = new Arc(420,160,20,20,270,180);
		Line line15 = new Line(420,140,420,130);


		Circle circle4 = new Circle(150,300,20);
		Line line16 = new Line(170,300,230,300);
		Line line17 = new Line(270,300,340,300);
		Arc arc7 = new Arc(340,290,10,10,270,90);
		Line line18 = new Line(340,290,360,290);
		Line line19 = new Line(350,290,350,220);
		Arc arc8 = new Arc(350,200,20,20,90,180);
		Line line20 = new Line(350,180,350,155);


		Timeline firstCircle=new Timeline( //en sað alt

				new KeyFrame(Duration.millis(250),
						new KeyValue(circle.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle.radiusProperty(),20)),

				new KeyFrame(Duration.millis(500),
						new KeyValue(line2.endXProperty(),390)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line1.endYProperty(),175),
						new KeyValue(line1.startYProperty(),225))
				);

		Timeline firstCircleFinish=new Timeline(

				new KeyFrame(Duration.millis(500),
						new KeyValue(line2.opacityProperty(),0),

						new KeyValue(circle.radiusProperty(),1),
						new KeyValue(circle.opacityProperty(),0),

						new KeyValue(line1.endYProperty(),200),
						new KeyValue(line1.startYProperty(),200),
						new KeyValue(line1.opacityProperty(),0),

						new KeyValue(line.opacityProperty(),0),
						new KeyValue(arc.opacityProperty(),0))
				);

		Timeline secondCircle=new Timeline( //altta soldaki

				new KeyFrame(Duration.millis(250),
						new KeyValue(circle1.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle1.radiusProperty(),20)),

				new KeyFrame(Duration.millis(1500),
						new KeyValue(line8.endXProperty(),260)),
				new KeyFrame(Duration.millis(1000),
						new KeyValue(line8.startXProperty(),260)),
				new KeyFrame(Duration.millis(1000),
						new KeyValue(arc4.centerXProperty(),240)),
				new KeyFrame(Duration.millis(636),
						new KeyValue(line7.endXProperty(),260)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line6.endYProperty(),185),
						new KeyValue(line6.startYProperty(),135))
				);

		Timeline secondCircleFinish=new Timeline(

				new KeyFrame(Duration.millis(500),
						new KeyValue(line8.opacityProperty(),0),
						new KeyValue(arc4.opacityProperty(),0),
						new KeyValue(line7.opacityProperty(),0),

						new KeyValue(circle1.radiusProperty(),1),
						new KeyValue(circle1.opacityProperty(),0),

						new KeyValue(line6.endYProperty(),160),
						new KeyValue(line6.startYProperty(),160),
						new KeyValue(line6.opacityProperty(),0),

						new KeyValue(line3.opacityProperty(),0),
						new KeyValue(line4.opacityProperty(),0),
						new KeyValue(line5.opacityProperty(),0),
						new KeyValue(arc3.opacityProperty(),0),

						new KeyValue(circle6.opacityProperty(),0),
						new KeyValue(line11.opacityProperty(),0))


				);

		Timeline thirdCircle= new Timeline(

				new KeyFrame(Duration.millis(250),
						new KeyValue(circle3.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle3.radiusProperty(),20)),

				new KeyFrame(Duration.millis(2000),
						new KeyValue(line15.endYProperty(),370)),
				new KeyFrame(Duration.millis(1916),
						new KeyValue(line15.startYProperty(),370)),
				new KeyFrame(Duration.millis(1916),
						new KeyValue(arc6.centerYProperty(),390)),
				new KeyFrame(Duration.millis(1583),
						new KeyValue(line14.endYProperty(),370)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line13.endXProperty(),445),
						new KeyValue(line13.startXProperty(),395))
				);

		Timeline thirdCircleFinish=new Timeline(

				new KeyFrame(Duration.millis(500),
						new KeyValue(line15.opacityProperty(),0),
						new KeyValue(arc6.opacityProperty(),0),
						new KeyValue(line14.opacityProperty(),0),

						new KeyValue(circle3.radiusProperty(),1),
						new KeyValue(circle3.opacityProperty(),0),

						new KeyValue(line13.endXProperty(),420),
						new KeyValue(line13.startXProperty(),420),
						new KeyValue(line13.opacityProperty(),0),

						new KeyValue(line9.opacityProperty(),0),
						new KeyValue(line12.opacityProperty(),0),
						new KeyValue(arc5.opacityProperty(),0),

						new KeyValue(circle5.opacityProperty(),0),
						new KeyValue(line10.opacityProperty(),0))
				);

		Timeline fourthCircle=new Timeline(

				new KeyFrame(Duration.millis(250),
						new KeyValue(circle4.radiusProperty(),25)),
				new KeyFrame(Duration.millis(250),
						new KeyValue(circle4.radiusProperty(),20)),

				new KeyFrame(Duration.millis(1500),
						new KeyValue(line20.endYProperty(),290)),
				new KeyFrame(Duration.millis(1222),
						new KeyValue(line20.startYProperty(),290)),
				new KeyFrame(Duration.millis(1222),
						new KeyValue(arc8.centerYProperty(),310)),
				new KeyFrame(Duration.millis(778),
						new KeyValue(line19.endYProperty(),290)),

				new KeyFrame(Duration.millis(200),
						new KeyValue(line18.endXProperty(),375),
						new KeyValue(line18.startXProperty(),325))
				);

		Timeline fourthCircleFinish= new Timeline(

				new KeyFrame(Duration.millis(500),
						new KeyValue(line20.opacityProperty(),0),
						new KeyValue(line19.opacityProperty(),0),
						new KeyValue(arc8.opacityProperty(),0),

						new KeyValue(circle4.radiusProperty(),1),
						new KeyValue(circle4.opacityProperty(),0),

						new KeyValue(line18.endXProperty(),350),
						new KeyValue(line18.startXProperty(),350),
						new KeyValue(line18.opacityProperty(),0),

						new KeyValue(line16.opacityProperty(),0),
						new KeyValue(line17.opacityProperty(),0),
						new KeyValue(arc7.opacityProperty(),0))
				);
		
		Timeline colission =new Timeline(
	    		
	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line8.endXProperty(),410),
	    				new KeyValue(line8.startXProperty(),355),
	    				
	    				new KeyValue(arc4.centerXProperty(),335),
	    				
	    				new KeyValue(line7.endXProperty(),315)

	    				)
	    		);
		
			Timeline colission2 =new Timeline(
	    		
	    		new KeyFrame(Duration.millis(133),
	    				new KeyValue(line15.endYProperty(),145),
	    				new KeyValue(line15.startYProperty(),155),
	    				
	    				new KeyValue(arc6.centerYProperty(),175),
	    				
	    				new KeyValue(line14.endYProperty(),195)

	    				)
	    		);
			
			Timeline colission3 =new Timeline(
		    		
		    		new KeyFrame(Duration.millis(133),
		    				new KeyValue(line20.endYProperty(),170),
		    				new KeyValue(line20.startYProperty(),195),
		    				
		    				new KeyValue(arc8.centerYProperty(),215),
		    				
		    				new KeyValue(line19.endYProperty(),235)

		    				)
		    		);


	public Level_5() {

		arc.setType(ArcType.OPEN);
		arc.setFill(null);
		arc.setStroke(Color.BLACK);
		line1.setStrokeWidth(3);
		line2.setStrokeWidth(3);
		getChildren().add(circle);
		getChildren().add(line);
		getChildren().add(arc);
		getChildren().add(line1);
		getChildren().add(line2);


		circle5.setFill(Color.WHITE);
		circle5.setStroke(Color.BLACK);
		circle5.setStrokeWidth(3);
		circle6.setFill(Color.WHITE);
		circle6.setStroke(Color.BLACK);
		circle6.setStrokeWidth(3);
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
		getChildren().add(circle1);
		getChildren().add(line3);
		getChildren().add(circle5);
		getChildren().add(line10);
		getChildren().add(line4);
		getChildren().add(circle6);
		getChildren().add(line11);
		getChildren().add(line5);
		getChildren().add(arc3);
		getChildren().add(line6);
		getChildren().add(line7);
		getChildren().add(arc4);
		getChildren().add(line8);


		arc5.setType(ArcType.OPEN);
		arc5.setFill(null);
		arc5.setStroke(Color.BLACK);
		line13.setStrokeWidth(3);
		line14.setStrokeWidth(3);
		arc6.setType(ArcType.OPEN);
		arc6.setFill(null);
		arc6.setStroke(Color.BLACK);
		arc6.setStrokeWidth(3);
		line15.setStrokeWidth(3);
		getChildren().add(circle3);
		getChildren().add(line9);
		getChildren().add(line12);
		getChildren().add(arc5);
		getChildren().add(line13);
		getChildren().add(line14);
		getChildren().add(arc6);
		getChildren().add(line15);


		arc7.setType(ArcType.OPEN);
		arc7.setFill(null);
		arc7.setStroke(Color.BLACK);
		line18.setStrokeWidth(3);
		line19.setStrokeWidth(3);
		arc8.setType(ArcType.OPEN);
		arc8.setFill(null);
		arc8.setStroke(Color.BLACK);
		arc8.setStrokeWidth(3);
		line20.setStrokeWidth(3);
		getChildren().add(circle4);
		getChildren().add(line16);
		getChildren().add(arc7);
		getChildren().add(line17);
		getChildren().add(line18);
		getChildren().add(line19);
		getChildren().add(arc8);
		getChildren().add(line20);


		circle.setOnMouseClicked(e -> {firstCircle.play();firstCircle.setOnFinished(ex -> firstCircleFinish.play());});

		circle5.setOnMouseClicked(e -> {line10.setRotate(line10.getRotate() + 90);click++;});
		circle6.setOnMouseClicked(e -> {line11.setRotate(line11.getRotate() + 90);click2++;});

		circle4.setOnMouseClicked(e -> secondTrueCircle());
		circle1.setOnMouseClicked(e -> thirthTrueCircle());
		circle3.setOnMouseClicked(e -> fourthTrueCircle());
	}
	public void secondTrueCircle() {

		if(click2 % 2 == 0) {
			fourthCircle.play();
			if(arc8.getBoundsInParent().intersects(line2.getBoundsInParent())) {
				collisioncount++;
				colission3.play();
				fourthCircle.stop();
				}
			fourthCircle.setOnFinished(ex -> fourthCircleFinish.play());
		}

	}
	public void thirthTrueCircle() {

		if(click % 2 == 1 && click2 % 2 == 1)
		{
			secondCircle.play();
			if(arc4.getBoundsInParent().intersects(line20.getBoundsInParent())) {
				collisioncount++;
				colission.play();
				secondCircle.stop();
				}
			secondCircle.setOnFinished(ex -> secondCircleFinish.play());
		}

	}
	public void fourthTrueCircle() {

		if(click % 2 == 0)
		{
			thirdCircle.play();
			if(arc6.getBoundsInParent().intersects(line8.getBoundsInParent())) {
				collisioncount++;
				colission2.play();
				thirdCircle.stop();
				}
			thirdCircle.setOnFinished(ex -> thirdCircleFinish.play());
		}


	}




}

