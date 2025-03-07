package bubble.test.game;

import bubble.test.game.component.Bubble;
import bubble.test.game.component.Player;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

//우리는 여러 클래스를 설게한다고 한다.
@Getter
public class BubbleFrame extends JFrame {
    private Player player;
    private JLabel backgroundMap;
    private  BubbleFrame mContext = this;
    public BubbleFrame(){
        initData();
    }

    public void initData(){
        super.setSize(1000,600);
        super.setLayout(null);
        super.setLocationRelativeTo(null); // JFrame 가운데 배치하기
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.BLACK);
        backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
        backgroundMap.setBounds(0, 0, 1000, 600);
        player = new Player(mContext);
        super.add(player);
        super.add(backgroundMap);

        super.setVisible(true);
    }


    public static void main(String[] args) {
        new BubbleFrame();


    }


}
