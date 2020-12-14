public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if (count > 0){
            return (double) sum / count;
        } else {
            return 0;
        }
    }
}