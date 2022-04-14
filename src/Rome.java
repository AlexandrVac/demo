public class Rome {
    // результат
    private int res;

    public void setRes(int res) {

        //Проверка на корректность ответа(может быть только положительное число)
        if(res < 1){
            System.out.println("Результатом работы калькулятора с римсикми" +
                    " цифрами могу быть только положительные числа");
            System.exit(0);
        }
        this.res = res;
    }

    public int getRes() {
        return res;
    }
}
