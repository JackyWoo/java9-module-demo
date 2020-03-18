package demo.algorithm.main;

import demo.algorithm.spi.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Created by wujianchao on 2020/3/17.
 */
public class Main {

    public static void main(String[] args) {

        List<Algorithm> algorithmList = new ArrayList<>();
        ServiceLoader.load(Algorithm.class).forEach(algorithmList::add);

        for (Algorithm algorithm : algorithmList) {
            System.out.println(algorithm.calculate(1, 1));
        }

    }
}
