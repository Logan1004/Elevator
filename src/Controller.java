import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.awt.event.ActionListener;

import static java.lang.Math.abs;


public class Controller {
    //左侧电梯按键
    @FXML
    private Button buttonU19;
    @FXML
    private Button buttonU18;
    @FXML
    private Button buttonU17;
    @FXML
    private Button buttonU16;
    @FXML
    private Button buttonU15;
    @FXML
    private Button buttonU14;
    @FXML
    private Button buttonU13;
    @FXML
    private Button buttonU12;
    @FXML
    private Button buttonU11;
    @FXML
    private Button buttonU10;
    @FXML
    private Button buttonU9;
    @FXML
    private Button buttonU8;
    @FXML
    private Button buttonU7;
    @FXML
    private Button buttonU6;
    @FXML
    private Button buttonU5;
    @FXML
    private Button buttonU4;
    @FXML
    private Button buttonU3;
    @FXML
    private Button buttonU2;
    @FXML
    private Button buttonU1;

    @FXML
    private Button buttonD20;
    @FXML
    private Button buttonD19;
    @FXML
    private Button buttonD18;
    @FXML
    private Button buttonD17;
    @FXML
    private Button buttonD16;
    @FXML
    private Button buttonD15;
    @FXML
    private Button buttonD14;
    @FXML
    private Button buttonD13;
    @FXML
    private Button buttonD12;
    @FXML
    private Button buttonD11;
    @FXML
    private Button buttonD10;
    @FXML
    private Button buttonD9;
    @FXML
    private Button buttonD8;
    @FXML
    private Button buttonD7;
    @FXML
    private Button buttonD6;
    @FXML
    private Button buttonD5;
    @FXML
    private Button buttonD4;
    @FXML
    private Button buttonD3;
    @FXML
    private Button buttonD2;
    //电梯内部按键
    @FXML
    private Button button1_1;
    @FXML
    private Button button1_2;
    @FXML
    private Button button1_3;
    @FXML
    private Button button1_4;
    @FXML
    private Button button1_5;
    @FXML
    private Button button1_6;
    @FXML
    private Button button1_7;
    @FXML
    private Button button1_8;
    @FXML
    private Button button1_9;
    @FXML
    private Button button1_10;
    @FXML
    private Button button1_11;
    @FXML
    private Button button1_12;
    @FXML
    private Button button1_13;
    @FXML
    private Button button1_14;
    @FXML
    private Button button1_15;
    @FXML
    private Button button1_16;
    @FXML
    private Button button1_17;
    @FXML
    private Button button1_18;
    @FXML
    private Button button1_19;
    @FXML
    private Button button1_20;
    @FXML
    private Button button2_1;
    @FXML
    private Button button2_2;
    @FXML
    private Button button2_3;
    @FXML
    private Button button2_4;
    @FXML
    private Button button2_5;
    @FXML
    private Button button2_6;
    @FXML
    private Button button2_7;
    @FXML
    private Button button2_8;
    @FXML
    private Button button2_9;
    @FXML
    private Button button2_10;
    @FXML
    private Button button2_11;
    @FXML
    private Button button2_12;
    @FXML
    private Button button2_13;
    @FXML
    private Button button2_14;
    @FXML
    private Button button2_15;
    @FXML
    private Button button2_16;
    @FXML
    private Button button2_17;
    @FXML
    private Button button2_18;
    @FXML
    private Button button2_19;
    @FXML
    private Button button2_20;
    @FXML
    private Button button3_1;
    @FXML
    private Button button3_2;
    @FXML
    private Button button3_3;
    @FXML
    private Button button3_4;
    @FXML
    private Button button3_5;
    @FXML
    private Button button3_6;
    @FXML
    private Button button3_7;
    @FXML
    private Button button3_8;
    @FXML
    private Button button3_9;
    @FXML
    private Button button3_10;
    @FXML
    private Button button3_11;
    @FXML
    private Button button3_12;
    @FXML
    private Button button3_13;
    @FXML
    private Button button3_14;
    @FXML
    private Button button3_15;
    @FXML
    private Button button3_16;
    @FXML
    private Button button3_17;
    @FXML
    private Button button3_18;
    @FXML
    private Button button3_19;
    @FXML
    private Button button3_20;
    @FXML
    private Button button4_1;
    @FXML
    private Button button4_2;
    @FXML
    private Button button4_3;
    @FXML
    private Button button4_4;
    @FXML
    private Button button4_5;
    @FXML
    private Button button4_6;
    @FXML
    private Button button4_7;
    @FXML
    private Button button4_8;
    @FXML
    private Button button4_9;
    @FXML
    private Button button4_10;
    @FXML
    private Button button4_11;
    @FXML
    private Button button4_12;
    @FXML
    private Button button4_13;
    @FXML
    private Button button4_14;
    @FXML
    private Button button4_15;
    @FXML
    private Button button4_16;
    @FXML
    private Button button4_17;
    @FXML
    private Button button4_18;
    @FXML
    private Button button4_19;
    @FXML
    private Button button4_20;
    @FXML
    private Button button5_1;
    @FXML
    private Button button5_2;
    @FXML
    private Button button5_3;
    @FXML
    private Button button5_4;
    @FXML
    private Button button5_5;
    @FXML
    private Button button5_6;
    @FXML
    private Button button5_7;
    @FXML
    private Button button5_8;
    @FXML
    private Button button5_9;
    @FXML
    private Button button5_10;
    @FXML
    private Button button5_11;
    @FXML
    private Button button5_12;
    @FXML
    private Button button5_13;
    @FXML
    private Button button5_14;
    @FXML
    private Button button5_15;
    @FXML
    private Button button5_16;
    @FXML
    private Button button5_17;
    @FXML
    private Button button5_18;
    @FXML
    private Button button5_19;
    @FXML
    private Button button5_20;
    @FXML
    private Button btn1O;
    @FXML
    private Button btn1C;
    @FXML
    private Button btn1A;
    @FXML
    private Button btn1R;
    @FXML
    private Button btn2O;
    @FXML
    private Button btn2C;
    @FXML
    private Button btn2A;
    @FXML
    private Button btn2R;
    @FXML
    private Button btn3O;
    @FXML
    private Button btn3C;
    @FXML
    private Button btn3A;
    @FXML
    private Button btn3R;
    @FXML
    private Button btn4O;
    @FXML
    private Button btn4C;
    @FXML
    private Button btn4A;
    @FXML
    private Button btn4R;
    @FXML
    private Button btn5O;
    @FXML
    private Button btn5C;
    @FXML
    private Button btn5A;
    @FXML
    private Button btn5R;
    @FXML
    private Button Starting;
    @FXML
    private Label floor1;
    @FXML
    private Label floor2;
    @FXML
    private Label floor3;
    @FXML
    private Label floor4;
    @FXML
    private Label floor5;
    @FXML
    private Label status1;
    @FXML
    private Label status2;
    @FXML
    private Label status3;
    @FXML
    private Label status4;
    @FXML
    private Label status5;
    @FXML
    private Label eleLabel1;
    @FXML
    private Label eleLabel2;
    @FXML
    private Label eleLabel3;
    @FXML
    private Label eleLabel4;
    @FXML
    private Label eleLabel5;


