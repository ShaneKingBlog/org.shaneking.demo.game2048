package org.shaneking.g2048.cons;

import com.google.common.collect.Lists;
import org.shaneking.skava.ling.util.Random0;

import java.util.List;

public class NumCons {
  private static final List<Integer> NUM_LIST = Lists.newArrayList();

  static {
    NUM_LIST.add((int) Math.scalb(1, 1));
    NUM_LIST.add((int) Math.scalb(1, 2));
  }

  public static int roundNum() {
    return NUM_LIST.get(Random0.nextRangeInt(NUM_LIST.size()));
  }
}
