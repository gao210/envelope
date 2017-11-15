package Homeworklv1;

public class Normalenvelope extends Envelope {
    int num;
    double money;
    double min = 0.01;

    @Override
    void separate() {
        if((money/num)<min)
        {
            System.out.println("平均每份钱数不能少于0.01元");
            return;
        }
        double d[] = new double[num];
        for(int i = 0;i<= num - 1;i++)
        {
            d[i] = (float)money/num;
            d[i]=((int)((d[i]+0.005)*100)) / 100.0;
        }
        for (int h = 0;h <= num - 1;h++)
        {
            System.out.println("第"+(h+1)+"个抽到"+d[h]+"元" );
        }
    }
}