    //电梯外部按键事件
    @FXML
    protected void U19(ActionEvent actionEvent) {
        elevatorAction(19, 1);
    }

    @FXML
    protected void U18(ActionEvent actionEvent) {
        elevatorAction(18, 1);
    }

    @FXML
    protected void U17(ActionEvent actionEvent) {
        elevatorAction(17, 1);
    }

    @FXML
    protected void U16(ActionEvent actionEvent) {
        elevatorAction(16, 1);
    }

    @FXML
    protected void U15(ActionEvent actionEvent) {
        elevatorAction(15, 1);
    }

    @FXML
    protected void U14(ActionEvent actionEvent) {
        elevatorAction(14, 1);
    }

    @FXML
    protected void U13(ActionEvent actionEvent) {
        elevatorAction(13, 1);
    }

    @FXML
    protected void U12(ActionEvent actionEvent) {
        elevatorAction(12, 1);
    }

    @FXML
    protected void U11(ActionEvent actionEvent) {
        elevatorAction(11, 1);
    }

    @FXML
    protected void U10(ActionEvent actionEvent) {
        elevatorAction(10, 1);
    }

    @FXML
    protected void U9(ActionEvent actionEvent) {
        elevatorAction(9, 1);
    }

    @FXML
    protected void U8(ActionEvent actionEvent) {
        elevatorAction(8, 1);
    }

    @FXML
    protected void U7(ActionEvent actionEvent) {
        elevatorAction(7, 1);
    }

    @FXML
    protected void U6(ActionEvent actionEvent) {
        elevatorAction(6, 1);
    }

    @FXML
    protected void U5(ActionEvent actionEvent) {
        elevatorAction(5, 1);
    }

    @FXML
    protected void U4(ActionEvent actionEvent) {
        elevatorAction(4, 1);
    }

    @FXML
    protected void U3(ActionEvent actionEvent) {
        elevatorAction(3, 1);
    }

    @FXML
    protected void U2(ActionEvent actionEvent) {
        elevatorAction(2, 1);
    }

    @FXML
    protected void U1(ActionEvent actionEvent) {
        elevatorAction(1, 1);
    }

    @FXML
    protected void D20(ActionEvent actionEvent) {
        elevatorAction(20, 0);
    }

    @FXML
    protected void D19(ActionEvent actionEvent) {
        elevatorAction(19, 0);
    }

    @FXML
    protected void D18(ActionEvent actionEvent) {
        elevatorAction(18, 0);
    }

    @FXML
    protected void D17(ActionEvent actionEvent) {
        elevatorAction(17, 0);
    }

    @FXML
    protected void D16(ActionEvent actionEvent) {
        elevatorAction(16, 0);
    }

    @FXML
    protected void D15(ActionEvent actionEvent) {
        elevatorAction(15, 0);
    }

    @FXML
    protected void D14(ActionEvent actionEvent) {
        elevatorAction(14, 0);
    }

    @FXML
    protected void D13(ActionEvent actionEvent) {
        elevatorAction(13, 0);
    }

    @FXML
    protected void D12(ActionEvent actionEvent) {
        elevatorAction(12, 0);
    }

    @FXML
    protected void D11(ActionEvent actionEvent) {
        elevatorAction(11, 0);
    }

    @FXML
    protected void D10(ActionEvent actionEvent) {
        elevatorAction(10, 0);
    }

    @FXML
    protected void D9(ActionEvent actionEvent) {
        elevatorAction(9, 0);
    }

    @FXML
    protected void D8(ActionEvent actionEvent) {
        elevatorAction(8, 0);
    }

    @FXML
    protected void D7(ActionEvent actionEvent) {
        elevatorAction(7, 0);
    }

    @FXML
    protected void D6(ActionEvent actionEvent) {
        elevatorAction(6, 0);
    }

    @FXML
    protected void D5(ActionEvent actionEvent) {
        elevatorAction(5, 0);
    }

