package demo.algorithm.add;

import demo.algorithm.spi.Algorithm;

/**
 * Created by wujianchao on 2020/3/17.
 */
public class Add implements Algorithm {
    @Override
    public int calculate(int left, int right) {
        return left + right;
    }
}
