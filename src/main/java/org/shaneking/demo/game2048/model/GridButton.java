package org.shaneking.demo.game2048.model;

import org.shaneking.demo.game2048.cons.ColorCons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

public class GridButton extends JButton {
  /**
   *
   */
  private static final long serialVersionUID = 1103838465571228907L;

  private int number;

  private int xValue;

  private int yValue;

  /**
   * This is a constructor
   */
  public GridButton() {
    //do nothing
    this(0, 0);
  }

  public GridButton(int xValue, int yVlaue) {
    //do nothing
    super();
    this.xValue = xValue;
    this.yValue = yVlaue;
    setNumber(0);
    setOpaque(true);    //MAC
    setBorderPainted(false);    //MAC
  }

  /**
   * @see java.awt.Component#addMouseListener(MouseListener)
   */
  @Override
  public synchronized void addMouseListener(MouseListener l) {
    //do nothing
    //        super.addMouseListener(l);
  }

  /**
   * @see java.awt.Component#addMouseMotionListener(MouseMotionListener)
   */
  @Override
  public synchronized void addMouseMotionListener(MouseMotionListener l) {
    //do nothing
    //        super.addMouseMotionListener(l);
  }

  /**
   * @see java.awt.Component#addMouseWheelListener(MouseWheelListener)
   */
  @Override
  public synchronized void addMouseWheelListener(MouseWheelListener l) {
    //do nothing
    //        super.addMouseWheelListener(l);
  }

  /**
   * this is a getter method for number
   *
   * @return the number
   */
  public int getNumber() {
    return number;
  }

  /**
   * this is a setter method for number
   *
   * @param number the number to set
   */
  public void setNumber(int number) {
    this.number = number;
    setText("" + (0 == number ? "" : number));
    setFont(new Font("Courier New", Font.BOLD, 56 - (String.valueOf(number).length() * 8)));
    setBackground(ColorCons.COLOR_MAP.get(number));
  }

  /**
   * this is a getter method for xValue
   *
   * @return the xValue
   */
  public int getxValue() {
    return xValue;
  }

  /**
   * this is a setter method for xValue
   *
   * @param xValue the xValue to set
   */
  public void setxValue(int xValue) {
    this.xValue = xValue;
  }

  /**
   * this is a getter method for yValue
   *
   * @return the yValue
   */
  public int getyValue() {
    return yValue;
  }

  /**
   * this is a setter method for yValue
   *
   * @param yValue the yValue to set
   */
  public void setyValue(int yValue) {
    this.yValue = yValue;
  }
}
