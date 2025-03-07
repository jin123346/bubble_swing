package bubble.test.game.component;

import bubble.test.game.BubbleFrame;
import bubble.test.game.Moveable;
import bubble.test.game.state.PlayerWay;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Player extends JLabel implements Moveable {
    private BubbleFrame mContext;
    private List<Bubble> bubbleList;


    private int x, y;
    private ImageIcon playerR, playerL;
    private ImageIcon playerRDie, playerLDie;
    private PlayerWay playerWay;

    private final int SPEED = 4;
    private final int JUMPSPEED=2;
    private int state = 0;// 0 : live /1: die
    // 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;

    //객체를 생성할떄 가장 먼저 실행되는 것은 생성자!
    public Player(BubbleFrame mContext) {
        initData();
        setInitLayout();
    }


    private void initData(){
        playerR = new ImageIcon("images/playerR.png");
        playerL = new ImageIcon("images/playerL.png");
        playerLDie = new ImageIcon("images/playerLDie.png");
        playerRDie = new ImageIcon("images/playerRDie.png");
        bubbleList = new ArrayList<>();

    }
    private void setInitLayout(){
        x=80;
        y=530;
        left=false;
        right= false;
        up= false;
        down= false;


        setIcon(playerR);
        setSize(50,50);
        setLocation(x,y);

    }

    //공격
    public void attack(){
        new Thread(() -> {
            Bubble bubble = new Bubble(mContext);
            mContext.add(bubble);

        });
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
