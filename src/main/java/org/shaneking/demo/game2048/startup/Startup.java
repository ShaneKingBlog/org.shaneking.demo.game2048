package org.shaneking.demo.game2048.startup;

import lombok.extern.slf4j.Slf4j;
import org.shaneking.demo.game2048.panel.G2048Panel;

import javax.swing.*;
import java.awt.*;

@Slf4j
public class Startup {
  /**
   * The coder is very lazy for this main method
   *
   * @param args void
   */
  public static void main(String[] args) {
    //do nothing
    SwingUtilities.invokeLater(() -> {
      //do nothing
      try {
        log.info("2048 starting!");
        JFrame g2048Frame = new JFrame();
        g2048Frame.setLayout(new BorderLayout());
        g2048Frame.add(G2048Panel.single(), BorderLayout.CENTER);
        g2048Frame.setTitle(getTitle());
        g2048Frame.setSize(G2048Panel.W, G2048Panel.H);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        g2048Frame.setLocation((int) (screen.getWidth() - G2048Panel.W) / 2, (int) (screen.getHeight() - G2048Panel.H) / 2);
        g2048Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        g2048Frame.setResizable(false);
        g2048Frame.setVisible(true);
      } catch (Exception e) {
        log.error(e.toString(), e);
      }
    });
  }

  private static String getTitle() {
    return "Game 2048";
  }
}