    @FXML
    protected void D4(ActionEvent actionEvent) {
        elevatorAction(4, 0);
    }

    @FXML
    protected void D3(ActionEvent actionEvent) {
        elevatorAction(3, 0);
    }

    @FXML
    protected void D2(ActionEvent actionEvent) {
        elevatorAction(2, 0);
    }

    //电梯内部按键事件
    @FXML
    protected void B1_1(ActionEvent actionEvent) {
        elevator1Action(1);
    }

    @FXML
    protected void B1_2(ActionEvent actionEvent) {
        elevator1Action(2);
    }

    @FXML
    protected void B1_3(ActionEvent actionEvent) {
        elevator1Action(3);
    }

    @FXML
    protected void B1_4(ActionEvent actionEvent) {
        elevator1Action(4);
    }

    @FXML
    protected void B1_5(ActionEvent actionEvent) {
        elevator1Action(5);
    }

    @FXML
    protected void B1_6(ActionEvent actionEvent) {
        elevator1Action(6);
    }

    @FXML
    protected void B1_7(ActionEvent actionEvent) {
        elevator1Action(7);
    }

    @FXML
    protected void B1_8(ActionEvent actionEvent) {
        elevator1Action(8);
    }

    @FXML
    protected void B1_9(ActionEvent actionEvent) {
        elevator1Action(9);
    }

    @FXML
    protected void B1_10(ActionEvent actionEvent) {
        elevator1Action(10);
    }

    @FXML
    protected void B1_11(ActionEvent actionEvent) {
        elevator1Action(11);
    }

    @FXML
    protected void B1_12(ActionEvent actionEvent) {
        elevator1Action(12);
    }

    @FXML
    protected void B1_13(ActionEvent actionEvent) {
        elevator1Action(13);
    }

    @FXML
    protected void B1_14(ActionEvent actionEvent) {
        elevator1Action(14);
    }

    @FXML
    protected void B1_15(ActionEvent actionEvent) {
        elevator1Action(15);
    }

    @FXML
    protected void B1_16(ActionEvent actionEvent) {
        elevator1Action(16);
    }

    @FXML
    protected void B1_17(ActionEvent actionEvent) {
        elevator1Action(17);
    }

    @FXML
    protected void B1_18(ActionEvent actionEvent) {
        elevator1Action(18);
    }

    @FXML
    protected void B1_19(ActionEvent actionEvent) {
        elevator1Action(19);
    }

    @FXML
    protected void B1_20(ActionEvent actionEvent) {
        elevator1Action(20);
    }

    @FXML
    protected void B2_1(ActionEvent actionEvent) {
        elevator2Action(1);
    }

    @FXML
    protected void B2_2(ActionEvent actionEvent) {
        elevator2Action(2);
    }

    @FXML
    protected void B2_3(ActionEvent actionEvent) {
        elevator2Action(3);
    }

    @FXML
    protected void B2_4(ActionEvent actionEvent) {
        elevator2Action(4);
    }

    @FXML
    protected void B2_5(ActionEvent actionEvent) {
        elevator2Action(5);
    }

    @FXML
    protected void B2_6(ActionEvent actionEvent) {
        elevator2Action(6);
    }

    @FXML
    protected void B2_7(ActionEvent actionEvent) {
        elevator2Action(7);
    }

    @FXML
    protected void B2_8(ActionEvent actionEvent) {
        elevator2Action(8);
    }

    @FXML
    protected void B2_9(ActionEvent actionEvent) {
        elevator2Action(9);
    }

    @FXML
    protected void B2_10(ActionEvent actionEvent) {
        elevator2Action(10);
    }

    @FXML
    protected void B2_11(ActionEvent actionEvent) {
        elevator2Action(11);
    }

    @FXML
    protected void B2_12(ActionEvent actionEvent) {
        elevator2Action(12);
    }

    @FXML
    protected void B2_13(ActionEvent actionEvent) {
        elevator2Action(13);
    }

    @FXML
    protected void B2_14(ActionEvent actionEvent) {
        elevator2Action(14);
    }

    @FXML
    protected void B2_15(ActionEvent actionEvent) {
        elevator2Action(15);
    }

    @FXML
    protected void B2_16(ActionEvent actionEvent) {
        elevator2Action(16);
    }

    @FXML
    protected void B2_17(ActionEvent actionEvent) {
        elevator2Action(17);
    }

    @FXML
    protected void B2_18(ActionEvent actionEvent) {
        elevator2Action(18);
    }

    @FXML
    protected void B2_19(ActionEvent actionEvent) {
        elevator2Action(19);
    }

    @FXML
    protected void B2_20(ActionEvent actionEvent) {
        elevator2Action(20);
    }

    @FXML
    protected void B3_1(ActionEvent actionEvent) {
        elevator3Action(1);
    }

    @FXML
    protected void B3_2(ActionEvent actionEvent) {
        elevator3Action(2);
    }

    @FXML
    protected void B3_3(ActionEvent actionEvent) {
        elevator3Action(3);
    }

    @FXML
    protected void B3_4(ActionEvent actionEvent) {
        elevator3Action(4);
    }

    @FXML
    protected void B3_5(ActionEvent actionEvent) {
        elevator3Action(5);
    }

    @FXML
    protected void B3_6(ActionEvent actionEvent) {
        elevator3Action(6);
    }

    @FXML
    protected void B3_7(ActionEvent actionEvent) {
        elevator3Action(7);
    }

    @FXML
    protected void B3_8(ActionEvent actionEvent) {
        elevator3Action(8);
    }

