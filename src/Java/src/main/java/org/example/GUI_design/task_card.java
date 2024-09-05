package org.example.GUI_design;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.concurrent.atomic.AtomicBoolean;

public class task_card {
    String [] head;
    String task_name;
    Double LeftTime;
    Double ImportanceLevel;
    Double TaskConsuming;
    Double PunishLevel;
    Double PreferenceLevel;
    Double DifficultyLevel;
    Double BufferbtwTasks;
    Double singalTaskTime;
    Double FactImportance;
    Double FactUrgency;

    private task_showing task_showing;

    public task_card(String[] list){
        this.head = list;
        task_name = list[0];
        LeftTime        = Double.parseDouble(list[1]);
        ImportanceLevel = Double.parseDouble(list[2]);
        TaskConsuming   = Double.parseDouble(list[3]);
        PunishLevel     = Double.parseDouble(list[4]);
        PreferenceLevel = Double.parseDouble(list[5]);
        DifficultyLevel = Double.parseDouble(list[6]);
        BufferbtwTasks  = Double.parseDouble(list[7]);
        singalTaskTime  = Double.parseDouble(list[8]);
        FactImportance  = Double.parseDouble(list[9]);
        FactUrgency     = Double.parseDouble(list[10]);
    }

    public Pane getCard1(){
        VBox card = new VBox();
        card.setStyle("-fx-background-color: lightgray;-fx-border-color: black");
        card.setSpacing(1); // Set the spacing between rows
        Button button = new Button("Exit");
        Label name = new Label(task_name);
        // Create a Line for separation
        Line separator1 = new Line();
        separator1.setStroke(Color.BLACK);
        separator1.setStrokeWidth(3);
        separator1.setStartX(0);
        separator1.endXProperty().bind(card.widthProperty().multiply(0.9));

        Button task_LeftTime        = new Button("LeftTime : "+LeftTime.toString());
        Button task_ImportanceLevel = new Button("ImportanceLevel : "+ImportanceLevel.toString());
        Button task_TaskConsuming   = new Button("TaskConsuming : "+TaskConsuming.toString());
        Button task_PunishLevel     = new Button("PunishLevel : "+PunishLevel.toString());
        Button task_PreferenceLevel = new Button("PreferenceLevel : "+PreferenceLevel.toString());
        Button task_DifficultyLevel = new Button("DifficultyLevel : "+DifficultyLevel.toString());
        Button task_BufferbtwTasks  = new Button("BufferbtwTasks : "+BufferbtwTasks.toString());
        Button task_singalTaskTime  = new Button("singalTaskTime : "+singalTaskTime.toString());
        Button task_FactImportance  = new Button("FactImportance : "+FactImportance.toString());
        Button task_FactUrgency     = new Button("FactUrgency : "+FactUrgency.toString());
        card.getChildren().addAll(button, name, separator1,task_LeftTime, task_ImportanceLevel,
                task_TaskConsuming, task_PunishLevel, task_PreferenceLevel,
                task_DifficultyLevel, task_BufferbtwTasks, task_singalTaskTime,
                task_FactImportance, task_FactUrgency);
        return card;
    }

    public Button getCard2(){
        Button card = new Button(task_name);
        card.setStyle("-fx-background-color: lightyellow;");
        return card;
    }

    public Pane getTaskCard(){
        StackPane card = new StackPane();
        Label name = new Label(task_name);
        name.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-font-family: 'KaiTi';");;
        card.getChildren().add(name);

        // 创建一条底部的黑色直线
        Line bottomLine = new Line();
        bottomLine.setStartX(0);
        bottomLine.endXProperty().bind(card.widthProperty());
        bottomLine.setStroke(Color.BLACK);
        bottomLine.setStrokeWidth(5);
        bottomLine.startYProperty().bind(card.heightProperty().subtract(5));
        bottomLine.endYProperty().bind(card.heightProperty().subtract(5));

//        card.getChildren().add(bottomLine);
        // 设置Pane的边框
        card.setBorder(new Border(new BorderStroke(
                Color.BLACK,           // 边框颜色
                BorderStrokeStyle.SOLID, // 边框样式
                null,                 // 边框圆角
                new BorderWidths(3)   // 边框宽度
        )));
        // 使用Insets添加额外的空间以增加Pane的实际大小
        card.setPadding(new Insets(20)); // 添加10像素的内边距以增加边缘空间

        return card;
    }
}
