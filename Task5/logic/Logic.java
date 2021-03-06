package by.epam_pre_training.task5.model;

import by.epam_pre_training.task5.entity.MagicItem;
import by.epam_pre_training.task5.entity.MagicStorage;
import by.epam_pre_training.task5.utils.MyList;

public class Logic {

    public static int countTotalMagicPower(MagicStorage storage) {
        MyList<MagicItem> items = storage.getItems();
        int sum = 0;

        for (MagicItem item : items) {
            if (item != null) {
                sum += item.getMagicPower();
            }
        }
        return sum;
    }


    public static MagicItem findMostPowerfulItem(MagicStorage storage) {
        MyList<MagicItem> items = storage.getItems();
        int maxMagicPower = -1;
        MagicItem mostPowerfulItem = null;

        for (MagicItem item : items) {
            if (item != null) {
                if (item.getMagicPower() > maxMagicPower) {
                    maxMagicPower = item.getMagicPower();
                    mostPowerfulItem = item;
                }
            }
        }
        return mostPowerfulItem;
    }
}
