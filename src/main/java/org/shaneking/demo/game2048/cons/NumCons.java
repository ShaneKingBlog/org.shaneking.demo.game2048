package org.shaneking.demo.game2048.cons;

import org.shaneking.ling.zero.security.SR0;
import org.shaneking.ling.zero.util.List0;

import java.util.List;

public class NumCons {
  private static final List<Integer> NUM_LIST = List0.newArrayList();

  static {
    NUM_LIST.add((int) Math.scalb(1, 1));
    NUM_LIST.add((int) Math.scalb(1, 2));
  }

  public static int roundNum() {
    return NUM_LIST.get(Math.abs(SR0.nextInt(NUM_LIST.size())));
  }
}
