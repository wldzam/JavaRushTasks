package com.javarush.task.task14.task1408;

/**
 * Created by Sukora Stas.
 */
public class MoldovanHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 1536;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
