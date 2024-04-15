public enum LevelEnum {
    High(3), Medium(2), Low(1);

    private int lvlNum;

    private LevelEnum(int num) {
        this.lvlNum = num;
    }

    public int getLvl() {
        return this.lvlNum;
    }

    public void setLvl(int num) {
        this.lvlNum = num;
    }
}
