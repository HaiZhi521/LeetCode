package src.Other;

public class Demo {
    public static void main(String[] args) {
        double _7to8 = 0.745;
        double _8to9 = 0.64;
        double _9to10 = 0.535;
        double _7to10 = _7to8 * _8to9 * _9to10;
        double n_7to10 = (1 - _7to8) + (_7to8 * (1 - _8to9) * 2) + (_7to8 * _8to9 * (1 - _9to10)) * 3;
        //增幅器
        double x = 0;
        //+10装备
        double y = 0;
        double y1 = 0;
        //+7装备
        double n = 100;

        for (int i = 0; y < 99 && i < 100 ; i++){
            y1 = n * _7to10;
            //成功所需
            double x1 = n * _7to10 * 3;
            //失败所需
            n = n - y1 ;
            double x2 = n_7to10 * n;
            x = x + x1 + x2;
            y = y + y1;

            System.out.println("第" + i +"轮" + "   +10装备:" + y +"   +7装备:"+ n + "   增幅器:" + x);

        }

//        y = y + n * _7to10;
//        //成功所需
//        double x1 = n * _7to10 * 3;
//        //失败所需
//        n = n - y;
//        double x2 = ((1 - _7to8) + (_7to8 * (1 - _8to9) * 2) + (_7to8 * _8to9 * (1 - _9to10)) * 3) * n;
//        x = x1 + x2;
//
//
//        System.out.println("+10装备:" + y +"   +7装备:"+ n + "   增幅器:" + x);

    }
}
