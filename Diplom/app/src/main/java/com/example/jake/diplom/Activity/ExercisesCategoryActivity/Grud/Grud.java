package com.example.jake.diplom.Activity.ExercisesCategoryActivity.Grud;

import com.example.jake.diplom.R;

/**
 * Created by htcvive on 06.05.2017.
 */

public class Grud {
    private String name;//название упражнения
    private String description;//описание упражнения
    private int imageResourceId;//изображение упражнения
    // Spina - массив с элементами Spina
    public static final Grud[] gruds = {
            new Grud("Жим лежа", "Правильная техника выполнения \n 1. Лягте на горизонтальную скамью для жима лежа и положите руки на штангу. Расстояние между руками должно быть примерно 55-60 см. " +
                    "Следите, чтобы штангу поддерживали исключительно ладони, а большой палец был сверху нее. Штанга не должна лежать в ладони слишком высоко.\n" +
                    "2. Сведите лопатки вместе, прижмите их к скамье (это повысит уровень устойчивости в основном движении), затем снимите штангу с держателей." +
                    " Займите исходное положение — вытянутые руки перпендикулярны скамье, локти зафиксированы. Штанга находится наверху, ровно по линии глаз.\n" +
                    "3. Сохраняя лопатки сведенными вместе, выставьте грудь вперед. Для этого, сохраняя ягодицы прижатыми к скамье, прогните нижнюю часть спины и выкрутите грудную клетку вверх." +
                    " Это увеличит амплитуду движения и позволит повысить эффективность. Однако не выгибайтесь чрезмерно.\n " +
                    "4. Держите ноги на полу по уровню колен, ступни слегка разведены в стороны. Ни в коем случае не ставьте ноги на скамью и не поднимайте их в воздух." +
                    "Следите за тем, чтобы пятка не отрывалась от пола при выжимании штанги. Ноги должны создавать своеобразную опору и поддержку.", R.drawable.ic_zhim),
            new Grud("Разводка лежа", "Шаг №1.\n" +
                    "\n" +
                    "Возьмите в руки гантели подходящего веса, сядьте на горизонтальную скамью, а затем, ложась, закиньте их себе на грудь с помощью коленей" +
                    " (или просто попросите подать партнера, сверху). Стартовая позиция – гантели нейтральным хватом (ладони смотрят друг на друга)" +
                    " находятся вверху на слегка подсогнутых руках, ноги жестко уперты в пол, в пояснице прогиб.\n" +
                    "\n" +
                    "Шаг №2.\n" +
                    "\n" +
                    "Медленно (на вдохе) разведите гантели в стороны (в нижней точке почувствуйте растяжение) по широкой дуге, описывая в воздухе полукруг. " +
                    "Как только гантели достигнут уровня груди (или чуть ниже), сожмите грудные, сводя руки назад по той же траектории, выдохните.\n" +
                    "\n" +
                    "Шаг №3.\n" +
                    "\n" +
                    "Задержитесь на секунду в верхней точке (не позволяя гантелям соприкасаться) и снова медленно повторите движение заданное количество раз.", R.drawable.ic_razvodka)
    };

    private Grud(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {return description;}
    public int getImageResourceId() {
        return imageResourceId;
    }
    @Override
    public String toString() {
        return this.name;
    }
}

