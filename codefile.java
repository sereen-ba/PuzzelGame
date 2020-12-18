
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.Writer;
	import java.net.URISyntaxException;
	import java.time.LocalTime;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Timer;
	import java.util.concurrent.Executors;
	import java.util.concurrent.ScheduledExecutorService;
	import java.util.concurrent.TimeUnit;
	import java.util.concurrent.atomic.AtomicInteger;
	import com.sun.webkit.ContextMenu;
	import javafx.animation.KeyFrame;
	import javafx.animation.KeyValue;
	import javafx.animation.Timeline;
	import javafx.application.Application;
	import javafx.application.Platform;
	import javafx.beans.property.Property;
	import javafx.beans.value.ObservableValue;
	import javafx.collections.FXCollections;

	import static javafx.application.Application.launch;
	import javafx.event.ActionEvent;
	import javafx.event.Event;
	import javafx.event.EventHandler;
	import javafx.geometry.Insets;
	import javafx.geometry.Point2D;
	import javafx.geometry.Pos;
	import javafx.scene.Group;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.ContentDisplay;
	import javafx.scene.control.Label;
	import javafx.scene.control.ListView;
	import javafx.scene.control.TextField;
	import javafx.scene.effect.DropShadow;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.input.MouseEvent;
	import javafx.scene.layout.Background;
	import javafx.scene.layout.BackgroundFill;
	import javafx.scene.layout.BackgroundImage;
	import javafx.scene.layout.BackgroundRepeat;
	import javafx.scene.layout.BackgroundSize;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.FlowPane;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.Pane;
	import javafx.scene.layout.Region;
	import javafx.scene.layout.StackPane;
	import javafx.scene.layout.VBox;
	import javafx.scene.media.Media;
	import javafx.scene.media.MediaPlayer;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Ellipse;
	import javafx.scene.shape.LineTo;
	import javafx.scene.shape.MoveTo;
	import javafx.scene.shape.Path;
	import javafx.scene.shape.Rectangle;
	import javafx.scene.shape.Shape;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontPosture;
	import javafx.scene.text.FontWeight;
	import javafx.scene.text.Text;
	import javafx.scene.text.TextAlignment;
	import javafx.stage.Stage;
	import javafx.util.Duration;
	import java.time.LocalTime;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Timer;
	import java.util.concurrent.Executors;
	import java.util.concurrent.ScheduledExecutorService;
	import java.util.concurrent.TimeUnit;
	import java.util.concurrent.atomic.AtomicInteger;
	import com.sun.webkit.ContextMenu;
	import javafx.animation.KeyFrame;
	import javafx.animation.KeyValue;
	import javafx.animation.Timeline;
	import javafx.application.Application;
	import javafx.application.Platform;
	import static javafx.application.Application.launch;
	import javafx.event.ActionEvent;
	import javafx.event.Event;
	import javafx.event.EventHandler;
	import javafx.geometry.Insets;
	import javafx.geometry.Point2D;
	import javafx.scene.Group;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.ContentDisplay;
	import javafx.scene.control.Label;
	import javafx.scene.control.RadioButton;
	import javafx.scene.control.ScrollBar;
	import javafx.scene.control.ScrollPane;
	import javafx.scene.control.SelectionMode;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;
	import javafx.scene.control.ToggleGroup;
	import javafx.scene.effect.DropShadow;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.input.MouseEvent;
	import javafx.scene.layout.Background;
	import javafx.scene.layout.BackgroundFill;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.Pane;
	import javafx.scene.layout.StackPane;
	import javafx.scene.layout.VBox;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Ellipse;
	import javafx.scene.shape.LineTo;
	import javafx.scene.shape.MoveTo;
	import javafx.scene.shape.Path;
	import javafx.scene.shape.Rectangle;
	import javafx.scene.shape.Shape;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontPosture;
	import javafx.scene.text.FontWeight;
	import javafx.scene.text.Text;

	public class codefile extends Application {
		private int mins = 0, secs = 0, millis = 0;
		private boolean sos = true;
		private Text text;
		private Button sButton, rButton;
		Timeline timelinee;
		private final int i = 60;
		private final DateTimeFormatter HH_MM_SS = DateTimeFormatter.ofPattern("HH:mm:ss");
		private final Label l1 = new Label("Time:  " + "00:00:00");
		private final Insets insets = new Insets(3, 5, 3, 5);
		private final Button shuffleButton = new Button("Shuffle");
		private final Button Finish = new Button("Finish");
		private final List<Piece> pieces = new ArrayList<Piece>(); //for game paices
		private final Button Bas = new Button("Back");
		private final Button button1 = new Button("Finish");
		private String HighScores = "Time: 00:00:000" + " ";
		private List<String> HighScore = new ArrayList<String>(); // for saving Score
		private Font ScoreFont;
		String high;
		private String SaveDataPath;
		private String Level1file = "SaveData";

		private final String path =   "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s1.mp3";
		private final String path2 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path3 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path4 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path5 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path6 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path7 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path8 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path9 =  "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path10 = "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path11 = "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path12 = "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path13 = "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path14 = "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		private final String path15 = "/Users/sireenbahdad/Desktop/eclipse-workspace/ProjectPuzzel/bin/s3.mp3";
		
		// Instantiating Media class
		private final Media media = new Media(new File(path).toURI().toString());
		// Instantiating MediaPlayer class
		private MediaPlayer mediaPlayer = new MediaPlayer(media);
		 private final Media media2 = new Media(new File(path2).toURI().toString());
			private MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
			private final Media media3 = new Media(new File(path3).toURI().toString());
				private MediaPlayer mediaPlayer3 = new MediaPlayer(media3);
			private final Media media4 = new Media(new File(path4).toURI().toString());
			private MediaPlayer mediaPlayer4 = new MediaPlayer(media4);
			private final Media media5 = new Media(new File(path5).toURI().toString());
			private MediaPlayer mediaPlayer5 = new MediaPlayer(media5);
			private final Media media7 = new Media(new File(path7).toURI().toString());
			private MediaPlayer mediaPlayer7 = new MediaPlayer(media7);
			private final Media media8 = new Media(new File(path8).toURI().toString());
			private MediaPlayer mediaPlayer8 = new MediaPlayer(media8);
			private final Media media9 = new Media(new File(path9).toURI().toString());
			private MediaPlayer mediaPlayer9 = new MediaPlayer(media9);
			private final Media media10 = new Media(new File(path10).toURI().toString());
			private MediaPlayer mediaPlayer10 = new MediaPlayer(media10);
			private final Media media11 = new Media(new File(path11).toURI().toString());
			private MediaPlayer mediaPlayer11 = new MediaPlayer(media11);
			private final Media media12 = new Media(new File(path12).toURI().toString());
			private MediaPlayer mediaPlayer12 = new MediaPlayer(media12);
			private final Media media13 = new Media(new File(path13).toURI().toString());
			private MediaPlayer mediaPlayer13 = new MediaPlayer(media13);
			private final Media media14 = new Media(new File(path14).toURI().toString());
			private MediaPlayer mediaPlayer14 = new MediaPlayer(media14);
			private final Media media15 = new Media(new File(path15).toURI().toString());
			private MediaPlayer mediaPlayer15 = new MediaPlayer(media15);
			private Timeline timeline;
		public codefile() { // for saving data path
			try {
				SaveDataPath=codefile.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}

		private void creatfile() { // creat score file

			try {
				File file = new File(SaveDataPath, Level1file);
				FileWriter output = new FileWriter(file,true);
				BufferedWriter f = new BufferedWriter(output);
				f.write("00:00:000");
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

		private void setHighScore() { // to write the score
			try {
				File ff = new File(SaveDataPath, Level1file);
				FileWriter output = new FileWriter(ff,true);
				BufferedWriter f = new BufferedWriter(output);
				int i = HighScore.size(); 
					f.write(HighScore.get(i-1));
					//f.newLine();
				
				f.close();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

		private String getFileText() {  // for show the score from file
			File ff = new File(SaveDataPath, Level1file);
			String listofscore = "";
			try {
				if(!(ff.exists()) || ff.length() == 0 ) {
					
					System.out.print(" ");
				}
				else {
				Scanner s = new Scanner(ff);

				while (s.hasNext()) {
					listofscore = listofscore.concat(String.format("%s\n",  s.next()));
				}}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			return listofscore;
		}
		
		private String getHighScore() {  // to find the hegiest score
			File ff = new File(SaveDataPath, Level1file);
			try {
				
	            if(!(ff.exists()) && ff.length() == 0 ) {
					
					System.out.print("there's no score, please be the First player");
				}
					
					
					
					else {


				Scanner s = new Scanner(ff);
				high=s.nextLine();
				int hn7=Integer.parseInt(Character.toString(high.charAt(7)));
				int hn8=Integer.parseInt(Character.toString(high.charAt(8)));
				int hn10=Integer.parseInt(Character.toString(high.charAt(10)));
				int hn11=Integer.parseInt(Character.toString(high.charAt(11)));
				int hn13=Integer.parseInt(Character.toString(high.charAt(13)));
				while (s.hasNext()) {
				String e=s.nextLine();
				int dn7=Integer.parseInt(Character.toString(e.charAt(7)));
				int dn8=Integer.parseInt(Character.toString(e.charAt(8)));
				int dn10=Integer.parseInt(Character.toString(e.charAt(10)));
				int dn11=Integer.parseInt(Character.toString(e.charAt(11)));
				int dn13=Integer.parseInt(Character.toString(e.charAt(13)));
				if(dn7<hn7) {
					high=e;
					break;
				}
				else if((dn7==hn7)&&(dn8<hn8)) {
					high=e;
					break;
				}
				else if((dn7==hn7)&&(dn8==hn8)&&(dn10<hn10)) {
					high=e;
					break;
				}
				else if((dn7==hn7)&&(dn8==hn8)&&(dn10==hn10)&&(dn11<hn11)) {
						high=e;
						break;
					}
				else	 if((dn7==hn7)&&(dn8==hn8)&&(dn10==hn10)&&(dn11==hn11)&&(dn13<hn13)) {
						high=e;
						break;
					}
				}
		    s.close();  
			 }}
			
			catch (FileNotFoundException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return high;
		}


		public static void main(String[] args) {
			launch(args);

		}

		
		public void start(Stage primaryStage, Image image) {

			///// Time
			BorderPane pb = new BorderPane();
			text = new Text("Time: " + "00:00:000");
			text.setStyle("-fx-font-size: 2em;");
			text.setTextAlignment(TextAlignment.JUSTIFY);
			
			timelinee = new Timeline(new KeyFrame(Duration.millis(1), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					change(text);
				}
			}));
			
			Group root = new Group();
	        root.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm());
			primaryStage.setScene(new Scene(root));
			primaryStage.setTitle("Puzzle Game");
			
			// load puzzle image
			int numOfColumns = (int) (image.getWidth() / Piece.SIZE);
			int numOfRows = (int) (image.getHeight() / Piece.SIZE);
			
			
			// create desk
			final Desk desk = new Desk(numOfColumns, numOfRows);
			// create puzzle pieces
			final List<Piece> pieces = new ArrayList<Piece>();
			for (int col = 0; col < numOfColumns; col++) {
				for (int row = 0; row < numOfRows; row++) {
					int x = col * Piece.SIZE;
					int y = row * Piece.SIZE;
					final Piece piece = new Piece(image, x, y, desk.getWidth(), desk.getHeight());
					pieces.add(piece);
				}
			}
			desk.getChildren().addAll(pieces);
			// create button box

				shuffleButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent actionEvent) {
					if (timeline != null)
						timeline.stop();
					timeline = new Timeline();
					for (final Piece piece : pieces) {
						piece.setActive();
						double shuffleX = Math.random() * (desk.getWidth() - Piece.SIZE + 48f) - 24f - piece.getCorrectX();
						double shuffleY = Math.random() * (desk.getHeight() - Piece.SIZE + 30f) - 15f - piece.getCorrectY();

						timeline.getKeyFrames()
								.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
										new KeyValue(piece.translateYProperty(), shuffleY)));
					}
					
					timeline.playFromStart();
					timelinee.play();

				}
			});

			timelinee.setCycleCount(Timeline.INDEFINITE);
			timelinee.setAutoReverse(false);
			sButton = new Button("Stop");
			sButton.setPadding(insets);
			shuffleButton.setOnMouseMoved(e->{
				mediaPlayer11.seek(Duration.ZERO);
				mediaPlayer11.play();
			});
			

			sButton.setOnMouseMoved(e->{
				mediaPlayer12.seek(Duration.ZERO);
				mediaPlayer12.play();
			});
			
			
			sButton.setOnMouseClicked(e -> {
				
				HBox pane3 = new HBox(20);
				HBox pane2 = new HBox(20);
				BorderPane H = new BorderPane();
				H.setStyle("-fx-background:beige");
				Button Ba = new Button("Back");
				Ba.setId("yellow1");
				timelinee.pause();
				sButton.setText("Stop");
				Label D = new Label("You Can't finish, Please complete first");
				D.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 18));
				H.setPadding(new Insets(30, 40, 40, 40));
				H.setTop(D);
				H.setBottom(Ba);
				Scene d = new Scene(H, 500, 200);
				
				d.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm()); // for CSS button style
				
				// For the waiting stage
				if(!(text.getText().equals("Time: " + "00:00:000"))) {
				D.setText("You Stoped The Game ");
				primaryStage.close();
				Stage bt = new Stage();
				bt.setScene(d);
				primaryStage.close();
				bt.show();
				
				Ba.setOnMouseMoved(el->{
					mediaPlayer13.seek(Duration.ZERO);
					mediaPlayer13.play();
				});
				
				Ba.setOnMouseClicked(em -> { // back button to level stage
					bt.close();
					timelinee.play();
					sButton.setText("stop");
					bt.close();
					primaryStage.show();
				});}
			});

			Bas.setOnMouseClicked(e -> { // back button to level stage

				timelinee.stop();
					//timelinee.pause();
				if(!(text.getText().equals("Time: " + "00:00:000"))){
				for (final Piece piece : pieces) { // solve the paces
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
				mins = 0;
				secs = 0;
				millis = 0;
				text.setText("Time:  " + "00:00:000");
				}
				primaryStage.close();
						st.show();
			});

			Finish.setOnMouseClicked(e -> { // when finishing the game

					timelinee.pause();

				boolean b = true;

				for (int i = 0; i < numOfRows; i++) {

					if (pieces.get(i).checkd() == true) {

					}

					else {
						b = false;
					}
				}

				HBox pane3 = new HBox(20);
				pane3.setAlignment(Pos.CENTER);
				HBox pane2 = new HBox(20);
				pane2.setAlignment(Pos.CENTER);
				BorderPane H = new BorderPane();
				Button Ba = new Button("Back");
				Ba.setId("yellow1");

				Text EnterYourNAme = new Text("Enter Your Name");
				EnterYourNAme.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 18));
				TextField Name = new TextField("YourName");
				Text Con = new Text("Congrats");
				Con.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 20));
				Button seeScore = new Button("See all scores"); // retern to levels
				seeScore.setId("yellow1");
				Button Save = new Button("Save your Score"); // save score
				Save.setId("yellow1");

				Label D = new Label("You Can't finish, Please complete first");
				D.setAlignment(Pos.CENTER);
				D.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 18));
				H.setPadding(new Insets(30, 40, 40, 40));
				H.setStyle("-fx-background:beige");

				if (b && !(text.getText().equals("Time: " + "00:00:000"))) {// check if the game solved 

					mediaPlayer.setAutoPlay(true); 
					Stage a = new Stage();
					H.setTop(Con);
					H.setAlignment(Con, Pos.TOP_CENTER);
					pane3.getChildren().addAll(EnterYourNAme, Name);
					pane2.getChildren().addAll(seeScore, Save);
					H.setCenter(pane3);
					H.setBottom(pane2);
					H.setAlignment(pane3, Pos.CENTER_LEFT);
					H.setAlignment(pane2, Pos.CENTER);


					seeScore.setOnMouseClicked(em -> { // back button to level stage
						timelinee.stop();
						text.setText("Time: " + "00:00:000");
						a.setTitle("Pazzle Game");
						a.close();
						st.show();
					});

					Save.setOnMouseClicked(em -> { // Save your Score

						HighScore.add(" "+text.getText()+","+Name.getText()+"\n");

						setHighScore(); // save the score
						Stage confermationmessage = new Stage(); // to confarm the saving  score
						
						BorderPane messageforsaving = new BorderPane();

						Text messafe = new Text("Your Score is Saved");
						messafe.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 18));
					
						Button colsingets = new Button("OK"); // bach to Congrats stage
						colsingets.setId("yellow1");
						messageforsaving.setAlignment(colsingets, Pos.CENTER);
						messageforsaving.setCenter(messafe);
						messageforsaving.setStyle("-fx-background:beige");
						messageforsaving.setBottom(colsingets);
						Scene weww = new Scene(messageforsaving, 500, 200);
						weww.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm()); // Css button style
						confermationmessage.setScene(weww);
						a.close();
						confermationmessage.show();
						colsingets.setOnAction(eweqqq -> {

							confermationmessage.close();
							a.show();
						});

					});
					primaryStage.close();
					Scene d = new Scene(H, 500, 200);
					d.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm());
					a.setScene(d);
					a.setTitle("Congrats");
					a.show();
				}

				else if (b && text.getText().equals("Time: " + "00:00:000")) { // if the game deos not start 
					
					mediaPlayer.setAutoPlay(false);
					D.setText("You Did Not Start Yet!");
					D.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 18));
					H.setTop(D);
					H.setBottom(Ba);

					Scene d1 = new Scene(H, 500, 200);
					d1.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm());
					
					primaryStage.close();
					Stage bt = new Stage();
					bt.setScene(d1);
					primaryStage.close();
					bt.show();
					Ba.setOnMouseClicked(em -> { // back button to level stage
						bt.close();
						Ba.setId("yellow1");
						primaryStage.show();
					});
				}

				else {
					H.setTop(D);
					H.setBottom(Ba);
					Scene d = new Scene(H, 500, 200);
	                d.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm());
					primaryStage.close();
					Stage bt = new Stage();
					bt.setScene(d);
					bt.show();
					Ba.setOnMouseClicked(em -> { // back button to level stage
						bt.close();
						primaryStage.show();
						sButton.setText("start");
						timelinee.play();
					});

				}

			});

			rButton = new Button("Reset");
			rButton.setPadding(insets);
			

			// Reset Button acts as Shuffle button + makes the time 00:00:00
			rButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent actionEvent) {
					 if ( !(text.getText().equals("Time: " + "00:00:000"))) {
					mins = 0;
					secs = 0;
					millis = 0;
					timeline.pause();
					if (sos == false) {
						timelinee.pause();
						sos = true;
						sButton.setText("Stop");
					}

					text.setText("Time: " + "00:00:000");

					if (timeline != null)
						timeline.stop();
					timeline = new Timeline();
					if (timeline != null)
						timeline.stop();
					timeline = new Timeline();
					for (final Piece piece : pieces) {
						piece.setActive();
						double shuffleX = Math.random() * (desk.getWidth() - Piece.SIZE + 48f) - 24f - piece.getCorrectX();
						double shuffleY = Math.random() * (desk.getHeight() - Piece.SIZE + 30f) - 15f - piece.getCorrectY();
						timeline.getKeyFrames()
								.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
										new KeyValue(piece.translateYProperty(), shuffleY)));
					}
					timeline.playFromStart();
					timelinee.play();
				}
				}
			});

			shuffleButton.setPadding(insets);
			Bas.setPadding(insets);
			HBox buttonBox = new HBox(8);
			rButton.setId("yellow1");
			rButton.setOnMouseMoved(el->{
				mediaPlayer15.seek(Duration.ZERO);
				mediaPlayer15.play();
			});
			
			sButton.setId("yellow1");
			Bas.setId("yellow1");
			Finish.setId("yellow1");
			shuffleButton.setId("yellow1");
			buttonBox.getChildren().addAll(shuffleButton, sButton, rButton, Bas, Finish);
			buttonBox.setAlignment(Pos.BOTTOM_CENTER);
			Finish.setOnMouseMoved(el->{
				mediaPlayer14.seek(Duration.ZERO);
				mediaPlayer14.play();
			});
			buttonBox.setPadding(insets);
			GridPane buttonBox1 = new GridPane();
			buttonBox1.add(text, 5, 0);
			buttonBox1.setPadding(insets);

			pb.setBottom(buttonBox);
			pb.setLeft(buttonBox1);
			BorderPane vb = new BorderPane();
			vb.setTop(text);
			text.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 15));
			BorderPane.setAlignment(text, Pos.TOP_CENTER);
			vb.setCenter(desk);
			vb.setBottom(buttonBox);
			root.getChildren().addAll(vb);
		}
		


		 //Node that represents the playing area/ desktop where the puzzle pices sit
		
		public static class Desk extends Pane {
			Desk(int numOfColumns, int numOfRows) {
				setStyle("-fx-background-color: #cccccc; " + "-fx-border-color: #464646; "
						+ "-fx-effect: innershadow( two-pass-box , rgba(0,0,0,0.8) , 15, 0.0 , 0 , 4 );");
				double DESK_WIDTH = Piece.SIZE * numOfColumns;
				double DESK_HEIGHT = Piece.SIZE * numOfRows;
				setPrefSize(DESK_WIDTH, DESK_HEIGHT);
				setMaxSize(DESK_WIDTH, DESK_HEIGHT);
				autosize();
			}

			@Override
			protected void layoutChildren() {
			}
		}
		
		 // Node that represents a puzzle piece
		public static class Piece extends Parent {
			public static final int SIZE = 100;
			public final double correctX;
			public final double correctY;
			public double startDragX;
			public double startDragY;
			public Shape pieceStroke;
			public Shape pieceClip;
			public ImageView imageView = new ImageView();
			public Point2D dragAnchor;

			public Piece(Image image, final double correctX, final double correctY, final double deskWidth,
					final double deskHeight) {
				this.correctX = correctX;
				this.correctY = correctY;
				
				// configure clip
				pieceClip = createPiece();
				pieceClip.setFill(Color.WHITE);
				pieceClip.setStroke(null);
				// add a stroke
				pieceStroke = createPiece();
				pieceStroke.setFill(null);
				pieceStroke.setStroke(Color.BLACK);
				// create image view
				imageView.setImage(image);
				imageView.setClip(pieceClip);
				setFocusTraversable(true);
				getChildren().addAll(imageView, pieceStroke);
				// turn on caching so the jigsaw piece is fasr to draw when dragging
				setCache(true);
				// start in inactive state
				setInactive();
				// add listeners to support dragging
				setOnMousePressed(new EventHandler<MouseEvent>() {// when user drag the puzzle pieces
					public void handle(MouseEvent me) {
						toFront();
						startDragX = getTranslateX();
						startDragY = getTranslateY();
						dragAnchor = new Point2D(me.getSceneX(), me.getSceneY());
					}
				});
				setOnMouseReleased(e -> {  // to check if the peice on it right position

					if (getTranslateX() < (10) && getTranslateX() > (-10) && getTranslateY() < (10)
							&& getTranslateY() > (-10)) {
						setTranslateX(0);
						setTranslateY(0);
						setInactive();

					}
				});
				setOnMouseDragged(e -> {

					double newTranslateX = startDragX + e.getSceneX() - dragAnchor.getX();
					double newTranslateY = startDragY + e.getSceneY() - dragAnchor.getY();
					double minTranslateX = -45f - correctX;
					double maxTranslateX = (deskWidth - Piece.SIZE + 50f) - correctX;
					double minTranslateY = -30f - correctY;
					double maxTranslateY = (deskHeight - Piece.SIZE + 70f) - correctY;
					if ((newTranslateX > minTranslateX) && (newTranslateX < maxTranslateX)
							&& (newTranslateY > minTranslateY) && (newTranslateY < maxTranslateY)) {
						setTranslateX(newTranslateX);
						setTranslateY(newTranslateY);

					}
				});
			}

			public boolean checkd() { // to check if the game finshid 
				if (getTranslateY() == 0 && getTranslateX() == 0) {
					return true;
				}
				return false;
			}

			private Shape createPiece() { 
				Shape shape = createPieceRectangle();
				shape.setTranslateX(correctX);
				shape.setTranslateY(correctY);
				shape.setLayoutX(50f);
				shape.setLayoutY(50f);
				return shape;
			}

			private Rectangle createPieceRectangle() {
				Rectangle rec = new Rectangle();
				rec.setX(-50);
				rec.setY(-50);
				rec.setWidth(SIZE);
				rec.setHeight(SIZE);
				return rec;
			}

			public void setActive() { // to allow the pices to have an action
				setDisable(false);
				setEffect(new DropShadow());
				toFront();
			}

			public void setInactive() {// to not allow the pices to have an action
				setEffect(null);
				setDisable(true);
				toBack();
			}

			public double getCorrectX() { 
				return correctX;
			}

			public double getCorrectY() {
				return correctY;
			}
		}

		
		
		
		private BorderPane pane = new BorderPane();
		private BorderPane pane1 = new BorderPane();
		private BorderPane pane2 = new BorderPane();
		private BorderPane pane3 = new BorderPane();
		private RadioButton l1s = new RadioButton("Level 1");
		private RadioButton l2 = new RadioButton("Level 2");
		private RadioButton l3 = new RadioButton("Level 3");
		private RadioButton l4 = new RadioButton("Level 4");
		private RadioButton l5 = new RadioButton("Level 5");
		private ToggleGroup group = new ToggleGroup();
		private Button letsgo = new Button("Let's Play");
		private String simagename = "1.jpg";
		Stage st = new Stage();
		

		@Override
		public void start(Stage primaryStage) throws Exception {
			primaryStage.setResizable(false);
			st.setResizable(false);

			BorderPane pane = new BorderPane();
			pane.setCenter(layoutpane(st, primaryStage));
			st.setTitle("Puzzle Game ");
			pane.setStyle("-fx-background:mistyrose");
			Scene s = new Scene(pane, 500, 500);
			s.getStylesheets().add(getClass().getClassLoader().getResource("buttondesin.css.css").toExternalForm());
			st.setScene(s);
			st.show();
			letsgo.setId("yellow2");
			
			letsgo.setOnMouseMoved(e3 -> {
				mediaPlayer10.seek(Duration.ZERO);
				mediaPlayer10.play();
			});
			
			
			letsgo.setOnAction(e3 -> {
				st.close();
				pane.setCenter(layoutpane(st, primaryStage));
				primaryStage.show();
			});

		}
		

		public void setCountDown(LocalTime lt) { // stop watch method
			Platform.runLater(() -> l1.setText(lt.format(HH_MM_SS)));
		}
		void change(Text text) {
			if (millis == 1000) {
				secs++;
				millis = 0;
			}
			if (secs == 60) {
				mins++;
				secs = 0;
			}
			text.setText("Time: " + (((mins / 10) == 0) ? "0" : "") + mins + ":" + (((secs / 10) == 0) ? "0" : "") + secs
					+ ":" + (((millis / 10) == 0) ? "00" : (((millis / 100) == 0) ? "0" : "")) + millis++);
		}

	//Welcoming Stage Pane creation.......
		public BorderPane layoutpane(Stage prse, Stage primaryStage) { 

			VBox v = new VBox(15);
			Rectangle rcentermovingPane = new Rectangle(30, 30, 100, 100);
			rcentermovingPane.setFill(Color.TRANSPARENT);
			ImageView stbut = new ImageView("ic1.jpg");
			stbut.setFitHeight(40);
			stbut.setFitWidth(40);
			Button b1 = new Button("Start", stbut);
			ImageView scbut = new ImageView("ic2.jpg");
			scbut.setFitHeight(40);
			scbut.setFitWidth(40);
			Button b2 = new Button("Score", scbut);
			ImageView helbut = new ImageView("help.png");
			helbut.setFitHeight(30);
			helbut.setFitWidth(30);
			Button b33 = new Button("Help", helbut);

			ImageView exbut = new ImageView("ic3.png");
			exbut.setFitHeight(40);
			exbut.setFitWidth(40);
			Button b4 = new Button("Exit", exbut);
			v.getChildren().addAll(b1, b2, b33, b4);
			pane.setLeft(v);
			pane.setCenter(rcentermovingPane);

			Button Back = new Button("Back");

			b1.setPrefWidth(200);
			b1.setPrefHeight(5);
			b1.setMinHeight(55);
			b1.setId("yellow");
			
			b2.setPrefWidth(200);
			b2.setPrefHeight(5);
			b2.setId("yellow");
			b2.setMinHeight(55);

			b33.setPrefWidth(200);
			b33.setPrefHeight(5);
			b33.setId("yellow");
			b33.setMinHeight(55);

			b4.setPrefWidth(200);
			b4.setPrefHeight(5);
			b4.setId("yellow");
			b4.setMinHeight(55);


			v.setAlignment(Pos.CENTER);
			v.setPadding(new Insets(70, 40, 20, 65));

			pane.setLeft(v);

			// for background
			Image m = new Image("gg2.png"); 
			BackgroundImage im = new BackgroundImage(m, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, null);
			BackgroundImage im2 = new BackgroundImage(m, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null,
					null);
			
			Background uh = new Background(im);
			pane.setBackground(uh);

			
			Back.setPrefWidth(150);
			Back.setPrefHeight(30);
			Back.setId("yellow2");
			
			
			b1.setOnMouseMoved(efirst -> {// start button
				mediaPlayer2.seek(Duration.ZERO);
			mediaPlayer2.play();
			});
			b1.setOnAction(efirst -> {// start button
				
				Image m2 = new Image("gg3.jpg");
				BackgroundImage im22 = new BackgroundImage(m2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null,
						new BackgroundSize(prse.getWidth(), prse.getHeight(), true, true, true, true));
				Background uh11 = new Background(im22);
				pane.setBackground(uh11);
			
				VBox v1 = new VBox();
				Label lchoose = new Label("Choose your level");
				lchoose.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 14));
				pane1.setTop(v1);
			    pane1.setPadding(new Insets(30, 10, 30, 30));

				HBox h = new HBox(50);
				h.getChildren().addAll(Back, letsgo);
				h.setAlignment(Pos.BOTTOM_CENTER);

				v1.getChildren().addAll(lchoose, comingpane(primaryStage));

				pane.setCenter(pane1);
				pane1.setBottom(h);
				
				Back.setOnAction(e1 -> {
					pane.setLeft(v);
					pane.setCenter(rcentermovingPane);
					pane.setBackground(uh);
				});
			});
			
	b33.setOnMouseMoved(e->{ // help button
				
				
				mediaPlayer3.seek(Duration.ZERO);
				mediaPlayer3.play();
				
				
			});

			b33.setOnAction(er -> {// help button
				pane.getChildren().clear();
				VBox v1 = new VBox();
				
				Text lr1 = new Text("How to Play:");
				lr1.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.ITALIC, 20));
				Text lr2 = new Text("  1.Press start button. \n  2.Choose the level that you want to play.\n  3.Press shuffle to start playing.\n  4.Move the tiles to recreate the image by dragging tiles adjacent\n to blanks.\n  5.Press stop button if you want to stop the puzzle for a while.\n  6.Press finish button when you finish playing\n  7.save youre score. \n  8.press score see your score. ");
				Text lr3 = new Text("\nFeatures:");
				lr3.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.ITALIC, 18));
				Text lr4 = new Text("  1- Five increasing difficulty levels. \n 2- Time Counting."+"\n\n Puzzle Game  Developers:\n Eng.Rose Al-Aslani - Eng.Sereen Bahadad- Eng.Maram Al-Sofiani \n Eng.Dania Bajaba- Eng.Lama Al-Shohaib "+ "\n\n For any suggestions contact us at : puzzlegamet@gmail.com");
				lr2.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 11.5));
				lr4.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 12));
				Image m2 = new Image("gg3.jpg");
				BackgroundImage im22 = new BackgroundImage(m2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null,
						new BackgroundSize(pane.getWidth(), pane.getHeight(), false, false, false, false));
				Background uh11 = new Background(im22);
				pane.setBackground(uh11);
				pane2.setTop(v1);
				HBox h = new HBox();
				h.getChildren().addAll(Back);

				v1.getChildren().addAll(lr1, lr2, lr3, lr4);
				h.setSpacing(180);
				pane.setCenter(pane2);
				pane2.setBottom(h);
				v1.setPadding(new Insets(0, 0, 0, 3));
				pane2.setPadding(new Insets(50, 20, 15, 40));
				
				
				Back.setOnAction(e1 -> {
					
					pane.setLeft(v);
					pane.setCenter(rcentermovingPane);
					pane.setBackground(uh);
				});
			});

			b2.setOnMouseMoved(efirst -> { // score button
				mediaPlayer4.seek(Duration.ZERO);
			mediaPlayer4.play();
			});
			
			
			b2.setOnAction(e -> {// score button
				Text lr4e = new Text();
				lr4e.setFont(Font.font("-fx-font-family: 'Fleftex'", FontWeight.BOLD, FontPosture.ITALIC, 20));
				TextArea a = new TextArea( "\n Players scores:\n\n"+getFileText());
				a.setFont(Font.font("-fx-font-family: 'Fleftex'", FontWeight.BOLD, FontPosture.REGULAR, 15));
				a.setStyle("-fx-TextAligment:JUSTIFY;");
			      Text th= new Text ("  The Highest Score:");
			      Text th1= new Text (getHighScore());
			      StackPane sp = new StackPane();
			      th.setFill(Color.DARKRED);
			      Rectangle r = new Rectangle(50,50);
			      th1.setFont(Font.font("-fx-font-family: 'Fleftex'", FontWeight.BOLD, FontPosture.ITALIC, 12));
			      th.setFont(Font.font("-fx-font-family: 'Fleftex'", FontWeight.BOLD, FontPosture.ITALIC, 	15));
			     VBox vo = new VBox();
			     vo.setAlignment(Pos.CENTER);
			    
			     ImageView cc= new ImageView("bbn.PNG");
			     cc.setFitWidth(80);
			     cc.setFitHeight(50);
			     vo.getChildren().addAll(cc,th,th1);
			    
			      pane3.setTop(vo);
			      pane3.setPadding(new Insets(1, 10, 10, 10));
			      BorderPane.setAlignment(sp, Pos.TOP_CENTER);
				  a.setWrapText(true);
				
				a.getScrollLeft();
				a.setVisible(true);
				a.setEditable(false);
				a.setPrefHeight(200);
				a.setPrefWidth(250);
				Image m2 = new Image("gg3.jpg");
				BackgroundImage im22 = new BackgroundImage(m2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null,
						new BackgroundSize(pane.getWidth(), pane.getHeight(), false, false, false, false));
				Background uh11 = new Background(im22);
				pane.setBackground(uh11);
				pane3.setTop(vo);
				
				pane3.setBottom(Back);
				
				pane3.setCenter(a);
				pane3.setPadding(new Insets(50,50,25,50));
				pane.setCenter(pane3);

				pane.getChildren().remove(v);
			
	Back.setOnMouseMoved(e1->{  
					
					mediaPlayer8.seek(Duration.ZERO);
					mediaPlayer8.play();
					
					
				});
				Back.setOnAction(e1 -> { // back to main stage
				

					pane.setLeft(v);
					pane.setCenter(rcentermovingPane);
				pane.setBackground(uh);
				});
				

			});

			b4.setOnMouseMoved(e -> { // exit button

				mediaPlayer9.seek(Duration.ZERO);
				mediaPlayer9.play();

			});
			b4.setOnAction(e -> {
				prse.close();

			});

			return pane;
		}

	//Play button Pane....

		public HBox comingpane(Stage primaryStage) {  // creating level pane

			pane.setPadding(new Insets(30, 30, 30, 30));
			HBox paneForridobutton = new HBox(15);

			paneForridobutton.setAlignment(Pos.BASELINE_CENTER);
			paneForridobutton.getChildren().addAll(l1s, l2, l3, l4, l5);
			pane.setLeft(paneForridobutton);

			l1s.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 12));
			l2.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 12));
			l3.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 12));
			l4.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 12));
			l5.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, FontPosture.REGULAR, 12));

			l1s.setToggleGroup(group);
			group.selectToggle(l1s);
			l2.setToggleGroup(group);
			l3.setToggleGroup(group);
			l4.setToggleGroup(group);
			l5.setToggleGroup(group);
			
			if (l1s.isSelected()) { // to initialize default selection
				Image image = new Image("1.jpg");
				ImageView vi = new ImageView(image);
				start(primaryStage, image);
				vi.fitWidthProperty().bind(pane1.widthProperty().divide(1.75));
				vi.fitHeightProperty().bind(pane1.heightProperty().divide(1.75));
				pane1.setCenter(vi);
			}
			l1s.setOnAction(e4 -> {
				if (l1s.isSelected()) {
					Image image = new Image("1.jpg");
					ImageView vi = new ImageView(image);
					start(primaryStage, image);
					vi.fitWidthProperty().bind(pane1.widthProperty().divide(1.75));
					vi.fitHeightProperty().bind(pane1.heightProperty().divide(1.75));
					pane1.setCenter(vi);
				}
			});
			l2.setOnAction(e5 -> {
				if (l2.isSelected()) {
					Image image = new Image("2.jpg");
					ImageView vi = new ImageView(image);
					start(primaryStage, image);
					vi.fitWidthProperty().bind(pane1.widthProperty().divide(1.75));
					vi.fitHeightProperty().bind(pane1.heightProperty().divide(1.75));

					pane1.setCenter(vi);
				}
			});
			l3.setOnAction(e6 -> {
				if (l3.isSelected()) {
					Image image = new Image("3.jpg");
					ImageView vi = new ImageView(image);
					start(primaryStage, image);
					vi.fitWidthProperty().bind(pane1.widthProperty().divide(1.75));
					vi.fitHeightProperty().bind(pane1.heightProperty().divide(1.75));

					pane1.setCenter(vi);
				}
			});
			l4.setOnAction(e7 -> {
				if (l4.isSelected()) {
					simagename = "4.jpg";
					Image image = new Image(simagename);
					ImageView vi = new ImageView(simagename);
					vi.fitWidthProperty().bind(pane1.widthProperty().divide(1.75));
					vi.fitHeightProperty().bind(pane1.heightProperty().divide(1.75));

					start(primaryStage, image);

					pane1.setCenter(vi);

				}
			});

			l5.setOnAction(e8 -> {
				if (l5.isSelected()) {
					Image image = new Image("5.jpg", 1200, 670, false, false);
					ImageView vi = new ImageView("5.jpg");
					vi.fitWidthProperty().bind(pane1.widthProperty().divide(1.75));
					vi.fitHeightProperty().bind(pane1.heightProperty().divide(1.75));
					;
					start(primaryStage, image);
					pane1.setCenter(vi);
				}
			});
			return paneForridobutton;
		}
	}





		