    @FXML
    protected void B3_9(ActionEvent actionEvent) {
        elevator3Action(9);
    }

    @FXML
    protected void B3_10(ActionEvent actionEvent) {
        elevator3Action(10);
    }

    @FXML
    protected void B3_11(ActionEvent actionEvent) {
        elevator3Action(11);
    }

    @FXML
    protected void B3_12(ActionEvent actionEvent) {
        elevator3Action(12);
    }

    @FXML
    protected void B3_13(ActionEvent actionEvent) {
        elevator3Action(13);
    }

    @FXML
    protected void B3_14(ActionEvent actionEvent) {
        elevator3Action(14);
    }

    @FXML
    protected void B3_15(ActionEvent actionEvent) {
        elevator3Action(15);
    }

    @FXML
    protected void B3_16(ActionEvent actionEvent) {
        elevator3Action(16);
    }

    @FXML
    protected void B3_17(ActionEvent actionEvent) {
        elevator3Action(17);
    }

    @FXML
    protected void B3_18(ActionEvent actionEvent) {
        elevator3Action(18);
    }

    @FXML
    protected void B3_19(ActionEvent actionEvent) {
        elevator3Action(19);
    }

    @FXML
    protected void B3_20(ActionEvent actionEvent) {
        elevator3Action(20);
    }

    @FXML
    protected void B4_1(ActionEvent actionEvent) {
        elevator4Action(1);
    }

    @FXML
    protected void B4_2(ActionEvent actionEvent) {
        elevator4Action(2);
    }

    @FXML
    protected void B4_3(ActionEvent actionEvent) {
        elevator4Action(3);
    }

    @FXML
    protected void B4_4(ActionEvent actionEvent) {
        elevator4Action(4);
    }

    @FXML
    protected void B4_5(ActionEvent actionEvent) {
        elevator4Action(5);
    }

    @FXML
    protected void B4_6(ActionEvent actionEvent) {
        elevator4Action(6);
    }

    @FXML
    protected void B4_7(ActionEvent actionEvent) {
        elevator4Action(7);
    }

    @FXML
    protected void B4_8(ActionEvent actionEvent) {
        elevator4Action(8);
    }

    @FXML
    protected void B4_9(ActionEvent actionEvent) {
        elevator4Action(9);
    }

    @FXML
    protected void B4_10(ActionEvent actionEvent) {
        elevator4Action(10);
    }

    @FXML
    protected void B4_11(ActionEvent actionEvent) {
        elevator4Action(11);
    }

    @FXML
    protected void B4_12(ActionEvent actionEvent) {
        elevator4Action(12);
    }

    @FXML
    protected void B4_13(ActionEvent actionEvent) {
        elevator4Action(13);
    }

    @FXML
    protected void B4_14(ActionEvent actionEvent) {
        elevator4Action(14);
    }

    @FXML
    protected void B4_15(ActionEvent actionEvent) {
        elevator4Action(15);
    }

    @FXML
    protected void B4_16(ActionEvent actionEvent) {
        elevator4Action(16);
    }

    @FXML
    protected void B4_17(ActionEvent actionEvent) {
        elevator4Action(17);
    }

    @FXML
    protected void B4_18(ActionEvent actionEvent) {
        elevator4Action(18);
    }

    @FXML
    protected void B4_19(ActionEvent actionEvent) {
        elevator4Action(19);
    }

    @FXML
    protected void B4_20(ActionEvent actionEvent) {
        elevator4Action(20);
    }

    @FXML
    protected void B5_1(ActionEvent actionEvent) {
        elevator5Action(1);
    }

    @FXML
    protected void B5_2(ActionEvent actionEvent) {
        elevator5Action(2);
    }

    @FXML
    protected void B5_3(ActionEvent actionEvent) {
        elevator5Action(3);
    }

    @FXML
    protected void B5_4(ActionEvent actionEvent) {
        elevator5Action(4);
    }

    @FXML
    protected void B5_5(ActionEvent actionEvent) {
        elevator5Action(5);
    }

    @FXML
    protected void B5_6(ActionEvent actionEvent) {
        elevator5Action(6);
    }

    @FXML
    protected void B5_7(ActionEvent actionEvent) {
        elevator5Action(7);
    }

    @FXML
    protected void B5_8(ActionEvent actionEvent) {
        elevator5Action(8);
    }

    @FXML
    protected void B5_9(ActionEvent actionEvent) {
        elevator5Action(9);
    }

    @FXML
    protected void B5_10(ActionEvent actionEvent) {
        elevator5Action(10);
    }

    @FXML
    protected void B5_11(ActionEvent actionEvent) {
        elevator5Action(11);
    }

    @FXML
    protected void B5_12(ActionEvent actionEvent) {
        elevator5Action(12);
    }

    @FXML
    protected void B5_13(ActionEvent actionEvent) {
        elevator5Action(13);
    }

    @FXML
    protected void B5_14(ActionEvent actionEvent) {
        elevator5Action(14);
    }

    @FXML
    protected void B5_15(ActionEvent actionEvent) {
        elevator5Action(15);
    }

    @FXML
    protected void B5_16(ActionEvent actionEvent) {
        elevator5Action(16);
    }

    @FXML
    protected void B5_17(ActionEvent actionEvent) {
        elevator5Action(17);
    }

    @FXML
    protected void B5_18(ActionEvent actionEvent) {
        elevator5Action(18);
    }

    @FXML
    protected void B5_19(ActionEvent actionEvent) {
        elevator5Action(19);
    }

