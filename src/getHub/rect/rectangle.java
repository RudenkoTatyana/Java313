package getHub.rect;

public class rectangle {
private int lenght;
private int widht;

//public rectangle(int lenght, int widht){
//    setLenght(lenght);
//    setWidht(widht);
//}

    public rectangle(int lenght, int widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidht() {
        return widht;
    }

    public void setLenght(int lenght) {
       if (lenght > 0) {
           this.lenght = lenght;
       } else {
           System.out.println("Вы ввели отрицательное число");
       }
    }

    public void setWidht(int widht) {
        if (widht > 0) {
            this.widht = widht;
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

       public int getArea(){
           return this.lenght * this.widht;
        }
       public int getPerimetr(){
           return 2 * (this.widht + this.lenght);
        }

        public double getHipotenus(){
        return Math.sqrt(Math.pow(this.lenght, 2) + Math.pow(this.widht, 2));
        }
        public void getDraw(){
            for (int i = 0; i < this.lenght; i++) {
                for (int j = 0; j < this.widht; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

