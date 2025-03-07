package bubble.test.game.service;

import bubble.test.game.component.Player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackgroundPlayerService implements Runnable{

    private Player player;
    private BufferedImage image;

    public BackgroundPlayerService(Player player) {
        this.player = player;
        try{
            image = ImageIO.read(new File("images/backgroundMapService.png")) ;
        }catch (Exception e){
            System.out.println("이미지 파일 명 및 경로 확인 불가");
        }
    }

    @Override
    public void run() {
        while (true){
            Color leftColor = new Color(image.getRGB(player.getX(),player.getY()+25));
            Color rightColor = new Color(image.getRGB(player.getX()+50 + 10,player.getY()+25));

            //이때 -1은 흰색(255, 255, 255) 을 의미합니다.
            //즉, 하얀색이 아니면 바닥 이라는 의미입니다.
            // 빨간색 (255, 0, 0)
//            -1 은 흰색 (RGB: 255, 255, 255) 을 의미합니다.
            //파란색 (0, 0, 255)
            int bottomColorLeft = image.getRGB(player.getX()+20,player.getY()+50+5);
            int bottomColorRight = image.getRGB(player.getX()+50 - 10,player.getY()+50+5);

            //바닥 255.0.0
            //bottomColorLeft = -1 이면:
            //플레이어 아래가 흰색이라는 뜻 → 공중에 떠 있음 또는 바닥이 아님
            //그래서 player.down() 을 호출하여 중력을 적용합니다.
            if((bottomColorLeft + bottomColorRight) != -2){//공중이 아닌경우
                //플레이어 down 필요

            }else{
                // 조금 점프하는 순간 bottomColor 값이 -1이 됨,
                //플레이어가 올라가는 도중이 아닌경우 down 시켜야함,그 이외에는 down 되지않아야함
            }

        }
    }
}