    @FXML
    protected void B5_20(ActionEvent actionEvent) {
        elevator5Action(20);
    }

    @FXML
    protected void Btn1Open(ActionEvent actionEvent) {
        flag1Open = false;
    }

    @FXML
    protected void Btn1Close(ActionEvent actionEvent) {
        flag1Close = false;
    }

    @FXML
    protected void Btn2Open(ActionEvent actionEvent) {
        flag2Open = false;
    }

    @FXML
    protected void Btn2Close(ActionEvent actionEvent) {
        flag2Close = false;
    }

    @FXML
    protected void Btn3Open(ActionEvent actionEvent) {
        flag3Open = false;
    }

    @FXML
    protected void Btn3Close(ActionEvent actionEvent) {
        flag3Close = false;
    }

    @FXML
    protected void Btn4Open(ActionEvent actionEvent) {
        flag4Open = false;
    }

    @FXML
    protected void Btn4Close(ActionEvent actionEvent) {
        flag4Close = false;
    }

    @FXML
    protected void Btn5Open(ActionEvent actionEvent) {
        flag5Open = false;
    }

    @FXML
    protected void Btn5Close(ActionEvent actionEvent) {
        flag5Close = false;
    }

    @FXML
    protected void Btn1Alarm(ActionEvent actionEvent) {
        flag1Alarm = false;
    }

    @FXML
    protected void Btn2Alarm(ActionEvent actionEvent) {
        flag2Alarm = false;
    }

    @FXML
    protected void Btn3Alarm(ActionEvent actionEvent) {
        flag3Alarm = false;
    }

    @FXML
    protected void Btn4Alarm(ActionEvent actionEvent) {
        flag4Alarm = false;
    }

    @FXML
    protected void Btn5Alarm(ActionEvent actionEvent) {
        flag5Alarm = false;
    }

    @FXML
    protected void Btn1Recover(ActionEvent actionEvent) {
        flag1Alarm = true;
    }

    @FXML
    protected void Btn2Recover(ActionEvent actionEvent) {
        flag2Alarm = true;
    }

    @FXML
    protected void Btn3Recover(ActionEvent actionEvent) {
        flag3Alarm = true;
    }

    @FXML
    protected void Btn4Recover(ActionEvent actionEvent) {
        flag4Alarm = true;
    }

    @FXML
    protected void Btn5Recover(ActionEvent actionEvent) {
        flag5Alarm = true;
    }


    private int[] elevator1List = new int[21];
    private int[] elevator2List = new int[21];
    private int[] elevator3List = new int[21];
    private int[] elevator4List = new int[21];
    private int[] elevator5List = new int[21];

    private Elevator elevator1 = new Elevator();
    private Elevator elevator2 = new Elevator();
    private Elevator elevator3 = new Elevator();
    private Elevator elevator4 = new Elevator();
    private Elevator elevator5 = new Elevator();

    @FXML
    protected void btnStarting(ActionEvent actionEvent) {
        eleLabel1.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        eleLabel2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        eleLabel3.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        eleLabel4.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        eleLabel5.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        Thread1Start();
        Thread2Start();
        Thread3Start();
        Thread4Start();
        Thread5Start();
    }

