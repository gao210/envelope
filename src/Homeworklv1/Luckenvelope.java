
package Homeworklv1;

        import java.util.Random;

class Luckenvelope extends Envelope{
    int num;
    double money;
    double min = 0.01;
void tell(){
    System.out.println("输入钱数和份数");
    return;
}
    @Override
    void separate() {
        if((money/num)<min)
        {
            System.out.println("平均每份钱数不能少于0.01元");
            return;
        }
        System.out.println("钱数"+money+"份数"+num);
        double d[] = new double[num];
        int    n[] = new int[num];
        int sum1 = 0;
        int sum2 = 0;
        Random random = new Random();
        for(int i = 0;i<=num - 1;i++) {
            n[i] = random.nextInt(10);
            sum1 += n[i];
        }
        for(int y = 0;y <= num - 2;y++){
            d[y] = (float)n[y]/sum1*money;
            d[y]=((int)((d[y]+0.005)*100)) / 100.0;
            sum2 += d[y];
        }
        d[num - 1] = money - sum2;

        for (int h = 0;h <= num - 1;h++)
        {
            System.out.println("第"+(h+1)+"个抽到"+d[h]+"元" );
        }
    }
}