package bubble.test.game.component;

import bubble.test.game.BubbleFrame;

import javax.swing.*;

public class Bubble {
    private BubbleFrame mContext;
    private Player player;

    // 위치 상태
    private int x;
    private int y;

    // 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;

    // 적군을 맞춘 상태
    private int state; // 0(물방울), 1(적을 가둔 물방울)

    private ImageIcon bubble; // 물방울
    private ImageIcon bubbled; // 적을 가둔 물방울
    private ImageIcon bomb; // 물방울이 터진 상태

    public Bubble(BubbleFrame mContext){
        this.mContext = mContext;
        this.player = mContext.getPlayer();
    }
}
