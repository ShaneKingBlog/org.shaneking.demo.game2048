package org.shaneking.g2048.cons;

import com.google.common.collect.Maps;

import java.awt.*;
import java.util.Map;

public class ColorCons {
  public static final Map<Integer, Color> COLOR_MAP = Maps.newHashMap();

  static {
    COLOR_MAP.put((int) Math.scalb(0, 0), new Color(255, 255, 255));    //0
    COLOR_MAP.put((int) Math.scalb(1, 1), new Color(255, 192, 192));    //2
    COLOR_MAP.put((int) Math.scalb(1, 2), new Color(255, 128, 128));    //4
    COLOR_MAP.put((int) Math.scalb(1, 3), new Color(255, 64, 64));      //8

    COLOR_MAP.put((int) Math.scalb(1, 4), new Color(192, 255, 255));    //16
    COLOR_MAP.put((int) Math.scalb(1, 5), new Color(192, 192, 192));    //32
    COLOR_MAP.put((int) Math.scalb(1, 6), new Color(192, 128, 128));    //64
    COLOR_MAP.put((int) Math.scalb(1, 7), new Color(192, 64, 64));      //128

    COLOR_MAP.put((int) Math.scalb(1, 8), new Color(128, 255, 255));    //256
    COLOR_MAP.put((int) Math.scalb(1, 9), new Color(128, 192, 192));    //512
    COLOR_MAP.put((int) Math.scalb(1, 10), new Color(128, 128, 128));   //1024
    COLOR_MAP.put((int) Math.scalb(1, 11), new Color(128, 64, 64));     //2048

    COLOR_MAP.put((int) Math.scalb(1, 12), new Color(64, 255, 255));    //4096
    COLOR_MAP.put((int) Math.scalb(1, 13), new Color(64, 192, 192));
    COLOR_MAP.put((int) Math.scalb(1, 14), new Color(64, 128, 128));
    COLOR_MAP.put((int) Math.scalb(1, 15), new Color(64, 64, 64));
  }
}
