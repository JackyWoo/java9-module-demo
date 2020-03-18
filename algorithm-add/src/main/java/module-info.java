import demo.algorithm.add.Add;
import demo.algorithm.spi.Algorithm;

/**
 * Created by wujianchao on 2020/3/17.
 */module algorithm.add {
      requires algorithm.spi;
      provides Algorithm with Add;
}