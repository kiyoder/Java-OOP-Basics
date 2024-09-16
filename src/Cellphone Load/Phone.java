class Phone{
    private boolean hasUnlimitedCalls;
    private boolean hasUnlimitedTexts;
    private int internetMB;

    public Phone(){
        this.hasUnlimitedCalls = false;
        this.hasUnlimitedTexts = false;
        this.internetMB = 0;
    }

    public void load(CellphoneLoad load){
        this.hasUnlimitedCalls = load.hasUnlimitedCalls();
        this.hasUnlimitedTexts = load.hasUnlimitedTexts();
        this.internetMB = load.internetMB();
    }

    public String toString(){
        return "Has unlimited calls = " + this.hasUnlimitedCalls + ", Has unlimited texts = " + this.hasUnlimitedTexts + ", Internet MB = " + this.internetMB;
    }
}