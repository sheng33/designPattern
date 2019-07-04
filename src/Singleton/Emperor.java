package Singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 13055
 */
public class Emperor {
    /**最大皇帝实例数量*/
    private static int maxNumofEmperor = 2;
    /**每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性*/
    private static ArrayList<String> nameList = new ArrayList<String>();
    /**定义一个列表，容纳所有的皇帝实例*/
    private static ArrayList<Emperor> emperorsList = new ArrayList<Emperor>();
    /**当前皇帝序列号*/
    private static int countNumOfEmperor = 0;
    //产生所有的对象
    static {
        for(int i = 0; i < maxNumofEmperor ; i++){
            emperorsList.add(new Emperor("皇帝"+(i+1)));
        }
    }
    /**随机获得一个皇帝对象*/
    public static Emperor getInstance(){
        Random random = new Random();
        //随机使用一个皇帝
        countNumOfEmperor = random.nextInt(maxNumofEmperor);
        return emperorsList.get(countNumOfEmperor);
    }
    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

    public Emperor() {
    }
    /**传入皇帝的名称，建立一个皇帝对象*/
    public Emperor(String name) {
        nameList.add(name);
    }
}