    //外部调度：最小调度
    public void elevatorAction(int floor, int bStatus) {
        int eleNum = 0;
        int eleDis = 100;
        boolean eleFlag = false;
        if (elevator1.getCurStatus() == bStatus || elevator1.getCurStatus() == bStatus + 10 || elevator1.getCurStatus() == 111) {
            int tempDis = abs(floor - elevator1.getCurFloor());
            if (tempDis < eleDis) {
                eleDis = tempDis;
                eleNum = 1;
                eleFlag = true;
            }
            if (tempDis == eleDis && elevator1.getCurStatus() == 111) {
                eleDis = tempDis;
                eleNum = 1;
                eleFlag = true;
            }
        }
        if (elevator2.getCurStatus() == bStatus || elevator2.getCurStatus() == bStatus + 10 || elevator2.getCurStatus() == 111) {
            int tempDis = abs(floor - elevator2.getCurFloor());
            if (tempDis < eleDis) {
                eleDis = tempDis;
                eleNum = 2;
                eleFlag = true;
            }
            if (tempDis == eleDis && elevator2.getCurStatus() == 111) {
                eleDis = tempDis;
                eleNum = 2;
                eleFlag = true;
            }
        }
        if (elevator3.getCurStatus() == bStatus || elevator3.getCurStatus() == bStatus + 10 || elevator3.getCurStatus() == 111) {
            int tempDis = abs(floor - elevator3.getCurFloor());
            if (tempDis < eleDis) {
                eleDis = tempDis;
                eleNum = 3;
                eleFlag = true;
            }
            if (tempDis == eleDis && elevator3.getCurStatus() == 111) {
                eleDis = tempDis;
                eleNum = 3;
                eleFlag = true;
            }
        }
        if (elevator4.getCurStatus() == bStatus || elevator4.getCurStatus() == bStatus + 10 || elevator4.getCurStatus() == 111) {
            int tempDis = abs(floor - elevator4.getCurFloor());
            if (tempDis < eleDis) {
                eleDis = tempDis;
                eleNum = 4;
                eleFlag = true;
            }
            if (tempDis == eleDis && elevator4.getCurStatus() == 111) {
                eleDis = tempDis;
                eleNum = 4;
                eleFlag = true;
            }
        }
        if (elevator5.getCurStatus() == bStatus || elevator5.getCurStatus() == bStatus + 10 || elevator5.getCurStatus() == 111) {
            int tempDis = abs(floor - elevator5.getCurFloor());
            if (tempDis < eleDis) {
                eleDis = tempDis;
                eleNum = 5;
                eleFlag = true;
            }
            if (tempDis == eleDis && elevator5.getCurStatus() == 111) {
                eleDis = tempDis;
                eleNum = 5;
                eleFlag = true;
            }
        }
        if (!eleFlag) {
            int tempDis = 0;
            int i;
            if (bStatus == 1) {
                for (i = 1; i <= 20; i++) {
                    if (elevator1List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 1;
                }
                for (i = 1; i <= 20; i++) {
                    if (elevator2List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 2;
                }
                for (i = 1; i <= 20; i++) {
                    if (elevator3List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 3;
                }
                for (i = 1; i <= 20; i++) {
                    if (elevator4List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 4;
                }
                for (i = 1; i <= 20; i++) {
                    if (elevator5List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 5;
                }
            } else {
                for (i = 20; i >= 1; i--) {
                    if (elevator1List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 1;
                }
                for (i = 20; i >= 1; i--) {
                    if (elevator2List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 2;
                }
                for (i = 20; i >= 1; i--) {
                    if (elevator3List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 3;
                }
                for (i = 20; i >= 1; i--) {
                    if (elevator4List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 4;
                }
                for (i = 20; i >= 1; i--) {
                    if (elevator5List[i] == 1) break;
                }
                tempDis = abs(floor - i);
                if (tempDis < eleDis) {
                    eleDis = tempDis;
                    eleNum = 5;
                }
            }
        }
        switch (eleNum) {
            case 1:
                elevator1List[floor] = 1;
                break;
            case 2:
                elevator2List[floor] = 1;
                break;
            case 3:
                elevator3List[floor] = 1;
                break;
            case 4:
                elevator4List[floor] = 1;
                break;
            case 5:
                elevator5List[floor] = 1;
                break;
        }
    }

    //内部调度：服从调度
    public void elevator1Action(int floor) {
        elevator1List[floor] = 1;
    }

    public void elevator2Action(int floor) {
        elevator2List[floor] = 1;
    }

    public void elevator3Action(int floor) {
        elevator3List[floor] = 1;
    }

    public void elevator4Action(int floor) {
        elevator4List[floor] = 1;
    }

    public void elevator5Action(int floor) {
        elevator5List[floor] = 1;
    }

    public boolean checkEle1() {
        return flag1Alarm;
    }

    public boolean checkEle2() {
        return flag2Alarm;
    }

    public boolean checkEle3() {
        return flag3Alarm;
    }

    public boolean checkEle4() {
        return flag4Alarm;
    }

    public boolean checkEle5() {
        return flag5Alarm;
    }

    //减少误差
    private boolean flag1 = false;
    private boolean flag2 = false;
    private boolean flag3 = false;
    private boolean flag4 = false;
    private boolean flag5 = false;

    //开关按键
    private boolean flag1Open = true;
    private boolean flag2Open = true;
    private boolean flag3Open = true;
    private boolean flag4Open = true;
    private boolean flag5Open = true;
    private boolean flag1Close = true;
    private boolean flag2Close = true;
    private boolean flag3Close = true;
    private boolean flag4Close = true;
    private boolean flag5Close = true;

    //警报按键
    private boolean flag1Alarm = true;
    private boolean flag2Alarm = true;
    private boolean flag3Alarm = true;
    private boolean flag4Alarm = true;
    private boolean flag5Alarm = true;


    public void Thread1Start() {
        new Thread() {
            @Override
            public void run() {
                elevator1.JudgeStatus(elevator1List);
                while (true) {
                    while (!flag1Alarm) {
                        try {
                            flag1Alarm = checkEle1();
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    boolean f = true;
                    if (elevator1.getCurStatus() == 1) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator1.getCurFloor();
                        elevator1.setCurFloor(tempFloor + 1);
                    } else if (elevator1.getCurStatus() == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator1.getCurFloor();
                        elevator1.setCurFloor(tempFloor - 1);
                    } else if (elevator1.getCurStatus() == 11 || elevator1.getCurStatus() == 10) {
                        try {
                            int i = 0;
                            while (i < 5) {
                                Thread.sleep(1000);
                                if (!flag1Open) {
                                    flag1Open = true;
                                    i = i - 5;
                                }
                                if (!flag1Close) {
                                    flag1Close = true;
                                    i = i + 2;
                                }
                                i++;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (elevator1.getCurStatus() == 111) {
                        f = false;
                        while (elevator1.getCurStatus() == 111) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            elevator1.JudgeStatus(elevator1List);
                        }
                    }
                    if (f) elevator1.JudgeStatus(elevator1List);
                    else f = true;
                    System.out.println(1 + " " + elevator1.getCurFloor());
                    if (elevator1.getCurFloor() == 1) flag1 = true;
                    if (elevator1.getCurFloor() > 1 && !flag1) elevator1.setCurFloor(elevator1.getCurFloor() - 1);
                    new Thread() {
                        public void run() {
                            Platform.runLater(() -> {
                                {
                                    if (elevator1.getCurStatus() == 11 || elevator1.getCurStatus() == 10 || elevator1.getCurStatus() == 111)
                                        floor1.setText(elevator1.getCurFloor() + "楼");
                                    else if (elevator1.getCurStatus() == 1)
                                        floor1.setText(elevator1.getCurFloor() + 1 + "楼");
                                    else if (elevator1.getCurStatus() == 0)
                                        floor1.setText(elevator1.getCurFloor() - 1 + "楼");
                                    if (elevator1.getCurStatus() == 1) {
                                        status1.setText("上行");
                                        double temp = eleLabel1.getLayoutY();
                                        eleLabel1.setLayoutY(temp - 27.0);
                                    } else if (elevator1.getCurStatus() == 0) {
                                        status1.setText("下行");
                                        double temp = eleLabel1.getLayoutY();
                                        eleLabel1.setLayoutY(temp + 27.0);
                                    } else status1.setText("   ");
                                }
                            });
                        }
                    }.start();
                }
            }
        }.start();
    }

    public void Thread2Start() {
        new Thread() {
            @Override
            public void run() {
                elevator2.JudgeStatus(elevator2List);
                while (true) {
                    while (!flag2Alarm) {
                        try {
                            flag2Alarm = checkEle2();
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    boolean f = true;
                    if (elevator2.getCurStatus() == 1) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator2.getCurFloor();
                        elevator2.setCurFloor(tempFloor + 1);
                    } else if (elevator2.getCurStatus() == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator2.getCurFloor();
                        elevator2.setCurFloor(tempFloor - 1);
                    } else if (elevator2.getCurStatus() == 11 || elevator2.getCurStatus() == 10) {
                        try {
                            int i = 0;
                            while (i < 5) {
                                Thread.sleep(1000);
                                if (!flag2Open) {
                                    flag2Open = true;
                                    i = i - 5;
                                }
                                if (!flag2Close) {
                                    flag2Close = true;
                                    i = i + 2;
                                }
                                i++;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (elevator2.getCurStatus() == 111) {
                        f = false;
                        while (elevator2.getCurStatus() == 111) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            elevator2.JudgeStatus(elevator2List);
                        }
                    }
                    if (f) elevator2.JudgeStatus(elevator2List);
                    else f = true;
                    System.out.println(2 + " " + elevator2.getCurFloor());
                    if (elevator2.getCurFloor() == 1) flag2 = true;
                    if (elevator2.getCurFloor() > 1 && !flag2) elevator2.setCurFloor(elevator2.getCurFloor() - 1);
                    new Thread() {
                        public void run() {
                            Platform.runLater(() -> {
                                {
                                    if (elevator2.getCurStatus() == 11 || elevator2.getCurStatus() == 10 || elevator2.getCurStatus() == 111)
                                        floor2.setText(elevator2.getCurFloor() + "楼");
                                    else if (elevator2.getCurStatus() == 1)
                                        floor2.setText(elevator2.getCurFloor() + 1 + "楼");
                                    else if (elevator2.getCurStatus() == 0)
                                        floor2.setText(elevator2.getCurFloor() - 1 + "楼");
                                    if (elevator2.getCurStatus() == 1) {
                                        status2.setText("上行");
                                        double temp = eleLabel2.getLayoutY();
                                        eleLabel2.setLayoutY(temp - 27.0);
                                    } else if (elevator2.getCurStatus() == 0) {
                                        status2.setText("下行");
                                        double temp = eleLabel2.getLayoutY();
                                        eleLabel2.setLayoutY(temp + 27.0);
                                    } else status2.setText("   ");
                                }
                            });
                        }
                    }.start();

                }
            }
        }.start();
    }

    public void Thread3Start() {
        new Thread() {
            @Override
            public void run() {
                elevator3.JudgeStatus(elevator3List);
                while (true) {
                    while (!flag3Alarm) {
                        try {
                            flag3Alarm = checkEle3();
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    boolean f = true;
                    if (elevator3.getCurStatus() == 1) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator3.getCurFloor();
                        elevator3.setCurFloor(tempFloor + 1);
                    } else if (elevator3.getCurStatus() == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator3.getCurFloor();
                        elevator3.setCurFloor(tempFloor - 1);
                    } else if (elevator3.getCurStatus() == 11 || elevator3.getCurStatus() == 10) {
                        try {
                            int i = 0;
                            while (i < 5) {
                                Thread.sleep(1000);
                                if (!flag3Open) {
                                    flag3Open = true;
                                    i = i - 5;
                                }
                                if (!flag3Close) {
                                    flag3Close = true;
                                    i = i + 2;
                                }
                                i++;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (elevator3.getCurStatus() == 111) {
                        f = false;
                        while (elevator3.getCurStatus() == 111) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            elevator3.JudgeStatus(elevator3List);
                        }
                    }
                    if (f) elevator3.JudgeStatus(elevator3List);
                    else f = true;
                    System.out.println(3 + " " + elevator3.getCurFloor());
                    if (elevator3.getCurFloor() == 1) flag3 = true;
                    if (elevator3.getCurFloor() > 1 && !flag3) elevator3.setCurFloor(elevator3.getCurFloor() - 1);
                    new Thread() {
                        public void run() {
                            Platform.runLater(() -> {
                                {
                                    if (elevator3.getCurStatus() == 11 || elevator3.getCurStatus() == 10 || elevator3.getCurStatus() == 111)
                                        floor3.setText(elevator3.getCurFloor() + "楼");
                                    else if (elevator3.getCurStatus() == 1)
                                        floor3.setText(elevator3.getCurFloor() + 1 + "楼");
                                    else if (elevator3.getCurStatus() == 0)
                                        floor3.setText(elevator3.getCurFloor() - 1 + "楼");
                                    if (elevator3.getCurStatus() == 1) {
                                        status3.setText("上行");
                                        double temp = eleLabel3.getLayoutY();
                                        eleLabel3.setLayoutY(temp - 27.0);
                                    } else if (elevator3.getCurStatus() == 0) {
                                        status3.setText("下行");
                                        double temp = eleLabel3.getLayoutY();
                                        eleLabel3.setLayoutY(temp + 27.0);
                                    } else status3.setText("   ");
                                }
                            });
                        }
                    }.start();
                }
            }
        }.start();
    }

    public void Thread4Start() {
        new Thread() {
            @Override
            public void run() {
                elevator4.JudgeStatus(elevator4List);
                while (true) {
                    while (!flag4Alarm) {
                        try {
                            flag4Alarm = checkEle4();
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    boolean f = true;
                    if (elevator4.getCurStatus() == 1) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator4.getCurFloor();
                        elevator4.setCurFloor(tempFloor + 1);
                    } else if (elevator4.getCurStatus() == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator4.getCurFloor();
                        elevator4.setCurFloor(tempFloor - 1);
                    } else if (elevator4.getCurStatus() == 11 || elevator4.getCurStatus() == 10) {
                        try {
                            int i = 0;
                            while (i < 5) {
                                Thread.sleep(1000);
                                if (!flag4Open) {
                                    flag4Open = true;
                                    i = i - 5;
                                }
                                if (!flag4Close) {
                                    flag4Close = true;
                                    i = i + 2;
                                }
                                i++;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (elevator4.getCurStatus() == 111) {
                        f = false;
                        while (elevator4.getCurStatus() == 111) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            elevator4.JudgeStatus(elevator4List);
                        }
                    }
                    if (f) elevator4.JudgeStatus(elevator4List);
                    else f = true;
                    System.out.println(4 + " " + elevator4.getCurFloor());
                    if (elevator4.getCurFloor() == 1) flag4 = true;
                    if (elevator4.getCurFloor() > 1 && !flag4) elevator4.setCurFloor(elevator4.getCurFloor() - 1);
                    new Thread() {
                        public void run() {
                            Platform.runLater(() -> {
                                {
                                    if (elevator4.getCurStatus() == 11 || elevator4.getCurStatus() == 10 || elevator4.getCurStatus() == 111)
                                        floor4.setText(elevator4.getCurFloor() + "楼");
                                    else if (elevator4.getCurStatus() == 1)
                                        floor4.setText(elevator4.getCurFloor() + 1 + "楼");
                                    else if (elevator4.getCurStatus() == 0)
                                        floor4.setText(elevator4.getCurFloor() - 1 + "楼");
                                    if (elevator4.getCurStatus() == 1) {
                                        status4.setText("上行");
                                        double temp = eleLabel4.getLayoutY();
                                        eleLabel4.setLayoutY(temp - 27.0);
                                    } else if (elevator4.getCurStatus() == 0) {
                                        status4.setText("下行");
                                        double temp = eleLabel4.getLayoutY();
                                        eleLabel4.setLayoutY(temp + 27.0);
                                    } else status4.setText("   ");
                                }
                            });
                        }
                    }.start();
                }
            }
        }.start();
    }

    public void Thread5Start() {
        new Thread() {
            @Override
            public void run() {
                elevator5.JudgeStatus(elevator5List);
                while (true) {
                    while (!flag5Alarm) {
                        try {
                            flag5Alarm = checkEle5();
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    boolean f = true;
                    if (elevator5.getCurStatus() == 1) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator5.getCurFloor();
                        elevator5.setCurFloor(tempFloor + 1);
                    } else if (elevator5.getCurStatus() == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int tempFloor = elevator5.getCurFloor();
                        elevator5.setCurFloor(tempFloor - 1);
                    } else if (elevator5.getCurStatus() == 11 || elevator5.getCurStatus() == 10) {
                        try {
                            int i = 0;
                            while (i < 5) {
                                Thread.sleep(1000);
                                if (!flag5Open) {
                                    flag5Open = true;
                                    i = i - 5;
                                }
                                if (!flag5Close) {
                                    flag5Close = true;
                                    i = i + 2;
                                }
                                i++;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (elevator5.getCurStatus() == 111) {
                        f = false;
                        while (elevator5.getCurStatus() == 111) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            elevator5.JudgeStatus(elevator5List);
                        }
                    }
                    if (f) elevator5.JudgeStatus(elevator5List);
                    else f = true;
                    System.out.println("5 " + elevator5.getCurFloor());
                    if (elevator5.getCurFloor() == 1) flag5 = true;
                    if (elevator5.getCurFloor() > 1 && !flag5) elevator5.setCurFloor(elevator5.getCurFloor() - 1);
                    new Thread() {
                        public void run() {
                            Platform.runLater(() -> {
                                {
                                    if (elevator5.getCurStatus() == 11 || elevator5.getCurStatus() == 10 || elevator5.getCurStatus() == 111)
                                        floor5.setText(elevator5.getCurFloor() + "楼");
                                    else if (elevator5.getCurStatus() == 1)
                                        floor5.setText(elevator5.getCurFloor() + 1 + "楼");
                                    else if (elevator5.getCurStatus() == 0)
                                        floor5.setText(elevator5.getCurFloor() - 1 + "楼");
                                    if (elevator5.getCurStatus() == 1) {
                                        status5.setText("上行");
                                        double temp = eleLabel5.getLayoutY();
                                        eleLabel5.setLayoutY(temp - 27.0);
                                    } else if (elevator5.getCurStatus() == 0) {
                                        status5.setText("下行");
                                        double temp = eleLabel5.getLayoutY();
                                        eleLabel5.setLayoutY(temp + 27.0);
                                    } else status5.setText("   ");
                                }
                            });
                        }
                    }.start();
                }
            }
        }.start();
    }

}
