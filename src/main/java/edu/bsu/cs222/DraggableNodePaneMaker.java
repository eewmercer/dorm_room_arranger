package edu.bsu.cs222;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class DraggableNodePaneMaker extends Application {
    public BorderPane borderPane = new BorderPane();
    public Stage stage = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageGenerator generator = new ImageGenerator();
        InteractiveFeatures features = new InteractiveFeatures();

        Node chair = new Circle(30, 30, 30, Color.BLUE);
        Node bed = new Rectangle(135, 215, Color.RED);
        Node desk = new Rectangle(100, 95, Color.GREEN);
        Node drawers = new Rectangle(100, 95, Color.YELLOW);
        Node fridge = new Rectangle(65, 65, Color.DARKCYAN);
        Node trashcan = new Rectangle(55,30, Color.SANDYBROWN);
        Label control = new Label("Fishtank");
        control.setFont(Font.font(34));

        Node[] nodeArray = new Node[]{chair, desk, drawers, fridge, bed, trashcan};

        HBox hBox = addHBox();
        VBox vBox = addVBox();
        borderPane.setTop(hBox);
        borderPane.setLeft(vBox);
        stage.setScene(new Scene(borderPane));
        stage.show();

    }

    public Pane createPane(int x, int y, Node[] content){
        Pane pane = new Pane(content);
        pane.setPrefSize(x, y);
        return pane;
    }
    public HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #b51212;");

        Text title = new Text("Ball State University: Residence Halls");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 27));
        title.setFill(Color.WHITESMOKE);

        hbox.getChildren().add(title);

        return hbox;
    }

    public VBox addVBox() throws FileNotFoundException {
        InteractiveFeatures features = new InteractiveFeatures();
        features.initBtnsArray();

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);

        Button button1 = new Button("Dehority");
        Button button2 = new Button("Park");
        Button button3 = new Button("North");
        Button button4 = new Button("Botsford Swinford");
        Button button5 = new Button("Kinghorn");
        Button button6 = new Button("North West");
        Button button7 = new Button("Noyer");
        Button button8 = new Button("Schmidt Wilson");
        Button button9 = new Button("Studebaker East");
        Button button10 = new Button("Studebaker West");
        Button button11 = new Button("Woodworth");
        button1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    try {
                        Pane image = features.getDormImage(button1.getText());
                        borderPane.setRight(image); // works because borderPane is full variable and in start
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane image = features.getDormImage(button2.getText());
                    borderPane.setRight(image); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button3.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button4.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button5.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button6.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button7.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button8.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button9.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button10.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Pane dehority = features.getDormImage(button11.getText());
                    borderPane.setRight(dehority); // works because borderPane is full variable and in start
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        Text title = new Text("Dorm Selection");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        vbox.getChildren().addAll(title, button1, button2, button3, button4, button5,
                button6, button7, button8, button9, button10, button11); //features.getButtonGrid()

        return vbox;
    }


    public Pane getDormImage(String dormName) throws FileNotFoundException {
        ImageGenerator generator = new ImageGenerator();
//        DraggableNodePaneMaker draggable = new DraggableNodePaneMaker();
        InteractiveFeatures features = new InteractiveFeatures();

        Group imageGroup;
        Pane imageGroupPane = null;
        for(Button b : features.buttons) {
            if(b.getText() == dormName) {
                imageGroup = generator.GetRoomImageAsGroup(dormName);
                imageGroupPane = createPane(800, 600, imageGroup.getChildren().toArray(new Node[0]));
                borderPane.setRight(imageGroupPane);
                break;
            }
        }
        return imageGroupPane;
    }
    public Parent createDraggableApp(Node[] nodeArray) {

        for(int i = 0; i<nodeArray.length; i++){
            if(nodeArray[i] != null) {
                nodeArray[i].setTranslateX(i * 75);
                nodeArray[i].setTranslateY(50);
            }
        }

        var root = createPane(800, 600, nodeArray);

        root.getChildren().forEach(this::makeDraggable);

        return root;
    }

    private double startPointX;
    private double startPointY;

    private void makeDraggable(Node node){
        node.setOnMousePressed(obj -> {
            startPointX = obj.getSceneX() - node.getTranslateX();
            startPointY = obj.getSceneY() - node.getTranslateY();

            node.setCursor(Cursor.CLOSED_HAND);
        });

        node.setOnMouseDragged(obj -> {
            node.setTranslateX(obj.getSceneX() - startPointX);
            node.setTranslateY(obj.getSceneY() - startPointY);
        });

    }


}
