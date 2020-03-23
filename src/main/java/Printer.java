public class Printer {
    private int paperSheets;
    private int toner;

    public Printer(int paperSheets) {
        this.paperSheets = paperSheets;
        this.toner = 500;
    }

    public int getPaperSheets(){
        return this.paperSheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void addPaper(int extraSheets) {
        this.paperSheets += extraSheets;
    }

    public void print(int copies){
        if (this.paperSheets >= copies && this.toner >= copies) {
            this.paperSheets -= copies;
            this.toner -= copies;
        }
    }
}
