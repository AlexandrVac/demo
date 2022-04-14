public class Arabic {
    //числа а и б
    private int num;
    // результат
    private int res;


    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        //делает ответ целым числом
        res = (int) res;

        this.res = res;
    }

    public void setNum(int num) {
        //проверяю на корректность введенного числа
        for (int i = 1; i < 11; i++) {
            if(num == i){
                break;
            }
            if(i == 10){
                System.out.println("Введено недоступное число!");
                System.exit(0);
            }
        }

        this.num = num;
    }
}
