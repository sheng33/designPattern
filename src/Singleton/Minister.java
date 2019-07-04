package Singleton;

/**
 * @author 13055
 * 单例模式demo
 */
public class Minister {
    public static void main(String[] args) {
        //定义5个大臣
        int ministerNum = 5;
        for(int i =0 ;i<ministerNum; i++){
            Emperor.getInstance();
            System.out.print("第"+(i+1)+"大臣参拜的是");
            Emperor.say();
        }
    }
}
